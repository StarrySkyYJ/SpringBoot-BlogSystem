<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>头部页面</title>
	<!-- Bootstrap -->
	<link href="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">

	<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
	<script src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	
	<link rel="stylesheet" href="${request.contextPath}/resource/login-modal/css/form-elements.css">
    <link rel="stylesheet" href="${request.contextPath}/resource/login-modal/css/style.css">

</head>
<body>
	
	<!-- Static navbar -->
	<nav class="navbar navbar-default navbar-inverse navbar-static-top" >
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="${request.contextPath}/index/index/index" style="color:#fff;">博客系统</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse" >
				<ul class="nav navbar-nav">
					<li id="nav_new"><a href="${request.contextPath}/index/" >最新</a></li>
					<li id="nav_hot"><a href="${request.contextPath}/index/index/indexHot">最热</a></li>

				</ul>
				<ul class="nav navbar-nav navbar-right" style="margin-right: 5%;">	
					<li><a href="#" id="writeBlog" style="font-size: 15px;">写博客</a></li> 			
					<#if Session["userSession"]?exists>						
						<li class="dropdown">
							<a id="dropdown_i" class="btn dropdown-toggle" data-toggle="dropdown"  href="#" >${Session.userSession.username} <span class="caret"></span></a>
							<ul class="dropdown-menu" >
								<li><a href="#">个人信息&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span></a></li>
								<li><a href="${request.contextPath}/user/homePage?id=${Session.userSession.id}">个人主页&nbsp;&nbsp;<span class="glyphicon glyphicon-user"></span></a></li>            
								<li role="separator" class="divider"></li>
								<!-- <li class="dropdown-header">Nav header</li> -->
								<li><a href="${request.contextPath}/user/loginOut">退出&nbsp;&nbsp;<span class="glyphicon glyphicon-off"></span></a></li>  
	
							</ul> 
						</li> 					
						<#else>
							<li><a href="#" id="login">登录</a></li>            
							<li><a href="${request.contextPath}/user/register">注册</a></li>
					</#if>					
					                      
				</ul>
			</div><!--/.nav-collapse -->
		</div>
	</nav>


		<!-- MODAL -->
        <div class="modal fade" id="modal-login" tabindex="-1" role="dialog" aria-labelledby="modal-register-label" aria-hidden="true">
        	<div class="modal-dialog">
        		<div class="modal-content">
        			
        			<div class="modal-header">
        				<button type="button" class="close" data-dismiss="modal">
        					<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
        				</button>
        				<h3 class="modal-title" id="modal-register-label">用户登录</h3>
        				<a href="${request.contextPath}/admins/login/login"><p>后台管理员登录入口</p></a>
        			</div>
        			
        			<div class="modal-body">
        				
	                    <form id="loginForm" role="form" method="post" class="registration-form">
	                    	<div class="form-group" id="input-username" >
	                    		<label  for="form-first-name">用户名:</label>
	                        	<input type="text" id="modal-input-username" name="username" placeholder="username..." class="form-first-name form-control" />
	                        </div>
	                        <div class="form-group" id="input-password">
	                        	<label  for="form-last-name">密码:</label>
	                        	<input type="password" id="modal-input-password" name="password" placeholder="password..." class="form-last-name form-control" />
	                        </div>
	                        <span id="error_message"></span>
	                        <button type="button" class="btn btn-danger" id="btn_index_submit">确认登录</button>
	                    </form>
	                    
        			</div>
        			
        		</div>
        	</div>
        </div>

	



	<script type="text/javascript">
	
		<!-- 模态框  -->
		$('#login').on('click',function(){
			$('#modal-login').modal('show');

		});
		
		//下拉框
		$("#dropdown_i").on('click',function(){
			$('.dropdown-toggle').dropdown();
		});
		

		//ajax 后台校验
		$("#btn_index_submit").on('click',function(){				
			$.ajax({
				url:"${request.contextPath}/user/userLogin",
				type:"POST",
				data:$("#loginForm").serialize(),
				success:function(res){
					//console.log(res);
					//console.log(res.messageMap.id);
					//登录成功跳转到主页
					if(100 == res.code){
						confirm("登录成功");
						window.location.href='${request.contextPath}/user/homePage?id='+res.messageMap.id;
					}else{
						
						//confirm("用户名或密码错误");
						//清空 输入框
						$("#password").val("");
						//提示 输入错误
						$("#input-username").addClass("has-error");
						$("#input-password").addClass("has-error");
						
						$("#error_message").addClass("text-danger").append("用户名或密码错误");
						
						//定时器：5秒后执行
						setTimeout(function(){
							$("#error_message").empty();
							$("#input-username").removeClass("has-error");
							$("#input-password").removeClass("has-error");
						},3000);
						
					}					
				}
			});
		});
		
		//nav 控制active属性
		//$("#nav_hot").on('click',function(){
		//	$("#nav_hot").attr("class","active");
		//	$("#nav_new").removeAttr("class","active");
		//});
		
		$("#writeBlog").on('click',function(){
			var session = "${Session.userSession}";
			console.log("session",session);
			console.log("session.length",session.length);
			if(session.length != 0){
				window.location.href="${request.contextPath}/blog/blogWrite";
			}else{
				confirm("请登录!");
				window.location.href="${request.contextPath}/user/login";
			}
		});
		
		
	</script>


<style type="text/css">
	#btn_index_submit{
		width:100%;
		width: 100%;
		height: 50px;
	    margin: 0;
	    padding: 0 20px;
	    vertical-align: middle;
	}
	
	

</style>

</body>
</html>