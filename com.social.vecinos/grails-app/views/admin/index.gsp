<!DOCTYPE html>
<html ng-app="socialNBHAdmin">
<head lang="es" class="no-js">
	<meta charset="utf-8">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<title>social NBH Admin</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">
    <asset:stylesheet src="bootstrap/css/bootstrap.css" />
    <asset:stylesheet src="app/app.css" />
</head>
<body ng-controller="NavigationController">
	<!-- Static navbar -->
	<div class="navbar navbar-inverse navbar-static-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#/dashboard">Social NBH Admin</a>
			</div>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#/users/requests">Usuarios</a></li>
					<li><a href="#/groups">Grupos</a></li>
					<li><a href="#rooms">Ambientes</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown">Dropdown <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider"></li>
							<li class="dropdown-header">Nav header</li>
							<li><a href="#">Separated link</a></li>
							<li><a href="#">One more separated link</a></li>
						</ul></li>
				</ul>
				<ul class="nav navbar-nav navbar-right">
					<li><a href="#login">Iniciar Sesión</a></li>
					<li><a href="#registro">Registrarme</a></li>
				</ul>
			</div>
			<!--/.nav-collapse -->
		</div>
	</div>
	<!-- /Static navbar -->
	
	<!-- container -->
	<div class="container">
		<div ng-view=""></div>
	</div>
	<!-- /container -->

	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">{{modal.title}}</h4>
				</div>
				<ng-include src="modal.url"></ng-include>
			</div>
		</div>
	</div>
	<!-- /Modal -->

	<asset:javascript src="lib/jquery/jquery-2.0.3.js" />
	<asset:javascript src="lib/angular-js/angular.js" />
	<asset:javascript src="lib/angular-js/angular-resource.js" />
	<asset:javascript src="lib/angular-js/angular-route.js" />
	<asset:javascript src="lib/bootstrap/bootstrap.js" />
	<asset:javascript src="app/admin/app.module.js" />
	<asset:javascript src="app/admin/app.routes.js" />
	<asset:javascript src="app/admin/common/resource/userrequest.js" />
	<asset:javascript src="app/admin/common/resource/requestapproval.js" />
	<asset:javascript src="app/admin/common/navigationcontroller.js" />
	<asset:javascript src="app/admin/dashboard/dashboardcontroller.js" />
	<asset:javascript src="app/admin/users/usernavigationcontroller.js" />
</body>
</html>
