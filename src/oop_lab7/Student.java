package oop_lab7;
//Talking about Student?
//1.student ID
//2.Major
//3.Faculty
//4.Name
public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }//to string
    public static String gender = "Male";
    private String id;
    private String major;
    private String faculty;
    private String name;
    //constructor
    //Default contructor
    public Student(){}
    //create constructor by owner
    public  Student(String id,String m,String f, String n){
        //assign data to class properties
        this.id = id;
        this.faculty = f;
        this.major = m;
        this.name = n;
    }
    //getter and setter methods

    public  String  getID(){
        return this.id;
    }
    public  void setID(String id){
        this.id = id;
    }
    public  String getMajor(){
        return  this.major;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public  String getFaculty() {
        return this.faculty;
    }
    public void setFaculty(String faculty){
        this.faculty=faculty;
    }
    public  String getName() {
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}//cless
