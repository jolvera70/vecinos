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
<script type="text/javascript" charset="utf-8">
    $("select#paisSelect").change(function(){
        alert("aqui");
        $.getJSON("rootCatalogoEstado",{countryCode: $(this).val()}, function(j){
            var options = '';
            for (var i = 0; i < j.length; i++) {
                options += '<option value="' + j[i].id + '">' + j[i].name + '</option>';
            }
            $("select#idEstado").html(options);
        });
    });
</script>
<body>
<div id="wrapper">
    <%@ include file="/WEB-INF/pages/views/jsp/root/leftPanel.jsp" %>
    <div id="page-wrapper" class="page-wrapper-cls">
        <div id="page-inner">
            <div class="row">
                <div class="col-md-12">
                    <h1 class="page-head-line"><spring:message code="label.commons.colony" text="default text"/></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <spring:message code="label.colony.title" text="default text"/>
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" action="rootAddColonia">
                                <div class="form-group">
                                    <spring:message code='label.colony.name' text="default text" var="name"/>
                                    <form:label path="nombre"/>
                                        ${name}</label>
                                    <form:input path="nombre" class="form-control" id="nombre" placeholder="${name}"/>
                                </div>
                                <div class="form-group">
                                    <spring:message code='label.colony.country.combo' text="default text"
                                                    var="paisCombo"/>
                                    <spring:message code='label.colony.country' text="default text" var="pais"/>
                                    <spring:message code='label.commons.country.default.id' text="default text"
                                                    var="paisDefault"/>
                                    <label>${pais}</label>
                                    <form:select class="form-control" path="pais">
                                        <form:option value="0">${paisCombo}</form:option>
                                        <form:options items="${catalogoPais}" itemValue="idPais" itemLabel="descPais"/>
                                    </form:select>
                                </div>

                                <div class="form-group">
                                    <spring:message code='label.colony.state.combo' text="default text" var="estadoCombo"/>
                                    <spring:message code='label.colony.state' text="default text" var="estado"/>
                                    <label>${estado}</label>
                                    <form:select class="form-control" path="idEstado">
                                        <option value="0">${estadoCombo}</option>
                                        <c:forEach items="${catalogoEstado}" var="estadoElemento">
                                            <option value="${estadoElemento.idEstado}">${estadoElemento.descEstado}</option>
                                        </c:forEach>
                                    </form:select>
                                </div>

                                <div class="form-group">
                                    <spring:message code='label.colony.municipio.combo' text="default text"
                                                    var="municipioCombo"/>
                                    <spring:message code='label.colony.municipio' text="default text" var="municipio"/>
                                    <label>${municipio}</label>
                                    <form:select class="form-control" path="idMunicipio">
                                        <option value="0" selected>${municipioCombo}</option>
                                        <c:forEach items="${catalogoMunicipio}" var="municipioElemento">
                                            <option value="${municipioElemento.idMunicipio}">${municipioElemento.descMunicipio}</option>
                                        </c:forEach>
                                    </form:select>
                                </div>

                                <div class="form-group">
                                    <spring:message code='label.colony.zone.combo' text="default text"
                                                    var="zonaCombo"/>
                                    <spring:message code='label.colony.zone' text="default text" var="zona"/>
                                    <label>${zona}</label>
                                    <form:select class="form-control" path="idZona">
                                        <option value="0" selected>${zonaCombo}</option>
                                        <c:forEach items="${catalogoZona}" var="zonaElemento">
                                            <option value="${zonaElemento.idZona}">${zonaElemento.descZona}</option>
                                        </c:forEach>
                                    </form:select>
                                </div>

                                <div class="form-group">
                                    <spring:message code='label.colony.zipcode' text="default text" var="zipcode"/>
                                    <form:label path="cp"/>
                                        ${zipcode}</label>
                                    <form:input path="cp" class="form-control" id="cp" placeholder="${zipcode}"/>
                                </div>
                                <button type="submit" class="btn btn-default" value="submit"><spring:message
                                        code="label.commons.next" text="default text"/></button>
                            </form:form>
                        </div>
                        <!-- /. PAGE INNER  -->
                    </div>
                    <!-- /. PAGE WRAPPER  -->
                </div>





        </div>
    </div>
</div>
<%@ include file="/WEB-INF/pages/views/jsp/footer.jsp" %>
<%@ include file="/WEB-INF/pages/views/jsp/jquery.jsp" %>
</body>
</html>
