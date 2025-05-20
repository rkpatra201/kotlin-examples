package com.example.crud

import com.example.crud.controllers.EmployeeController
import com.example.crud.data.Employee
import com.example.crud.repositories.EmployeeRepository
import com.example.crud.services.EmployeeService

fun main(){
    // creating repository object by calling default or no-param constructor
    val employeeRepository : EmployeeRepository = EmployeeRepository();
    // creating service object by calling parameterized constructor where parameter is repository object
    val employeeService: EmployeeService = EmployeeService(employeeRepository)

    val employeeController: EmployeeController = EmployeeController(employeeService)

    // created employee object
    val employee: Employee = Employee(1, "John", "John.Doe@gmail.com")

    // modifying email of employee using apply method
    employee.apply {
        email = "new.email@email.com"
    }

    // calling the controller method which will delegate call to service and repository
    employeeController.save(employee)

    // implement service and controller for below calls
    println(employeeRepository.fetchAll())
    println(employeeRepository.fetch(employee.id))
    println(employeeRepository.delete(employee.id))

}