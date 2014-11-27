/**
 * UserRequest Resource
 */
socialNBHAdmin.factory('UserRequest', function($resource) {
	return $resource('api/UserRequests/:id', {
		id: '@id'
	}, {
		query: { method: 'GET', isArray: false },
		get: { method: 'GET', isArray: false }
	});
});
