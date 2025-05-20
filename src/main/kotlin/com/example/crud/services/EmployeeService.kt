package com.example.crud.services

import com.example.crud.data.Employee
import com.example.crud.repositories.EmployeeRepository

class EmployeeService(private val employeeRepository: EmployeeRepository) {

    public fun save(param: Employee){
        employeeRepository.save(param)
    }
}