var app = angular.module('app', ['ngToast']);

app.config(['$httpProvider', function ($httpProvider) {
    $httpProvider.interceptors.push(function ($q,$rootScope) {
        return {
            'responseError': function (responseError) {
                $rootScope.errormessage = responseError.data.message;
                return $q.reject(responseError);
            },
            'response' : function(response){
            	$rootScope.successmessage = "Erfolgreich" + response
            	return response;
            }
        };
    });
}]);

app.controller('postController', function($scope, $http, $location) {
	$scope.submitForm = function() {
		var url = $location.absUrl() + "customer/create";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		var data = {
			name : $scope.name,
			phone : $scope.phone,
			contact : $scope.contact,
			address : $scope.address
		};

		$http.post(url, data, config).then(function(response) {
			$scope.postResultMessage = "Sucessful!";
		}, function(response) {
			$scope.postResultMessage = "Fail!";
		});

		$scope.firstname = "";
		$scope.lastname = "";
	}
});

app.controller('getallcustomersController', function($scope, $http, $location) {

	$scope.showAllCustomers = false;

	$scope.getAllCustomers = function() {
		var url = $location.absUrl() + "customer";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(response) {

			if (response.data.status == "Done") {
				$scope.allcustomers = response.data;
				$scope.showAllCustomers = true;

			} else {
				$scope.getResultMessage = "get All Customers Data Error!";
			}

		}, function(response) {
			$scope.getResultMessage = "Fail!";
		});

	}
});

app.controller('getcustomerController', function($scope, $http, $location) {

	$scope.showCustomer = false;

	$scope.getCustomer = function() {
		var url = $location.absUrl() + "customer/" + $scope.customerId;

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}

		$http.get(url, config).then(function(response) {

			if (response.data.status == "Done") {
				$scope.customer = response.data;
				$scope.showCustomer = true;

			} else {
				$scope.getResultMessage = "Customer Data Error!";
			}

		}, function(response) {
			$scope.getResultMessage = "Fail!";
		});

	}
});


app.controller('getcustomersbylastnameController', function($scope, $http,
		$location) {

	$scope.showCustomersByLastName = false;

	$scope.getCustomersByLastName = function() {
		var url = $location.absUrl() + "/customer/findbylastname";

		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			},

			params : {
				'lastName' : $scope.customerLastName
			}
		}

		$http.get(url, config).then(function(response) {

			if (response.data.status == "Done") {
				$scope.allcustomersbylastname = response.data;
				$scope.showCustomersByLastName = true;

			} else {
				$scope.getResultMessage = "Customer Data Error!";
			}

		}, function(response) {
			$scope.getResultMessage = "Fail!";
		});

	}
});

app.controller('asdsa', function($scope, ngToast) {
	// create a simple toast:
	ngToast.create('a toast message...');

	// create a toast with settings:
	ngToast.create({
	  className: 'warning',
	  content: '<a href="#" class="">a message</a>'
	});

	// or just use "success", "info", "warning" or "danger" shortcut methods:
	var myToastMsg = ngToast.warning({
	  content: '<a href="#" class="">a message</a>'
	});

	// to clear a toast:
	ngToast.dismiss(myToastMsg);

	// clear all toasts:
	ngToast.dismiss();
});