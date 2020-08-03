package org.example.ownToDoList;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class ToDoList {

    private List<SingleTask> toDoList = new ArrayList<>();

    public List<SingleTask> getToDoList() {
        return toDoList;
    }

    public void setToDoList(List<SingleTask> toDoList) {
        this.toDoList = toDoList;
    }

    // docelowo unit test
    public ToDoList() {
        super();
        SingleTask singleTask = new SingleTask();
        singleTask.setId(1);
        singleTask.setNameOfTask("kupa");
        singleTask.setIsItDone("done");
        singleTask.setStartingDate(LocalDateTime.now().minusMinutes(20));
        singleTask.setEndDate(LocalDateTime.now());
        singleTask.setComment("bylo zajebiscie");
        toDoList.add(singleTask);
    }

//        @Override
//        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            List<ToDoList> toDoLists = .list();
//            request.setAttribute("tasks", products); // Will be available as ${products} in JSP
//            request.getRequestDispatcher("/WEB-INF/list.jsp").forward(request, response);
//        }
//
//    }

}
