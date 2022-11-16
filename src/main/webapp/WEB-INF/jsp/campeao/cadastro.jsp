<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Campeão</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <h2>Campeão</h2>
    <form action="/campeao/inclusao" method="post">
        <div class="form-group">
            <label>Código:</label>
            <input type="text" class="form-control" placeholder="Insira o código" name="codigo">
        </div>
        <div class="form-group">
            <label>Tipo:</label>
            <input type="text" class="form-control" placeholder="Insira o tipo" name="tipo">
        </div>
        <div class="form-group">
            <label>Partida:</label>
            <input type="text" class="form-control" placeholder="Insira a partida" name="partida">
        </div>
        <div class="form-group">
            <label>Data:</label>
            <input type="date" class="form-control" placeholder="Insira a data" name="data">
        </div>
        <button type="submit" class="btn btn-default">Confirmar</button>
    </form>
</div>
</body>
</html>
