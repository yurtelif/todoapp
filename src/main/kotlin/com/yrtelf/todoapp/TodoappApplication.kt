 package com.yrtelf.todoapp

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoappApplication

fun main(args: Array<String>) {
    runApplication<TodoappApplication>(*args)
}
