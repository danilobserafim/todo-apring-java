/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.digitalinnovation.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.digitalinnovation.todo.model.Todo;
/**
 *
 * @author danil
 */
public interface TodoRepository extends JpaRepository<Todo, Object> {
    
}
