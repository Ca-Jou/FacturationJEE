<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="commons/head.jsp"%>
</head>
<body>
<%@ include file="commons/navMenu.jsp"%>

<div>
    <p>Date de facturation : ${facture.date}</p>
    <p>Numero de facture : ${facture.numero}</p>
</div>

<div style="text-align: right">
    <p>${facture.client.nom}</p>
    <p>${facture.client.adresse}</p>
</div>

<table>
    <thead>
        <tr>
            <th>Article</th>
            <th>Quantite</th>
            <th>Prix unitaire HT</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${facture.lignesFacture}" var="ligne" varStatus="variableStatus">
            <tr>
                <td>${ligne.article.nom}</td>
                <td>${ligne.quantite}</td>
                <td>${ligne.prix}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<div style="text-align: right">
    <p>Total : ${facture.montant} €HT</p>
</div>

</body>
</html>
