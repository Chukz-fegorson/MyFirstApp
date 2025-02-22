<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Todos List Page</title>
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
        <h2 class="welcome-msg">Welcome ${name} to Fegorson Academy</h2>
        <hr>
    </header>

    <!-- Todos Section -->
    <section>
        <h1 class="mb-3">Your Todos</h1>
        <!-- (Optional) Remove the debug line if you don't want to show the raw list -->
        <!-- <div>Your Todos are: ${todos}</div> -->
        <table class="table table-striped table-hover">
            <thead class="table-dark">
            <tr>
                <th>ID</th>
                <th>Description</th>
                <th>Due Date</th>
                <th>Is Done?</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${todos}" var="todo">
                <tr>
                    <td>${todo.id}</td>
                    <td>${todo.description}</td>
                    <td>${todo.dueDate}</td>
                    <td>
                        <c:choose>
                            <c:when test="${todo.done}">
                                <span class="badge bg-success">Yes</span>
                            </c:when>
                            <c:otherwise>
                                <span class="badge bg-danger">No</span>
                            </c:otherwise>
                        </c:choose>
                    </td>
                    <td>
                        <span>
                        <a href="delete-todo?id=${todo.id}" class="btn btn-danger btn-sm">
                        Delete ${todo.id}
                        </a>
                        </span>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
        <a href="add-todo" class="btn btn-success"> Add Todo</a>
    </section>

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
