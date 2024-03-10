package com.ToDoList.model.repositories;

import com.ToDoList.model.classes.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

public interface TaskRepository extends ListCrudRepository<Task, Long> {

    @Query("SELECT t from Task t Where t.id = :id")
    public Task getTaskById(@Param("id") Long id);
}
