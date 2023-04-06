package com.simform.person;

public class Employee extends Person {
    int empId;
    long empSalary;
    String empDept;

    public Employee(int id, String name, int age, long salary, String dept) {
        super(age, name);
        this.empId = id;
        this.empSalary = salary;
        this.empDept = dept;
    }

    public void EmployeeDetails() {
        System.out.println("---------------------------------------");
        System.out.println("Welcome !!!");
        System.out.println("Employee ID     :  " + empId);
        System.out.println("Employee Name   :  " + name);
        System.out.println("Employee Age    :  " + age);
        System.out.println("Employee Salary :  " + empSalary);
        System.out.println("Employee Dept :  " + empDept);
    }
}
