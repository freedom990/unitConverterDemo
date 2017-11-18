<!DOCTYPE html>
<html>
<head>
<title>Home Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>

	<header class="navbar navbar-inverse ">

		<div class="container">

			<a href="#" class="navbar-left"></a>

			<ul class="nav navbar-nav navbar-left">

				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Contact us</a></li>

			</ul>

		</div>

	</header>

	<div class="container">


		<section class="col-lg-8">

			<div class="panel panel-default">

				<div class="panel-body">

					<div class="panel-header">

						<div class="page-header">

							<h2>Welcome</h2>

						</div>

						<div class="container"></div>

					</div>

				</div>

			</div>

		</section>

		<asid class="col-lg-4"> <!-- Login Form -->

		<form class="panel-group form-horizontal" id="loginform"
			method="post" action="login.do">

			<div class="panel panel-default">

				<div class="panel-heading">Login Area</div>

				<div class="panel-body">


					<div class="form-group">

						<label for="username" class="control-label col-sm-4">UserName</label>

						<div class="col-sm-7">

							<input type="text" id="username" name="username"
								onfocus="emptyElement('status')" placeholder="Enter your E-mail"
								class="form-control">

						</div>

					</div>
					

					<div class="form-group">

						<label for="password" class="control-label col-sm-4">Password</label>

						<div class="col-sm-7">

							<input type="password" id="password" name="password"
								onfocus="emptyElement('status')"
								placeholder="Enter your Password" class="form-control">

						</div>

					</div>

					<div class="form-group">

						<div class="col-sm-12">

							<button class="btn btn-block btn-success" id="submitlogin">LOG
								IN</button>



						</div>

					</div>

				</div>

			</div>

		</form>


		</asid>


		<div class="navbar navbar-default navbar-fixed-bottom">

			<div class="container">

				<p class="navbar-text">TEST</p>

				<a href="#" class="btn btn-link pull-right navbar-btn">Share</a>

			</div>

		</div>


	</div>
</body>

</html>