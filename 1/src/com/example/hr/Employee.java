// com/example/hr/Employee.java
package com.example.hr;

public class Employee {
    private String name;
    private int id;
    private double salary;

    public void printName() {
        System.out.println("Employee Name: " + name);
    }

    public void printSalary() {
        System.out.println("Employee Salary: $" + salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}