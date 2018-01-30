package oop_lab8;

public class PatApp {
    public static void main(String[] args) {

        dog dog = new dog("chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();
        cat cat =new cat ("gin",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();
    }
}
