<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <%@ include file="commons/head.jsp"%>
</head>
<body>
<%@ include file="commons/navMenu.jsp"%>
<h1>Enregistrer un.e nouv.eau.elle client.e</h1>
<form method="post" action="nouveauclient">
    <label for="nom">Nom : </label>
    <input type="text" name="nom" />

    <label for="adresse">Adresse : </label>
    <input type="text" name="adresse" />

    <input type="submit" value="Enregistrer" />
</form>

</body>
</html>
