<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Zeiterfassung Tischlerei Fankhauser</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />

<link rel="stylesheet" href="/js/lib/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="js/lib/ng-dialog/css/ngDialog.min.css">
<link rel="stylesheet" href="/js/lib/ng-dialog/css/ngDialog-theme-default.min.css">
<link rel="stylesheet" href="js/lib/ng-toast/ngToast.min.css">

<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/js/home.js"></script>
<script src="/js/lib/ng-dialog/js/ngDialog.min.js"></script>

<script src="js/lib/ng-toast/angular-animate.min.js"></script>
<script src="js/lib/ng-toast/angular-sanitize.min.js"></script>
<script src="js/lib/ng-toast/ngToast.min.js"></script>
</head>
<body>
	<div class="container" ng-app="app">
		<h1>Kunden Verwaltung</h1>
		<toast></toast>
		<div ng-show="errormessage" class="animate-show-hide alert alert-danger">{{errormessage}}</div>
		<div ng-show="successmessage" class="alert alert-success">{{successmessage}}</div>
		<div class="container">
			<div class="row">
				<div ng-controller="postController" class="col-md-3">
					<form name="customerForm" ng-submit="submitForm()">
						<label>Vorname</label> <input type="text" name="firstname"
							class="form-control" ng-model="firstname" /> <label>Nachname</label>
						<input type="text" name="lastname" class="form-control"
							ng-model="lastname" />

						<button type="submit" class="btn btn-primary"
							style="margin-top: 5px">
							Speichern <i class="glyphicon glyphicon-floppy-disk"></i>
						</button>
					</form>
					<p>{{postResultMessage}}</p>
					<div
						class="col-lg-12 col-sm-12 col-xs-12 alert alert-success ng-hide"
						ng-show="isDisplay">
						<strong>{{postResultMessage}}</strong>
					</div>

				</div>
			</div>
		</div>
		<div class="row">
			<div ng-controller="getallcustomersController" class="col-md-3">
				<h3>All Customers</h3>

				<button ng-click="getAllCustomers()">Get All Customers</button>

				<div ng-show="showAllCustomers">
					<table border="1" class="table">
						<tr ng-repeat="customer in allcustomers.data">
							<td>{{customer.id}}</td>
							<td>{{customer.firstName}}</td>
							<td>{{customer.lastName}}</td>
						</tr>
					</table>
				</div>
				<p>{{getResultMessage}}</p>
			</div>

			<div ng-controller="getcustomerController" class="col-md-3">
				<h3>Customer by ID</h3>

				<input type="text" class="form-control" style="width: 100px;"
					ng-model="customerId" /> <br />
				<button ng-click="getCustomer()">Get Customer</button>

				<div ng-show="showCustomer">
					Id: {{customer.data.id}}<br /> First Name:
					{{customer.data.firstName}}<br /> Last Name:
					{{customer.data.lastName}}
				</div>
				<p>{{getResultMessage}}</p>
			</div>

			<div ng-controller="getcustomersbylastnameController"
				class="col-md-4">
				<h3>Customers by LastName</h3>

				<input type="text" class="form-control" style="width: 100px;"
					ng-model="customerLastName" /><br />
				<button ng-click="getCustomersByLastName()">Get Customers</button>

				<div ng-show="showCustomersByLastName">

					<ul class="list-group">
						<li ng-repeat="customer in allcustomersbylastname.data"><h4
								class="list-group-item">
								<strong>Customer {{$index}}</strong><br /> Id: {{customer.id}}<br />
								First Name: {{customer.firstName}}<br /> Last Name:
								{{customer.lastName}}
							</h4></li>
					</ul>
				</div>
				<p>{{getResultMessage}}</p>
			</div>

		</div>
	</div>
</body>
</html>