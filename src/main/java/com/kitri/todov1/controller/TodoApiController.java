package com.kitri.todov1.controller;

import com.kitri.todov1.dto.request.RequestTodo;
import com.kitri.todov1.dto.response.ResponseTodo;
import com.kitri.todov1.mappers.TodoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/api/todos")
public class TodoApiController {
    @Autowired
    TodoMapper todoMapper;
    @GetMapping
    public ArrayList<ResponseTodo> todos() {
        return todoMapper.findAll();
    }
    @PostMapping
    public void addTodo(@RequestBody RequestTodo todo) {
        todoMapper.save(todo);
    }

    @PutMapping("/{id}")
    public void toggleCompleted(@PathVariable int id, @RequestBody RequestTodo todo) {
        todo.setId(String.valueOf(id));
        todoMapper.update(todo);
    }
    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable Long id) {
        todoMapper.deleteById(id);
    }
}
