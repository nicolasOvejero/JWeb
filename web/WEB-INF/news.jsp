<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <div class="row">
                <c:forEach var="value" items="${value}">
                    <c:set var="news" value="${fn:split(value, ';')}"/>
                    <section class="12u 12u(narrower)">
                        <div class="box post">
                            <div>
                                <h3><c:out value="${news[1]}"/></h3>

                                <p><c:out value="${news[2]}"/></p>
                            </div>
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
