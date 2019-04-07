<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>博客系统首页</title>

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

</head>
<body>

	<#include "index-top.ftl">

	<div class="container">
		<div class="row">
			<div class="col-sm-8"  id="indexBlogItems">
			
				<!-- <p>这是左边文章   使用 jq 动态获取 </p> -->

				



			</div> <!-- indexBlogItems -->
			
			
			
			<div class="col-sm-4">
				<!-- 这是右边标签 -->
				<!-- <h4>2.查询出 最热的标签</h4>
				<#list hotLabels as labels> <span>标签：${labels.lablesName}</span> 
				</#list> -->

				<div id="hot_item_label">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">热门标签</h3>
						</div>
						<div id="hot_labels" class="panel-body">
							<#list hotLabels as labels> <span
								class="label label-default">${labels.lablesName}</span> </#list>
						</div>
					</div>
				</div>

				<!-- <h4>3.热门用户</h4>
				<#list attentions as attention> <span>热门用户：${attention.user.id}.${attention.user.username}
				; </span> </#list> -->
				<div id="hot_item_user">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">热门用户</h3>
						</div>
						<div id="hot_user_icon" class="panel-body">
							<#list attentions as attention>
							<div id="img_headIcon" class="col-sm-4"
								onclick="userIconClick(${attention.user.id})"
								style="background-image: url('${request.contextPath}/images/headIcon/${attention.user.headImgUrl}');"></div>
							</#list>
						</div>
					</div>


				</div>

			</div>
		</div>
		<footer class="footer">
			<p>&copy; 2019 space.</p>
		</footer>
	</div>



	<style type="text/css">
	body{
		
	}
#img_headIcon {
	width: 50px;
	height: 50px;
	border-radius: 50px;
	background-size: cover;
	/* background-image: url('./image/headIcon/2.jpg'); */
}

#img_headIcon:hover {
	cursor: pointer;
	border: solid 2px #ffa200;
	background-color: #DDD;
}

#top_content {
	margin-top: 5px;
	margin-left: 25px;
	text-align: left;
}

#middle_content {
	width: 90%;
	overflow: hidden;
	display: -webkit-box;
	text-overflow: ellipsis; /*超过部分用点点表示*/
	-webkit-line-clamp: 3; /*规定超过两行的部分截断*/
	-webkit-box-orient: vertical;
	/* white-space: nowrap;  不换行*/
	margin-top: 5px;
	margin-bottom: 5px;
	margin-left: 20px;
	line-height: 20px;
	mix-height:50px;
}

#bottom_content {
	text-align: left;
	margin-bottom: 5px;
	margin-left: 20px;
}

#home_blog_item {
	border: solid 2px #e3e3e3;
	margin-bottom: 15px;
	cursor: pointer;
	background-color: #FCFCFC;
}

#home_blog_item:hover {
	background-color: #DDD;
}

a :hover {
	color: #ffa200;
}

#hot_item_label {
	text-align: left;
}

#hot_labels span {
	font-size: 12px;
	display: inline-block;
}

#hot_item_user {
	text-align: left;
}

#hot_user_icon div {
	margin-left: 2px;
	margin-bottom: 2px;
}
</style>
	<script type="text/javascript">
			var isHot  ;
			$(function(){
				//标识： 最新 index
				//      最热 indexHot
				isHot = "${isHot}"
				//console.log("index:"+isHot);
				
				//初次加载博客
				$.ajax({
					url:'${request.contextPath}/index/getBlogItems',
					type:'POST',
					data:{
						'pageNum':1 ,
						'isHot':isHot 
					},
					success:function(data){
						$("#indexBlogItems").empty();
						$("#indexBlogItems").append(data);
					}
					
				});
				
			});
		
			
			
	
	
	
			//跳转主页
			function userIconClick(i){
				window.open("${request.contextPath}/user/homePage?id="+i);
			}
			
			//跳转 查看具体文章
			function articleContent(index){
				window.location.href="${request.contextPath}/blog/content?id="+index;
			}
		</script>
</body>
</html>