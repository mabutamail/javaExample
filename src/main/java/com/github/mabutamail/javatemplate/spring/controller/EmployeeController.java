package com.github.mabutamail.javatemplate.spring.controller;

import com.github.mabutamail.javatemplate.spring.beans.EmployeeManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

@Controller
public class EmployeeController {

    @Lazy
    @Autowired
    EmployeeManager employeeManager;

    public EmployeeManager getManagerInstance() {
        return employeeManager;
    }
}