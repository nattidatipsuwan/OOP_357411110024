package oop_lab9;

public class myCarApp {
    public static void main(String[] args) {
        //Engins
        Engine engine=new Engine("1500 cc","V-TEC V4");
        //car
      Car car = new Car("Honda","Black",engine);
      System.out.println(car.toString());
      Car car1 = new Car("Honda","red",engine);
      System.out.println(car1.toString());

    }//main
}//class
