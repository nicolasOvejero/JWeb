<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div id="header">
    <a href="/home" id="logo"><img src="/images/logo.png" alt="logo" style="margin-top: -50px;"/></a>
    <nav id="nav">
        <ul>
            <li><a href="home">Accueil</a></li>
            <li><a href="catalogue">Catalogue</a></li>
            <li><a href="news">News</a></li>
            <li><a href="creation">Création de compte</a></li>
            <li><a href="login">Connectez vous</a></li>
            <li><a href="contact">Contact</a></li>
            <c:if test="${!empty sessionScope.userSeesion && sessionScope.userSeesion.level != 0}">
                <li><a href="administrator">Administration</a></li>
            </c:if>
        </ul>
    </nav>
</div>