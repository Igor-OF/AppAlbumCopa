<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Album</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <h2>Album</h2>
    <form action="/album/inclusao" method="post">
        <div class="form-group">
            <label>Nome do Dono:</label>
            <input type="text" class="form-control" placeholder="Insira o nome do dono" name="nomeDono">
        </div>
        <div class="form-group">
            <label>Data Aquisição:</label>
            <input type="date" class="form-control" name="dataAquisicao">
        </div>
        <button type="submit" class="btn btn-default">Confirmar</button>
    </form>
</div>
</body>
</html>
