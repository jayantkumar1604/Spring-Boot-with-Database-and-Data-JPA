package com.jayant.springbootdemoproject.service;

import com.jayant.springbootdemoproject.entity.Department;

import java.util.List;

public interface DepartmentService {

    Department saveDepartment(Department department);

    List<Department> fetchDepartmentList();

    Department updateDepartment(Department department,Long departmentId);

    void deleteDepartmentById(Long departmentId);
}
