package org.example.ownToDoList;

import javax.imageio.IIOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

//@WebServlet(name= "ToDoListServlet", value = "/list")
public class ToDoListServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//  User user = (User) request.getSession().getAttribute("user");
//    //select * from toDoList where owner = user.getUsername()  //w przypadku rejestracji-inserta-by do bazy zapisac uzytnnkonwika
//    List<String> toDoList = new ArrayList<>();
//    PrintWriter out = response.getWriter();
//    out.println(toDoList);

//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<SingleTask> singleTasks = new ToDoList().getToDoList();
        request.setAttribute("toDoList", singleTasks); // Will be available as ${toDoList} in JSP
        request.getRequestDispatcher("/list.jsp").forward(request, response);
    }


}

