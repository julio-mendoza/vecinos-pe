/**
 * Admin Navigation Controller
 */
socialNBHAdmin.controller('DashboardController', function($scope) {
	$scope.modal = {
		url : null,
		title : "",
		data : {}
	};

	$scope.openModal = function(config) {
		var modalCfg = angular.extend({
			url : null,
			title : "",
			data : {}
		}, config);
		$scope.modal = modalCfg;
		$('#myModal').modal();
	};
	
});
