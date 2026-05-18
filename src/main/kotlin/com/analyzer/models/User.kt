package com.analyzer.models

data class User(val id: Int, val name: String) {
    companion object {
        fun create(name: String) = User(1, name)
    }
}
