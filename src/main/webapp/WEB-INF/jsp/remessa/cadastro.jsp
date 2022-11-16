<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Cadastramento de Remessa</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
<c:import url="/WEB-INF/jsp/menu.jsp"/>
<div class="container mt-3">
    <h2>Remessa</h2>
    <form action="/remessa/inclusao" method="post">
        <div class="form-group">
            <label>Album:</label>
            <select name="album" class="form-control">
                <c:forEach var="a" items="${albuns}">
                    <option value="${a.id}">${a.nomeDono}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <label>Figurinhas:</label>
            <c:forEach var="f" items="${figurinhas}">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="figurinhas" value="${f.id}">
                    <label class="form-check-label"> ${f.codigo}</label>
                </div>
            </c:forEach>
        </div>
        <button type="submit" class="btn btn-default">Confirmar</button>
    </form>
</div>
</body>
</html>
