package data;

public class Dog {
    private String name;   //___
    private int yob;       //___
    private double weight; //___
    
    public Dog(String name, int yob, double weight) {
        this.name= name;
        this.yob = yob;
        this.weight = weight;
    }
    
    public void updateYob(int yob) {
        this.yob = yob;
    }
    
    public double getWeight() {
        return weight;
    }
}