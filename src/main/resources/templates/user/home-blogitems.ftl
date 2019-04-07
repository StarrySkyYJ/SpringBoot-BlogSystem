<meta charset="utf-8">

<div id="homeBlogItem">

	<#list blogList.list as blogItem>
	<div id="home_blog_item" onclick="blogItemClick(${blogItem.id});">
		<div id="top_content">
			<div style="padding-top: 5px;">
				<a href="${request.contextPath}/blog/content?id=${blogItem.id}"><span
					class="text-info" style="font-size: 20px;"><strong>${blogItem.articleTitle}</strong></span></a>
			</div>
		</div>
		<div id="middle_content">
			<span>${blogItem.articleContent?html}</span>
		</div>
		<div id="bottom_content">
			<span>发布于${blogItem.articleDate?string('yyyy-MM-dd
				HH:mm:ss')}&nbsp;&nbsp;</span> <span class="glyphicon glyphicon-eye-open"
				aria-hidden="true">${blogItem.articleViews}</span> <span
				class="glyphicon glyphicon-heart-empty" aria-hidden="true">${blogItem.articleNumLike}</span>
			<span class="glyphicon glyphicon-comment" aria-hidden="true">${blogItem.articleNumComments}</span>
		</div>
	</div>
	</#list>

	<!-- 分页 -->
	<div class="row">
		<div class="col-sm-12 col-md-5">
			<div class="dataTables_info" id="dataTable_info" role="status"
				aria-live="polite">总共${blogList.total}篇文章</div>
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
<!-- home_blog_item-->


<script type="text/javascript">
	   	var pageSize ;
	   	var isHot ;
	   	var id ;
		$(function() {
			isHot = "${isHot}";
			id = "${userId}" ; 
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
		        url:'${request.contextPath}/user/getUserBlogItems',
		        type:'POST',
		        data:{
		          'id':id, 
		          'pageNum':num ,
		          'isHot':isHot 
		        },
		        success:function(data){
		        	//console.log("nav_btn_ajax");
		          	$("#homeBlogItem").empty();
					$("#homeBlogItem").append(data);
		        }
		      });
			
		}
		
		
		
	</script>


