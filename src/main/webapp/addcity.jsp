<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1.0,maximum-scale=1">
		
		<title>Add City | Weather Report Application</title>

		<!-- Loading third party fonts -->
		<link href="http://fonts.googleapis.com/css?family=Roboto:300,400,700|" rel="stylesheet" type="text/css">
		<link href="fonts/font-awesome.min.css" rel="stylesheet" type="text/css">

		<!-- Loading main css file -->
		<link rel="stylesheet" href="style.css">
		
		<!--[if lt IE 9]>
		<script src="js/ie-support/html5.js"></script>
		<script src="js/ie-support/respond.js"></script>
		<![endif]-->

	</head>


	<body>
		
		<div class="site-content">
			<div class="site-header">
				<div class="container">
					<a href="index.html" class="branding">
						<div class="logo-type">
							<h1 class="site-title">Weather</h1>
							<small class="site-description">Report Application</small>
						</div>
					</a>

					<!-- Default snippet for navigation -->
					<div class="main-navigation">
						<button type="button" class="menu-toggle"><i class="fa fa-bars"></i></button>
						<ul class="menu">
							<li class="menu-item current-menu-item"><a href="/">Home</a></li>
							<li class="menu-item"><a href="add">Add a City</a></li>
							<li class="menu-item"><a href="all">All Cities</a></li>
							<li class="menu-item"><a href="/">Logout</a></li>
						</ul> <!-- .menu -->
					</div> <!-- .main-navigation -->

					<div class="mobile-navigation"></div>

				</div>
			</div> <!-- .site-header -->

			<main class="main-content">
				<div class="container">
					<div class="breadcrumb">
						<span>Add City and Temperature</span>
					</div>
				</div>
				

				<div class="fullwidth-block">
					<div class="container">
						<div class="col-md-6">
							<h2 class="section-title"></h2>
							<p></p>
							<form action="savemydata" class="contact-form" method="POST" enctype="multipart/form-data">
								<div class="row">
								<div class="col-md-12"><input type="text" name="temperature" placeholder="Temperature..." value="${place.temperature }"></div>
									<div class="col-md-12"><input type="text" name="city" placeholder="Place..." value="${place.city }"></div>
									<div class="col-md-12"><input type="text" name="weather" placeholder="Weather..." value="${place.weather }"></div>						
								</div>
								<div class="text-right">
									<input type="submit" placeholder="Add City">
								</div>
							</form>

						</div>
					</div>
				</div>
				
			</main> <!-- .main-content -->

			<footer class="site-footer">
				<div class="container">
					<div class="row">
						<div class="col-md-8">
							<form action="savemyemail" class="subscribe-form" method="POST">
								<input type="text" name="email" placeholder="Enter your email to subscribe...">
								<input type="submit" value="Subscribe">
							</form>
						</div>
						<div class="col-md-3 col-md-offset-1">
							<div class="social-links">
								<a href="#"><i class="fa fa-facebook"></i></a>
								<a href="#"><i class="fa fa-twitter"></i></a>
								<a href="#"><i class="fa fa-google-plus"></i></a>
								<a href="#"><i class="fa fa-pinterest"></i></a>
							</div>
						</div>
					</div>

					<p class="colophon">Copyright <script>document.write(new Date().getFullYear())</script>. All rights reserved</p>
				</div>
			</footer> <!-- .site-footer --><!-- .site-footer -->
		</div>
		
		<script src="js/jquery-1.11.1.min.js"></script>
		<script type="text/javascript" src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
		<script src="js/plugins.js"></script>
		<script src="js/app.js"></script>
		
	</body>

</html>