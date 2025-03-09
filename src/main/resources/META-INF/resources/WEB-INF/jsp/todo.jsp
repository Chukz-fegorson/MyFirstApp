<%--<%@ taglib prefix="c" uri="jakarta.tags.core" %>--%>

<%@include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf" %>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <meta charset="UTF-8">--%>
<%--    <title>Add Todo Page</title>--%>
<%--    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">--%>
<%--    <link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet">--%>
<%--    <style>--%>
<%--        body { padding-top: 20px; background-color: #f8f9fa; }--%>
<%--        .welcome-msg { margin-bottom: 20px; }--%>
<%--        .footer { margin-top: 40px; padding: 20px; background-color: #e9ecef; text-align: center; }--%>
<%--    </style>--%>
<%--</head>--%>
<%--<body>--%>
<div class="container">
    <header class="text-center">
        <h3 class="welcome-msg">Welcome ${name}, Please Enter Todo Details</h3>
        <hr>
    </header>
    <div class="container-fluid">
        <h1>Enter Todo Details</h1>
        <form:form method="post" modelAttribute="todo">
            <div class="mb-3">
                <label for="description">Description:</label>
                <form:input type="text" path="description" id="description" cssClass="form-control" required="required"/>
                <form:errors path="description" cssClass="text-danger"/>
            </div>
            <div class="mb-3">
                <label for="dueDate">Due Date:</label>
                <form:input type="text" path="dueDate" id="dueDate" cssClass="form-control" required="required"/>
                <form:errors path="dueDate" cssClass="text-danger"/>
            </div>
            <form:input type="hidden" path="id"/>
            <form:input type="hidden" path="done"/>
            <input type="submit" value="Add Todo" class="btn btn-success"/>
        </form:form>
    </div>
    <footer class="footer">
        <h4>Do have a wonderful time using our service!</h4>
    </footer>
</div>
<%--<script src="webjars/jquery/3.6.0/jquery.min.js"></script>--%>
<%--<script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>--%>
<%--<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.min.js"></script>--%>
<script type="text/javascript">
    $('#dueDate').datepicker({
        format: 'yyyy-mm-dd', // Must match the pattern expected by the model (@DateTimeFormat(iso = ISO.DATE))
        autoclose: true
    });
</script>
<%--</body>--%>
<%--</html>--%>
<%@ include file="common/footer.jspf" %>
