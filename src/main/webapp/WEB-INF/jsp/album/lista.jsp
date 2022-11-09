<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Albuns</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container mt-3">
    <h3>Albuns: ${listagem.size()}</h3>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Dono</th>
            <th>Data Aquisição</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="a" items="${listagem}">
            <tr>
                <td>${a.id}</td>
                <td>${a.nomeDono}</td>
                <td>${a.dataAquisicao}</td>
                <td><a href="/album/${a.id}/exclusao">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
