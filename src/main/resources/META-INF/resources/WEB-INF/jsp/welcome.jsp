
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
    <!-- Bootstrap CSS -->
    <link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            padding-top: 50px;
        }
        .welcome-container {
            max-width: 600px;
            margin: auto;
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        .welcome-header {
            margin-bottom: 30px;
        }
        .footer {
            margin-top: 40px;
            text-align: center;
            color: #6c757d;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="welcome-container">
        <!-- Header Section -->
        <header class="welcome-header text-center">
            <h4>Hello ${name}, Welcome to Fegorson Academy</h4>
        </header>
        <hr>

        <!-- User Details -->
        <div class="mb-4">
            <p><strong>Your username is:</strong> ${name}</p>
        </div>

        <!-- Navigation Link -->
        <div class="mb-4 text-center">
            <a href="list-todos" class="btn btn-primary">Manage Your Todos</a>
        </div>

        <!-- Footer Section -->
        <footer class="footer">
            <p>Do have a wonderful time using our service!</p>
        </footer>
    </div>
</div>

<!-- Bootstrap Bundle JS (includes Popper) -->
<script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>
