package oop_lab6;

public class StringCompare {
    public static void main(String[] args) {
        //Compers String
        String str1="Hello";
        String str2="Hellooo";
        //type1(==)
        if (str1==str2)System.out.println("true");
        else System.out.println("false");
        //type2(equals()methods
        if (str1.equals(str2))System.out.println("true");
        else System.out.println("false");

        //type3(comperTo()methods
        //-,+,0
        if (str1.compareTo(str2)==0)
            System.out.println("true");
        else if (str1.compareTo(str2)>=1)
            System.out.println("str 2 more than str1");
        else
            System.out.println("str 1 lese than str2");

    }//main
}//class
