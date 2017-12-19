package oop_lab4;

public class TestMethods {

        //glo
    public static  int number = 1000;

        //type 1
        public static void A () {
            System.out.println("Hello A");
            B(20);
        }//A
    // type 2
    public static void B (int x) {
            System.out.println("Hello B"+x);
    }// B
    //type 3
    public static int c (int x,int y) {
System.out.println("Hello c"+ number);
        return x+y;
    }//C

        public static void main (String[] args) {
            System.out.println("Hello Main");
            //calliny mathod
           // A();
          //  B(10);
         int number = c(10,20);
         System.out.println(number);
         System.out.println(c(50,50));
         //local varible
            int x = 1000;
    }//main


}//class
