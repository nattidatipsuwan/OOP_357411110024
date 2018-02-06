package oop_lab9;

public class Engine {
    private String sire;
    private String type;
    //constructor

    public Engine(String sire, String type) {
        this.sire = sire;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "sire='" + sire + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
