package com.example.crud.controllers

import com.example.crud.data.Employee
import com.example.crud.services.EmployeeService

class EmployeeController(
    private val employeeService: EmployeeService
) {
    public fun save(param: Employee){
        employeeService.save(param)
    }
}