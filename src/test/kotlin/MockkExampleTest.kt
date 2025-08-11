package org.example

import io.mockk.every
import io.mockk.mockk
import kotlin.test.Test
import kotlin.test.assertEquals

class MockkExampleTest {
    // A simple interface that we'll mock in this test
    interface Greeter {
        fun greet(name: String): String
    }

    @Test
    fun `mockk can mock a simple interface`() {
        val greeter = mockk<Greeter>()
        every { greeter.greet("Kotlin") } returns "Hi Kotlin"

        val result = greeter.greet("Kotlin")

        assertEquals("Hi Kotlin", result)
    }
}
