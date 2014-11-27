/**
 * Social NBH Admin configuration
 */

socialNBHAdmin.config(function ($routeProvider) {
	$routeProvider
		.when('/dashboard', {
			controller: 'DashboardController',
	        templateUrl: 'app/common/dashboard.html'
	    })
		.when('/users/:viewId', {
			controller: 'UserNavigationController',
            templateUrl: 'app/users/userdashboard.html'
        })
        .when('/groups', {
        	controller: 'GroupNavigationController',
        	templateUrl: 'app/groups/groupdashboard.html'
		})
		.otherwise({ redirectTo: '/dashboard' });

	
	//** Example for Parameter
	/*
	//Define a route that has a route parameter in it (:customerID)
    .when('/customerorders/:customerID',
        {
            controller: 'CustomerOrdersController',
            templateUrl: '/app/partials/customerOrders.html'
        })*/
});
