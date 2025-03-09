package com.starter.MyFirstApp.Todo;

import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Todo {
    private int id;
    private String username;
    private String description;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dueDate;

    private boolean done;

    // Constructors
    public Todo() {}

    public Todo(int id, String username, String description, LocalDate dueDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.dueDate = dueDate;
        this.done = done;
    }

    // Getters and setters
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

    public String getFormattedDueDate() {
        return dueDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
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