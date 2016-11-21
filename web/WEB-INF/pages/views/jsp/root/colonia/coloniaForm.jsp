<%--
  Created by IntelliJ IDEA.
  User: jolvera
  Date: 12/11/2016
  Time: 11:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page session="false" %>
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
                                    <label for="nombre"><spring:message code="label.commons.name" text="default text" /></label>
                                    <input type="nombre" class="form-control" id="nombre" placeholder="<spring:message code="label.commons.name" text="default text" />" />
                                </div>
                                <button type="submit" class="btn btn-default" value="submit"><spring:message code="label.commons.submit" text="default text" /></button>
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
