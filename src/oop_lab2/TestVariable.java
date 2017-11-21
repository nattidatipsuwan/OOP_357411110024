package oop_lab2;

public class TestVariable {
    public static  void main (String[] args){
        // Integer
        int i;
        i=10;
        System.out.println("i= "+i);
        int j = 20;
        System.out.println("j= "+j);
        int x = i + j;
        System.out.println("x= "+x);
        // Double
        double v = 10.10;
        System.out.println("v= "+v);
        x = (int) v;
        System.out.println("x= "+x);
        // char
        char c = 'T';
        System.out.println("c= "+c);
        // String
        String s = "Hello,World";
        System.out.println(s);
        String name = "I am nat";
        System.out.println(s+" "+name);

        String msg = s.concat(name);
        System.out.println(msg.length());
        System.out.println(msg.toUpperCase());
        System.out.println(msg.toLowerCase());

        int number = 10;
        int m = number++;
        System.out.println(number);
        System.out.println(m);
        m+=1; // m = m+1; m =12
        System.out.println(m);
        m += 10;
        System.out.println(m);
        m -= 5;
        m *= 10;
        System.out.println(m);

       // Boolean
        boolean b = true;
        boolean u = false;
        System.out.println(b);
        b = false;
        System.out.println(b);


    } // main

}
