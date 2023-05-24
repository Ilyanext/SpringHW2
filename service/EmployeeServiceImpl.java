package ru.skypro.homework.service;

import org.springframework.stereotype.Service;
import ru.skypro.homework.controller.pojo.Employee;
import ru.skypro.homework.repository.EmployeeRepository;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
