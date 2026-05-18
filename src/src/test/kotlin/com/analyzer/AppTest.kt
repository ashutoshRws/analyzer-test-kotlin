package com.analyzer

import com.analyzer.models.User
import com.analyzer.utils.greet
import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test
    fun greetWorks() {
        assertEquals("Hello, world", greet("world"))
    }

    @Test
    fun createUserWorks() {
        assertEquals("a", User.create("a").name)
    }
}
