package oop_lab8;

public class dog extends Pet {
    private  String breed;

    public dog(String name, int age,String breed) {
        super(name, age);
        this.breed=breed;
    }


    @Override
    public void makeNoise() {
        System.out.println("Ba-huuw  Ba-huuw");

    }

    @Override
    public String toString() {
        return "dog{" +
                "breed='" + breed + '\'' +
                "}"+ super.toString();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
