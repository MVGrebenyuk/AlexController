(function () {
    'use strict';

    angular
        .module('app', ['ngRoute', 'ngStorage'])
        .config(config)
        .run();

    function config($routeProvider, $httpProvider) {
        $routeProvider
            .when('/addNews', {
                templateUrl: 'addNews/addNews.html',
                controller: 'newsController'
            })
            .when('/admin', {
                templateUrl: 'admin/admin.html',
                controller: 'adminController'
            })
            .when('/cart', {
                templateUrl: 'cart/cart.html',
                controller: 'cartController'
            });
    }
})();
