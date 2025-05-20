package com.example.crud.repositories

import com.example.crud.data.Employee

class EmployeeRepository {
    private val employees = ArrayList<Employee>()

    public fun save(param: Employee): Unit {
        employees.add(param)
    }

    public fun fetchAll(): List<Employee> {
        val employeeList: List<Employee> = employees.toList(); // immutable list
        return employeeList
    }

    public fun fetch(id: Int): Employee? {
        for (item in employees) {
            if (item.id == id) {
                return item
            }
        }
        return null
    }

    public fun delete(id: Int): Employee? {
        val copyList = ArrayList(employees);
        var deleteItem: Employee? = null;
        for ((index, item) in copyList.withIndex()) {
            if (item.id == id) {
                employees.removeAt(index)
                deleteItem = item
            }
        }
        return deleteItem
    }
}