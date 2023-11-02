package com.example.Springboot.lar.repository;

import com.example.Springboot.lar.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository                // Pass the entity and the primary key type vvv
public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
