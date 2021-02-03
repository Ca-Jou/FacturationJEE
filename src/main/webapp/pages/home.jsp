<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Pezzz</title>
    <link rel="stylesheet" href="https://unpkg.com/concrete.css@1.3.0/concrete.css">
    <style type="text/css">
        ul {
            display: flex;
            align-items: center;
            justify-content: flex-end;
            list-style: none;
        }
        a {
            margin-right: 18px;
            text-decoration: none;
        }
        h1 {
            text-align: center;
        }
    </style>
</head>
<body>
<header>
    <nav>
        <div class="nav-wrapper">
            <%--            <a href="" class="brand-logo"><%@include file="../../images/logo.png" %></a>--%>
            <ul id="nav-mobile" class="right hide-on-med-and-down">
                <li><a href="clients">Clients</a></li>
                <li><a href="">Factures</a></li>
                <li><a href="">Articles</a></li>
            </ul>
        </div>
    </nav>
</header>
<h1>Bienvenue dans votre logiciel de gestion du Pezzz !</h1>
</body>
</html>