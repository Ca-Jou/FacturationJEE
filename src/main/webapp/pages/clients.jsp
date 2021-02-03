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
            <th>Nom</th>
            <th>Adresse</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${clients}" var="client" varStatus="variableStatus">
            <tr>
                <td>${client.nom}</td>
                <td>${client.adresse}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<a href="nouveauclient"><button>Ajouter un.e client.e</button></a>
</body>
</html>
