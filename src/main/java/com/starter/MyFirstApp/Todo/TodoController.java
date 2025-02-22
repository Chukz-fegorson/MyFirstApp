package com.starter.MyFirstApp.Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@SessionAttributes("name")
public class TodoController {

    public TodoController(TodoService todoService) {
        this.todoService = todoService;}
    private TodoService todoService;

    @RequestMapping("list-todos") //Url
    public String listAllTodos(Model model) {
        List<Todo> todos = todoService.findByUsername("Chuks");
        model.addAttribute("name", "Chuks");
        model.addAttribute("todos", todos);
        return "listTodos"; // Ensure this matches your JSP filename
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.GET) //Url and request type
    public String shownewTodoPage(ModelMap model){
        Todo todo = new Todo(0, "Chuks","", LocalDate.now().plusYears(1),false);
        model.put("todo", todo);
        return "todo"; //this should match the jsp view file
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST) //Url and request type
    //public String addNewTodo(@RequestParam String description, ModelMap model)
    public String addNewTodo(@ModelAttribute("todo") Todo todo, ModelMap model) {
        //todoService.addTodo((String) model.get("name"), description, LocalDate.now().plusYears(1), false);
        String username= (String)model.get("name");
        todoService.addTodo(username, todo.getDescription(),LocalDate.now().plusYears(1), false);
        //redirecting back to the updated list
        return "redirect:list-todos";
    }
    @RequestMapping("delete-todo") //Url
    public String deleteTodo(@RequestParam int id) {
        //Delete todo
        todoService.deleteById(id);
        return "redirect:list-todos"; // Ensure this matches your JSP filename
    }

}
