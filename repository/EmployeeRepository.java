package ru.skypro.homework.repository;


import ru.skypro.homework.controller.pojo.Employee;

import java.util.List;

public interface EmployeeRepository {
    public List<Employee> getAllEmployees();
}
