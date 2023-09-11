CREATE DATABASE IF NOT EXISTS employeedb;
USE employeedb;

CREATE TABLE IF NOT EXISTS Employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    age INT,
    salary DOUBLE,
    department VARCHAR(50)
);

-- Insert 50 employee records
INSERT INTO Employee (first_name, last_name, age, salary, department) VALUES
    ('John', 'Doe', 35, 65000.00, 'Engineering'),
    ('Jane', 'Smith', 28, 55000.00, 'HR'),
    ('Michael', 'Johnson', 42, 75000.00, 'Sales'),
    ('Emily', 'Williams', 29, 60000.00, 'Engineering'),
    ('William', 'Brown', 31, 70000.00, 'Marketing'),
    ('Amanda', 'Jones', 45, 80000.00, 'Sales'),
    ('David', 'Lee', 27, 56000.00, 'Engineering'),
    ('Sophia', 'Martin', 34, 72000.00, 'HR'),
    ('James', 'Wilson', 38, 78000.00, 'Engineering'),
    ('Olivia', 'Moore', 26, 59000.00, 'Marketing'),
    ('Benjamin', 'Taylor', 30, 68000.00, 'Sales'),
    ('Emma', 'Anderson', 33, 71000.00, 'Engineering'),
    ('Alexander', 'White', 29, 61000.00, 'Engineering'),
    ('Liam', 'Harris', 41, 74000.00, 'Sales'),
    ('Mia', 'Clark', 32, 67000.00, 'HR'),
    ('Daniel', 'Lewis', 28, 56000.00, 'Engineering'),
    ('Sofia', 'Young', 36, 76000.00, 'Marketing'),
    ('Henry', 'Walker', 39, 79000.00, 'Sales'),
    ('Amelia', 'Hall', 27, 57000.00, 'Engineering'),
    ('Matthew', 'Brown', 31, 68000.00, 'Sales'),
    ('Ella', 'Wilson', 40, 77000.00, 'Engineering'),
    ('Liam', 'Harris', 33, 71000.00, 'Marketing'),
    ('Charlotte', 'Lee', 28, 59000.00, 'Engineering'),
    ('William', 'Anderson', 37, 77000.00, 'Sales'),
    ('Ava', 'White', 30, 67000.00, 'HR'),
    ('James', 'Miller', 26, 55000.00, 'Engineering'),
    ('Harper', 'Brown', 34, 72000.00, 'Marketing'),
    ('Benjamin', 'Martin', 29, 60000.00, 'Sales'),
    ('Olivia', 'Moore', 38, 78000.00, 'Engineering'),
    ('Lucas', 'Clark', 27, 57000.00, 'Engineering'),
    ('Sophia', 'Young', 35, 75000.00, 'HR'),
    ('Liam', 'Taylor', 31, 69000.00, 'Engineering'),
    ('Emma', 'Williams', 29, 60000.00, 'Sales'),
    ('Mason', 'Johnson', 43, 76000.00, 'Engineering'),
    ('Ava', 'Smith', 26, 55000.00, 'Marketing'),
    ('Noah', 'Anderson', 32, 70000.00, 'Sales'),
    ('Isabella', 'Jones', 29, 61000.00, 'Engineering'),
    ('Sophia', 'Martin', 35, 75000.00, 'Engineering'),
    ('Oliver', 'Wilson', 36, 77000.00, 'Marketing'),
    ('Aria', 'Brown', 27, 57000.00, 'Sales'),
    ('Elijah', 'Young', 30, 68000.00, 'Engineering'),
    ('Aiden', 'Williams', 37, 79000.00, 'HR'),
    ('Grace', 'Smith', 33, 71000.00, 'Sales'),
    ('Lucas', 'Taylor', 28, 59000.00, 'Engineering'),
    ('Abigail', 'Lewis', 32, 70000.00, 'Engineering'),
    ('Scarlett', 'Walker', 30, 68000.00, 'Sales');

COMMIT;
