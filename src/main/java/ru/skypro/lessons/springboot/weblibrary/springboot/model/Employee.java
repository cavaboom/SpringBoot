package ru.skypro.lessons.springboot.weblibrary.springboot.model;

public record Employee(String name, int salary) {

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
