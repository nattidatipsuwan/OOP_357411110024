package oop_lab9;

public class mypersonApp {
    public static void main(String[] args) {
        Address address=new Address("123","nakhon","80110");
        Job job=new Job("พนักงานบัญชี",15000);
        Person person=new Person("1234","nat",address,job);
        System.out.println(person.toString());
        person.getJob().setSalary(25000);
        System.out.println(person.getJob().getSalary());
        System.out.println(person.getAddress().getPostcode());

    }
}
