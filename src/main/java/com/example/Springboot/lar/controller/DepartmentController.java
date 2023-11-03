package com.example.Springboot.lar.controller;

import com.example.Springboot.lar.entity.Department;
import com.example.Springboot.lar.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    // We are using the property based dependency injection, there are also constructor based and the setter based DI
    @Autowired // We are using the dependency injection and the inversion of control
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartmentList();
    }

    @GetMapping("/departments/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully.";
    }

//    @PutMapping("/departments/{id}")
//    public Department updateDepartment(
//            @PathVariable("id") Long departmentId,
//            @RequestBody Department department
//    ) {
//
//    }

}
