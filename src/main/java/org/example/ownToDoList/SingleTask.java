package org.example.ownToDoList;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SingleTask {

    int id = 0;

    String nameOfTask;

    String isItDone;

    LocalDateTime startingDate;

    LocalDateTime endDate;

    String comment;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameOfTask() {
        return nameOfTask;
    }

    public void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public String getIsItDone() {
        return isItDone;
    }

    public void setIsItDone(String isItDone) {
        this.isItDone = isItDone;
    }

    public LocalDateTime getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDateTime startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
