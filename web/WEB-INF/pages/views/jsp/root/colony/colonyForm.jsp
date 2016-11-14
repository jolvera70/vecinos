<%--
  Created by IntelliJ IDEA.
  User: jolvera
  Date: 12/11/2016
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Add Colony</title>
</head>
<body>

<h2>Colony Information</h2>
<form:form method="POST" action="rootAddColony">
    <table>
        <tr>
            <td><form:label path="name">Name</form:label></td>
            <td><form:input path="name" /></td>
        </tr>
        <tr>
            <td><form:label path="address">Address</form:label></td>
            <td><form:input path="address" /></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit"/>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>