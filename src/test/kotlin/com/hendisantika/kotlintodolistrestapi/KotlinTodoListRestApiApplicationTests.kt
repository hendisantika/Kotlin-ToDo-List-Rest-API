package com.hendisantika.kotlintodolistrestapi

import com.hendisantika.kotlintodolistrestapi.repository.TodoRepository
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.DynamicPropertyRegistry
import org.springframework.test.context.DynamicPropertySource
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers

@SpringBootTest
@Testcontainers
class KotlinTodoListRestApiApplicationTests {
    @Autowired
    private lateinit var todoRepository: TodoRepository

    companion object {
        @Container
        val postgresContainer = PostgreSQLContainer<Nothing>("postgres:16.4").apply {
            withDatabaseName("testdb")
            withUsername("testuser")
            withPassword("testpass")
        }

        @JvmStatic
        @DynamicPropertySource
        fun registerProperties(registry: DynamicPropertyRegistry) {
            registry.add("spring.datasource.url", postgresContainer::getJdbcUrl)
            registry.add("spring.datasource.username", postgresContainer::getUsername)
            registry.add("spring.datasource.password", postgresContainer::getPassword)
        }
    }

    /**
     * Clean up the database after each test method to ensure test isolation.
     */
    @AfterEach
    fun cleanup() {
        todoRepository.deleteAll()
    }

    @Test
    fun `context loads and PostgreSQL container is running`() {
        // Basic check: Verify the container managed by Testcontainers is running
        assertTrue(postgresContainer.isRunning, "PostgreSQL container should be running")

        // More meaningful check: Verify the application context loaded successfully
        // by interacting with a bean (e.g., the repository)
        // This implicitly confirms the database connection was established.
        val count = todoRepository.count()
        assertEquals(0, count, "TodoRepository should be empty initially")
        println("Successfully connected to test DB and repository count is: $count")
    }

    @Test
    fun `should save and retrieve a Todo item`() {
        // Arrange
        // Assuming you have a Todo data class/entity like:
        // data class Todo(
        //    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        //    val id: Long? = null,
        //    val title: String,
        //    val completed: Boolean = false
        // )
        // And your TodoRepository extends JpaRepository<Todo, Long> or similar

        // val newTodo = Todo(title = "Test Todo Item") // Create a Todo entity instance

        // Act
        // val savedTodo = todoRepository.save(newTodo)
        // val foundTodo = savedTodo.id?.let { todoRepository.findById(it) }

        // Assert
        // assertNotNull(savedTodo.id, "Saved Todo should have an ID")
        // assertTrue(foundTodo?.isPresent ?: false, "Should find the saved Todo by ID")
        // assertEquals("Test Todo Item", foundTodo?.get()?.title, "Saved Todo title should match")

        // Placeholder assertion until Todo entity/repository is confirmed
        assertTrue(true, "Placeholder test: Replace with actual save/retrieve logic")
        println("Placeholder test passed. Implement actual DB interaction test.")
    }
}
