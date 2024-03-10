package com.ToDoList.controller;

import com.ToDoList.model.classes.Task;
import com.ToDoList.model.repositories.TaskRepository;
import com.ToDoList.servise.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class ToDoListController {

    private final ToDoListService toDoListService;

    private final TaskRepository taskRepository;

    @Autowired
    public ToDoListController(ToDoListService toDoListService, TaskRepository taskRepository) {
        this.toDoListService = toDoListService;
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("taskList", taskRepository.findAll());
        return "index";
    }

    @PostMapping("/addNewTask")
    public String postAddNewTask(@RequestParam("input-box") String taskName) {
        toDoListService.addNewTask(taskName);
        return "redirect:/";
    }

    @GetMapping("/changeState")
    public String getChangeState(@RequestParam Long id) {
        toDoListService.changeState(id);
        return "redirect:/";
    }

    @GetMapping("/deleteTask")
    public String getDeleteTask(@RequestParam Long id) {
        toDoListService.deleteTask(id);
        return "redirect:/";
    }
}
