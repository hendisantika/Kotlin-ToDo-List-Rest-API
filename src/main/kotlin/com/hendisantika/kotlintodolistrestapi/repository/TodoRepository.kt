package com.hendisantika.kotlintodolistrestapi.repository

import com.hendisantika.kotlintodolistrestapi.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-todo-list-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/02/20
 * Time: 06.16
 */
interface TodoRepository : JpaRepository<Todo, Long>