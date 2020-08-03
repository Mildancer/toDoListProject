package org.example.ownToDoList;

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
    }                    //long

    public void setId(int id) {
        this.id = id;
    }         //long

    public String getNameOfTask() {
        return nameOfTask;
    }

    public void setNameOfTask(String nameOfTask) {
        this.nameOfTask = nameOfTask;
    }

    public String getIsItDone() {
        return isItDone;
    }       //status ENUM docelowo albo boolean done + dodatkowe pole zamieniajas long zamiejace sie -typ prymitywny nie ma nulli

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
