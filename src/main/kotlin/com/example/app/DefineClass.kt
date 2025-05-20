package com.example.app

fun main(){
    val c: Contact = Contact()
    val p: Person = Person(100, "email@email.com")

    println(c)
    println(p)
   // p.id = 234 // immutable id cant be modified
    p.email = "welcome@welcome.com"
    println(p)
}

class Contact

// immutable, mutable
class Person(val id: Int, var email: String){
    init{
       println("The init logic: ${id}")
    }
    override fun toString(): String {
        return "${this::class} $id : $email"
    }
}