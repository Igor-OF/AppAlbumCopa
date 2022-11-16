<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>AppAlbumCopa</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>

<div class="container mt-3">
    <h2>Autenticação</h2>
    <form action="/login" method="post">
        <div class="form-group">
            <label>Email:</label>
            <input type="email" class="form-control" placeholder="Insira o seu e-mail" name="email">
        </div>
        <div class="form-group">
            <label>Senha:</label>
            <input type="password" class="form-control" placeholder="Insira a sua senha" name="senha">
        </div>

        <button type="submit" class="btn btn-default">Acessar</button>
    </form>
</div>
</body>
</html>
