package ru.skypro.lessons.springboot.weblibrary.springboot.repository;

import ru.skypro.lessons.springboot.weblibrary.springboot.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getListEmployees();
}
