import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "NameServlet", value = "/name")
public class NameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String age = request.getParameter("age");
        StringBuilder error = new StringBuilder();

        if(firstName == null){
            error.append("A first name was not provided");
        }else if(lastName == null){
            error.append("A last name was not provided");
        }else if(age == null){
            error.append("An Age was not provided");
        }
        if(error.length() > 0){
            request.setAttribute("error", error.toString());
        }else{
            request.setAttribute("firstName", firstName);
            request.setAttribute("lastName", lastName);
            request.setAttribute("age", age);
        }
        getServletContext().getRequestDispatcher("/other").forward(request, response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }

}
