package com.starter.MyFirstApp.Todo;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class AddTodos {

    @NotBlank(message = "Description cannot be blank")
    @Size(min = 3, message = "Description must be at least 3 characters")
    private String description;

    // Optionally, include a dueDate if you want users to specify one.
    private LocalDate dueDate;

    // Default constructor is required for data binding
    public AddTodos() {
        // You can set a default due date if desired. For example:
        // this.dueDate = LocalDate.now().plusYears(1);
    }

    // Getters and Setters
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
}
