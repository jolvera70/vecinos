<%--
  Created by IntelliJ IDEA.
  User: bvelasco
  Date: 20/11/2016
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<%@ include file="/WEB-INF/pages/views/jsp/head.jsp" %>
<body>
<div id="wrapper">
    <%@ include file="/WEB-INF/pages/views/jsp/admin/leftPanelAdmin.jsp" %>
    <div id="page-wrapper" class="page-wrapper-cls">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-head-line"><spring:message code="label.commons.neighbor" text="default text" /></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <spring:message code="label.neighbor.title" text="default text" />
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" action="adminAddVecino">
                                <div class="form-group">
                                    <spring:message code='label.neighbor.name' text="default text" var="name"/>
                                    <label>${name}</label>
                                    <form:input path="nombre" class="form-control" id="nombre" placeholder="${name}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.neighbor.lastName1' text="default text" var="apellidoPaterno"/>
                                    <label>${apellidoPaterno}</label>
                                    <form:input path="apellidoPaterno" class="form-control" id="apellidoPaterno" placeholder="${apellidoPaterno}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.neighbor.lastName2' text="default text" var="apellidoMaterno"/>
                                    <label>${apellidoMaterno}</label>
                                    <form:input path="apellidoMaterno" class="form-control" id="apellidoMaterno" placeholder="${apellidoMaterno}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.neighbor.street.combo' text="default text" var="calleCombo"/>
                                    <spring:message code='label.neighbor.street' text="default text" var="calle"/>
                                    <label>${calle}</label>
                                    <form:select class="form-control" path="idCalle">
                                        <option value="0">${calleCombo}</option>
                                        <c:forEach items="${catalogoCalle}" var="calleElemento">
                                            <option value="${calleElemento.idCalle}">${calleElemento.descCalle}</option>
                                        </c:forEach>
                                    </form:select>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.neighbor.houseNumber' text="default text" var="numCasa"/>
                                    <label>${numCasa}</label>
                                    <form:input path="numCasa" class="form-control" id="numCasa" placeholder="${numCasa}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.neighbor.movilNumber' text="default text" var="numCelular"/>
                                    <label>${numCelular}</label>
                                    <form:input path="numCelular" class="form-control" id="numCelular" placeholder="${numCelular}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.neighbor.phoneNumber' text="default text" var="numTelefono"/>
                                    <label>${numTelefono}</label>
                                    <form:input path="numTelefono" class="form-control" id="numTelefono" placeholder="${numTelefono}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.neighbor.email' text="default text" var="email"/>
                                    <label>${email}</label>
                                    <form:input path="email" class="form-control" id="email" placeholder="${email}"/>
                                </div>
                                <div class="form-group">
                                    <div class="checkbox">
                                            <spring:message code='label.neighbor.requiresBilling' text="default text" var="billing"/>
                                            <label><form:checkbox path="requiereFactura" id="requiereFactura" value="1"/>${billing}</label>
                                    </div>
                                    <div class="checkbox">
                                            <spring:message code='label.neighbor.isRentedHouse' text="default text" var="rented"/>
                                            <label><form:checkbox path="casaRentada" id="casaRentada" value="1"/>${rented}</label>
                                    </div>
                                    <div class="checkbox">
                                            <spring:message code='label.neighbor.isVisible' text="default text" var="visible"/>
                                            <label><form:checkbox path="esVisible" id="esVisible" value="1"/>${visible}</label>
                                    </div>
                                </div>

                        </div>
                        <!-- /. PAGE INNER  -->
                    </div>
                    <!-- /. PAGE WRAPPER  -->

                </div>

                <div class="col-md-6">
                    <div class="row">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <spring:message code="label.occupier.title" text="default text" />
                        </div>
                        <div class="panel-body">

                                <div class="form-group">
                                    <spring:message code='label.occupier.name' text="default text" var="name"/>
                                    <label>${name}</label>
                                    <form:input path="nombre" class="form-control" id="nombre" placeholder="${name}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.occupier.lastName1' text="default text" var="apellidoPaterno"/>
                                    <label>${apellidoPaterno}</label>
                                    <form:input path="apellidoPaterno" class="form-control" id="apellidoPaterno" placeholder="${apellidoPaterno}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.occupier.lastName2' text="default text" var="apellidoMaterno"/>
                                    <label>${apellidoMaterno}</label>
                                    <form:input path="apellidoMaterno" class="form-control" id="apellidoMaterno" placeholder="${apellidoMaterno}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.occupier.movilNumber' text="default text" var="numCelular"/>
                                    <label>${numCelular}</label>
                                    <form:input path="numCelular" class="form-control" id="numCelular" placeholder="${numCelular}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.occupier.email' text="default text" var="email"/>
                                    <label>${email}</label>
                                    <form:input path="email" class="form-control" id="email" placeholder="${email}"/>
                                </div>
                                <div class="form-group">
                                    <div class="checkbox">
                                        <spring:message code='label.occupier.requiresBilling' text="default text" var="billing"/>
                                        <label><form:checkbox path="requiereFactura" id="requiereFactura" value="1"/>${billing}</label>
                                    </div>

                                    <div class="checkbox">
                                        <spring:message code='label.occupier.isVisible' text="default text" var="visible"/>
                                        <label><form:checkbox path="esVisible" id="esVisible" value="1"/>${visible}</label>
                                    </div>
                                </div>

                        </div>
                        <!-- /. PAGE INNER  -->
                    </div>
                    <!-- /. PAGE WRAPPER  -->

                </div>

                    <div class="row">
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <spring:message code="label.billing.title" text="default text" />
                            </div>
                            <div class="panel-body">

                                <div class="form-group">
                                    <spring:message code='label.billing.id' text="default text" var="name"/>
                                    <label>${name}</label>
                                    <form:input path="nombre" class="form-control" id="nombre" placeholder="${name}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.billing.address' text="default text" var="apellidoPaterno"/>
                                    <label>${apellidoPaterno}</label>
                                    <form:input path="apellidoPaterno" class="form-control" id="apellidoPaterno" placeholder="${apellidoPaterno}"/>
                                </div>

                            </div>
                            <!-- /. PAGE INNER  -->
                        </div>
                        <!-- /. PAGE WRAPPER  -->
                        <button type="submit" class="btn btn-default" value="submit"><spring:message code="label.commons.submit" text="default text"/></button>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/pages/views/jsp/footer.jsp" %>
<%@ include file="/WEB-INF/pages/views/jsp/jquery.jsp" %>
</body>
</html>
