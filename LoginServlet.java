import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Retrieve user input from the HTML form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // For demonstration purposes, check if username and password are correct
        if (isValidUser(username, password)) {
            // Create a session
            HttpSession session = request.getSession(true);

            // Store user information in the session
            session.setAttribute("username", username);

            // Set a cookie to remember the username
            Cookie usernameCookie = new Cookie("username", username);
            usernameCookie.setMaxAge(60 * 60 * 24 * 7); // Cookie valid for 1 week
            response.addCookie(usernameCookie);

            // Display a welcome message
            out.println("<html><body>");
            out.println("<h2>Welcome, " + username + "!</h2>");
            out.println("<a href='LogoutServlet'>Logout</a>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h2>Invalid username or password.</h2>");
            out.println("<a href='index.html'>Try Again</a>");
            out.println("</body></html>");
        }
    }

    private boolean isValidUser(String username, String password) {
        // In a real application, you would validate against a database or another source
        // For simplicity, hardcoding a valid username and password
        return "user123".equals(username) && "password123".equals(password);
    }
}
