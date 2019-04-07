<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>博客文章</title>

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
	<!--用户信息-->
	<!--用户文章列表-->
	<div class="container">
	
		<!-- 头部 -->
		<div class="title-box">
			<div class="row">
				<div class="col-sm-4 ">
					<span class="title-blog"><strong>${blogArticle.user.username}的博客</strong></span>
				</div>

				<div class="col-sm-8" >
					<!-- <button  type="button" class="btn btn-danger btn_blog">
					<span class="glyphicon glyphicon-plus">关注</span></button> -->
					
				</div>
			</div>			
			
		</div>
		
		<!-- 左边 -->
		<div class="row">
			
			<div class="col-sm-4 ">
				<!-- 个人信息 -->
				<div id="left_user"  >
					
					<!-- 头像 -->
					<div  id="left_user_info"  >
						<div id="img_headIcon" style="background-image: url('${request.contextPath}/images/headIcon/${blogArticle.user.headImgUrl}');">							
						</div>
						<div id="left_user_name"  >
							<span class="text-info glyphicon glyphicon-user"  ><strong> ${blogArticle.user.username}</strong></span><br>	
							<span class="text-info glyphicon glyphicon-envelope" > ${blogArticle.user.email}</span>		
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
				<!--<p>查看具体文章</p>
				<div>用户头像：${blogArticle.user.headImgUrl}</div>
				<div>用户名：${blogArticle.user.username}</div>
				<div>文章标题：${blogArticle.articleTitle}</div>
				<div>发布时间：${blogArticle.articleDate?string('yyyy-MM-dd HH:mm:ss')}</div>
				<div>文章内容：${blogArticle.articleContent}</div>
				<div>访问量：${blogArticle.articleViews}</div>
				<div>点赞量：${blogArticle.articleNumLike}</div>
				<div>评论量：${blogArticle.articleNumComments}</div>
				<div>${blogArticle.articleTitle}</div> -->
			
				<div id="right_content">

						<div id="blog_content_top">
							
							<div id="content_title" class="row">						
								<div class="col-sm-6 col-md-6">
									<span class="text-info" style="font-size:24px;"><strong> ${blogArticle.articleTitle}</strong></span>
									<span style="margin-right: 0px;"><small> </small></span>
								</div>
								
								<div class="col-sm-6 col-md-6" style="text-align: right;">
									<#if Session["userSession"]?exists && Session.userSession.username == blogArticle.user.username>
										<button type="button" class="btn btn-primary btn-sm">编辑</button>
										<button type="button" class="btn btn-danger btn-sm">删除</button>
									</#if>
								</div>
							</div>					
							<div id="blog_time">
								<span>${blogArticle.articleDate?string('yyyy-MM-dd HH:mm:ss')}&nbsp;&nbsp;</span>
								<span>${blogArticle.user.username}&nbsp;&nbsp;</span>
								<span class="small">访问量:${blogArticle.articleViews}</span>
								<span class="small">点赞量:${blogArticle.articleNumLike}</span>
								<span class="small">评论量:${blogArticle.articleNumComments}</span>

								<!-- <span >标签：</span>-->
							</div>
						</div> <!-- blog_content_top-->
						
						<!-- 文章内容 -->
						<div id="content_main">
							<div id="userBlogContent" class="userBlogContent">
								${blogArticle.articleContent}
							</div>
							<div class="border"></div>
							<div style="text-align: center ;" id="div_more">
								<a id="btn_readMore" class="btn ">阅读更多</a>
							</div>
							
						</div>						
					</div>

					<!-- 文章评论 -->
					<div id="blog_comments">
						<!-- w文章评论 session -->
						<!-- 用户未登陆 ，不显示 -->
						<#if Session["userSession"]?exists>							
							<div class="row" >
								<div id="img_coment_headIcon" class="col-sm-2" style="background-image: url('${request.contextPath}/images/headIcon/${Session.userSession.headImgUrl}');">							
								</div>
								<div class="col-sm-10">
									<div class="input-group">
										<input type="text" class="form-control" placeholder="想对作者说些什么...">
										<span class="input-group-btn">
											<button class="btn btn-danger" type="button">发送</button>
										</span>
									</div><!-- /input-group -->
								</div>
	
							</div>
						</#if>

						<!-- 评论-->
						<!-- <#list commentsList as comments>
							<span>用户：  首评：${comments.commentsContent},
							时间：${comments.commentsDate?string('yyyy-MM-dd HH:mm:ss')}点赞数：${comments.commentsNumLike} </span><br>
							<#list comments.blogCommentsReplies as commentReplies >
								<span>${commentReplies.user.username}回复 ${commentReplies.replyUser.username} 
								内容： ${commentReplies.replyUser.content} ；点赞数：${commentReplies.replyUser.contentNumLike}  </span>
							</#list>
							<br>
						</#list> -->
						<!-- 文章 所有评论 -->
						<#assign num = 0>
						<#list commentsList as comments>
							<div id="blog_comments_list">
	
								<ul class="list-group">
									<li class="list-group-item" id="first_comments">
										<span class="badge glyphicon glyphicon-thumbs-up badge_comment" > ${comments.commentsNumLike!'0'}</span>							
										<div class="row" >
											<div id="img_raply_top_headIcon" class="col-sm-4 comments_icon " style="background-image: url('${request.contextPath}/images/headIcon/${comments.user.headImgUrl}');">							
											</div>
											<div class="col-sm-8">
												<div style="margin-top:5px;padding: 0 5px;">
													<span>用户：</span>
													<span>${comments.commentsContent}</span>
													<span>(${comments.commentsDate?string('yyyy-MM-dd HH:mm:ss')} , #${num+1}楼)</span>
	
												</div>
												
											</div>
										</div>		
										
									</li>
								<#list comments.blogCommentsReplies as commentReplies >
									<li class="list-group-item">
										<div>
											<ul id="comment_reply" class="list-group">
												<li class="list-group-item">
													<span class="badge glyphicon glyphicon-thumbs-up badge_comment" > 1</span>							
													<div class="row" >
														<div id="img_raply_headIcon" class="col-sm-4" style="background-image: url('${request.contextPath}/images/headIcon/${commentReplies.user.headImgUrl}');">							
														</div>
														<div class="col-sm-8">
															<div style="padding: 0 5px;">
																<span>${commentReplies.user.username}</span>
																<span style="color:#999 ">回复 ${commentReplies.replyUser.username}:</span>
																<span> ${commentReplies.content} </span>
																<span>(${commentReplies.createtime?string('yyyy-MM-dd HH:mm:ss')})</span>
	
															</div>
	
														</div>
													</div>
												</li>
												
											</ul>
	
										</div>
									</li>
								</#list>
								</ul>
	
	
							</div><!--blog_comments_list -->						
						</#list>
					</div>
						
			</div><!-- col-sm-8-->



		</div>
		

		<footer class="footer" style="margin-top: 20px;">
			<p>&copy; 2019 space.</p>
		</footer>
		
	</div>
	
	
	
	
	
	
	<!-- <#if Session["userSession"]?exists>
		<p>登录的用户名：${userSession.username};</p>
	<#else>
		<a href="${request.contextPath}/user/login" >请登录</a>
	</#if> -->
	
			
	<script type="text/javascript">
		$(function(){
			var text =$("#userBlogContent").text();
			//console.log(text.length);
			if(text.length <= 800){
				$("#userBlogContent").removeClass('userBlogContent');
				$("#div_more").css('display','none');
			}
			
		});
	
		$("#btn_readMore").on('click',function(){
			$("#userBlogContent").removeClass('userBlogContent');
			$("#div_more").css('display','none');
			 var target_top = $(".list-group-item").offset().top;
			//$("html,body").animate({scrollTop:target_top},1000);
			$("html,body").scrollTop(target_top); 
		});
	
	</script>
	
	
	
	
	
	
	
	<style type="text/css">
	.userBlogContent{
		overflow: hidden;
		display: -webkit-box;
		text-overflow: ellipsis; /*超过部分用点点表示*/
		-webkit-line-clamp: 25; /*规定超过两行的部分截断*/
		-webkit-box-orient: vertical;
		/* white-space: nowrap;  不换行*/
	}
	body{
		background-color: #EEE;
	}
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
	
	.small{
		border-left:solid 2px #AAA;
		padding-left:5px;
		padding-right:10px;
	}

	#img_headIcon{
		width: 150px ;
		height:150px ;
		border-radius: 30px ;
		background-size: cover ;
		/* background-image: url('./image/headIcon/2.jpg'); */
		margin-left: 20px;

	}
	
	#img_coment_headIcon{
		width: 30px ;
		height:30px ;
		border-radius: 50% ;
		background-size: cover ;
		/* background-image: url('./image/headIcon/2.jpg'); */
		margin-left: 20px;
		
	}
	
	#img_raply_top_headIcon{
		width: 30px ;
		height:30px ;
		border-radius: 50% ;
		background-size: cover ;
		/* background-image: url('./image/headIcon/2.jpg'); */
		margin-left:5px;
	}
	#img_raply_headIcon{
		width: 30px ;
		height:30px ;
		border-radius: 50% ;
		background-size: cover ;
		/* background-image: url('./image/headIcon/2.jpg'); */
		margin-left:20px;
		padding:0px;
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
	}
	#home_blog_item:hover{
		background-color: #DDD;
	}
	a :hover{
		color:#ffa200 ;
	}
	#btn_readMore{
		border: solid 1px #ca0c16;
		color: #ca0c16 ;
		
		box-shadow: 0 2px 4px 0 rgba(0,0,0,0.05);
	}
	#btn_readMore:hover{
		background-color: #fde3e4 ;
	}
	.border {
	    -webkit-box-shadow: 0 2px 4px 0 rgba(0,0,0,0.05);
	    box-shadow: 0 2px 4px 0 rgba(0,0,0,0.05);
	    width: 100%;
	    height: 2px;
	    margin-bottom: 10px;
	}
	
	#right_content{
		padding-left: 20px;
		background-color: #fff;
		padding-right: 20px;
	}

	#blog_content_top{
		border-bottom: solid 2px #e3e3e3;
	}
	#content_title{
		padding-top: 20px;
	}
	#blog_time{
		margin-top: 10px;
		margin-bottom: 10px;
		font-size: 16px;
	}
	#content_main{
		margin-top: 20px;
		font-size: 16px;
		padding-bottom: 20px;
		
		
	}
	
	
	#blog_comments{
		margin-top: 5px;
		background-color: #fff;
		padding: 20px;
	}
	
	.input-group{
		
	}
	
	#blog_comments_list{
		margin-top: 10px;
		font-size: 14px;
		border-bottom: dashed 2px #e3e3e3;
	}
	
	.comments_icon{
		
	}	
		
	.list-group li{
		border-style: none;
	}
	#comment_reply{
		list-style-type: none;
		font-size: 14px;
		margin-bottom: -10px;
		margin-left:20px;
		word-break:break-all;
	}
	#comment_reply li{
		border-style: none;
		border-left: solid 3px #AAA ;
		padding-left: 5px;
		line-height: 30px;
	}

	.badge_comment{
		color: #000;
		background-color: #FFF;
	}
	
	
	
</style>
</body>
</html>