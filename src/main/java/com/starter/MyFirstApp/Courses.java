package com.starter.MyFirstApp;

public class Courses {

    private long id;
    private String name;
    private String author;

    // Constructor
    public Courses(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // Getters
    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // toString method for debugging
    @Override
    public String toString() {
        return "Courses [ id=" + id + ", name=" + name + ", author=" + author + " ]";
    }
}
