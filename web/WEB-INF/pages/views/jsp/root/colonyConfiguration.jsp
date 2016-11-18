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
    <title>Colony Configuration</title>
</head>
<body>
<a href="rootColonyForm">Add Colony</a>

<h3>Colony List</h3>
<c:if test="${!empty colonyList}">
    <table class="tg">
        <tr>
            <th width="80">ID Colony</th>
            <th width="120">Name</th>
            <th width="120">Address</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
        </tr>
        <c:forEach items="${colonyList}" var="colony">
            <tr>
                <td>${colony.idColony}</td>
                <td>${colony.name}</td>
                <td>${colony.address}</td>
                <td><a href="<c:url value='/edit/${colony.idColony}' />" >Edit</a></td>
                <td><a href="<c:url value='/remove/${colony.idColony}' />" >Delete</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
