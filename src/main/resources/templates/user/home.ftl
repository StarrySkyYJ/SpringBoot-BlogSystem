<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>个人主页 </title>

    <!-- 引入jquery -->
    <script src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/jquery.min.js"></script>

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
	
		<!-- 头部 -->
		<div class="title-box">
			<div class="row">
				<div class="col-sm-4 ">
					<span class="title-blog"><strong>${user.username}的博客</strong></span>
				</div>
	
				<!-- 关注按钮 ; (先不做)  -->
				<!-- <div class="col-sm-8" >
					<button  type="button" class="btn btn-danger btn_blog">
						<span class="glyphicon glyphicon-plus">关注</span> 
					</button>
				</div> -->
			</div>			
			
		</div>
		
		<!-- 左边 -->
		<div class="row">
			
			<div class="col-sm-4 ">
				<!-- 个人信息 -->
				<div id="left_user"  >
					
					<!-- 头像 -->
					<div  id="left_user_info"  >
						<div id="img_headIcon" style="background-image: url('${request.contextPath}/images/headIcon/${user.headImgUrl}');">							
														
						</div>
						<form id="imageForm" >
							<input id="imageFile" multiple="multiple" accept="image/*" type="file" name="file" style="display:none;">
						</form>
						<div id="left_user_name"  >
							<span class="text-info glyphicon glyphicon-user"  ><strong> ${user.username}</strong></span><br>	
							<span class="text-info glyphicon glyphicon-envelope" > ${user.email}</span>		
						</div>
						
					</div><!-- left_user_info -->
					
					<!-- 统计 -->

				</div >	<!-- 个人信息 -->

				<!-- 分类 -->
				<div id="blog_categories" style="text-align:left;">
					<ul class="list-group">
						<li class="list-group-item" style="background-color: #DDD;"><span class="glyphicon glyphicon-list" > </span> &nbsp;<strong>文章分类</strong></li>
						<#list categoriesList as bcList>
							<a href=""><li class="list-group-item">${bcList.categoriesName} <span class="badge">${bcList.blogArticles?size}</span></li></a>							
						</#list>
					</ul>

				</div><!-- blog_categories -->

			</div> <!-- col-sm-4 -->

			<div class="col-sm-8" style="text-align:left;">
				<!-- <p>这是左边文章</p> -->
				
				<div id="blog_item_header" >
					<span >排序：</span>
					<a class="btn active" id="btn_orderDefault">默认</a>
					<a class="btn" id="btn_orderViewNum">访问量</a>
				</div>
				
				<div id="homeBlogItem">
				
				<!-- <#list user.blogArticles as blogItem>
					<div id="home_blog_item" onclick="blogItemClick(${blogItem.id});">
						<div  id="top_content" >						
							<div style="padding-top: 5px; ">
								<a href="${request.contextPath}/blog/content?id=${blogItem.id}"><span class="text-info" style="font-size:20px;"><strong>${blogItem.articleTitle}</strong></span></a>
							</div>
						</div>					
						<div id="middle_content" >
							<span>${blogItem.articleContent}</span>
						</div>
						<div id="bottom_content">
							<span>发布于${blogItem.articleDate?string('yyyy-MM-dd HH:mm:ss')}&nbsp;&nbsp;</span>
							<span class="glyphicon glyphicon-eye-open" aria-hidden="true">${blogItem.articleViews}</span>
							<span class="glyphicon glyphicon-heart-empty" aria-hidden="true">${blogItem.articleNumLike}</span>
							<span class="glyphicon glyphicon-comment" aria-hidden="true">${blogItem.articleNumComments}</span>
						</div>
					</div> home_blog_item				
				</#list> -->
			
				</div>


		
			</div><!-- col-sm-8-->



		</div>
		

		<footer class="footer" style="margin-top: 20px;">
			<p>&copy; 2018 space.</p>
		</footer>
		
	</div>
	
	
	
	
	
	
	<!-- <#if Session["userSession"]?exists>
		<p>登录的用户名：${userSession.username};</p>
	<#else>
		<a href="${request.contextPath}/user/login" >请登录</a>
	</#if> -->
	
			
	<style type="text/css">
	
	
	.title-box{
		height: 50px;
		margin-bottom: 20px;
		margin-top: 10px;
		

	}
	.title-blog{
		color: #ffa200;
		font-size: 24px;
		margin-left: 20px;
	}
	.btn_blog{
		margin-left: 20px;
		

	}


	#img_headIcon{
		width: 150px ;
		height:150px ;
		border-radius: 30px ;
		background-size: cover ;
		/* background-image: url('./image/headIcon/2.jpg'); */
		margin-left: 20px;

	}
	#left_user{
		width: 90%;
		text-align:left;
	}

	#left_user_info{
		border-bottom: solid 1px #e3e3e3;
		padding-bottom: 10px;
		position: relative
	}
	#left_user_name{
		margin-top: 10px;
		margin-left: 20px;
		font-size: 16px;
	}

	#left_user_article{
		text-align: center;
		line-height: 16px;
		margin-top: 20px;
		border-bottom: solid 1px #e3e3e3;
		padding-bottom: 20px;
	}
	

	#blog_categories{
		margin-top: 30px;
		width: 90%;
	}


	#blog_item_header{		
		margin-bottom: 10px;
		border-bottom: solid 1px #e3e3e3;
	}


	#home_blog_item{
		border: solid 2px #e3e3e3;
		margin-bottom: 15px;
		cursor:pointer;
		background-color: #FCFCFC;
	}
	#home_blog_item:hover{
		background-color: #DDD;
	}
	a :hover{
		color:#ffa200 ;
	}
	#img_headIcon:hover{
		color:#ffa200 ;
		border:3px solid #ffa200;
		cursor:pointer;
	}

	#top_content{
		margin-top: 5px;
		margin-left: 25px;
		text-align: left;
	}
	#middle_content{
		width: 90%;		
		overflow: hidden ;	
		display: -webkit-box;　			
		text-overflow: ellipsis;  /*超过部分用点点表示*/
		-webkit-line-clamp: 3; /*规定超过两行的部分截断*/
		-webkit-box-orient: vertical;

		/* white-space: nowrap;  不换行*/
		/*
		margin-top: 5px;
		margin-bottom: 10px;
		margin: 10px auto;*/
		margin-top: 5px;
		margin-bottom: 5px;
		margin-left: 20px;
		line-height: 20px;

	}
	#bottom_content{
		padding-left: 25px;
		margin-bottom: 5px;
		text-align: left;
	}
	
	
</style>
<script type="text/javascript">
	var id ; 
	var isHot ;
	$(function(){
		//获取 个人所有文章
		id = "${user.id}";	
		//默认取最新
		isHot = "index";
		
		getBlogItem(isHot);		
		
	});
	
	//默认情况下 ; 最新消息
	function getBlogItem(hot){
		$.ajax({
	        url:'${request.contextPath}/user/getUserBlogItems',
	        type:'POST',
	        data:{
	          'id':id , 
	          'pageNum':1 ,
	          'isHot':hot 
	        },
	        success:function(data){
	        	//console.log("nav_btn_ajax");
	          	$("#homeBlogItem").empty();
				$("#homeBlogItem").append(data);
	        }
	      }); 
		
	}
	


	function blogItemClick(i){
		// 查看文章
		window.location.href="${request.contextPath}/blog/content?id="+i;
		
	}
	
	
	//排序按钮 ; 默认
	$("#btn_orderDefault").on('click',function(){
		$(this).addClass("active");
		$("#btn_orderViewNum").removeClass("active");
		isHot = "index" ;
		getBlogItem(isHot);
		
	});
	
	//排序按钮 ; 访问量
	$("#btn_orderViewNum").on('click',function(){
		$(this).addClass("active");
		$("#btn_orderDefault").removeClass("active");
		isHot = "indexHot";
		getBlogItem(isHot);
		
	});
	
	//图片  上传
	$("#img_headIcon").on('click',function(){
		//console.log("click");
		//$("#imageFile").click();		
	
		/* $.ajax({
			url:'imageUpload' ,
			
			
		}); */
		
	});
	$("#imageFile").on('change',function(){
		var image = $("#imageFile").val();
		var start = image.indexOf('.')+1;
		var name = image.substring(start,image.length).toLowerCase();
		if(name != "jpg" && name != "png" && name!= "gif" && name != "jpeg"){
			console.log("图片格式不正确");
			return false ;
		}
		imageUpload();
	});
	function imageUpload(){
		var formData = new FormData($("#imageForm")[0]);
		$.ajax({
			url:'${request.contextPath}/user/imageUpload' ,
			type:'POST',
			data:formData ,
			cache: false ,
			contentType:false ,
			processData:false ,
			success:function(data){
				console.log("ajax返回值"+data);
			}
		});
	}
</script>
</body>
</html>