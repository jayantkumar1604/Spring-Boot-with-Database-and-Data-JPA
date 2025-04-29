package com.example.SpringBootwithH2Database.repository;

import com.example.SpringBootwithH2Database.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Long> {

}
