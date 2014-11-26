var VarsApp = {
    rootUrl : '',
    baseUrl : '/resources/scripts',
    libUrl : '../../../resources/components',
    autor : "Proyecto Calzado"
};

require.config({
    baseUrl: VarsApp.baseUrl,
    paths: {
        angular: VarsApp.libUrl +'/angular/angular',
        'angular-route': VarsApp.libUrl +'/angular-route/angular-route',
        jquery: VarsApp.libUrl +'/jquery/dist/jquery.min',
        //bootstrap:VarsApp.libUrl+'/bootstrap/dist/js/bootstrap.min',
        'angular-mocks': VarsApp.libUrl +'/angular-mocks/angular-mocks',
        'angular-cookies':VarsApp.libUrl+'/angular-cookies/angular-cookies',
        'angular-sanitize':VarsApp.libUrl+'/angular-sanitize/angular-sanitize',
        'angular-resource':VarsApp.libUrl+'/angular-resource/angular-resource',
        'angular-animate':VarsApp.libUrl+'/angular-animate/angular-animate.min',
        'angular-touch':VarsApp.libUrl+'/angular-touch/angular-touch.min',
        'semantic':VarsApp.libUrl+'/semantic/semantic.min',
        moment:VarsApp.libUrl+'/moment/moment',
        datetimepicker:VarsApp.libUrl+'/datetimepicker/bootstrap-datetimepicker.min',
        immersive:VarsApp.libUrl+'/immersive-slider/jquery.immersive-slider',
        vegas:VarsApp.libUrl+'/vegas/jquery.vegas.min'
    },
    shim: {
        'angular' : {'exports' : 'angular'},
        'angular-route': ['angular'],
        'angular-cookies': ['angular'],
        'angular-sanitize': ['angular'],
        'angular-resource': ['angular'],
        'angular-animate': ['angular'],
        'angular-touch': ['angular'],
        'angular-mocks': {
            deps:['angular'],
            'exports':'angular.mock'
        },
        jquery: {
            exports: "$"
        },
        semantic:{
            deps:['jquery'],
            'exports':'semantic'
        },
        moment:{
            deps:['jquery']
        },
        datetimepicker:{
            deps:['jquery','moment'],
            'exports':'datetimepicker'
        },
        vegas:{
            deps:['jquery'],
            'exports':'vegas'
        },
        immersive:{
            deps:['jquery'],
            'exports':'immersive'
        }
        /*,
        'bootstrap': {
            deps: ['jquery'],
            exports: "$.fn.popover"
        }*/
    },
    priority: [
        'angular'
    ]
});

//http://code.angularjs.org/1.2.1/docs/guide/bootstrap#overview_deferred-bootstrap
window.name = 'NG_DEFER_BOOTSTRAP!';

require([
    'angular',
    'app',
    'angular-route',
    'jquery',
    //'bootstrap',
    'angular-cookies',
    'angular-sanitize',
    'angular-resource',
    'angular-animate',
    'angular-touch',
    'semantic',
    'datetimepicker',
    'vegas',
    'immersive'
], function(angular, app, ngRoutes,$,bootstrap, ngCookies, ngSanitize, ngResource, ngAnimate, ngTouch,semantic) {
    'use strict';
    /* jshint ignore:start */
    var $html = angular.element(document.getElementsByTagName('html')[0]);
    /* jshint ignore:end */
    angular.element().ready(function() {
        angular.bootstrap(document,['utpApp']);
    });
});
