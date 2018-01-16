package Midterm;
import java.util.Scanner;
public class Employee {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String  id = getID();
        String name = getName();
        String Salary = getSalary();
        String OverTime = getOverTime();
        String calculate = calculateTax();
    }

    private static String calculateTax() {

    }

    private static String getOverTime() {
        System.out.print("Enter employee OverTime: ");
        return scanner.nextLine();
    }

    private static String getSalary() {
        System.out.print("Enter employee Salary: ");
        return scanner.nextLine();
    }

    private static String getName() {
        System.out.print("Enter employee Name: ");
        return scanner.nextLine();
    }

    private static String getID() {
        System.out.print("Enter employee id: ");
        return scanner.nextLine();
    }


    }

