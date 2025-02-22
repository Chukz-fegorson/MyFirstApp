<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Todo Page</title>
    <!-- Bootstrap CSS -->
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            padding-top: 20px;
            background-color: #f8f9fa;
        }
        .welcome-msg {
            margin-bottom: 20px;
        }
        .footer {
            margin-top: 40px;
            padding: 20px;
            background-color: #e9ecef;
            text-align: center;
        }
    </style>
</head>
<body>
<div class="container">
    <!-- Header Section -->
    <header class="text-center">
        <h3 class="welcome-msg">Welcome ${name}, Please Enter Todo Details</h3>
        <hr>
    </header>
        <body>
        <div class="container-fluid">
            <h1> Enter Todo Details</h1>
            <form:form method="post" modelAttribute="todo">
                Description:<form:input type="text" path="description" required="required"/>
                <form:input type="hidden" path="id"/> <!--collects value as part of a form but hides it from the user-->
                <form:input type="hidden" path="done"/>
                <input type="submit" class="btn-success"/>

            </form:form>
        </div>

        </body>

    <!-- Footer Section -->
    <footer class="footer">
        <h4>Do have a wonderful time using our service!</h4>
    </footer>
</div>

<!-- Bootstrap Bundle JS (includes Popper) -->
<script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<!-- jQuery (if needed; Bootstrap 5 doesn't require jQuery) -->
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>
