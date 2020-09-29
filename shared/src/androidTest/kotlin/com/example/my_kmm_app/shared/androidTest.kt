package com.example.my_kmm_app.shared

import org.junit.Assert.assertTrue
import org.junit.Test

class GreetingTest {

    @Test
    fun testExample() {
        assertTrue("Check Guess is mentioned", Greeting().greeting().contains("Guess"))
    }
}