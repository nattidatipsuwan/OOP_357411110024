package oop_lab3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSwitchCase {
    public static void main(String[] args) throws IOException {
        //switch-case
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input ;
        System.out.print("Pless enter number (1-3): ");
        input = Integer.parseInt(reader.readLine());
        switch (input){
            case 1 : System.out.println("Your enter 1.");break;
            case 2 : System.out.println("Your enter 2.");break;
            case 3 : System.out.println("Your enter 3.");break;
            default:System.out.println("Pliease enter number 1-3.");
        }//switch

    }//main
}//class
