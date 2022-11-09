<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Estádios</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
    <h3>Estádios: ${listagem.size()}</h3>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Código</th>
            <th>Tipo</th>
            <th>Nome</th>
            <th>Cidade</th>
            <th>Capacidade</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="e" items="${listagem}">
            <tr>
                <td>${e.id}</td>
                <td>${e.codigo}</td>
                <td>${e.tipo}</td>
                <td>${e.nome}</td>
                <td>${e.cidade}</td>
                <td>${e.capacidade}</td>
                <td><a href="/estadio/${e.id}/exclusao">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
