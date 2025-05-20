package com.example.app

fun main() {
    printAll("Hello", "World")
    printAllWithName("Hello", "World")
    printAsArray("Hello", "World")
}

fun printAsArray(vararg messages: String) {
    printAll(*messages)
}

fun printAllWithName(vararg messages: String, name: String = "Alex") {
    println("$name: " + messages.size)
    for (item in messages) {
        println("$name: " + item)
    }
}

fun printAll(vararg messages: String) {
    for (item in messages) {
        println(item)
    }
}