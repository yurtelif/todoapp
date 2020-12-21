package com.yrtelf.todoapp

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ToDoController(private val todoService: TodoService) {

    @GetMapping("/test")
    fun getTest(): String{
        return "xox"
    }

    @PostMapping("/save")
    fun saveTodo(@RequestBody toDoModel: ToDoModel){
        todoService.save(toDoModel)
    }

    @GetMapping("/todos")
    fun getTodos(): List<ToDoModel>{
        return todoService.getAllTodos()
    }

}