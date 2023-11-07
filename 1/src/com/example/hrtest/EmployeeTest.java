// com/example/hrtest/EmployeeTest.java
package com.example.hrtest;

import com.example.hr.Employee; // Import the Employee class from the "com.example.hr" package.

public class EmployeeTest {
    public static void main(String[] args) {
		
        Employee employee = new Employee();
		
        employee.setName("Selvi R");
        employee.setId(12345);
        employee.setSalary(60000.0);

        employee.printName();
        employee.printSalary();
    }
}