package org.example.ownToDoList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "loginServlet", value = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        // select * from users where users.username like username
        //compare passwords from request and from database  -- porownujemy hasla z requesta i bazy danych
        //
        User user = new User(username, password);
        //ciasteczko JSESSIONID- ma identyfikator sesji
        request.getSession().setAttribute("user", user);        //pod atrybutem sesji zapisujemy obiekt sesji
        PrintWriter out = response.getWriter();
        out.println("hello" +username);
    }


}
