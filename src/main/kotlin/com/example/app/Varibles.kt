package com.example.app

fun main() {
    // var : mutable
    // val : immutable
    var a = 10; // compiler auto-detect the type as Int
    var b: Int = 20; // we are defining type
    val c = 30; // cant be modified as it is val
    val d: Int = 40;
    var e: Int; // this is just a delcaration
    e = 100
    println(e) // must be initialized: Error at compilation time. As we are reading a variable which is not init yet.

    // init conditionally but before first read access
    val message: String
    if (evaluateAge(10)) {
        message = "You are above 18"
    } else {
        message = "You are below 18"
    }
    println(message)

    // handling null
    var strNotNull = "This cant be null";
//    strNotNull = null; // assigning null gives compilation error

    // must add question mark if you know the value may be null
    var strMayNull : String ? = "This may be null";
    strMayNull = null; // you can assign null without any compilation error

    printAll(strNotNull)
//    printAll(strMayNull) // possible null value we are passing so the compilation error
}

fun strLen(str: String) : Int{
    return str.length
}

fun evaluateAge(x: Int) = x > 18