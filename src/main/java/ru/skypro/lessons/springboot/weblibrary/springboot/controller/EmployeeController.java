package ru.skypro.lessons.springboot.weblibrary.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.skypro.lessons.springboot.weblibrary.springboot.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/salarySum")
    public String getEmployeeSalarySum() {
        return employeeService.getEmployeeSalarySum();
    }

    @GetMapping("/salaryMin")
    public String getEmployeeSalaryMin() {
        return employeeService.getEmployeeSalaryMin();
    }

    @GetMapping("/salaryMax")
    public String getEmployeeSalaryMax() {
        return employeeService.getEmployeeSalaryMax();
    }

    @GetMapping("/highSalary")
    public String getEmployeeAverageHighSalary() {
        return employeeService.getEmployeeAverageHighSalary();
    }

}
