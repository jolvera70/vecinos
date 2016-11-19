<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Free Bootstrap Admin Template</title>
    <!-- BOOTSTRAP STYLES-->
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME ICONS STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!--CUSTOM STYLES-->
    <link href="assets/css/style.css" rel="stylesheet" />
    <!-- HTML5 Shiv and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
    <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body onload='document.loginForm.username.focus();'>

<h1>Spring Security Login Form (Database Authentication)</h1>

<div id="login-box">

    <h2>Login with Username and Password</h2>

    <c:if test="${not empty error}">
        <div class="error">${error}</div>
    </c:if>
    <c:if test="${not empty msg}">
        <div class="msg">${msg}</div>
    </c:if>

    <form name='loginForm'
          action="<c:url value='/j_spring_security_check' />" method='POST'>

        <table>
            <tr>
                <td>User:</td>
                <td><input type='text' name='username'></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td><input type='password' name='password' /></td>
            </tr>
            <tr>
                <td colspan='2'><input name="submit" type="submit"
                                       value="submit" /></td>
            </tr>
        </table>

        <input type="hidden" name="${_csrf.parameterName}"
               value="${_csrf.token}" />

    </form>
</div>
<div id="page-wrapper" class="page-wrapper-cls">
    <div id="page-inner">
        <div class="row">
            <div class="col-md-12">
                <h1 class="page-head-line">Data Tables</h1>
            </div>
        </div>
        <div class="row">
            <div class="col-md-6">
      <div id="container" class="container">
      </div>
            </div>

</div>
    <!-- BACKGROUND IMAGE -->
    <!--===================================================-->
    <div id="bg-overlay"></div>


    <!-- LOGIN FORM -->
    <!--===================================================-->
    <div class="form-control">
        <div class="page-wrapper-cls">
            <div class="panel-body">
                <div class="mar-ver pad-btm">
                    <h3 class="h4 mar-no">Account Login</h3>
                    <p class="text-muted">Sign In to your account</p>
                </div>
                <form action="index.html">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Username" autofocus>
                    </div>
                    <div class="form-group">
                        <input type="password" class="form-control" placeholder="Password">
                    </div>
                    <div class="checkbox pad-btm text-left">
                        <input id="demo-form-checkbox" class="magic-checkbox" type="checkbox">
                        <label for="demo-form-checkbox">Remember me</label>
                    </div>
                    <button class="btn btn-primary btn-lg btn-block" type="submit">Sign In</button>
                </form>
            </div>

            <div class="pad-all">
                <a href="pages-password-reminder.html" class="btn-link mar-rgt">Forgot password ?</a>
                <a href="pages-register.html" class="btn-link mar-lft">Create a new account</a>

                <div class="media pad-top bord-top">
                    <div class="pull-right">
                        <a href="#" class="pad-rgt"><i class="demo-psi-facebook icon-lg text-primary"></i></a>
                        <a href="#" class="pad-rgt"><i class="demo-psi-twitter icon-lg text-info"></i></a>
                        <a href="#" class="pad-rgt"><i class="demo-psi-google-plus icon-lg text-danger"></i></a>
                    </div>
                    <div class="media-body text-left">
                        Login with
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--===================================================-->


    <!-- DEMO PURPOSE ONLY -->
    <!--===================================================-->
    <div class="demo-bg">
        <div id="demo-bg-list">
            <div class="demo-loading"><i class="psi-repeat-2"></i></div>
            <img class="demo-chg-bg bg-trans active" src="img/bg-img/thumbs/bg-trns.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-1.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-2.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-3.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-4.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-5.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-6.jpg" alt="Background Image">
            <img class="demo-chg-bg" src="img/bg-img/thumbs/bg-img-7.jpg" alt="Background Image">
        </div>
    </div>
    <!--===================================================-->



</div>
<!--===================================================-->
<!-- END OF CONTAINER -->


</body>
</html>