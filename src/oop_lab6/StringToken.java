package oop_lab6;

import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        String mag = "Hello, RMUTSV Nattida Tipsuwan ";
        StringTokenizer myToken =new StringTokenizer(mag);
        System.out.println(myToken.countTokens());
        while (myToken.hasMoreTokens()){
            StringBuffer myBuf = new StringBuffer(myToken.nextToken());
            System.out.print(myBuf.reverse()+" ");
        }//while
    }//main
}//class
