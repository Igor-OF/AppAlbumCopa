<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Figurinhas</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
    <h3>Figurinhas: ${listagem.size()}</h3>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Código</th>
            <th>Tipo</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="f" items="${listagem}">
            <tr>
                <td>${f.id}</td>
                <td>${f.codigo}</td>
                <td>${f.tipo}</td>
                <td><a href="/figurinha/${f.id}/exclusao">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
