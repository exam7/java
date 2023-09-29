<!DOCTYPE html>
<html>
<head>
    <title>Display Form Data</title>
</head>
<body>
    <h1>Form Data Submitted:</h1>

    <%
        String name = request.getParameter("name");
        String email = request.getParameter("email");
    %>

    <p><strong>Name:</strong> <%= name %></p>
    <p><strong>Email:</strong> <%= email %></p>
</body>
</html>
