<%--
  Created by IntelliJ IDEA.
  User: jolvera
  Date: 13/11/2016
  Time: 06:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Vecino</title>
</head>
<body>

<h2>Submitted Vecino Information</h2>
<table>
    <tr>
        <td>idVecino</td>
        <td>${idVecino}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>Address</td>
        <td>${address}</td>
    </tr>
</table>
</body>
</html>