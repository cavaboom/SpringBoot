package ru.skypro.lessons.springboot.weblibrary.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.weblibrary.springboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String getEmployeeSalarySum() {
        return employeeService.getEmployeeSalarySum();
    }

    @GetMapping
    public String getEmployeeSalaryMin() {
        return employeeService.getEmployeeSalaryMin();
    }

    @GetMapping
    public String getEmployeeSalaryMax() {
        return employeeService.getEmployeeSalaryMax();
    }

    @GetMapping
    public String getEmployeeAverageHighSalary() {
        return employeeService.getEmployeeAverageHighSalary();
    }

}
