package ru.skypro.lessons.springboot.weblibrary.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.skypro.lessons.springboot.weblibrary.springboot.model.Employee;
import ru.skypro.lessons.springboot.weblibrary.springboot.repository.EmployeeRepository;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public String getEmployeeSalarySum() {
        int sum = employeeRepository.getListEmployees().stream().mapToInt(Employee::salary).sum();
        return "Сумма зарплат всех сотрудников: " + sum;
    }

    @Override
    public String getEmployeeSalaryMin() {
        Optional<Employee> employeeSalaryMin = employeeRepository.getListEmployees().stream().min(Comparator.comparingInt(Employee::salary));
        return "Минимальная зарплата: " + employeeSalaryMin;
    }

    @Override
    public String getEmployeeSalaryMax() {
        Optional<Employee> employeeSalaryMax = employeeRepository.getListEmployees().stream().max(Comparator.comparingInt(Employee::salary));
        return "Максимальная зарплата: " + employeeSalaryMax;
    }

    @Override
    public String getEmployeeAverageHighSalary() {
        double salaryAverage = employeeRepository.getListEmployees().stream()
                .mapToDouble(Employee::salary).average().orElse(0.0);
        List<Employee> employeeHighSalary = employeeRepository.getListEmployees().stream().filter(employee -> employee.salary() > salaryAverage).toList();
        return "Средняя зарплата: " + salaryAverage + "\nСотрудники с выше средней зарплатой: " + employeeHighSalary;
    }

}
