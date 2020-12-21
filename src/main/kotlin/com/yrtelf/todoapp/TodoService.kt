package com.yrtelf.todoapp

import org.springframework.stereotype.Service

@Service
class TodoService(private val toDoRepository: ToDoRepository) {

    fun save(toDoModel: ToDoModel) {
        toDoRepository.save(toDoModel)
    }

    fun getAllTodos(): List<ToDoModel>{
        return toDoRepository.findAll().toList()
    }

}