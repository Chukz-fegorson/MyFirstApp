package com.starter.MyFirstApp.Todo;

import java.time.LocalDate;

//Database (Postgres)
//Create a Static List of todos => Database(H2,Postgres)

public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate dueDate; //used to store a date
    private boolean done;

    public Todo(int id, String username, String description, LocalDate dueDate, boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.dueDate = dueDate;
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", dueDate=" + dueDate +
                ", done=" + done +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}


