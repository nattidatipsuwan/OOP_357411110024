package oop_lab7;
import java.util.Scanner;
public class mySuperCar {
    public static void main(String[] args) {
        SuperCar superCar1 = new SuperCar();
        superCar1.setBrand("toyota");
        superCar1.setColor("red");
        superCar1.setEnginesize("160");
        superCar1.setMaxspeede("250");
        superCar1.setCountry("japan");
        System.out.println(superCar1.toString());

        SuperCar superCar2 = new SuperCar("toyota","red","160","200","japan");
        System.out.println(superCar2.toString());

        SuperCar superCar3 = new SuperCar();
        superCar3 = inputData(superCar3);
        System.out.println(superCar3.toString());
        //   System.out.println(student1.gender);
        // System.out.println(Student.gender);
    }//main

    private static SuperCar inputData(SuperCar s) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Car Brand : ");
        System.out.print(" Enter Car Brand : ");
        s.setBrand(scanner.nextLine());
        System.out.print("Enter Car Color : ");
        s.setColor(scanner.nextLine());
        System.out.print("Enter Engine Size : ");
        s.setEnginesize(scanner.nextLine());
        System.out.print("Enter Max Speed : ");
        s.setMaxspeede(scanner.nextLine());
        System.out.print("Enter Country of origin : ");
        s.setCountry(scanner.nextLine());
        return s;
    }
}
