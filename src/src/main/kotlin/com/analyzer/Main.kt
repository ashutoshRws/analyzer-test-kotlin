package com.analyzer

import com.analyzer.models.User
import com.analyzer.utils.greet

fun main() {
    val user = User.create("tester")
    println(greet(user.name))
}
