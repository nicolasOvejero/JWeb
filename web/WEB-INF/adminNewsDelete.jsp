<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Administration Clobal</title>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <link rel="stylesheet" href="../../css/main.css"/>
    </head>
    <body>
        <%@ include file="headerAdmin.jsp" %>
        <c:choose>
            <c:when test="${empty sessionScope.userSeesion}">
                <h1 >Merci de vous connecter pour accéder à cette page</h1>
            </c:when>
            <c:when test="${sessionScope.userSeesion.level  == 0}">
                <h1 >Vous n'avez pas les droits pour accéder à cette page</h1>
            </c:when>
            <c:otherwise>
                <section class="wrapper style1">
                    <div class="container">
                        <div class="row 200%">
                            <div class="4u 12u(narrower)">
                                <div id="sidebar">
                                    <section>
                                        <h3>Menu d'administration</h3>
                                        <ul class="links">
                                            <li><a href="/administrator">Accueil administration</a></li>
                                            <li><a href="/administrator/users">Voir tout les utilisateur</a></li>
                                            <li><a href="/administrator/news/add">Ajouter une news</a></li>
                                            <li><a href="/administrator/news/delete">Supprimer une news</a></li>
                                            <li><a href="/home">Retour sur site</a></li>
                                        </ul>
                                    </section>
                                </div>
                            </div>
                            <div class="8u  12u(narrower) important(narrower)">
                                <div id="content">
                                    <article>
                                        <header>
                                            <h2>Liste des news</h2>
                                        </header>
                                        <form action="/administrator/news/delete" method="post">
                                            <table class="default">
                                                <thead>
                                                <tr>
                                                    <th>Titre</th>
                                                    <th>Texte</th>
                                                    <th>Suppression</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <c:forEach var="value" items="${news.values}">
                                                    <c:set var="news" value="${fn:split(value, ';')}"/>
                                                    <tr>
                                                        <td><c:out value="${fn:substring(news[1], 0, 100)}"/> ...</td>
                                                        <td><c:out value="${fn:substring(news[2], 0, 100)}"/> ...</td>
                                                        <td style="text-align: center;"><input type="checkbox" name="id"
                                                                                               value="<c:out value="${fn:substring(news[0], 2, 15)}"/>"></td>
                                                    </tr>
                                                </c:forEach>
                                                </tbody>
                                            </table>
                                            <input type="submit" value="Supprimer">
                                        </form>
                                    </article>
                                </div>
                            </div>
                        </div>
                    </div>
                </section>
            </c:otherwise>
        </c:choose>
        <%@ include file="footer.jsp" %>
    </body>
</html>
