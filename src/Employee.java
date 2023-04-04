import java.util.Formatter;

public class Employee extends Person{
    int empId;
    int empSalary;
    String empDept;

    Employee(int id, String name, int age, int salary, String dept){
        super(age, name);
        this.empId = id;
        this.empSalary = salary;
        this.empDept = dept;
    }

    void EmployeeDetails(){
        System.out.println("Employee ID     :  " + empId);
        System.out.println("Employee Name   :  " + name);
        System.out.println("Employee Age    :  " + age);
        System.out.println("Employee Salary :  " + empSalary);
        System.out.println("Employee Dept :  " + empDept);
    }
}
