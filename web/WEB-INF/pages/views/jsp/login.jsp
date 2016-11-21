<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@page session="true"%>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Vecinos</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="/vecinos/resources/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME ICONS STYLES-->
    <link href="/vecinos/resources/assets/css/font-awesome.css" rel="stylesheet" />
    <!--CUSTOM STYLES-->
    <link href="/vecinos/resources/assets/css/style.css" rel="stylesheet" />
    <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body onload='document.loginForm.username.focus();'>

<div id="login-box">

</div>
<div id="page-wrapper" class="page-wrapper-cls">
    <div class="row">
        <div class="col-md-3"></div>
        <div class="col-md-3">
            <a href="?language=en_US">English</a>|<a href="?language=es_MX">Espanol</a>
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <spring:message code="label.login.header" text="default text" />
                </div>
                <div class="panel-body">
                    <p>
                    <form name='loginForm'
                          action="<c:url value='/j_spring_security_check' />" method='POST' clas>
                    <c:if test="${not empty error}">
                        <div class="form-group has-error">
                            <label class="control-label">${error}</label>
                        </div>
                    </c:if>
                    <c:if test="${not empty msg}">
                        <div class="form-group feedback">
                            <label class="control-label">${msg}</label>
                        </div>
                    </c:if>

                        <div class="form-group">
                            <label><spring:message code="label.login.username" text="default text" /></label>
                            <input type="text" class="form-control" placeholder="Username" name='username' autofocus >
                        </div>
                        <div class="form-group">
                            <label><spring:message code="label.login.password" text="default text" /></label>
                            <input type="password" class="form-control" placeholder="Password" name='password'>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-primary btn-lg btn-block" type="submit" value="submit"><spring:message code="label.login.signin" text="default text" /></button>
                        </div>
                        </table>
                        <div class="pad-all">
                            <a href="pages-password-reminder.html" class="btn-link mar-rgt"><spring:message code="label.login.forgotpassword" text="default text" /></a>
                            <a href="pages-register.html" class="btn-link mar-lft"><spring:message code="label.login.createnewaccount" text="default text" /></a>

                            <div class="media pad-top bord-top">
                                <div class="pull-right">
                                    <a href="#" class="pad-rgt"><i class="demo-psi-facebook icon-lg text-primary"></i></a>
                                    <a href="#" class="pad-rgt"><i class="demo-psi-twitter icon-lg text-info"></i></a>
                                    <a href="#" class="pad-rgt"><i class="demo-psi-google-plus icon-lg text-danger"></i></a>
                                </div>
                            </div>
                        </div>

                        <input type="hidden" name="${_csrf.parameterName}"
                               value="${_csrf.token}" />
                    </form>
                    </p>
                </div>
                <div class="panel-footer">
                    <p class="text-muted"><spring:message code="label.login.footermessage" text="default text" /></p>
                </div>
            </div>
        </div>
        <div class="col-md-3"></div>
    </div>
</div>
</div>
</body>
</html>