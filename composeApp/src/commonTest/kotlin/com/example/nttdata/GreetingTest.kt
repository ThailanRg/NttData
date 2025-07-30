package com.example.nttdata

import kotlin.test.Test
import kotlin.test.assertTrue

class GreetingTest {
    @Test
    fun testGreetingContainsHello() {
        val greeting = Greeting()
        val result = greeting.greet()
        assertTrue(result.contains("Hello"), "Greeting should contain 'Hello'")
    }
}