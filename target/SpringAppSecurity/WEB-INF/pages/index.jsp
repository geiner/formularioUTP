<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<!doctype>
<html lang="en" ng-app="utpApp">
<head>
    <meta charset="UTF-8">
    <title>UTP</title>
    <link rel="stylesheet" type="text/css" href="/assets/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="/assets/css/utp.css">
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">Tercera Practica - UTP</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
            <form class="navbar-form navbar-right" role="form">
                <div class="form-group">
                    <input type="text" placeholder="Usuario" class="form-control">
                </div>
                <div class="form-group">
                    <input type="password" placeholder="Contraseña" class="form-control">
                </div>
                <button type="submit" class="btn btn-success">Ingresar</button>
            </form>
        </div>
        <!--/.navbar-collapse -->
    </div>
</nav>
<div class="container">
    <div class="starter-template">
        <h1><span class="glyphicon glyphicon-user"></span> Registro de Empleado </h1>
    </div>
</div>
<div ng-view>

</div>
<script src="resources/components/requirejs/require.js" data-main="resources/scripts/main.js"></script>
</body>
</html>