package com.example.app

fun main() {
    display("Sanjana")
    display()
    var result = sum(10,20);
    println(result)
    result = multi(10,20)
    println(result)
}

fun display(name: String = "Alex"): Unit {
    println(name)
    println("The name is : $name")
}

fun sum(a:Int, b: Int): Int{
    return a + b;
}

fun multi(a: Int, b: Int) = a * b