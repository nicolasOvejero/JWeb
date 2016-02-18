<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Home</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="css/main.css"/>
</head>
<body>
<div id="page-wrapper">
    <%@ include file="header.jsp" %>

    <section id="banner">
        <header>
            <h2>BDVO : <em>Le site de vente de bande dessiné en ligne en VO !</em></h2>
        </header>
    </section>
    <section class="wrapper style1">
        <div class="container">
            <div class="row 200%">
                <c:forEach var="value" items="${LastCata}">
                    <c:set var="product" value="${fn:split(value, '#')}"/>
                    <c:set var="text" value="${product[4]}"/>
                    <section class="4u 12u(narrower)">
                        <div class="box highlight">
                            <img class="icon major-first fa-paper-plane" src="<c:out value="${product[7]}"/>"/>

                            <h3><c:out value="${product[1]}"/> par <c:out value="${product[2]}"/></h3>

                            <p><c:out value="${fn:substring(text, 0, 200)}"/> ...</p>
                        </div>
                    </section>
                </c:forEach>
            </div>
        </div>
    </section>

    <section class="wrapper style2">
        <div class="container">
            <header class="major">
                <h2>Vous voulez plus de bande dessinée !</h2>

                <p><a href="catalogue" class="button">Alors venez ici</a></p>
            </header>
        </div>
    </section>

    <section class="wrapper style1">
        <div class="container">
            <div class="row">
                <c:forEach var="value" items="${LastNews}">
                    <c:set var="news" value="${fn:split(value, ';')}"/>
                    <c:set var="text" value="${news[2]}"/>
                    <section class="6u 12u(narrower)">
                        <div class="box post">
                            <div>
                                <h3><c:out value="${news[1]}"/></h3>

                                <p><c:out value="${fn:substring(news[2], 0, 250)}"/> ...</p>
                            </div>
                        </div>
                    </section>
                </c:forEach>
            </div>
        </div>
    </section>

    <section id="cta" class="wrapper style3">
        <div class="container">
            <header>
                <h2>Vous n'avez pas assez de news ?</h2>
                <a href="news" class="button">Voir plus de news</a>
            </header>
        </div>
    </section>

    <%@ include file="footer.jsp" %>
</div>
</div>
</body>
</html>