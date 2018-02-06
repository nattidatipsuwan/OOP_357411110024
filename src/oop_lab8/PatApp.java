package oop_lab8;

import oop_lab9.Cow;

public class PatApp {
    public static void main(String[] args) {

        dog dog = new dog("chayen",2,"Bangkeaw");
        System.out.println(dog.toString());
        dog.makeNoise();
        dog.myPet();

        cat cat =new cat ("gin",2,"persian");
        System.out.println(cat.toString());
        cat.makeNoise();
        cat.myPet();

        Cow cow = new Cow("Namjai",5);
        System.out.println(cow.toString());
        cow.makeNoise();
        cow.myPet();
    }
}
