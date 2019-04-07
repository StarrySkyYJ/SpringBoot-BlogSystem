<!DOCTYPE html>
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">
  <meta name="_csrf" content="${_csrf.token}"/>
  <meta name="_csrf_header" content="${_csrf.headerName}"/>

  <title>博客后台管理系统</title>

  <!-- Custom fonts for this template-->
  <link href="${request.contextPath}/resource/startbootstrap-admin/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
  <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

  <!-- Custom styles for this template-->
  <link href="${request.contextPath}/resource/startbootstrap-admin/css/sb-admin-2.min.css" rel="stylesheet">
	
	<link href="${request.contextPath}/resource/startbootstrap-admin/vendor/datatables/dataTables.bootstrap4.min.css" rel="stylesheet">
	
	

</head>

<body id="page-top">

  <!-- Page Wrapper -->
  <div id="wrapper">

    <!-- Sidebar -->
    <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

      <!-- Sidebar - Brand -->
      <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index.html">
        <div class="sidebar-brand-icon rotate-n-15">
          <i class="fas fa-laugh-wink"></i>
        </div>
        <div class="sidebar-brand-text mx-3">后台管理 <sup>1</sup></div>
      </a>

      <!-- Divider -->
      <hr class="sidebar-divider my-0">

      <!-- Nav Item - Dashboard -->
      <li class="nav-item">
        <a class="nav-link" href="index.html">
          <i class="fas fa-fw fa-tachometer-alt"></i>
          <span>首页</span></a>
      </li>

      <!-- 下划线 Divider -->
      <hr class="sidebar-divider">

      <!-- 小标题 Heading -->
      <div class="sidebar-heading">
        	用户管理
      </div>
      
	  <!-- 按钮： Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link js_clickBtn" data-name="user/list" href="#">
          <i class="fas fa-fw fa-wrench"></i>
          <span>用户信息</span></a>
      </li>

      <!-- Divider -->
      <hr class="sidebar-divider">

      <!-- Heading -->
      <div class="sidebar-heading">
      	 管理员管理
      </div>
      
	  <!-- 按钮： Nav Item - Charts -->
      <li class="nav-item">
        <a class="nav-link disabled "  href="#" disabled="disabled">
          <i class="fas fa-fw fa-cog"></i>
          <span>管理员信息</span></a>
      </li>


      <!-- Divider -->
      <hr class="sidebar-divider d-none d-md-block">

      <!-- Sidebar Toggler (Sidebar) -->
      <div class="text-center d-none d-md-inline">
        <button class="rounded-circle border-0" id="sidebarToggle"></button>
      </div>

    </ul>
    <!-- End of Sidebar -->

    <!-- Content Wrapper -->
    <div id="content-wrapper" class="d-flex flex-column">

      <!-- Main Content -->
      <div id="content">

        <!-- Topbar -->
        <nav class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

          <!-- Sidebar Toggle (Topbar) -->
          <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

          <!-- Topbar Search -->
          <form class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search">
            <div class="input-group">
              <input type="text" class="form-control bg-light border-0 small" placeholder="搜索..." aria-label="Search" aria-describedby="basic-addon2">
              <div class="input-group-append">
                <button class="btn btn-primary" type="button">
                  <i class="fas fa-search fa-sm"></i>
                </button>
              </div>
            </div>
          </form>

          <!-- Topbar Navbar -->
          <ul class="navbar-nav ml-auto">

           <!--  <div class="topbar-divider d-none d-sm-block"></div> -->

            <!-- Nav Item - User Information -->
            <li class="nav-item dropdown no-arrow">
              <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                <span class="mr-2 d-none d-lg-inline text-gray-600 ">${Session.admin.username}</span>
                <img class="img-profile rounded-circle" src="${request.contextPath}/images/headIcon/5.jpg">
              </a>
              <!-- Dropdown - User Information -->
              <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                <a class="dropdown-item" href="#">
                  <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i>
                  		个人信息
                </a>
               
                <div class="dropdown-divider"></div>
                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                  <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i>
                  		退出
                </a>
              </div>
            </li>

          </ul>

        </nav>
        <!-- End of Topbar -->

        <!-- Begin Page Content -->
        <div class="container-fluid">
          
        
        
        
          	<!-- Page Heading -->
         	<h1 class="h3 mb-4 text-gray-800" style="text-align:center;margin-top:50px;">欢迎使用博客后台管理系统</h1>

        </div>
        <!-- /.container-fluid -->

      </div>
      <!-- End of Main Content -->

      <!-- Footer -->
      <footer class="sticky-footer bg-white">
        <div class="container my-auto">
          <div class="copyright text-center my-auto">
            <span>space &copy; 2019</span>
          </div>
        </div>
      </footer>
      <!-- End of Footer -->

    </div>
    <!-- End of Content Wrapper -->

  </div>
  <!-- End of Page Wrapper -->

  <!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Logout Modal-->
  <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog" role="document">
      <div class="modal-content">
        <div class="modal-header">
          <h5 class="modal-title" id="exampleModalLabel">确定退出?</h5>
          <button class="close" type="button" data-dismiss="modal" aria-label="Close">
            <span aria-hidden="true">×</span>
          </button>
        </div>
        <div class="modal-body">点击 “确定”按钮，将退出后台管理系统</div>
        <div class="modal-footer">
          <button class="btn btn-secondary" type="button" data-dismiss="modal">取消</button>
          <a class="btn btn-primary" href="${request.contextPath}/admins/loginOut">确定</a>
        </div>
      </div>
    </div>
  </div>

  <!-- Bootstrap core JavaScript-->
  <script src="${request.contextPath}/resource/startbootstrap-admin/vendor/jquery/jquery.min.js"></script>
  <script src="${request.contextPath}/resource/startbootstrap-admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="${request.contextPath}/resource/startbootstrap-admin/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="${request.contextPath}/resource/startbootstrap-admin/js/sb-admin-2.min.js"></script>
  
  
  <!-- Page level plugins -->
  <script src="${request.contextPath}/resource/startbootstrap-admin/vendor/datatables/jquery.dataTables.min.js"></script>
  <script src="${request.contextPath}/resource/startbootstrap-admin/vendor/datatables/dataTables.bootstrap4.min.js"></script>

  <!-- Page level custom scripts -->
  <script src="${request.contextPath}/resource/startbootstrap-admin/js/demo/datatables-demo.js"></script>
  
  
 	 <!-- js 单页面路由 -->
  <script type="text/javascript">
  	var header = $("meta[name='_csrf_header']").attr("content");
	var token = $("meta[name='_csrf']").attr("content");  
	
    $('.js_clickBtn').on('click',function(e){
      //var $target = $(event.target); //此处就是可以查看是那个点击的jQ对象
      
	  var URL = $(this).attr('data-name');
	  //console.log("url:",URL);
      //ajax
      $.ajax({
      	url:'${request.contextPath}/admins/'+URL,
      	type:'POST' ,
      	data:{
      		'pageNum': 1 ,
      		'pageSize': 5 
      	},
      	success:function(data){
      		console.log("ajax");
      		$(".container-fluid").empty();
      		$(".container-fluid").append(data);
      	},
      	error:function(data){
      		console.log(data);
      	}
      
      });      

    });
    
    $("nav_btn").on('click',function(){
    	console.log("分页点击事件");
    	
    });

  </script>

</body>

</html>
