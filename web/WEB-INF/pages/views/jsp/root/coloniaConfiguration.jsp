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
                    <h1 class="page-head-line"><spring:message code="label.commons.colony" text="default text"/></h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="col-md-6">
                        <!--    Context Classes  -->
                        <div class="panel panel-default">
                            <div class="panel-heading">
                                <spring:message code="label.commons.colonies" text="default text"/> <a
                                    href="rootColoniaForm"><i class="fa fa-plus-circle "></i><spring:message
                                    code="label.colony.add" text="default text"/></a>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>#</th>
                                            <th><spring:message code="label.commons.name" text="default text"/></th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <c:forEach items="${coloniaList}" var="colonia">
                                            <tr class="success">
                                                <td>${colonia.idColonia}</td>
                                                <td>${colonia.nombre}</td>
                                            </tr>
                                        </c:forEach>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                        <!--  end  Context Classes  -->
                    </div>
                </div>
            </div>
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>
</div>
<%@ include file="/WEB-INF/pages/views/jsp/footer.jsp" %>
<%@ include file="/WEB-INF/pages/views/jsp/jquery.jsp" %>
</body>
</html>
