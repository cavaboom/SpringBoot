package ru.skypro.lessons.springboot.weblibrary.springboot.repository;

import org.springframework.stereotype.Repository;
import ru.skypro.lessons.springboot.weblibrary.springboot.model.Employee;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final List<Employee> employeeList = List.of(
            new Employee("Jonh", 70000),
            new Employee("Carl", 80000),
            new Employee("Ada", 100000),
            new Employee("Vanessa", 95000)
    );

    public List<Employee> getListEmployees(){
        return employeeList;
    }
}
