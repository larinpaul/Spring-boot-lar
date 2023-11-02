package com.example.Springboot.lar.controller;

import com.example.Springboot.lar.entity.Department;
import com.example.Springboot.lar.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    // We are using the property based dependency injection, there are also constructor based and the setter based DI
    @Autowired // We are using the dependency injection and the inversion of control
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

}
