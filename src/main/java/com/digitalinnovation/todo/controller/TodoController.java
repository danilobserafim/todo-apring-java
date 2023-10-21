/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.digitalinnovation.todo.controller;

import com.digitalinnovation.todo.model.Todo;
import com.digitalinnovation.todo.repository.TodoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author danil
 */
@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired
    TodoRepository todoRepository;
    
    @GetMapping
    public List<Todo> getTasks(){
        return todoRepository.findAll();
    }
    @PostMapping
    public void saveTask(@RequestBody Todo todo){
        todoRepository.save(todo);
    }
    @PutMapping
    public void changeTask(@RequestBody Todo todo){
        if(todo.getId() > 0){
            todoRepository.save(todo);
        }
    }
    @DeleteMapping
    public void deleteTask(@RequestBody Todo todo){
        todoRepository.delete(todo);
    }
}
