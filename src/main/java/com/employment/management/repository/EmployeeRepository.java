package com.employment.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.employment.management.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
