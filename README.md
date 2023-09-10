# streamsPractise
# Problem Statement:
    In this tech challenge, we will be working with Java Streams to manipulate and analyze data from a dataset of employees. The goal is to practice and demonstrate your understanding of Java Streams and related concepts, while also integrating this functionality into a Spring Boot application connected to a MySQL database.

# Instructions:

# 1. Database Setup:
    - Create a MySQL database for employee data. You can name it `EmployeeDB`.

# 2. Dataset Generation:
    - Create a dataset of employee objects within the MySQL database. Each employee should have the following attributes: `id` (integer), `firstName` (String), `lastName` (String), `age` (integer), `salary` (double), and `department` (String).
    - Insert at least 50 unique employee records into the `Employee` table in the database. You can use the provided SQL script for this purpose.

# 3. Spring Boot Application:
    - Create a Spring Boot application that connects to the `EmployeeDB` MySQL database.
    - Set up the necessary configurations and dependencies to enable database connectivity.

# 4. Stream Operations:
    - Within your Spring Boot application, specify the following RESTful API endpoints where Java Streams will be used to perform operations on the dataset of employees:

# i) Filtering:
    - Create an endpoint to retrieve employees who are older than 30.
    - Create an endpoint to retrieve employees who belong to the "Engineering" department.

# ii) Mapping:
    - Create an endpoint to retrieve a list of employee full names (concatenate `firstName` and `lastName` with a space).
    - Create an endpoint to retrieve a list of employee IDs.

# iii) Sorting:
    - Create an endpoint to retrieve employees sorted by salary in ascending order.
    - Create an endpoint to retrieve employees sorted by age in descending order.

# iv) Reduction:
    - Create an endpoint to calculate and return the total salary of all employees.
    - Create an endpoint to find and return the employee with the highest salary.
    - Create an endpoint to calculate and return the average age of employees.

# 5. Data Transformation:
    - Within your Spring Boot application, create an endpoint to retrieve a map that groups employees by their department. The key should be the department name, and the value should be a list of employees in that department.

# 6. Output:
    - Implement the specified APIs to perform the Java Stream operations on the employee dataset and return the results as JSON responses.

# Additional Instructions:
    - Use Lambda expressions and method references wherever applicable within your Spring Boot application.
    - Encapsulate the stream operations in meaningful methods for better code organization and readability.
    - Ensure that your code is efficient and uses stream operations effectively.

# Challenge Constraints:
    - The dataset in the MySQL database should contain at least 50 employee records.
    - You can use Java 8 or a later version for this challenge.

# Bonus (Optional):
    - Implement error handling and validation for data input in your Spring Boot application.
    - Create unit tests to validate the correctness of your stream operations and API endpoints. 
