    <%@include file="common/header.jspf"%>
    <%@ include file="common/navigation.jspf" %>
    <div class="container">
        <!-- Header Section -->
        <header class="text-center">
            <h2 class="welcome-msg">Welcome ${name} to Fegorson Academy</h2>
            <hr>
        </header>

        <!-- Todos Section -->
        <section>
            <h1 class="mb-3">Your Todos</h1>
            <table class="table table-striped table-hover">
                <thead class="table-dark">
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Due Date</th>
                    <th>Is Done?</th>
                    <th>Delete</th>
                    <th>Update</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>
                            ${todo.dueDate}
                        </td>
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
                            <a href="delete-todo?id=${todo.id}" class="btn btn-danger btn-sm">Delete</a>
                        </td>
                        <td>
                            <a href="update-todo?id=${todo.id}" class="btn btn-success btn-sm">Update</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
            <a href="add-todo" class="btn btn-success">Add Todo</a>
        </section>

        <!-- Footer Section -->
        <footer class="footer">
            <h4>Do have a wonderful time using our service!</h4>
        </footer>
    </div>

<!-- Scripts -->
<script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>