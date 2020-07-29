import org.example.list.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "RegistrationServlet", value = "/register")
public class Register extends HttpServlet {

    private List<User> users = new ArrayList<>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        String name = req.getParameter("name");
        String lastname = req.getParameter("lastname");
        User user = new User(name, lastname);
        users.add(user);
        req.setAttribute("users", users);
        RequestDispatcher dispatcher =         //odpowiada za wysylanie requestow dalej
                getServletContext().getRequestDispatcher("/list.jsp");

        dispatcher.forward(req, resp);
    }
}
