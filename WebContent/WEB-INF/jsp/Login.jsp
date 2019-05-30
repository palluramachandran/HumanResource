<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<!-- Custom fonts for this template-->
<link href="resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="resources/css/sb-admin-2.min.css" rel="stylesheet">
</head>
<body>



	<div class="container">

		<!-- Outer Row -->
		<div class="row justify-content-center">

			<div class="col-md-6">

				<div class="card o-hidden border-0 shadow-lg my-5">
					<div class="card-body p-0">
						<!-- Nested Row within Card Body -->
						<div class="row">
							<div class="col-lg-12">
								<div class="p-5">
									<div class="text-center">
										<h1 class="h4 text-gray-900 mb-4">Sign in</h1>
									</div>
									<form name='loginForm' action="login" method='POST'
										class="needs-validation">
										<div class="form-group">
											<div class="input-group">
												<div class="input-group-prepend">
													<div class="input-group-text">
														<span class="input-group-addon"><i
															class="fa fa-user"></i></span>
													</div>
												</div>
												<input type="text"
													class="form-control form-control-user needs-validation"
													name="username" placeholder="Enter User Name..." required>
											</div>
										</div>
										<div class="form-group">
											<div class="input-group">
												<div class="input-group-prepend">
													<div class="input-group-text">
														<span class="input-group-addon"><i
															class="fa fa-lock"></i></span>
													</div>
												</div>
												<input type="password"
													class="form-control form-control-user needs-validation"
													name="password" placeholder="Password" required>
											</div>
										</div>
										<input
											class="btn btn-primary btn-user btn-block font-weight-bold"
											name="submit" type="submit" value="Login" />
									</form>
									<hr>
									</br>
									<c:if test="${not empty error}">
										<div class="text-danger text-center">${error}</div>
									</c:if>
									<c:if test="${not empty msg}">
										<div class="text-info text-center">${msg}</div>
									</c:if>
								</div>
							</div>
						</div>
					</div>
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
</body>
</html>