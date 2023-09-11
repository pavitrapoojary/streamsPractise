package com.employee.controller;

import com.employee.entity.Employee;
import com.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //i) Filtering:

    @GetMapping("/employees/ageAbove30")
    public List<Employee> getEmployeesOlderThan30() {
        return this.employeeService.getEmployeesOlderThan30();
    }

    @GetMapping("/employees/department/engineering")
    public List<Employee> getEmployeesFromEngineeringDepartment() {
        return this.employeeService.getEmployeesFromEngineeringDepartment();
    }

    //ii) Mapping:

    @GetMapping("/employees/fullNames")
    public List<String> getListOfEmployeeFullNames() {
        return this.employeeService.getListOfEmployeeFullNames();
    }

    @GetMapping("/employees/ids")
    public List<Integer> getListOfEmployeeIds() {
        return this.employeeService.getListOfEmployeeIds();
    }

    //iii) Sorting:

    @GetMapping("/employees/salary/sort/asc")
    public List<Employee> getEmployeesSortedInAscendingOrderOfSalary() {
        return this.employeeService.getEmployeesSortedInAscendingOrderOfSalary();
    }

    @GetMapping("/employees/age/sort/desc")
    public List<Employee> getEmployeesSortedInDescendingOrderOfAge() {
        return this.employeeService.getEmployeesSortedInDescendingOrderOfAge();
    }

    //iv) Reduction:

    @GetMapping("/employees/totalSalary")
    public double getTotalEmployeeSalary() {
        return this.employeeService.getTotalEmployeeSalary();
    }

    @GetMapping("/employees/highestSalary")
    public double getEmployeeWithHighestSalary() {
        return this.employeeService.getEmployeeWithHighestSalary();
    }

    @GetMapping("/employees/averageAge")
    public double getEmployeesAverageAge() {
        return this.employeeService.getEmployeesAverageAge();
    }

    //v) Data Transformation:

    @GetMapping("/department/employees")
    public Map<String, List<Employee>> getDepartmentWiseEmployees() {
        return this.employeeService.getDepartmentWiseEmployees();
    }
}
