package oop_lab5;

import java.util.Scanner;

//1.input data from user
//2.find summation of data in array
//3.find averge value of data in array
//4.find maximum value of data in array
//5.find minimum value of data in array
public class InputDataToArray {
    private static final int MAX = 10;

    public static void main(String[] args) {
        int num[]=new int[MAX];
        num = inputData(num);
        ShowData(num);

    }//main

    private static void ShowData(int[] num) {
        System.out.println("Data in array");
        for (int val : num)
            System.out.print(val+" ");
    }

    private static int[] inputData(int [ ]num) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plese enter data to array : ");
        for (int i=0 ; i<num.length;i++){
            System.out.print("num["+i+"]:");
            num[i] = scanner.nextInt();
        }
        return num;
    }
}//class

