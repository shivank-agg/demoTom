import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "OtherServlet", urlPatterns = "/other")
public class OtherServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getAttribute("error") == null) {
            String firstName = request.getAttribute("firstName").toString();
            String lastName = request.getAttribute("lastName").toString();
            String age = request.getAttribute("age").toString();

            System.out.println(firstName + " " + lastName + " " + age);
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

}

