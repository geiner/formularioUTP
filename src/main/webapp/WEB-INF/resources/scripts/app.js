define(['angular','controllers/hello'],
    function(angular,HelloCtrl){
    'use strict';

    angular.module('utpApp',['ModuloPrincipal',
        'ngCookies','ngResource','ngSanitize','ngRoute','ngAnimate','ngTouch'])
        .config(function ($routeProvider) {
            $routeProvider
                .when('/hello', {
                    templateUrl: 'resources/views/hello.html',
                    controller: 'HelloCtrl'
                })
                .otherwise({
                    redirectTo: '/hello'
                });
        });
});