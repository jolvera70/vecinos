<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Vecinos</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="vecinos/resources/assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME ICONS STYLES-->
    <link href="vecinos/resources/assets/css/font-awesome.css" rel="stylesheet" />
    <!--CUSTOM STYLES-->
    <link href="vecinos/resources/assets/css/style.css" rel="stylesheet" />
    <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body onload='document.loginForm.username.focus();'>

<div id="login-box">

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>

</div>
<div id="page-wrapper" class="page-wrapper-cls">
    <div class="row">
        <div class="col-md-5 col-md-5 col-sm-5">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    Account Login
                </div>
                <div class="panel-body">
                    <p>
                    <form name='loginForm'
                          action="<c:url value='/j_spring_security_check' />" method='POST' clas>
                        <div class="form-group">
                            <label>User</label>
                            <input type="text" class="form-control" placeholder="Username" name='username' autofocus >
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="text" class="form-control" placeholder="Password" name='password'>
                        </div>
                        <div class="form-group">
                            <button class="btn btn-primary btn-lg btn-block" type="submit" value="submit">Sign In</button>
                        </div>
                        </table>
                        <div class="pad-all">
                            <a href="pages-password-reminder.html" class="btn-link mar-rgt">Forgot password ?</a>
                            <a href="pages-register.html" class="btn-link mar-lft">Create a new account</a>

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
                    <p class="text-muted">Sign In to your account</p>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>