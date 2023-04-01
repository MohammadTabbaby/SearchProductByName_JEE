<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%--@elvariable id="modele" type="web.ProduitModele"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="controleur" method="post" >
        <input type="text" name="motCle" value="${modele.motCle}">
        <input type="submit" value="Send">
    </form>

    <table border="2" width="80%">
    <table border="2" width="80%">
        <tr>
            <th>ID</th><th>Nom</th><th>Prix</th>
        </tr>
        <tr>
            <c:forEach items = "${modele.produits}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.nom}</td>
                    <td>${p.prix}</td>
                </tr>
            </c:forEach>
    </table>
</body>
</html>
