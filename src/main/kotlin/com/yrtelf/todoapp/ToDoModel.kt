package com.yrtelf.todoapp

import javax.persistence.*

@Entity
@Table(name = "todos")
class ToDoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    var id: Int = 0
    var title: String = ""
    var description: String = ""
    var user: String = ""
}