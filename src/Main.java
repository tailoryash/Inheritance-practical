import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Employee Id : ");
        int id = scn.nextInt();

        System.out.print("Enter Employee Age : ");
        int age = scn.nextInt();
        scn.nextLine();

        System.out.print("Enter Employee Name : ");
        String name = scn.nextLine();

        System.out.print("Enter Employee Salary : ");
        long salary = scn.nextLong();

        System.out.print("Enter Employee Dept :");
        String dept = scn.next();

        Employee emp = new Employee(id, name, age, salary, dept);
        emp.EmployeeDetails();
    }
}