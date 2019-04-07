<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户注册 </title>

    <!-- 引入jquery -->
    <script src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/jquery.min.js"></script>

    <!-- 引入样式  -->
    <link
            href="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script
            src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

	
	<link rel="stylesheet" href="${request.contextPath}/resource/user/register/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${request.contextPath}/resource/user/register/css/form-elements.css">
    <link rel="stylesheet" href="${request.contextPath}/resource/user/register/css/style.css">

</head>
<body>

	<!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>博客系统</strong>用户注册</h1>
                            
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	


                            <div class="form-bottom">
			                    <form id="registerForm" role="form" method="post" class="login-form">
			                    	<div class="form-group" id="input-username" >
			                    		<label for="form-username">用户名：</label>
			                        	<input type="text" id="username" name="username"  placeholder="Username..." class="form-username form-control" onblur="idUsernameExists()"/>
			                        	<span id="username-message"></span
			                        </div>
			                        <div class="form-group" id="input-password" >
			                        	<label for="form-password">密码：</label>
			                        	<input type="password" id="password" name="password" placeholder="Password..." class="form-password form-control"/>
			                        </div>
			                        <div class="form-group" id="input-email" >
			                        	<label for="form-email">邮箱：</label>
			                        	<input type="email" id="email" name="email" placeholder="email..." class="form-email form-control"/>
			                        </div>
			                        <div class="form-group" id="input-mobile" >
			                        	<label for="form-mobile">手机号：</label>
			                        	<input type="text" id="mobile" name="mobile" placeholder="mobile..." class="form-mobile form-control" />
			                        </div>								
								


			                        <button type="button" class="btn" id="btn_register">注册</button>
			                    </form>
		                    </div>

							<div class="form-top">
                        		<div class="form-top-left">
                        			<h4>已有帐号? 点击&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;<a href="${request.contextPath}/user/login">登录</h4> 
                        		</div>
           
                        	 </div>

                        </div>
                    </div>
                    
					<div class="row">
                        <div class="col-sm-6 col-sm-offset-3 social-login">
                        	<div class="social-login-buttons">
	                        	<a class="btn btn-link-2" href="${request.contextPath}/index/">
	                        		<i class="glyphicon glyphicon-home"></i> 首页
	                        	</a>
	                        	
                        	</div>
                        </div>
                    </div>


                </div>
            </div>
            
        </div>
	
	
	
	<script type="text/javascript">
	
		//ajax 用户名唯一校验
		function idUsernameExists(){
			//清空提示信息
			$("#username-message").empty();
			$("#username-message").removeAttr("class");
		
			var username = $("#username").val();
			if(username.length != 0 ){
				console.log("ajax用户名校验:"+username);
								
				$.ajax({
					url:"${request.contextPath}/user/isUsernameExists",
					type:"POST",
					data:{"username":username},
					success:function(res){
						console.log(res);
						if(res == "fail"){
							//存在用户 提示信息
							$("#username-message").addClass("text-danger").append("该用户名已存在，请重新输入！");
							$("#input-username").addClass("has-error");
						
							//按钮禁用状态
							$("#btn_register").attr("disabled",true);
						}else{
							//confirm("用户名可用");							
							$("#username-message").addClass("text-info").append("该用户名可以使用！");
																
							$("#btn_register").removeAttr("disabled");
							$("#input-username").addClass("has-success");
							$("#input-username").removeClass("has-error");
							setTimeout(function(){
								$("#username-message").empty();
								$("#input-username").removeClass("has-success");
							},3000);
						
						}
					}			
				});				
				
			}else{
				//console.log("NUll 请输入用户名");
				$("#username-message").addClass("text-danger").append("请输入用户名！");
				$("#input-username").addClass("has-error");						
				//按钮禁用状态
				$("#btn_register").attr("disabled",true);
			}
		}		
		
		
		// ajax 后台注册
		$("#btn_register").on('click',function(){
			var username = $("#username").val().length;
			var password = $("#username").val().length;
			var email = $("#email").val().length;
			var mobile = $("#mobile").val().length;
			if(username == 0 || password == 0 || email == 0 || mobile == 0){
				confirm("请将表单填写完整");
			}else{		
				$.ajax({
					url:"${request.contextPath}/user/userRegister",
					type:"POST",
					data:$("#registerForm").serialize(),
					success:function(res){
						console.log(res);
						if(parseInt(res) == 1){
							confirm("注册成功");
							//跳转登录页面
							window.location.href="${request.contextPath}/user/login";
						}else{
							confirm("注册失败");
							window.location.href="${request.contextPath}/index/index";
						}
									
					}
				});
			}
		});

	</script>
</body>
</html>