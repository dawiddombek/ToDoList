package com.ToDoList.model.repositories;

import com.ToDoList.model.classes.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;

public interface TaskRepository extends ListCrudRepository<Task, Long> {
}
