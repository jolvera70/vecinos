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
                    <h1 class="page-head-line"><spring:message code="label.admin.street.add" text="default text" /></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <spring:message code="label.admin.streat" text="default text" />
                        </div>
                        <div class="panel-body">
                            <form:form method="POST" action="addCalle">
                                <div class="form-group">
                                    <spring:message code='label.admin.street.name' text="default text" var="nombre"/>
                                        <form:label path="descCalle"/>${nombre}</label>
                                    <form:input path="descCalle" class="form-control" id="descCalle" placeholder="${nombre}"/>
                                </div>

                                <form:hidden path="iduser"></form:hidden>
                                <form:hidden path="idColonia"></form:hidden>
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
