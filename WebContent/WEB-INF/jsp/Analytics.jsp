<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
							href="analytics">
								<i class="fas fa-fw fa-chart-area"></i> <!-- Counter - Alerts -->
								Analytics
						</a> <!-- Dropdown - Alerts -->

						</li>

						<!-- Nav Item - Messages -->


						<div class="topbar-divider d-none d-sm-block"></div>

						<!-- Nav Item - User Information -->


						<li class="nav-item no-arrow mx-1"><a class="nav-link"
							href="departmentConfiguration">
								<i class="fas fa-fw fa-chart-area"></i> <!-- Counter - Configurations -->Configuration
						</a> <!-- Dropdown - Alerts --></li>
					</ul>

					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-right">
						<div class="input-group">

							<div class="input-group-append">
								<a class="btn btn-primary" href="logout">
									<span>Logout</span> <i class="fas fa-sign-out-alt fa-sm"></i>
								</a>
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
						<div class="col-xl-6 col-lg-6">
							<div class="card shadow mb-4">
								<!-- Card Header-->
								<div id="overviewHeader"
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
						<div class="col-xl-6 col-lg-6 mb-4">
					<div class="card shadow mb-4 h-100">
						<div id="departmentDetails" class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">Department Details
								</h6>
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-bordered" id="dataTable" cellspacing="0">
									<thead>
										<tr>
											<th>Department Name</th>
											<th>Description</th>
											<th>Active</th>
										</tr>
									</thead>
									
									<tbody>
										<c:forEach var="d" items="${departmentEmpDetailsList}">
											<tr>
												<td><c:out value="${d.deptName}" /></td>
												<td><c:out value="${d.noOfEmployees}" /></td>
												<td><c:out value="${d.salary}" /></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
						</div>
					</div>

					<!-- Content Row -->
					<div class="row">
						<!-- Employee Skills Bar Chart-->
						<div class="col-lg-6 mb-4">

							<!-- Employee Skills Card -->
							<div class="card shadow mb-4 h-100">
								<div id="employeeSkills" class="card-header py-3">
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
								<div id="departmentLevel"class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Department
										Level Skills</h6>
								</div>
								<div class="card-body">
									<!-- Department Level Skills Bar Chart -->
									<div id="highChartsDepartmentSkills"></div>
									
								</div>
							</div>
						</div>
					</div>
					<div class="row">

						<!-- --countRating pie chart start -->
						<div class="col-xl-6 col-lg-6">
							<div class="card shadow mb-4">
								<!-- Card Header-->
								<div id="departmentRating"
									class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
									<h6 class="m-0 font-weight-bold text-primary">Employee
										Rating</h6>

								</div>
								<!-- Departments Card Body -->
								<div class="card-body">
									<!-- Departments Overview Pie Chart -->
									<div id="highChartsEmployeeRating"></div>
								</div>
							</div>
						</div>

						<!-- --countRating pie chart end -->
						<div class="col-xl-6 col-lg-6">
							<div class="card shadow mb-4 h-100">

								<div id="loadButton"
									class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
									<div class="col-xl-6 col-lg-6 ">
										<input type="button" value="Load" class="btn btn-primary" />
									</div>
								</div>
								<div id="loadCardBody" class="card-body"></div>

							</div>
						</div>
					</div>
					<div class="row">

						<div class="col-xl-6 col-lg-6">
							<div class="card shadow mb-4 h-100">

								<div id="submit"
									class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
									<h6 class="m-0 font-weight-bold text-primary">Rating
								</h6>
									
								</div>
								<div id="submitCard" class="card-body">
									<div class="form-group row">
										<label for="empId" class="col-lg-4 col-xl-4">EmpID</label>
										<div class="col-lg-6 col-xl-6">
											<input type="text" class="form-control" id="empId" />
										</div>
									</div>
									<div class="form-group row">
										<label for="rating" class="col-lg-4 col-xl-4">Rating</label>
										<div class="col-lg-6 col-xl-6">
											<input type="text" class="form-control" id="rating" />
										</div>
									</div>
									<div class="form-group row">
										<input id="ratingSubmitId" type="button" value="submit" class="btn btn-primary"/>
									</div>

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
		href="#page-top"
		style="display: none;"> <i class="fas fa-angle-up"></i>
	</a>

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

	
	<script type="text/javascript">
	
	Highcharts.setOptions({
		 colors: ['#0275d8', '#5bc0de', '#5cb85c', '#f0ad4e', '#64E572', '#FF9655', '#FFF263', '#6AF9C4']
		});
	
	//Department Chart-Start
    $(document).ready(function(){
			var processed_json = new Array();
		    $.getJSON('http://localhost:8089/HumanResource/departmentEmpDetails', function(data) {
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
		            	type:'pie',
		                name: 'Departments',
		                data: processed_json
		            }]
		        }); 
			});
	});
		  //Department Chart-End
		  //skill Chart-start
		  $(document).ready(function(){
		  var processed_json = new Array();
		    $.getJSON('http://localhost:8089/HumanResource/employeeSkills', function(data) {
		        // Populate series
		        for (i = 0; i < data.length; i++){
		        	  processed_json.push([data[i].skill, data[i].noOfEmployees]);
		          }
		        $('#highChartsEmployeeSkills').highcharts({
		            chart: {
		                type: "column"
		            },
		            title: {
		                text: "EmployeeSkill And No of Employees"
		            },
		            xAxis: {
		                type: 'category',
		                allowDecimals: false,
		                title: {
		                    text: "Skill"
		                }
		            },
		            yAxis: {
		                title: {
		                    text: "No. of Employees"
		                }
		            },
		            series: [{
		                name: 'Employees',
		                data: processed_json
		            }]
		        }); 
			});
			});
		  //skill Chart-End
		  
		  
		  //DepartmentSkill Chart-Start
		  $(document).ready(function(){
		  var processed_json = new Array();
		  var categories_json = new Array();
		    $.getJSON('http://localhost:8089/HumanResource/departmentSkills', function(data) {
		        // Populate series
		        for (i = 0; i < data.length; i++){
		        	  processed_json.push([data[i].skill, data[i].noOfEmployees]);
		        	  categories_json.push([data[i].deptName]);
		          }
		        $('#highChartsDepartmentSkills').highcharts({
		            chart: {
		                type: "column"
		            },
		            title: {
		                text: "EmployeeSkill And Skill Count"
		            },
		            xAxis: {
		                categories : categories_json,
		                allowDecimals: false,
		                title: {
		                    text: "Department Name"
		                }
		            },
		            yAxis: {
		                title: {
		                    text: "Skills Count"
		                }
		            },
		            series: [{
		            	name: 'Skills Count',
		                data: processed_json
		            }]
		        }); 
			});
			});
		    
		  
		  //Department Level Skill Chart-end
		  
		  //rating chart -start
		   $(document).ready(function(){
			var rating_json = new Array();
		    $.getJSON('http://localhost:8089/HumanResource/countOfEmployeeRating', function(data) {
		        // Populate series
		        for (i = 0; i < data.length; i++){
		        	  rating_json.push([data[i].rating,data[i].noOfEmployees]);
		          }
		        $('#highChartsEmployeeRating').highcharts({
		            chart: {
		                type: "column"
		            },
		            title: {
		                text: "Rating And No of Employees"
		            },
		            xAxis: {
		                type: 'category',
		                allowDecimals: false,
		                title: {
		                    text: "Rating"
		                }
		            },
		            yAxis: {
		                title: {
		                    text: "No. of Employees"
		                }
		            },
		            series: [{
		                name: 'No of Employees',
		                data: rating_json
		            }]
		        }); 
			});
	});
		  //rating chart-end
		  
		  $(document).ready(function() {
			$('#dataTable').DataTable();
		});
		    
		  
	
		  //hide and show department overview-start
		  $(document).ready(function(){
			  $("#overviewHeader").click(function(){
				  $("#highChartsDepartments").hide();
				 });
 	       
		  //hide and show department overview-end
		  
		  //fade departmentDetails-start 
		  $("#departmentDetails").click(function(){
			  
			  $("#dataTable").fadeToggle();
			  
		  });
		  //fade departmentDetails-end
		  
		   //fade employeeSkills-start 

              $("#employeeSkills").click(function(){
			  
			  $("#highChartsEmployeeSkills").fadeToggle();
			  
		  });
 //fade employeeSkills-end
 
  //fade departmentlevel-start
 
             $("#departmentLevel").click(function(){
	  
	         $("#highChartsDepartmentSkills").fadeToggle();
	  
          });
 //fade departmentLevel-end 
 
  //fade departRating-start 
 
            $("#departmentRating").click(function(){
	  
	        $("#highChartsEmployeeRating").fadeToggle();
	  
         });
 //fade departmenRating-end
 
 //reading text file on load button-start
     
		$("#loadButton").click(function() {
				
				$.get("resources/info.txt", function(data) {
					
				$("#loadCardBody").text(data);	

				});

			});
		//reading text file on load button-end
		
		//Submitting rating form start
		$("#ratingSubmitId").click(function(){
			var empId=document.getElementById("empId").value;
			var rating=document.getElementById("rating").value;
			
			var employee={};
			employee.empId=Number(empId);
			employee.rating=Number(rating);
			employee.description="";
			
			$.ajax({
				  type: "POST",
				  url: "submitRatingRest",
				  dataType: "json",
				  contentType: 'application/json',
				  data: JSON.stringify(employee),
				  success : function(){
					  alert("success");
				  }
				});
		});
		//Submitting rating form end
		
		
		});
	</script>


</body>
</html>