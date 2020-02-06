package com.hendisantika.kotlintodolistrestapi.controller

import com.hendisantika.kotlintodolistrestapi.repository.TodoRepository
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-todo-list-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/02/20
 * Time: 06.21
 */
@RestController
@RequestMapping("/todos")
class TodoRestController(val todoRepository: TodoRepository)