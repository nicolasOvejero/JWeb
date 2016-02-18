<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Contact-us</title>
    <meta charset="utf-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="css/main.css"/>
</head>
<body>
<div id="page-wrapper">
    <%@ include file="header.jsp" %>
    <section class="wrapper style1">
        <div class="container">
            <div class="row 200%">
                <c:forEach var="value" items="${value}">
                    <c:set var="product" value="${fn:split(value, '#')}"/>
                    <c:set var="text" value="${product[4]}"/>
                    <section class="4u 12u(narrower)">
                        <div class="box highlight">
                            <img class="icon major fa-paper-plane" src="<c:out value="${product[7]}"/>"/>

                            <h3><c:out value="${product[1]}"/> par <c:out value="${product[2]}"/></h3>

                            <p><c:out value="${fn:substring(text, 0, 200)}"/> ...</p>
                            <h5>Quantité : <c:out value="${product[5]}"/><br> Prix : <c:out value="${product[6]}"/>
                                euros</h5>
                        </div>
                    </section>
                </c:forEach>
            </div>
        </div>
    </section>
    <%@ include file="footer.jsp" %>
</div>
</body>
</html>
