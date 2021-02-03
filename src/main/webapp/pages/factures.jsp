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

<table>
    <thead>
        <tr>
            <th>Numero</th>
            <th>Date</th>
            <th>Client</th>
            <th>Montant HT</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${factures}" var="facture" varStatus="variableStatus">
            <tr>
                <td><a href="facture?id=${facture.id}">${facture.numero}</a></td>
                <td>${facture.date}</td>
                <td>${facture.client.nom}</td>
                <td>${facture.montant}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
