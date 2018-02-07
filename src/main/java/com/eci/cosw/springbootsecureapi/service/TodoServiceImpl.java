/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Todo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author JuanArevaloMerchan
 */
@Service
public class TodoServiceImpl implements TodoService{
     private List<Todo> todos;
    
    @Autowired
    public TodoServiceImpl(){
        todos = new ArrayList<>();
    }
    
    
    @Override
    public List<Todo> getTodoList() {
        return todos;
    }

    @Override
    public Todo addTodo(Todo todo) {
        todos.add(todo);
        return todo;
    }
    
}
