<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <%@ include file="commons/head.jsp"%>
</head>
<body>
<%@ include file="commons/navMenu.jsp"%>
<h1>Enregistrer un nouvel article</h1>
<form method="post" action="nouvelarticle">
    <label for="code">Code : </label>
    <input type="text" name="code" />

    <label for="nom">Nom : </label>
    <input type="text" name="nom" />

    <label for="prix">Prix : </label>
    <input type="number" name="prix" />

    <input type="submit" value="Enregistrer" />
</form>

</body>
</html>
