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
            <th>Code</th>
            <th>Description</th>
            <th>Prix unitaire</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${articles}" var="article" varStatus="variableStatus">
            <tr>
                <td>${article.code}</td>
                <td>${article.nom}</td>
                <td>${article.prix}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="nouvelarticle"><button>Ajouter un article</button></a>
</body>
</html>
