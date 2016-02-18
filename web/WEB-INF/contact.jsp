<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <div class="container">
        <h3>Garder le contact avec nous !</h3>

        <form method="post" action="contact">
            <div class="row 50%">
                <div class="6u 12u(mobilep)">
                    <input type="text" name="name" id="name" placeholder="Nom *" value="${form.value['name']}"/>
                    <span style="color:red">${form.error['name']}</span>
                </div>
                <div class="6u 12u(mobilep)">
                    <input type="text" name="surname" id="surname" placeholder="Prenom *"
                           value="${form.value['surname']}"/>
                    <span style="color:red">${form.error['surname']}</span>
                </div>
                <div class="6u 12u(mobilep)">
                    <input type="text" name="subject" id="subject" placeholder="Sujet *"
                           value="${form.value['subject']}"/>
                    <span style="color:red">${form.error['subject']}</span>
                </div>
                <div class="6u 12u(mobilep)">
                    <input type="email" name="email" id="email" placeholder="Email *" value="${form.value['email']}"/>
                    <span style="color:red">${form.error['email']}</span>
                </div>
                <div class="10u 12u(mobilep)">
                    <textarea name="message" id="message" placeholder="Message *" cols="500" rows="5">${form.value['message']}</textarea>
                    <span style="color:red">${form.error['message']}</span>
                </div>
            </div>
            <div class="row 50%">
                <div class="12u">
                    <ul class="actions">
                        <li><input type="submit" class="button alt" value="Envoyer le message"/></li>
                    </ul>
                </div>
            </div>
        </form>
        <p style="${empty form.error ? 'color:green' : 'color:red'}">${form.result}</p>
    </div>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>
