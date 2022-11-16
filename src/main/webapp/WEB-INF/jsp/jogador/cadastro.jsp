<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Jogador</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <h2>Jogador</h2>
    <form action="/jogador/inclusao" method="post">
        <div class="form-group">
            <label>Código:</label>
            <input type="text" class="form-control" placeholder="Insira o código" name="codigo">
        </div>
        <div class="form-group">
            <label>Tipo:</label>
            <input type="text" class="form-control" placeholder="Insira o tipo" name="tipo">
        </div>
        <div class="form-group">
            <label>Nome:</label>
            <input type="text" class="form-control" placeholder="Insira o nome" name="nome">
        </div>
        <div class="form-group">
            <label>Seleção:</label>
            <input type="text" class="form-control" placeholder="Insira a seleção" name="selecao">
        </div>
        <div class="form-group">
            <label>Posição:</label>
            <input type="text" class="form-control" placeholder="Insira a posição" name="posicao">
        </div>
        <button type="submit" class="btn btn-default">Confirmar</button>
    </form>
</div>
</body>
</html>
