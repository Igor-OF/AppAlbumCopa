<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Usuário</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <form action="/cep" class="form-inline" method="post">
        <div class="form-group">
            <label>CEP:</label>
            <input type="text" class="form-control" placeholder="Insira o CEP" name="cep">
        </div>
        <button type="submit" class="btn btn-default">Buscar</button>
    </form>
    <h2>Usuário</h2>
    <form action="/usuario/inclusao" method="post">
        <div class="form-group">
            <label>Nome:</label>
            <input type="text" class="form-control" placeholder="Insira o nome" name="nome">
        </div>
        <div class="form-group">
            <label>Email:</label>
            <input type="email" class="form-control" placeholder="Insira o email" name="email">
        </div>
        <div class="form-group">
            <label>Senha:</label>
            <input type="password" class="form-control" placeholder="Insira a senha" name="senha">
        </div>
        <c:import url="/WEB-INF/jsp/endereco.jsp"/>
        <button type="submit" class="btn btn-default">Confirmar</button>
    </form>
</div>
</body>
</html>
