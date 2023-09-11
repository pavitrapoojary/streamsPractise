package com.employee.service;

import com.employee.entity.Employee;
import com.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeesOlderThan30() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees.stream()
                .filter(employee ->
                        employee.getAge() > 30)
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> getEmployeesFromEngineeringDepartment() {
        List<Employee> allEmployees = employeeRepository.findAll();
        return allEmployees.stream()
                .filter(employee ->
                        employee.getDepartment().equals("Engineering"))
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getListOfEmployeeFullNames() {
        return employeeRepository.findAll()
                .stream().map(
                        employee -> employee.getFirstName() + " " + employee.getLastName()
                ).collect(Collectors.toList());
    }

    @Override
    public List<Integer> getListOfEmployeeIds() {
        return employeeRepository.findAll()
                .stream()
                .map(
                        Employee::getId
                ).collect(Collectors.toList());
    }

    @Override
    public List<Employee> getEmployeesSortedInAscendingOrderOfSalary() {
        return employeeRepository.findAll()
                .stream().sorted(Comparator.comparing(Employee::getSalary))
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> getEmployeesSortedInDescendingOrderOfAge() {
        return employeeRepository.findAll()
                .stream().sorted(Comparator.comparing(Employee::getAge).reversed())
                .collect(Collectors.toList());
    }

    @Override
    public double getTotalEmployeeSalary() {
        return employeeRepository.findAll()
                .stream()
                .mapToDouble(Employee::getSalary)
                .sum();
    }

    @Override
    public double getEmployeeWithHighestSalary() {
        return employeeRepository.findAll()
                .stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0.0);
    }

    @Override
    public double getEmployeesAverageAge() {
        return employeeRepository.findAll()
                .stream()
                .mapToDouble(Employee::getAge)
                .average()
                .orElse(0.0);
    }

    @Override
    public Map<String, List<Employee>> getDepartmentWiseEmployees() {
        return employeeRepository.findAll()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}
