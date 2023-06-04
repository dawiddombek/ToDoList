package com.ToDoList.servise;

import com.ToDoList.model.classes.Task;
import com.ToDoList.model.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoListService {

    private final TaskRepository taskRepository;

    @Autowired
    public ToDoListService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public void addNewTask(String taskName) {
        Task task = new Task();
        task.setName(taskName);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
