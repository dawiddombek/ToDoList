package com.ToDoList.controller;

import com.ToDoList.servise.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ToDoListController {

    private final ToDoListService toDoListService;

    @Autowired
    public ToDoListController(ToDoListService toDoListService) {
        this.toDoListService = toDoListService;
    }

    @GetMapping("/")
    public String getHomePage() {
        return "index";
    }

    @PostMapping("/AddNewTask")
    public String postAddNewTask() {
        return "redirect:/test";
    }

    @GetMapping("/test")
    public String getTest() {
        return "test";
    }
}
