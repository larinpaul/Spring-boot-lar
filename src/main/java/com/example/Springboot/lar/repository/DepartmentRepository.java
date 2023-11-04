package com.example.Springboot.lar.repository;

import com.example.Springboot.lar.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository                // Pass the entity and the primary key type vvv
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    public Department findByDepartmentName(String departmentName);

    // docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
//    @Query(value = "", nativeQuery = true)
//    @Query("") // JPQL query
    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
