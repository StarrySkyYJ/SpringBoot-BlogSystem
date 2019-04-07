<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户登陆 </title>

    <!-- 引入jquery -->
    <script src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/jquery.min.js"></script>

    <!-- 引入样式  -->
    <link
            href="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css"
            rel="stylesheet">
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script
            src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

	<link rel="stylesheet" href="${request.contextPath}/resource/user/login/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${request.contextPath}/resource/user/login/css/form-elements.css">
    <link rel="stylesheet" href="${request.contextPath}/resource/user/login/css/style.css">

</head>
<body>

	<!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>登录</strong></h1>
                            
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        	


                            <div class="form-bottom">
			                    <form id="loginForm" role="form" class="login-form">
			                    	<div class="form-group" id="input-username">
			                    		<label for="form-username">用户名：</label>
			                        	<input type="text" id="username" name="username" placeholder="Username..." class="form-username form-control">
			                        </div>
			                        <div class="form-group" id="input-password">
			                        	<label for="form-password">密码：</label>
			                        	<input type="password" id="password" name="password" placeholder="Password..." class="form-password form-control" >
			                        </div>                      				
								
									<span id="error_message"></span>
			                        <button id="btn_submit" type="button" class="btn">登录</button>
			                    </form>
		                    </div>

							<div class="form-top">
                        		<div class="form-top-left">
                        			<h4>没有帐号? 点击&nbsp;<span class="glyphicon glyphicon-hand-right"></span>&nbsp;<a href="${request.contextPath}/user/register">注册</h4> 
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
		//ajax 后台校验
		$("#btn_submit").on('click',function(){
			var username = $("#username").val();
			var password = $("#password").val();
			
			if(username.length != 0 && password.length != 0){				
				$.ajax({
					url:"${request.contextPath}/user/userLogin",
					type:"POST",
					data:$("#loginForm").serialize(),
					success:function(res){
						console.log(res);
						console.log(res.messageMap.id);
						//登录成功跳转到主页
						if(100 == res.code){
							window.location.href='${request.contextPath}/user/homePage?id='+res.messageMap.id;
						}else{						
							//提示 输入错误
							//confirm("用户名或密码错误");
							//清空 输入框
							$("#password").val("");
							//提示 输入错误
							errorMessage("用户名或密码错误，请重新输入！");
						}					
					}
				});
			}else{
				errorMessage("用户名或密码为空，请填写完整！");
			}
			
		});
		
		//错误提示
		function errorMessage(message){
			$("#input-username").addClass("has-error");
			$("#input-password").addClass("has-error");
							
			$("#error_message").addClass("text-danger").append(message);
							
			//定时器：5秒后执行
			setTimeout(function(){
			$("#error_message").empty();
			$("#input-username").removeClass("has-error");
			$("#input-password").removeClass("has-error");
			},3000);
		
		}

	</script>
</body>
</html>