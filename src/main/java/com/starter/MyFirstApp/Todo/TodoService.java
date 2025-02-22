package com.starter.MyFirstApp.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;

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
        //Create a new todo instance with the next available count
        // Here, we return all todos for simplicity.
        return todos;
    }

    public void addTodo(String username, String description, LocalDate dueDate, boolean done) {
        //create a new Todo instance with the next available count
        Todo todo = new Todo(++todosCount, username, description, dueDate, done);
        // Ad the new Todo object to the todos list
        todos.add(todo);
    }

    public  void deleteById(int id){
        //todo.getId() == id
        //todo -> todo.getId() == id
        Predicate<? super Todo> predicate =todo-> todo.getId() == id;
        todos.removeIf(predicate);
    }
}
