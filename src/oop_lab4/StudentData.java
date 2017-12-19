package oop_lab4;
//สร้าง methods สำหรับรับค่าข้อมูลนักศึกษาประกอบด้วย
//1.ชื่อ-สกุล
//2.ที่อยู่
//3.รหัสนักศึกษา
//4.สาขาและมหาวิทยาลัย
//5.email

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentData {
   public  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
   public  static  String getName() throws IOException{
       System.out.print("Enter your name: ");
       return  reader.readLine();
   }
  public static  String getAddresd() throws IOException {
      System.out.print("Enter your Addresd: ");
      return reader.readLine();
  }
    public static  String getid() throws IOException {
        System.out.print("Enter your id: ");
        return reader.readLine();
    }
    public static  String getfac() throws IOException {
        System.out.print("Enter your major and faculty: ");
        return reader.readLine();
    }
    public static  String getemail() throws IOException {
        System.out.print("Enter your email: ");
        return reader.readLine();
    }
    public static  void main (String[] args)throws IOException{
       String name = getName();
       String id = getid();
       String Addresd = getAddresd();
       String fac = getfac();
       String email = getemail();
       System.out.println(name+"\n"+Addresd+"\n"+id+"\n"+fac+ "\n"+email);
    }
}



