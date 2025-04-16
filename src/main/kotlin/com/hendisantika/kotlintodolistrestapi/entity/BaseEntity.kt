package com.hendisantika.kotlintodolistrestapi.entity

import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-todo-list-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/02/20
 * Time: 06.13
 */
@MappedSuperclass
abstract class BaseEntity protected constructor() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private val id: Long?

    init {
        id = null
    }
}