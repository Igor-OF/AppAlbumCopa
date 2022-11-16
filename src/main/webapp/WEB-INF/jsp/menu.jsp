<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">AppAlbumCopa</a>
        </div>
        <ul class="nav navbar-nav">
            <li class="active"><a href="/">Home</a></li>
            <c:if test="${not empty user}">
                <li>
                    <a class="nav-link" href="/usuario/lista">Usuario</a>
                </li>
                <li>
                    <a class="nav-link" href="/remessa/lista">Remessa</a>
                </li>
                <li>
                    <a class="nav-link" href="/album/lista">Album</a>
                </li>
                <li>
                    <a class="nav-link" href="/figurinha/lista">Figurinha</a>
                </li>
                <li>
                    <a class="nav-link" href="/jogador/lista">Jogador</a>
                </li>
                <li>
                    <a class="nav-link" href="/estadio/lista">Estadio</a>
                </li>
                <li>
                    <a class="nav-link" href="/campeao/lista">Campeao</a>
                </li>
            </c:if>
        </ul>
        <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty user}">
                <li><a href="/usuario"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="/login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </c:if>
            <c:if test="${not empty user}">
                <li><a href="/logout"><span class="glyphicon glyphicon-log-out"></span> Logout ${user.nome}</a></li>
            </c:if>
        </ul>
    </div>
</nav>
