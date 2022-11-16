<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Jogadores</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <h3>Jogadores: ${listagem.size()}</h3>
    <h4><a href="/jogador">Novo jogador</a></h4>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Código</th>
            <th>Tipo</th>
            <th>Nome</th>
            <th>Seleção</th>
            <th>Posição</th>
            <th></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="j" items="${listagem}">
            <tr>
                <td>${j.id}</td>
                <td>${j.codigo}</td>
                <td>${j.tipo}</td>
                <td>${j.nome}</td>
                <td>${j.selecao}</td>
                <td>${j.posicao}</td>
                <td><a href="/jogador/${j.id}/exclusao">excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
