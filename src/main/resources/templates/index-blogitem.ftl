
<meta charset="utf-8">

<div id="indexBlogItem">

	<#list blogList.list as bloglist>
	<div id="home_blog_item">
		<div id="top_content" class="row">
			<div id="img_headIcon" class="col-sm-4"
				onclick="userIconClick(${bloglist.userId})"
				style="background-image: url('${request.contextPath}/images/headIcon/${bloglist.user.headImgUrl}');"></div>
			<div class="col-sm-4" style="padding-top: 5px;">
				<a href="${request.contextPath}/blog/content?id=${bloglist.id}"><span
					class="text-info" style="font-size: 20px;"><strong>
							${bloglist.articleTitle}</strong></span></a>
			</div>
		</div>
		<div id="middle_content" onclick="articleContent(${bloglist.id})">
			<span>${bloglist.articleContent?html}</span>
		</div>
		<div id="bottom_content">
			<a href="${request.contextPath}/user/homePage?id=${bloglist.user.id}"><strong>${bloglist.user.username}</strong>
			</a>发布于<span>${bloglist.articleDate?string('yyyy-MM-dd
				HH:mm:ss')}&nbsp;&nbsp;</span> <span class="glyphicon glyphicon-eye-open"
				aria-hidden="true">${bloglist.articleViews}</span> <span
				class="glyphicon glyphicon-heart-empty" aria-hidden="true">${bloglist.articleNumLike}</span>
			<span class="glyphicon glyphicon-comment" aria-hidden="true">${bloglist.articleNumComments}</span>
		</div>
	</div>
	<!-- home_blog_item--> </#list>

	<div class="row">
		<div class="col-sm-12 col-md-5">
			<div class="dataTables_info" id="dataTable_info" role="status"
				aria-live="polite">总共${blogList.total}条数据</div>
		</div>
		<div class="col-sm-12 col-md-7">
			<div class="dataTables_paginate paging_simple_numbers"
				id="dataTable_paginate">
				<ul class="pagination" id="ul_li_click">
					<li id="btn-theFirstPage"
						class="paginate_button page-item previous "><a href="#"
						class=" " onclick="toPage(1)">首页</a></li>
					<li id="btn-prePage" class="paginate_button page-item previous">
						<a href="#" class="" onclick="toPage(${blogList.pageNum -1})">上一页</a>
					</li>
					<!--是否有上一页-->
					<#if blogList.hasPreviousPage>
					<li class="paginate_button page-item "><a id="btn-preNum"
						href="#" class="" onclick="toPage(${blogList.pageNum -1})">${blogList.pageNum
							-1}</a></li>
					</#if>
					<li class="paginate_button page-item active"><a
						id="btn-pageNum" href="#" class=""
						onclick="toPage(${blogList.pageNum})">${blogList.pageNum}</a></li>
					<!--是否有下一页-->
					<#if blogList.hasNextPage>
					<li class="paginate_button page-item "><a id="btn-nextNum"
						href="#" class="" onclick="toPage(${blogList.pageNum +1})">${blogList.pageNum+1}</a>
					</li>
					</#if>

					<li id="btn-nextPage" class=""><a id="nav_btn_next" href="#"
						class="" onclick="toPage(${blogList.pageNum +1})">下一页</a></li>
					<li id="btn-theEndPage" class="paginate_button page-item previous ">
						<a href="#" class="" onclick="toPage(${blogList.pages})">尾页</a>
					</li>

				</ul>
			</div>
		</div>
	</div>

</div>
<script type="text/javascript">
	   	var pageSize ;
	   	var isHot = null ;
		$(function() {
			isHot = "${isHot}";
			
			//判断 首页 ，尾页 ，上一页 ，下一页
			var isFirstPage = "${blogList.isFirstPage}";
			var isLastPage = "${blogList.isLastPage}";
			//首页禁用
			if(isFirstPage == "true" ){
				//是第一页
				$("#btn-theFirstPage").addClass("disabled");
				$("#btn-prePage").addClass("disabled");			
			}
			
			if(isLastPage == "true" ){
				//是第一页
				$("#btn-nextPage").addClass("disabled");
				$("#btn-theEndPage").addClass("disabled");
			}
			
			//禁用 li的点击事件
			$(".disabled").css('pointer-events','none');
		});
		
		
		//跳转第几页
		function toPage(num){
			//console.log("跳转的页数:"+num);
			//console.log("获取的数据数量:"+pageSize);
			//console.log("isHot:"+isHot);
			$.ajax({
		        url:'${request.contextPath}/index/getBlogItems',
		        type:'POST',
		        data:{
		          'pageNum':num ,
		          'isHot':isHot 
		        },
		        success:function(data){
		        	//console.log("nav_btn_ajax");
		          	$("#indexBlogItem").empty();
					$("#indexBlogItem").append(data);
		        }
		      });
			
		}
		
		
		
	</script>


