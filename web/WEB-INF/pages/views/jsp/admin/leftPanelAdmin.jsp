<%--
  Created by IntelliJ IDEA.
  User: jolvera
  Date: 20/11/2016
  Time: 05:22 PM
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-default navbar-cls-top " role="navigation" style="margin-bottom: 0">
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
        </button>
        <a  class="navbar-brand" href="home"><spring:message code="label.commons.application.name.admin" text="default text" /></a>
    </div>

    <div class="notifications-wrapper">
        <ul class="nav">
            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-language"></i>  <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="?language=es_MX"><i class="fa fa-folder-open"></i> <spring:message code="label.commons.spanish" text="default text" /></a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="?language=en_US"><i class="fa fa-folder-open"></i> <spring:message code="label.commons.english" text="default text" /></a>
                    </li>
                </ul>
            </li>

            <li class="dropdown">
                <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                    <i class="fa fa-user-plus"></i>  <i class="fa fa-caret-down"></i>
                </a>
                <ul class="dropdown-menu dropdown-user">
                    <li><a href="#"><i class="fa fa-user-plus"></i> My Profile</a>
                    </li>
                    <li class="divider"></li>
                    <li><a href="<c:url value='/j_spring_security_logout' />"><i class="fa fa-sign-out"></i> Logout</a>
                    </li>
                </ul>
            </li>

        </ul>

    </div>
</nav>
<!-- /. NAV TOP  -->
<nav  class="navbar-default navbar-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav" id="main-menu">
            <li>
                <div class="user-img-div">
                    <img src="/vecinos/resources/assets/img/user.jpg" class="img-circle" />


                </div>

            </li>
            <li>
                <a  href="#"> <strong> Romelia Alexendra </strong></a>
            </li>

            <li>
                <a class="active-menu" href="adminVecinosHome"><i class="fa fa-venus "></i><spring:message code="label.root.menu.neighbors" text="default text" /></a>

            </li>

        </ul>
    </div>

</nav>
