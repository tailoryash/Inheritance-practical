import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        Employee employee1 = new Employee(5055, "Yash Tailor", 22, 100000, "JAVA");
//
//        Employee employee2 = new Employee(5056, "Yash Fofdiya", 25, 1200000, "JAVA");
        Scanner scn = new Scanner(System.in);
        int id = scn.nextInt();
        String name = scn.nextLine();
        int age = scn.nextInt();
        int salary = scn.nextInt();
        String dept = scn.nextLine();
        Employee emp3 = new Employee(id, name, age, salary, dept);
        emp3.EmployeeDetails();
//        employee1.EmployeeDetails();
//        System.out.println("---------------------------------------");
//        employee2.EmployeeDetails();

    }
}