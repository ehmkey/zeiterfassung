<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Zeiterfassung Tischlerei Fankhauser</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/js/angular.js"></script>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" />
<script src="js/angular-ui-bootstrap-modal.js"></script>
</head>
<body>
	<div class="container" ng-app="app">
		<h1>Kunden Verwaltung</h1>

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
				</div>
			</div>
		</div>
		<div class="row">
		
			<div ng-controller="MyCtrl">
			<button class="btn" ng-click="open()">Open Modal</button>

			<div modal="showModal" close="cancel()">
				<div class="modal-header">
					<h4>Modal Dialog</h4>
				</div>
				<div class="modal-body">
					<p>Example paragraph with some text.</p>
				</div>
				<div class="modal-footer">
					<button class="btn btn-success" ng-click="ok()">Okay</button>
					<button class="btn" ng-click="cancel()">Cancel</button>
				</div>
				</div>

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