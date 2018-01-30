package oop_lab8;

public class Employee extends Person {
        private  String emoloyeeID;
        private  String position;
        private int salary;

    public Employee(String personID, String name, String gender, int age, String emoloyeeID, String position, int salary) {
        super(personID, name, gender, age);
        this.emoloyeeID = emoloyeeID;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emoloyeeID='" + emoloyeeID + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                "}"+ super.toString();
    }

    public String getEmoloyeeID() {
        return emoloyeeID;
    }

    public void setEmoloyeeID(String emoloyeeID) {
        this.emoloyeeID = emoloyeeID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}//class
