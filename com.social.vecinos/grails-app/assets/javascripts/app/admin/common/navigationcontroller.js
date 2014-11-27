/**
 * Admin Navigation Controller
 */
socialNBHAdmin.controller('NavigationController', function($scope) {
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

//
// // ** Navigation Controller
// socialMarketAdmin.
//
// socialMarketAdmin.controller('UserRequestListController', function($scope,
// UserRequest) {
// $scope.requestsPages = {
// pagesCount: 0,
// pageSize: 2
// };
//	
// $scope.retrieveData = function(pageNumber, forceClean) {
// if ($scope.requestsPages[pageNumber] && !forceClean) {
// $scope.currentPage = $scope.requestsPages[pageNumber];
// } else {
// var pageSize = $scope.requestsPages.pageSize,
// rowIndex = (pageNumber - 1) * pageSize;
//			
// UserRequest.query({
// rowIndex: rowIndex,
// numRows: pageSize
// }, function(result) {
// $scope.currentPage = {
// data: result.data,
// pageNumber: pageNumber
// };
// $scope.requestsPages[pageNumber] = $scope.currentPage;
// $scope.requestsPages.pagesCount = Math.ceil(result.total / pageSize);
//				
//				
// });
// }
// };
//
// $scope.approveRequest = function(request) {
// $scope.openModal({
// url : "tpl/admin/users/approve-request.html",
// title : "Aprobación de Solicitud",
// data : {
// request : request
// }
// });
// };
//
// $scope.denyRequest = function(request) {
// $scope.openModal({
// url : "tpl/admin/users/deny-request.html",
// title : "Aprobación de Solicitud",
// data : {
// request : request
// }
// });
// };
//
// $scope.createUser = function(request) {
// debugger;
// };
//
// $scope.deleteRequest = function(request) {
// debugger;
// };
//	
// $scope.retrieveData(1);
//	
// $scope.demo = function(index) {
// alert(index);
// };
// });
//
// socialMarketAdmin.controller('RequestApprovalController', function($scope,
// Approval) {
// $scope.approval = {
// userRequest : $scope.modal.data.request
// };
//
// $scope.createApproval = function(approval) {
// Approval.save({
// userRequestId: approval.userRequest.id
// }, approval, function () {
//		
// alert("Guardo!");
// //$scope.request = angular.copy($scope.empty);
// //$('#myModal').modal('hide');
// });
// };
// });
//
// })();
