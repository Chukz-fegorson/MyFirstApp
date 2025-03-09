package com.starter.MyFirstApp.Todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

    // This is a static list. Data resets when the application/server restarts.
    static {
        todos.add(new Todo(++todosCount, "Chuks", "Learn Microsoft Excel",
                LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++todosCount, "Chuks", "SQL",
                LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++todosCount, "Chuks", "Learn Power Bi and Tableau",
                LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++todosCount, "Chuks", "Learn Python",
                LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++todosCount, "Chuks", "Learn Springboot",
                LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++todosCount, "Chuks", "Learn Html and CSS",
                LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++todosCount, "Chuks", "Learn Python",
                LocalDate.now().plusYears(0), true));
        todos.add(new Todo(++todosCount, "Chuks", "Learn Javascript",
                LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todosCount, "Chuks", "Learn React Framework",
                LocalDate.now().plusYears(2), false));
        todos.add(new Todo(++todosCount, "Chuks", "Learn Full Stack Software",
                LocalDate.now().plusYears(3), false));
        todos.add(new Todo(++todosCount, "Chuks", "Learn How to combine All the Above for Fullstack Software and Data Engineering ",
                LocalDate.now().plusYears(1), false));
    }

    public static List<Todo> findByUsername(String username) {
        // For simplicity, this returns all todos.
        Predicate<? super Todo> predicate =todo -> todo.getUsername().equalsIgnoreCase(username);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate dueDate, boolean done) {
        // Create a new Todo instance with the next available id.
        Todo todo = new Todo(++todosCount, username, description, dueDate, done);
        todos.add(todo);
    }

    public void deleteById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    // New method to find a Todo by its ID.
    public Todo findById(int id) {
        for (Todo todo : todos) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null; // or throw an exception if not found.
    }

    // Optionally, implement the update method if needed.
    public void updateTodo(@Valid Todo updatedTodo) {
        for (int i = 0; i < todos.size(); i++) {
            Todo existingTodo = todos.get(i);
            if (existingTodo.getId() == updatedTodo.getId()) {
                existingTodo.setDescription(updatedTodo.getDescription());
                existingTodo.setDueDate(updatedTodo.getDueDate());
                existingTodo.setDone(updatedTodo.isDone());
                existingTodo.setUsername(updatedTodo.getUsername());
                break;
            }
        }
    }
}
