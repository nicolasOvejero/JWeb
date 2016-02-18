<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"/>
    <title>Connexion</title>
    <link type="text/css" rel="stylesheet" href="/css/main.css"/>
</head>
<body>
<div id="page-wrapper">
    <%@ include file="header.jsp" %>
    <c:choose>
        <c:when test="${!empty sessionScope.userSeesion}">
            <p style="color:green;margin: 50px auto 160px auto;width: 550px;font-size: 60px;">Bonjour, ${sessionScope.userSeesion.login}</p>
        </c:when>
        <c:otherwise>
            <section class="wrapper style1">
                <div class="container">
                    <form method="post" action="login">
                        <section class="6u 12u(narrower)" style="margin: auto;">
                            <div class="box post">
                                <div>
                                    <h3>Connexion</h3>
                                    <form method="post" action="connexion">
                                        <div class="row 50%">
                                            <div class="6u 12u(mobilep)">
                                                <input type="text" name="login" id="login" placeholder="Identifiant *"/>
                                                <span style="color:red">${form.error['login']}</span>
                                            </div>
                                            <div class="6u 12u(mobilep)">
                                                <input type="password" name="pass" id="pass" placeholder="Mot de passe *"/>
                                                <span style="color:red">${form.error['pass']}</span>
                                            </div>
                                        </div>
                                        <br><input type="submit" value="Connexion"/>
                                    </form>
                                </div>
                            </div>
                        </section>
                    </form>
                </div>
            </section>
        </c:otherwise>
    </c:choose>
    <span style="color:red">${form.error['errorUser']}</span>
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>