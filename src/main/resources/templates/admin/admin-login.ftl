<!DOCTYPE html>
<html lang="en">
<head>

<meta charset="UTF-8">
<title>博客系统后台登录</title>

	<!-- 引入jquery -->
	<script
		src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
	
	<!-- 引入样式  -->
	<link
		href="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css"
		rel="stylesheet">
	<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
	<script
		src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

	<link href="${request.contextPath}/resource/admin/admin-login/css/style.css" rel='stylesheet' type='text/css' />

</head>
<body style="">
	<div id ="userTest" style="">
		<strong>为了演示效果:  登录账号及密码默认设置为admin。</strong>
		<p>可以直接登录，但某些功能不开放。</p>
	</div>
	
	<!--SIGN UP-->
	<h1>博客系统后台登录</h1>
	<div class="login-form">
		<div class="close"></div>
		<div class="head-info">
			<label class="lbl-1"> </label>
			<label class="lbl-2"> </label>
			<label class="lbl-3"> </label>
		</div>
		<div class="clear"> </div>

		<form  id="adminLoginForm" >
			<input type="text" class="text" name="username" value="admin" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'admin';}" >
			<div class="key">
				<input type="password" name="password" value="admin" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'admin';}">
			</div>
			
		</form>
		<div class="signin">
			<input id="submit" type="submit" value="登录" >
		</div>
	</div>
	<div class="copy-rights">
		<p>Space &copy; 2019.</p>
	</div>
	
	
	
	
	<style type="text/css">
		body{
			position: relative;
		}
		#userTest{
			width:200px;
			height:150px;
			float:left;
			position: absolute;			
			margin-top:200px;
			margin-left:150px;
			background-color: #FFF;
			padding: 10px;
			font-size: 18px;
		}
	</style>
	
	<script type="text/javascript">
		 

			$("#submit").on('click',function(){
				//console.log("submit");
				$.ajax({
					url:'${request.contextPath}/admins/login/islogin',
					type:'POST',
					data:$("#adminLoginForm").serialize(),		
					dataType:'json',			
					success:function(res){
						console.log(res.code);
						var result = JSON.stringify(res); //解析; 用户查看数据
						//成功处理
						if(res.code == 100){
							//confirm(res.message);
							window.location.href="${request.contextPath}/admins/index";
						}else{
							confirm(res.message);
						}
						
						
					},
					error:function(res){
						//失败 处理
						console.log(res.status);
						confirm("服务器出错 ！");
					}
				});
								
			});
		
		
	</script>
	
</body>
</html>