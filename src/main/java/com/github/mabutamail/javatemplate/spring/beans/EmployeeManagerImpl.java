package com.github.mabutamail.javatemplate.spring.beans;

//import javax.annotation.PostConstruct;

import com.github.mabutamail.javatemplate.spring.model.Employee;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class EmployeeManagerImpl implements EmployeeManager {

    @Override
    public Employee create() {
        Employee emp =  new Employee();
        emp.setId(1);
        emp.setName("Lokesh");
        return emp;
    }

//    @PostConstruct
    public void onInit(){
        System.out.println("EmployeeManagerImpl Bean is Created !!");
    }
}