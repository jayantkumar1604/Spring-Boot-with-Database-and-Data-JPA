package com.example.demoproject.service;

import com.example.demoproject.model.Employee;

import java.util.ArrayList;

public interface EmpService {
    ArrayList<Employee> findAllEmployee();
    Employee findAllEmployeeByID(long id);
    void addEmployee();
    void deleteAllData();
}
