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
    <section class="wrapper style1">
        <div class="container">
            <h3>Création de compte</h3>

            <form method="post" action="creation">
                <div class="row 50%">
                    <div class="6u 12u(mobilep)">
                        <input type="text" name="newlogin" id="newLogin" placeholder="Identifiant *"
                               value="${user.login}"/>
                        <span style="color:red">${form.error['newlogin']}</span>
                    </div>
                    <div class="6u 12u(mobilep)">
                        <input type="password" name="newPass" id="newPass" placeholder="Mot de passe *"
                               value="${user.password}"/>
                        <span style="color:red">${form.error['newPass']}</span>
                    </div>
                    <div class="6u 12u(mobilep)">
                        <input type="text" name="newNom" id="newNom" placeholder="Votre nom *" value="${user.name}"/>
                        <span style="color:red">${form.error['newPass']}</span>
                    </div>
                    <div class="6u 12u(mobilep)">
                        <input type="text" name="newSurname" id="newSurname" placeholder="Votre prénom *"
                               value="${user.surname}"/>
                        <span style="color:red">${form.error['newSurname']}</span>
                    </div>
                    <div class="6u 12u(mobilep)">
                        <input type="text" name="newAdress" id="newAdress" placeholder="Votre adresse *"
                               value="${user.adress}"/>
                        <span style="color:red">${form.error['newAdress']}</span>
                    </div>
                    <div class="6u 12u(mobilep)">
                        <input type="text" name="newEmail" id="newEmail" placeholder="Votre email *"
                               value="${user.email}"/>
                        <span style="color:red">${form.error['newEmail']}</span>
                    </div>
                    <div class="6u 12u(mobilep)">
                        <input type="checkbox" name="newsLetter" id="newsLetter"/>Abonement news letter
                    </div>
                </div>
                <br><input type="submit" value="Crée un compte"/>
            </form>
            <p style="${empty form.error ? 'color:green' : 'color:red'}">${form.result}</p>
        </div>
        <%@ include file="footer.jsp" %>
</div>
</body>
</html>
