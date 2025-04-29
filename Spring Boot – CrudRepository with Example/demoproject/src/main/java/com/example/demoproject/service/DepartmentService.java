package com.example.demoproject.service;

import com.example.demoproject.entity.Department;

import java.util.List;

public interface DepartmentService {
    // save operation
    Department saveDepartment(Department department);

    // read operation
    List<Department> fetchDepartmentList();

    // update operation
    Department updateDepartment(Department department, Long departmentId);

    // delete operation
    void deleteDepartmentById(Long departmentId);
}
