package com.starter.MyFirstApp.Todo;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("list-todos")
    public String listAllTodos(ModelMap model) {
        String username = getLoggedInUsername();
        List<Todo> todos = todoService.findByUsername(username);
        model.addAttribute("name", username);
        model.addAttribute("todos", todos);
        return "listTodos";
    }

    @GetMapping("add-todo")
    public String showNewTodoPage(ModelMap model) {
        String username = getLoggedInUsername();
        Todo todo = new Todo(0, username, "", LocalDate.now().plusYears(1), false);
        model.put("todo", todo);
        return "todo";
    }

    @PostMapping("add-todo")
    public String addNewTodo(@Valid @ModelAttribute("todo") Todo todo,
                             BindingResult result,
                             ModelMap model) {
        if (result.hasErrors()) {
            return "todo";
        }
        String username = getLoggedInUsername();
        todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }

    @GetMapping("delete-todo")
    public String deleteTodo(@RequestParam int id) {
        todoService.deleteById(id);
        return "redirect:list-todos";
    }

    @GetMapping("update-todo")
    public String showUpdateTodoPage(@RequestParam int id, ModelMap model) {
        Todo todo = todoService.findById(id);
        model.addAttribute("todo", todo);
        return "todo";
    }

    @PostMapping("update-todo")
    public String updateTodo(@Valid Todo todo, BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "todo";
        }
        String username = getLoggedInUsername();
        todo.setUsername(username);
        todoService.updateTodo(todo);
        return "redirect:list-todos";
    }

    private String getLoggedInUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
