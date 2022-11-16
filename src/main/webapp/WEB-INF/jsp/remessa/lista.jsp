<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Remessas</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <h3>Remessas: ${listagem.size()}</h3>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Data</th>
            <th>Dono do Album</th>
            <th>Figurinhas</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="r" items="${listagem}">
            <tr>
                <td>${r.id}</td>
                <td>${r.data}</td>
                <td>${r.album.nomeDono}</td>
                <td>${r.figurinhas.size()}</td>
                <td><a href="/remessa/${r.id}/exclusao">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
