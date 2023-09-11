package com.employee.service;

import com.employee.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    List<Employee> getEmployeesOlderThan30();

    List<Employee> getEmployeesFromEngineeringDepartment();

    List<String> getListOfEmployeeFullNames();

    List<Integer> getListOfEmployeeIds();

    List<Employee> getEmployeesSortedInAscendingOrderOfSalary();

    List<Employee> getEmployeesSortedInDescendingOrderOfAge();

    double getTotalEmployeeSalary();

    double getEmployeeWithHighestSalary();

    double getEmployeesAverageAge();

    Map<String, List<Employee>> getDepartmentWiseEmployees();
}
