package com.yrtelf.todoapp

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ToDoRepository : CrudRepository<ToDoModel, Int>