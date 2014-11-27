/**
 * RequestApproval Resource
 */ 
socialNBHAdmin.factory('RequestApproval', function($resource) {
	return $resource('api/UserRequests/:userRequestId/RequestApprovals/:id', {
		id: '@id',
		userRequestId: '@userRequestId'
	}, {
		query: { method: 'GET', isArray: false },
		get: { method: 'GET', isArray: false }
	});
});
