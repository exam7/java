import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("welcome")
public class MyServlet extends HttpServlet {
    // Initialization method
    public void init() throws ServletException {
        // Perform initialization tasks
    }

    // service method to handle HTTP requests
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set response content type
        response.setContentType("text/html");

        // Get PrintWriter object to write the response
        PrintWriter out = response.getWriter();

        // Determine the HTTP request method (GET, POST, PUT, DELETE, etc.)
        String httpMethod = request.getMethod();

        // Generate the HTML response content based on the HTTP request method
        if (httpMethod.equals("GET")) {
            out.println("<html>");
            out.println("<head><title>GET Request</title></head>");
            out.println("<body>");
            out.println("<h1>This is a GET request</h1>");
            out.println("</body></html>");
        } else if (httpMethod.equals("POST")) {
            out.println("<html>");
            out.println("<head><title>POST Request</title></head>");
            out.println("<body>");
            out.println("<h1>This is a POST request</h1>");
            out.println("</body></html>");
        } else {
            // Handle other HTTP methods as needed
            out.println("<html>");
            out.println("<head><title>Other Request</title></head>");
            out.println("<body>");
            out.println("<h1>This is a request with an unsupported HTTP method</h1>");
            out.println("</body></html>");
        }
    }

    // Destroy method
    public void destroy() {
        // Perform cleanup tasks
    }
}
