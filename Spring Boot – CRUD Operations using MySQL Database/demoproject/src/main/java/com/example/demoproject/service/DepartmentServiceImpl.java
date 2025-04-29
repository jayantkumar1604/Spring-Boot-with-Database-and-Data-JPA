package com.example.demoproject.service;

import com.example.demoproject.entity.Department;
import com.example.demoproject.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository;

    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    // Save operation
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    // Read operation
    @Override
    public List<Department> fetchDepartmentList() {
        return departmentRepository.findAll();
    }

    // Update operation
    @Override
    public Department updateDepartment(Department department, Long departmentId) {
        Department existingDepartment = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new RuntimeException("Department not found with id: " + departmentId));

        if (Objects.nonNull(department.getDepartmentName()) && !department.getDepartmentName().trim().isEmpty()) {
            existingDepartment.setDepartmentName(department.getDepartmentName());
        }

        if (Objects.nonNull(department.getDepartmentAddress()) && !department.getDepartmentAddress().trim().isEmpty()) {
            existingDepartment.setDepartmentAddress(department.getDepartmentAddress());
        }

        if (Objects.nonNull(department.getDepartmentCode()) && !department.getDepartmentCode().trim().isEmpty()) {
            existingDepartment.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentRepository.save(existingDepartment);
    }

    // Delete operation
    @Override
    public void deleteDepartmentById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }
}
