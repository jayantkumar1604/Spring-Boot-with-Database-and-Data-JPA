package com.jayant.springbootdemoproject.repository;

import com.jayant.springbootdemoproject.entity.Department;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends CrudRepository<Department,Long> {
}
