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

<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">
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
					<span>Departments</span>
			</a></li>

			<!-- Divider -->
			<hr class="sidebar-divider">

			<!-- Nav Item - Pages Collapse Menu -->
			<li class="nav-item active"><a class="nav-link"
				href="employeeConfiguration"> <i class="fas fa-fw fa-users"></i>
					<span>Employees</span>
			</a></li>
			<li class="nav-item "><a class="nav-link"
				href="employeeRatingConfiguration"> <i
					class="fa fa-star"></i> <span>EmployeeRating</span>
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

					<!-- Topbar Navbar -->
					<ul class="navbar-nav">

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
							class="nav-link" href="departmentConfiguration.html"> <i
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
					<!-- DataTales Employee -->
					<div class="card shadow mb-4">
						<div class="card-header py-3">
							<h6 class="m-0 font-weight-bold text-primary">Employee
								Details</h6>
						</div>
						<div class="card-body">
						<c:if test="${not empty addMsg}">
										<div class="text-info text-center">${addMsg}</div>
									</c:if>
									<c:if test="${not empty deleteMsg}">
										<div class="text-danger text-center">${deleteMsg}</div>
									</c:if>
						
							<div>
								<a href="addEmployee"
									class="btn btn-primary col-lg-2 float-lg-right">Add</a>
							</div>
							<div class="table-responsive">
								<table class="table table-bordered" id="dataTable"
									cellspacing="0">
									<thead>
										<tr>

											<th>FirstName</th>
											<th>LastName</th>
											<th>EmailID</th>
											<th>Designation</th>
											<th>SkillSet</th>
											<th>Gender</th>
											<th>Salary</th>
											<th class="text-center">Edit</th>
											<th class="text-center">Delete</th>
										</tr>
									</thead>

									<tbody>
										<c:forEach var="e" items="${employee}">
											<tr>


												<td><c:out value="${e.firstName}" /></td>
												<td><c:out value="${e.lastName}" /></td>
												<td><c:out value="${e.emailId}" /></td>
												<td><c:out value="${e.designation}" /></td>
												<td><c:out value="${e.skillSetString}" /></td>
												<td><c:out value="${e.gender}" /></td>
												<td><c:out value="${e.salary}" /></td>
												<td class="text-center"><a
													href="editEmployee?empId=${e.empId}"><i
														class="fa fa-edit text-info"></i></a></td>
												<td class="text-center"><a
													href="deleteEmployee?empId=${e.empId}"><i
														class="fa fa-trash text-danger"></i></a></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
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
		style="display: none;"> <i class="fas fa-angle-up"></i>
	</a>

	<!-- Bootstrap core JavaScript-->
	<script src="resources/vendor/jquery/jquery.min.js"></script>
	<script src="resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="resources/vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="resources/js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="resources/vendor/datatables/jquery.dataTables.min.js"></script>
	<script src="resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

	<!-- Custom Script for datatable loading -->
	<script type="text/javascript">
					$(document).ready(function() {
						$('#dataTable').DataTable();
					});
				</script>
</body>
</html>