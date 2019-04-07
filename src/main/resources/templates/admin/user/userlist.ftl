<!-- 响应式表格-->
<div id="change">
  <div class="card shadow mb-4">
    <div class="card-header py-3">
      <h6 class="m-0 font-weight-bold text-primary">用户信息</h6>
    </div>
    <div class="card-body">
      <div class="table-responsive">
        <div id="dataTable_wrapper" class="dataTables_wrapper dt-bootstrap4">
          <div class="row">
            <div class="col-sm-12 col-md-6">
              <div class="dataTables_length" id="dataTable_length">
                <label>显示 
                  <select id="selectPageSize" name="dataTable_length" aria-controls="dataTable" class="custom-select custom-select-sm form-control form-control-sm">
                    <option class="btn_option" value="5">5</option>
                    <option class="btn_option" value="10">10</option>
                    <option class="btn_option" value="20">20</option>
                    <option class="btn_option" value="50">50</option>
                  </select> 条数据</label>
                </div>
              </div>
              <div class="col-sm-12 col-md-6">
                <div id="dataTable_filter" class="dataTables_filter">
                  <label>搜索:<input type="search" class="form-control form-control-sm disabled" placeholder="" aria-controls="dataTable" disabled="disabled">
                  </label>
                </div>
              </div>
            </div>

            <div class="row">
              <div class="col-sm-12">
                <table class="table table-hover table-bordered dataTable"id="dataTable" width="100%" cellspacing="0" role="grid" aria-describedby="dataTable_info" style="width: 100%;">
                  <thead>
                    <tr role="row">
                    	<th class="sorting_asc" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Name: activate to sort column descending" style="width: 62.6px;" aria-sort="ascending">序号</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 80.2px;">姓名</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 56.2px;">密码</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 30.6px;">性别</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 68.2px;">生日</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 66.8px;">电话</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 66.8px;">邮箱</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 66.8px;">地址</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 66.8px;">注册时间</th>
                    	<th class="sorting" tabindex="0" aria-controls="dataTable" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 66.8px;">操作</th>
                    </tr>
                  </thead>

				<#list userPageInfo as pageInfo>
	           
	            
	              <#list pageInfo.list as user>	            
                  <tr>
                    <td >${user.id}</td>
                    <td >${user.username}</td>
                    <td >
                    	<#if Session.svip?exists >
                    		${user.password}
                    	<#else>${user.password?substring(0,1)}*******
                    	</#if>
                    </td>
                    <td >${user.sex} </td>
                    <td >${user.birthday}</td>
                    <td >${user.mobile}</td>
                    <td >${user.email}</td>
                    <td >${user.address}</td>
                    <td >${user.registerTime?string('yyyy-MM-dd	HH:mm:ss')}</td>
                    <td style="color:#FFF;">
                    	<div class="btn-group btn-group-justified  btn-xs" role="group" aria-label="...">
						  
						  <a type="btn" class="btn btn-warning btn-sm" onclick="btn_SetChange(${user_index})">修改</a>
						  <a type="btn" class="btn btn-danger btn-sm disabled" >删除</a>
						</div>
                    </td>
                    
                  </tr>				
	            
	            </#list>
	            </#list>
				
                </table>
              </div>
            </div>

            
            <div class="row">
              <div class="col-sm-12 col-md-5">
                <div class="dataTables_info" id="dataTable_info" role="status" aria-live="polite">总共${userPageInfo.total}条数据</div>
              </div>
              <div class="col-sm-12 col-md-7">
                <div class="dataTables_paginate paging_simple_numbers" id="dataTable_paginate">
                  <ul class="pagination" id="ul_li_click">
                  	<li id="btn-theFirstPage" class="paginate_button page-item previous ">
                      <a href="#" aria-controls="dataTable" data-dt-idx="0" tabindex="0" class="page-link " onclick="toPage(1)" >首页</a>
                    </li>
                    <li id="btn-prePage" class="paginate_button page-item previous" >
                      <a href="#" aria-controls="dataTable" data-dt-idx="0" tabindex="0" class="page-link" onclick="toPage(${userPageInfo.pageNum -1})">上一页</a>
                    </li>
                    <!--是否有上一页-->
                    <#if userPageInfo.hasPreviousPage>
                    <li class="paginate_button page-item ">
                      <a id="btn-preNum" href="#" aria-controls="dataTable" data-dt-idx="1" tabindex="0" class="page-link" onclick="toPage(${userPageInfo.pageNum -1})">${userPageInfo.pageNum -1}</a>
                    </li>
                    </#if>
                    <li  class="paginate_button page-item active">
                      <a id="btn-pageNum" href="#" aria-controls="dataTable" data-dt-idx="2" tabindex="0" class="page-link" onclick="toPage(${userPageInfo.pageNum})">${userPageInfo.pageNum}</a>
                    </li>
                     <!--是否有下一页-->
                     <#if userPageInfo.hasNextPage>
                    <li class="paginate_button page-item ">
                      <a id="btn-nextNum" href="#" aria-controls="dataTable" data-dt-idx="3" tabindex="0" class="page-link" onclick="toPage(${userPageInfo.pageNum +1})">${userPageInfo.pageNum+1}</a>
                    </li>
                    </#if>
                    
                    <li id="btn-nextPage" class="paginate_button page-item next" >
                      <a id="nav_btn_next" href="#" aria-controls="dataTable" data-dt-idx="7" tabindex="0" class="page-link" onclick="toPage(${userPageInfo.pageNum +1})">下一页</a>
                    </li>
                    <li id="btn-theEndPage" class="paginate_button page-item previous " >
                      <a href="#" aria-controls="dataTable" data-dt-idx="0" tabindex="0" class="page-link" onclick="toPage(${userPageInfo.pages})">尾页</a>
                    </li>
                    
                  </ul>
                </div>
              </div>
            </div>         
            
          </div>
        </div>
      </div>
    </div>
  </div>
  
  

  
  <div>
  <div id="SetModal" class="modal fade bs-example-modal-lg" tabindex="-1" role="dialog" data-backdrop="static">
  <div class="modal-dialog modal-lg" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close" style="margin-left:0px;"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title">用户修改</h4>
      </div>
      <div class="modal-body">
        <form  id="modal_form_update" class="form-inline">
		<table class="table table-bordered  table-striped table-hoverd">
		  
		  	 <thead>用户具体信息</ thead>
		  	<input type="hidden"  id="modal-id"  name="id" >
		  <tr>
		  	<td >
				<div class="form-group">
				    <label for="exampleInputName2">姓名: </label>
				    <input type="text" class="form-control" id="modal-username" name="username" placeholder="NULL">
				  </div>
				 
			</td>
		  	<td>
				<div class="form-group">
				    <label for="exampleInputName2">密码: </label>
				    <input type="text" class="form-control" id="modal-password" name="password" placeholder="NULL">
				  </div>
			</td>
		  <tr>
		  <tr>
		  	<td >
				<div class="form-group">
				    <label for="exampleInputName2">性别: </label>
				    <input type="text" class="form-control" id="modal-sex" name="sex" placeholder="NULL">
				  </div>
				 
			</td>
		  	<td>
				<div class="form-group">
				    <label for="exampleInputName2">生日: </label>
				    <input type="text" class="form-control" id="modal-birthday" name="birthday" placeholder="NULL">
				  </div>
			</td>
		  <tr>
		  <tr>
		  	<td >
				<div class="form-group">
				    <label for="exampleInputName2">电话: </label>
				    <input type="text" class="form-control" id="modal-mobile" name="mobile" placeholder="NULL">
				  </div>
				 
			</td>
		  	<td>
				<div class="form-group">
				    <label for="exampleInputName2">邮箱: </label>
				    <input type="text" class="form-control" id="modal-email" name="email" placeholder="NULL">
				  </div>
			</td>
		  <tr>
		  <tr>
		  	<td >
				<div class="form-group">
				    <label for="exampleInputName2">地址: </label>
				    <input type="text" class="form-control" id="modal-address" name="address" placeholder="NULL">
				  </div>
				 
			</td>
		  	<td>
				<div class="form-group">
				    <label for="exampleInputName2">注册时间: </label>
				    <input type="text" class="form-control" id="modal-registerTime" name="registerTime" placeholder="NULL">
				  </div>
			</td>
		  <tr>
		  
		</table>
	</form>

      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        <button type="button" class="btn btn-danger" id="btn_update">保存修改</button>
      </div>
    </div><!-- /.modal-content -->
  </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</div> 

	

  <!--/**
   * PageInfo{
   *  pageNum=1, pageSize=5, size=5, startRow=1, endRow=5, total=7, pages=2, 
   * list=Page{count=true, pageNum=1, pageSize=5, 
   *  startRow=0, endRow=5, total=7, pages=2, reasonable=true, pageSizeZero=false}
   * 
   * [com.space.entity.User@1cab19e2, 
   * com.space.entity.User@6879e983, 
   * com.space.entity.User@196d684b, 
   * com.space.entity.User@45d38165, 
   * com.space.entity.User@1f3f434], 
   *
   * prePage=0, nextPage=2, isFirstPage=true, 
   * isLastPage=false, hasPreviousPage=false,
   *  hasNextPage=true, navigatePages=8, 
   *  navigateFirstPage=1, navigateLastPage=2, navigatepageNums=[1, 2]}
   * @throws Exception
   */-->
   <script type="text/javascript">
   	var pageSize ;
	$(function() {
		//不是超级管理员  确认修改
		if ("${Session.svip}".length == 0) {
			$("#btn_update").addClass('disabled');
		}
		
		//修改 选中项 默认值
		var optionPageSize = "${userPageInfo.pageSize}"
		$("#selectPageSize").find("option[value='${userPageInfo.pageSize}']").attr("selected",true);
		
		//判断 首页 ，尾页 ，上一页 ，下一页
		var isFirstPage = "${userPageInfo.isFirstPage}";
		var isLastPage = "${userPageInfo.isLastPage}";
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
	
	//测试: 能否点击
	 $("#btn-theFirstPage").on('click',function(){
	 	console.log("禁用点击") ;
	 });
	
	
	

	//绑定 数据量选择 
	$("#selectPageSize").on('change',function(){
		pageSize = $("#selectPageSize option:selected").val();
		//console.log("选择点击:数据量："+pageSize);
		toPage(1) ;
	});
	
	//跳转第几页
	function toPage( num ){
		pageSize = $("#selectPageSize option:selected").val();
		//console.log("跳转的页数:"+num);
		//console.log("获取的数据数量:"+pageSize);
		
		$.ajax({
        url:'${request.contextPath}/admins/user/list',
        type:'POST',
        data:{
          'pageNum':num,
          'pageSize':pageSize
        },
        success:function(data){
          console.log("nav_btn_ajax");
          $("#change").empty();
          $("#change").append(data);
        }
      });
		
	}
	
	
	
	
	//修改 模态框
	function btn_SetChange(list_index){
		//console.log(list_index);
		$('#SetModal').modal('show');
		var i = 0 ;
		
		//js中嵌套  freemarker
		<#list userPageInfo.list as userList>
			if(i == list_index){
				//console.log("取得 freemarker 值"+i);
				// 赋值给 modal
				$("#modal-id").attr("value","${userList.id}"); //隐藏属性
				$("#modal-username").attr("value","${userList.username}");
				if ("${Session.svip}") {
					$("#modal-password").attr("value","${userList.password}");
				}else{
					$("#modal-password").attr("value","${userList.password?substring(0,1)}*******");
				}
				
				$("#modal-sex").attr("value","${userList.sex}");
				$("#modal-birthday").attr("value","${userList.birthday}");
				$("#modal-mobile").attr("value","${userList.mobile}");
				$("#modal-email").attr("value","${userList.email}");
				$("#modal-address").attr("value","${userList.address}");
				$("#modal-registerTime").attr("value","${userList.registerTime?string('yyyy-MM-dd HH:mm:ss')}");
			}
			i++;
		</#list>
		
		
	}
	
	//保存 修改
	$("#btn_update").on('click',function(){
		var isUpdate = confirm("是否确认修改?");
		if(isUpdate == true){
			//console.log("修改");
			
			$.ajax({
				url:'${request.contextPath}/admins/user/update',
				data: $("#modal_form_update").serialize(),
				type:"POST",
				success:function(data){
					//console.log(data.code);					
					if(data.code == 100){
						confirm(data.message);
						$('#SetModal').modal('hide');//隐藏模态框
						toPage(1); //重新获取第一页数据
					}
				}
			});		
			
		}else{
			console.log("已取消修改操作！");
		}
	});
	
	
	
	//删除
	function btn_SetDelete(id){
		console.log(id);
		console.log( ${assignNum});
	}
	
	
	

  </script>
