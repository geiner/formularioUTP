define(['angular'], function (angular) {
    'use strict';

    angular.module('ModuloPrincipal', []).controller('HelloCtrl', function ($scope, $http) {

        $scope.provincias={
        };
        $scope.distritos={
        };

        $http.get('/rest/empleado/provincias')
            .success(function (response) {
                $scope.provincias = response;
            });

        $('#empl_provincia').change(function(){
            $http.get('/rest/empleado/distritos/'+$('#empl_provincia').val())
                .success(function (response) {
                    $scope.distritos = response;
                });
        });
        $scope.cambiar= function () {
            $http.get('/rest/empleado/distritos/'+$('#empl_distrito').val())
                .success(function (response) {
                    $scope.distritos = response;
                });
        };
        $scope.grabar= function () {
            var empleado={
                nombres:$('#nombres').val(),
                apellidos:$('#apellidos').val(),
                dni:$('#dni').val(),
                provincia:$('#empl_provincia').val(),
                distrito:$('#empl_distrito').val(),
                direccion:$('#direccion').val()
            };
            $http.post('/rest/empleado/grabar', empleado).
                success(function(data, status, headers, config) {
                    $('#mensaje').modal();
                }).
                error(function(data, status, headers, config) {

                });
        }


    })
});