<%--
  Created by IntelliJ IDEA.
  User: jolvera
  Date: 12/11/2016
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %><html>
<head>
    <title>Colonia Configuration</title>
</head>
<body>
<a href="rootColoniaForm">Add Colonia</a>

<h3>Colonia List</h3>
<c:if test="${!empty coloniaList}">
    <table class="tg">
        <tr>
            <th width="80">ID Colonia</th>
            <th width="120">Name</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${coloniaList}" var="colonia">
            <tr>
                <td>${colonia.idColonia}</td>
                <td>${colonia.nombre}</td>
                <td><a href="<c:url value='/edit/${colonia.idColonia}' />" >Edit</a></td>
                <td><a href="<c:url value='/remove/${colonia.idColonia}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
