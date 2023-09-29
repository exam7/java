import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get the user's name from the form
        String name = request.getParameter("name");
        
        // Set a cookie
        Cookie nameCookie = new Cookie("user_name", name);
        response.addCookie(nameCookie);
        
        // Create or retrieve a session
        HttpSession session = request.getSession(true);
        
        // Store user's name in the session
        session.setAttribute("user_name", name);
        
        // Redirect to a new page
        response.sendRedirect("welcome.jsp");
    }
}
