package oop_lab4;
// 1.Overload methods
//2. overloading methods
//3. Methods Overloading/Overload

public class OverLoadMethod {
    public  static  void  A (){
        System.out.println("Hello A1");
    }
    public  static   void A (int x) {
        System.out.println("Hello" +x);
    }
    public  static  void A (int x, int y){
        System.out.println("Hello"+(x+y));
    }
    public static void  main (String[]args){
        A();
        A(10);
        A(10,20);
    }
}
