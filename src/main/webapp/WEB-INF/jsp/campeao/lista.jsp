<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Campeões</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
    <h3>Campeões: ${listagem.size()}</h3>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Código</th>
            <th>Tipo</th>
            <th>Partida</th>
            <th>Data</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="c" items="${listagem}">
            <tr>
                <td>${c.id}</td>
                <td>${c.codigo}</td>
                <td>${c.tipo}</td>
                <td>${c.partida}</td>
                <td>${c.data}</td>
                <td><a href="/campeao/${c.id}/exclusao">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
