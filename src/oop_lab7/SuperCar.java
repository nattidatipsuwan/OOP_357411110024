package oop_lab7;

public class SuperCar {

    @Override
    public String toString() {
        return "SuperCar{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", enginesize='" + enginesize + '\'' +
                ", maxspeede='" + maxspeede + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    private String brand;
    private String color;
    private String enginesize;
    private String maxspeede;
    private String country;
    //constructor
    //Default contructor
    public SuperCar(){}
    //create constructor by owner
    public  SuperCar(String b,String c,String e, String m,String cou){
        //assign data to class properties
        this.brand = b;
        this.color = c;
        this.enginesize = e;
        this.maxspeede = m;
        this.country = cou;
    }
    //getter and setter methods

    public  String  getBrand(){
        return this.brand;
    }
    public  void setBrand(String brand){
        this.brand =brand;
    }
    public  String getColor(){
        return  this.color;
    }
    public void setColor(String color ){
        this.color=color;
    }
    public  String getEnginesize() {
        return this.enginesize;
    }
    public void setEnginesize(String enginesize){
        this.enginesize=enginesize;
    }
    public  String getMaxspeede() {
        return this.maxspeede;
    }
    public void setMaxspeede(String maxspeede){
        this.maxspeede = maxspeede;
    }
    public  String getCountry() {
        return this.country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
