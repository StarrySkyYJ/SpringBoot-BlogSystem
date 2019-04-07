<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<title>博客编写</title>
<!-- Bootstrap -->
<link
	href="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script
	src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/jquery.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script
	src="${request.contextPath}/resource/bootstrap/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<!-- 引入 wangeditor  js -->
<script
	src="${request.contextPath}/resource/wangeditor/js/wangEditor.min.js"></script>

</head>
<body>
	<#include "index-top.ftl">

	<div class="container">
		<div class="row">
			<div class="col-sm-2 col-md-2" style="">
				<div class="btn-group btn-group-vertical btn-block " role="group"
					aria-label="...">
					<a type="button" href="${request.contextPath}/index/" class="btn btn-default btn-lg "><span
						class="glyphicon glyphicon-th-large"></span><span
						style="font-size: 14px;"> 返回首页</span></a> 
					<a type="button" href="${request.contextPath}/user/homePage?id=${Session.userSession.id}"
						class="btn btn-default btn-lg "><span
						class="glyphicon glyphicon-home"></span> <span
						style="font-size: 14px;"> 返回主页</span></a>
				</div>
			</div>


			<div class="col-sm-10 col-md-10">
				<!-- 文章标题 -->
				<div class="form-group" id="title">
					<label for="exampleInputEmail1 " class="sr-only">文章标题</label> 
					<input type="text" name="blogTitle" class="form-control input-lg"
						id="blogTitle" placeholder="输入文章标题">
				</div>

				<!-- 文章工具栏 -->
				<div id="editorToolbar" class="toolbar"></div>
				<!-- 文章内容 -->
				<div id="editorContext">
					
					
				</div>

				<!-- 文章其他信息 -->
				<div id="editorOther">

					<div id="contextLabels">
						<div class="form-inline">
							<div class="form-group">
								<label for="">文章标签：</label> <span><small
									style="color: #4f4f4f;">最多选择5个标签</small></span>
								<div id="labels"
									style="background-color: #DDD; margin-top: 5px; margin-left: 20px;">

									<ul style="">
										
										<li>
											<#list labels.list as lable>
												<div id="check" class="checkbox ">
													<label> <input name="checkbox" class="check_icon" type="checkbox"
														value="${lable.id}"> ${lable.lablesName}
													</label>
												</div>	
											</#list>
										</li>
										
									</ul>

								</div>
							</div>
						</div>
					</div>

					<!-- 选择文章分类 -->
					<div id="contextCategories">
						<div class="form-inline">
							<div class="form-group">
								<label for="exampleInputName2">文章分类:</label> 
								<select id="selectCategories"	class="form-control"
									style="background-color: #EEE; color: #000;">
									<option value="000" >选择分类</option>
									<#list blogCategories as categories>
										<option value="${categories.id}">${categories.categoriesName}</option>									
									</#list>
								</select>
							</div>
							<div></div>
						</div>
					</div>

					<!-- 发布博客按钮 -->
					<div id="blogSubimt">
						<a id="btn_submit" type="button" class="btn btn-default btn-lg">发布博客</a>
						<a id="btn_cancle" type="button" class="btn btn-default btn-lg">取消</a>

					</div>
				</div>

			</div>
		</div>
	</div>

	<script type="text/javascript">
		//配置wangeditor
		var editor;
		var checkBox; //复选框对象
		var checkBoxArray = new Array(); //复选框数组
		$(function() {
			if('${Session.userSession}'.length == 0){
				window.location.href="${request.contextPath}/user/login";
			}
			var E = window.wangEditor;
			editor = new E('#editorToolbar', '#editorContext');
			//配置菜单
			editor.customConfig.menus = [ 'head', // 标题
			'bold', // 粗体
			'fontSize', // 字号
			'fontName', // 字体
			'italic', // 斜体
			'underline', // 下划线
			'strikeThrough', // 删除线
			'foreColor', // 文字颜色
			'link', // 插入链接
			'code', // 插入代码			    
			'list', // 列表
			'justify', // 对齐方式
			'quote', // 引用
			'emoticon', // 表情
			'image', // 插入图片
			'table', // 表格			    
			]
			// editor.customConfig.uploadImgServer = '/upload'  // 上传图片到服务器
			editor.customConfig.uploadImgShowBase64 = true; // 使用 base64 保存图片
			editor.customConfig.debug = false ;
			// 将图片大小限制为 1M
			editor.customConfig.uploadImgMaxSize = 2*1024 * 1024;
			editor.create();
		});

		//提交按钮点击事件
		$("#btn_submit").on('click', function() {			
			//读取 text文本( 判断 文章内容是否为空)
			var contextText = editor.txt.text();			
			//读取 html 格式 (图片使用base64 直接保存在html中)
			var blogContext = editor.txt.html();
			
			if(contextText.trim().length == 0){
				console.log("文章内容为空");
				return false ;
			}
			
			//获取 标题
			var title = $("#blogTitle").val().trim();
			if(title.length == 0){
				console.log("请输入文章标题");
				return false ;
			}
			//获取文章分类
			var categories = $("#selectCategories option:selected").val();
			if(categories == 000){
				console.log("请选择文章分类!");
				return false ;
			}
			
			//获取文章分类
			
			checkBox.each(function(i){
				checkBoxArray[i] = $(this).val();
				console.log("checkBoxArray[i]:"+checkBoxArray[i]);
				
			});
			
			console.log("id:"+'${Session.userSession.id}');
			console.log(title);
			console.log(blogContext);
			console.log(categories);
			console.log(checkBoxArray);
			
			//保存
			$.ajax({
				url:'${request.contextPath}/blog/saveArticle',
				type:'POST',
				data:{
					'userId' : '${Session.userSession.id}',
					'articleTitle' : title ,
					'articleContent' : blogContext ,
					'categoriesId' : categories ,
					'labelsId' : checkBoxArray
				},
				success:function(data){
					//console.log(data);
					if(date.code == 100){
						confirm("发布成功！将跳转到 主页");
						window.location.href="${request.contextPath}/user/homePage?id=${Session.userSession.id}";
					}
				},
				error:function(data){
					console.log(data);
				}
				
				
			}); 
			

		});

		//图片上传 (直接通过文本的形式存储到数据库)
		
		
		//复选框 个数统计		
		$(".check_icon").on("click",function(){
			//console.log("checkbox 点击");
			checkBox = $("input[name='checkbox']:checked");
			//console.log("checkbox 个数:"+checkBox.eq(0).val());
			if(checkBox.length >= 5){
				$("input[name='checkbox']").not(":checked").addClass("disabled");
				$("input[name='checkbox']").not(":checked").prop("disabled","disabled");
			}else{
				$(".check_icon").removeClass("disabled");
				$(".check_icon").removeAttr("disabled");
			}
		});
	</script>

	<style type="text/css">
ul li {
	list-style-type: none;
}

body {
	background-color: #DDD;	
	margin-bottom: 30px;
	padding-bottom: 100px;
}

.col-md-10 {
	border-left: 1px solid #CCC;
}

.toolbar {
	border: 1px solid #ccc;
	background-color: #EEE;
	font-size: 18px;
}

#editorContext {
	background-color: #FFF;
	font-size: 16px;
	height: 400px;
	border: 1px solid #CCC;
}

#editorOther {
	margin-top: 5px;
	background-color: #FFF;
	padding: 20px;
	font-size: 16px;
	border: 1px solid #CCC;
}

#contextCategories {
	margin-top: 10px;
}

.btn-group {
	
}

.btn-lg:hover {
	background-color: #C92027;
	color: #FFF;
}

.check_icon {
	width: 16px;
	height: 16px;
}

#check {
	float: left;
	height: 25px;
	line-height: 25px;
	width: 150px;
	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
	margin: 0 16px 8px 0;
}

#blogSubimt {
	text-align: center;
	margin-top: 30px;
	margin-bottom: 20px;
	padding-bottom: 20px;
}

#btn_submit {
	border: 1px solid #C92027;
	color: #C92027;
	margin-right: 10px;
}

#btn_submit:hover {
	color: #FFF;
	background-color: #C92027;
	border: 1px solid #C92027;
}

#btn_cancle:hover {
	color: #FFF;
	background-color: #6c757d;
	border: 1px solid #6c757d;
}
</style>
</body>
</html>