package com.hendisantika.kotlintodolistrestapi.entity

import javax.persistence.*

/**
 * Created by IntelliJ IDEA.
 * Project : kotlin-todo-list-rest-api
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 07/02/20
 * Time: 06.15
 */
@Entity
@Table(name = "todo")
class Todo {

    /* GenerationType.IDENTITY is for databases like Postgres
        that use sequence tables instead of auto-increment
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    var id: Long? = null

    var title: String? = null
    var description: String? = null
    var finished: Boolean? = false
}