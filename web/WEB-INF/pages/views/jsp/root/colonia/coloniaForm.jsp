<%--
  Created by IntelliJ IDEA.
  User: jolvera
  Date: 12/11/2016
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="true" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<%@ include file="/WEB-INF/pages/views/jsp/head.jsp" %>
<body>
<div id="wrapper">
    <%@ include file="/WEB-INF/pages/views/jsp/root/leftPanel.jsp" %>
    <div id="page-wrapper" class="page-wrapper-cls">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-head-line"><spring:message code="label.commons.colony" text="default text" /></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <spring:message code="label.colony.title" text="default text" />
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" action="rootAddColonia">
                                <div class="form-group">
                                    <spring:message code='label.colony.name' text="default text" var="name"/>
                                    <form:label path="nombre"/>${name}</label>
                                    <form:input path="nombre" class="form-control" id="nombre" placeholder="${name}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.colony.country.combo' text="default text" var="countryCombo"/>
                                    <spring:message code='label.colony.country' text="default text" var="country"/>
                                    <spring:message code='label.commons.country.default.id' text="default text" var="countrydefault"/>
                                    <label>${country}</label>
                                    <select class="form-control">
                                        <option value="0 >${countryCombo}</option>
                                        <c:forEach items="${catalogoPais}" var="countryelement">
                                            <c:if test="${countryelement.id_pais == countrydefault}">
                                                <option value="${countryelement.id_pais}" selected>${countryelement.descPais}</option>
                                            </c:if>
                                            <option value="${countryelement.id_pais}">${countryelement.descPais}</option>
                                        </c:forEach>
                                    </select>
                                </div>

                                <div class="form-group">
                                    <spring:message code='label.colony.country' text="default text" var="country"/>
                                    <form:label path="idPais"/>${country}</label>
                                    <form:input path="idPais" class="form-control" id="idPais" placeholder="${country}" />
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.colony.state' text="default text" var="state"/>
                                    <form:label path="idEstado"/>${state}</label>
                                    <form:input path="idEstado" class="form-control" id="idEstado" placeholder="${state}" />
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.colony.city' text="default text" var="city"/>
                                    <form:label path="idCiudad"/>${city}</label>
                                    <form:input path="idCiudad" class="form-control" id="idCiudad" placeholder="${city}" />
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.colony.zipcode' text="default text" var="zipcode"/>
                                    <form:label path="cp"/>${zipcode}</label>
                                    <form:input path="cp" class="form-control" id="cp" placeholder="${zipcode}" />
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.colony.zone' text="default text" var="zone"/>
                                    <form:label path="idZona"/>${zone}</label>
                                    <form:input path="idZona" class="form-control" id="idZona" placeholder="${zone}" />
                                </div>
                                <button type="submit" class="btn btn-default" value="submit"><spring:message code="label.commons.submit" text="default text"/></button>
                            </form:form>
                        </div>
                        <!-- /. PAGE INNER  -->
                    </div>
                    <!-- /. PAGE WRAPPER  -->
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="/WEB-INF/pages/views/jsp/footer.jsp" %>
<%@ include file="/WEB-INF/pages/views/jsp/jquery.jsp" %>
</body>
</html>
