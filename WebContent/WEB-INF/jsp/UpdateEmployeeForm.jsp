<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
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
<body id="page-top" class="sidebar-toggled">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<ul
			class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion toggled"
			id="accordionSidebar">

			<!-- Sidebar - Brand -->
			<a
				class="sidebar-brand d-flex align-items-center justify-content-center"
				href="analytics">
				<div class="sidebar-brand-icon">
					<i class="fas fa-university"></i>
				</div>
				<div class="sidebar-brand-text mx-3">HRMS</div>
			</a>

			<!-- Divider -->
			<hr class="sidebar-divider my-0">

			<!-- Nav Item - Dashboard -->
			<li class="nav-item "><a class="nav-link"
				href="departmentConfiguration"> <i class="fas fa-fw fa-building"></i>
					<span>Departments</span></a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Heading -->


			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item active"><a class="nav-link"
				href="employeeConfiguration"> <i class="fas fa-fw fa-users"></i>
					<span>Employees</span>
			</a></li>
			<li class="nav-item "><a class="nav-link"
				href="employeeRatingConfiguration"> <i
					class="fas fa-fw fa-users"></i> <span>EmployeeRating</span>
			</a></li>



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
						<li class="nav-item active no-arrow mx-1 show"><a
							class="nav-link" href="analytics"> <i
								class="fas fa-fw fa-chart-area"></i> <!-- Counter - Alerts -->
								Analytics
						</a> <!-- Dropdown - Alerts --></li>

						<!-- Nav Item - Messages -->


						<div class="topbar-divider d-none d-sm-block"></div>

						<!-- Nav Item - User Information -->


						<li class="nav-item no-arrow mx-1 bg-gradient-primary"><a
							class="nav-link" href="departmentConfiguration"> <i
								class="fas fa-fw fa-chart-area"></i> <!-- Counter - Configurations -->Configuration
						</a> <!-- Dropdown - Alerts --></li>
					</ul>

					<form
						class="d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-right">
						<div class="input-group">

							<div class="input-group-append">
								<a class="btn btn-primary" href="logout"> <span>Logout</span>
									<i class="fas fa-sign-out-alt fa-sm"></i>
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


						<div class="col-xl-12 col-lg-12">
							<div class="card shadow mb-4">
								<!-- Card Header - Dropdown -->
								<div
									class="card-header py-3 d-flex flex-row align-items-center justify-content-between">
									<h6 class="m-0 font-weight-bold text-primary">Employee
										Details</h6>

								</div>
								<!-- Card Body -->
								<div class="card-body">

									<form:form modelAttribute="employee" method="post"
										action="updateEmployee">

										<div class="form-group row">
											<label for="firstname" class="col-lg-2 col-xl-2">FirstName
												<span class="required text-danger">*</span>
											</label>
											<div class="col-lg-8 col-xl-8">
												<form:input type="hidden" path="empId" />
												<form:input type="text" class="form-control" id="firstname"
													path="firstName" placeholder="" />
											</div>
										</div>
										<div class="form-group row">
											<label for="lastname" class="col-lg-2 col-xl-2">LastName</label>
											<div class="col-lg-8 col-xl-8">
												<form:input type="text" class="form-control" id="lastname"
													path="lastName" placeholder="" />
											</div>

											<div class="form-group row">

												<div class="col-sm-10"></div>
											</div>
										</div>
										<div class="form-group row">
											<label for="emailid" class="col-lg-2 col-xl-2">Email
												ID <span class="required text-danger">*</span>
											</label>
											<div class="col-lg-8 col-xl-8">
												<form:input type="text" class="form-control" id="emailid"
													placeholder="" path="emailId" />
											</div>
										</div>
										<div class="form-group row">
											<label for="designation" class="col-lg-2 col-xl-2">Designation
												<span class="required text-danger">*</span>
											</label>
											<div class="col-lg-8 col-xl-8">
												<form:input type="text" class="form-control"
													id="designation" placeholder="" path="designation" />
											</div>
										</div>
										<div class="form-group row">
											<label for="skillSet" class="col-lg-2 col-xl-2">Skill
												Set <span class="required text-danger">*</span>
											</label>
											<div class="col-lg-8 col-xl-8">
												<label class="checkbox-inline"> <form:checkbox
														path="skillSet" id="skillSet" value="java"/>Java
												</label> <label class="checkbox-inline"> <form:checkbox
														path="skillSet" id="skillSet" value="spring" />Spring
												</label> <label class="checkbox-inline"> <form:checkbox
														path="skillSet" id="skillSet" value="hibernate" />Hibernate
												</label>

											</div>
										</div>
										<div class="row form-group">
											<label for="gender" class="col-lg-2 col-xl-2">Gender</label>
											<div class="col-lg-8 col-xl-8">
												<div class="form-check">
													<form:radiobutton path="gender" id="male" value="male" />
													<label class="checkbox-inline" for="male"> Male </label>
													<form:radiobutton path="gender" id="female" value="female" />
													<label class="checkbox-inline" for="female"> Female
													</label>
												</div>
											</div>
										</div>
										<div class="form-group row">
											<label for="password" class="col-lg-2 col-xl-2">Password</label>
											<div class="col-lg-8 col-xl-8">
												<form:input type="text" class="form-control" id="password"
													placeholder="" path="password" />
											</div>
										</div>
										<div class="form-group row">
											<label for="salary" class="col-lg-2 col-xl-2">Salary
												<span class="required text-danger">*</span>
											</label>
											<div class="col-lg-8 col-xl-8">
												<form:input type="text" class="form-control" id="salary"
													placeholder="" path="salary" />
											</div>

										</div>
										<div class="form-group row">
											<label for="department" class="col=lg-2 col-xl-2">Department
												<span class="required text-danger">*</span>
											</label>
											<div class="col-lg-8 col-xl-8">
												<form:select path="deptId"
													class="form-control select-picker">

													<form:options items="${departments}" />
												</form:select>
											</div>
										</div>

										<fieldset class="form-group">
											<div class="row">

												<div class="col-sm-10">
													<div class="text-center">
														<button type="Reset" class="btn btn-primary col-sm-2">Reset</button>
														<input type="submit" class="btn btn-primary col-sm-2"
															value="Update" />
													</div>
												</div>
											</div>
										</fieldset>
									</form:form>
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
	<a class="scroll-to-top rounded" href="#page-top"
		style="display: inline;"> <i class="fas fa-angle-up"></i>
	</a>

	<!-- Bootstrap core JavaScript-->
	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="resources/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="resources/vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="resources/js/demo/chart-area-demo.js"></script>
	<script src="resources/js/demo/chart-pie-demo.js"></script>
</body>
</html>