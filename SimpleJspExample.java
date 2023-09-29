<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Simple JSP Example</title>
</head>
<body>
    <h1>Welcome to our JSP Example</h1>

    <%
        // Using a scriptlet to declare and display a variable
        String greeting = "Hello, JSP!";
        out.println("<p>" + greeting + "</p>");
    %>

    <p>Today's date: <%= new java.util.Date() %></p>

    <%
        // Using a scriptlet to loop and display numbers
        for (int i = 1; i <= 5; i++) {
            out.println("<p>Number: " + i + "</p>");
        }
    %>

    <%!
        // Declaration tag for declaring a method
        public void displayMessage() {
            out.println("<p>This is a custom message.</p>");
        }
    %>

    <!-- Using a JSP expression tag to call the declared method -->
    <jsp:scriptlet>
        displayMessage();
    </jsp:scriptlet>

</body>
</html>
