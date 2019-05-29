<!DOCTYPE html>
<!-- saved from url=(0076)file:///C:/Users/Pallavi/Desktop/Project%20HTMLS/HomeV9%20-%20Analytics.html -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Home</title>

<!-- Custom fonts for this template-->
<link href="resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">


<!-- Custom styles for this template-->
<link href="resources/css/sb-admin-2.min.css" rel="stylesheet">

</head>

<body id="page-top" class="sidebar-toggled">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->

		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<nav
					class="navbar navbar-expand navbar-light bg-white topbar mb-4 static-top shadow">

					<!-- Sidebar Toggle (Topbar) -->
					<button id="sidebarToggleTop"
						class="btn btn-link d-md-none rounded-circle mr-3">
						<i class="fa fa-bars"></i>
					</button>

					<!-- Topbar Search -->


					<!-- Topbar Navbar -->
					<ul class="navbar-nav">

						<!-- Nav Item - Search Dropdown (Visible Only XS) -->


						<!-- Nav Item - Alerts -->
						<li class="nav-item active no-arrow mx-1 bg-gradient-primary">
							<a class="nav-link"
							href="file:///C:/Users/Pallavi/Desktop/Project%20HTMLS/HomeV9%20-%20Analytics.html">
								<i class="fas fa-fw fa-chart-area"></i> <!-- Counter - Alerts -->
								Analytics
						</a> <!-- Dropdown - Alerts -->

						</li>

						<!-- Nav Item - Messages -->


						<div class="topbar-divider d-none d-sm-block"></div>

						<!-- Nav Item - User Information -->


						<li class="nav-item no-arrow mx-1"><a class="nav-link"
							href="file:///C:/Users/Pallavi/Desktop/Project%20HTMLS/HomeV9%20-%20Configuration.html">
								<i class="fas fa-fw fa-chart-area"></i> <!-- Counter - Configurations -->Configuration
						</a> <!-- Dropdown - Alerts --></li>
					</ul>

					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-right">
						<div class="input-group">

							<div class="input-group-append">
								<button class="btn btn-primary" type="button">
									<span>Logout</span> <i class="fas fa-sign-out-alt fa-sm"></i>
								</button>
							</div>
						</div>
					</form>
				</nav>
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Content Row -->

					<div class="row">

						<!-- Departments Pie Chart -->
						<div class="col-xl-6 col-lg-7">
							<div class="card shadow mb-4">
								<!-- Card Header-->
								<div
									class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
									<h6 class="m-0 font-weight-bold text-primary">Department
										Overview</h6>

								</div>
								<!-- Departments Card Body -->
								<div class="card-body">
									<!-- Departments Overview Pie Chart -->
									<div id="highChartsDepartments"></div>
								</div>
							</div>
						</div>

						<!-- Departments Details Table-->
						<div class="col-xl-6 col-lg-5">
							<div class="card shadow mb-4">
								<div
									class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
									<h6 class="m-0 font-weight-bold text-primary">Department
										Details</h6>
								</div>
								<!-- Card Body -->
								<div class="card-body"></div>
							</div>
						</div>
					</div>

					<!-- Content Row -->
					<div class="row">
						<!-- Employee Skills Bar Chart-->
						<div class="col-lg-6 mb-4">

							<!-- Employee Skills Card -->
							<div class="card shadow mb-4 h-100">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Employee
										Skills</h6>
								</div>
								<div class="card-body">

									<!-- Employee Skills Bar Chart -->
									<div id="highChartsEmployeeSkills"></div>

								</div>
							</div>
						</div>
						<!-- Department Level Skills Bar Chart -->
						<div class="col-lg-6 mb-4">

							<!-- Department Level Skills Card -->
							<div class="card shadow mb-4 h-100">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Department
										Level Skills</h6>
								</div>
								<div class="card-body">
									<!-- Department Level Skills Bar Chart -->
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<footer class="sticky-footer bg-white">
				<div class="container my-auto">
					<div class="copyright text-center my-auto">
						<span>Copyright © Pallavi PR 2019</span>
					</div>
				</div>
			</footer>
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded"
		href="file:///E:/javaworkspace/TemplateModification/index.html#page-top"
		style="display: none;"> <i class="fas fa-angle-up"></i>
	</a>

	<!-- Logout Modal-->
	<div class="modal fade" id="logoutModal" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Ready to Leave?</h5>
					<button class="close" type="button" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">Select "Logout" below if you are ready
					to end your current session.</div>
				<div class="modal-footer">
					<button class="btn btn-secondary" type="button"
						data-dismiss="modal">Cancel</button>
					<a class="btn btn-primary"
						href="file:///E:/javaworkspace/TemplateModification/login.html">Logout</a>
				</div>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript-->
	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="resources/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins for Chart-->
	<script src="resources/vendor/chart.js/Chart.min.js"></script>
	<script src="resources/js/highcharts.js"></script>
	<script src="resources/js/highcharts-3d.js"></script>

	<!-- Page level custom scripts -->
	<!-- <script src=resources/js/demo/chart-area-demo.js"></script>
	<script src="resources/js/demo/chart-pie-demo.js"></script> -->
	<script type="text/javascript">
	$(document).ready(function(){
			//Department Chart-Start
		    var processed_json = new Array();
		    $.getJSON('http://localhost:8088/HumanResource/departmentEmpDetails', function(data) {
		        // Populate series
		        for (i = 0; i < data.length; i++){
		        	  processed_json.push([data[i].deptName, data[i].noOfEmployees]);
		          }
		        $('#highChartsDepartments').highcharts({
		            chart: {
		                type: "column"
		            },
		            title: {
		                text: "Department And No of Employees"
		            },
		            xAxis: {
		                type: 'category',
		                allowDecimals: false,
		                title: {
		                    text: "Department"
		                }
		            },
		            yAxis: {
		                title: {
		                    text: "No. of Employees"
		                }
		            },
		            series: [{
		                name: 'Departments',
		                data: processed_json
		            }]
		        }); 
			});
		  //Department Chart-End
	
	});
	</script>


</body>
</html>