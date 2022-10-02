package com.howtodoinjava.rest.dao;

import org.springframework.stereotype.Repository;

import com.howtodoinjava.rest.model.Employee;
import com.howtodoinjava.rest.model.Employees;

@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
    
    static 
    {
        list.getEmployeeList().add(new Employee(1, "Rajesh", "Kareti", "rajesh.kareti@test.com"));
        list.getEmployeeList().add(new Employee(2, "Raj", "Tej", "raj.tej@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "raj", "k", "raj.k@gmail.com"));
    }
    
    public Employees getAllEmployees() 
    {
        return list;
    }
    
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
