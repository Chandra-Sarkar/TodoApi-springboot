package com.todolist.rest_demo.repo;

import com.todolist.rest_demo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
}
