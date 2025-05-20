package com.example.crud.data

data class Employee(
    val id: Int,
    private val name: String,
    var email: String
) {
}