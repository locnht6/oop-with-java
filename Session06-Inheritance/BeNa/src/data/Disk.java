package data;

public class Disk extends Shape {
    
    public static final double PI = 3.14;
    
    private String smile; // <3, :x
    private double radius;

    public Disk(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }

    public String getSmile() {
        return smile;
    }

    public void setSmile(String smile) {
        this.smile = smile;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius;
    }
    
    @Override
    public double getArea() {
        return Disk.PI * Math.pow(radius, 2);
    }
    
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%-4s|%4.1f|%7.2f|\n", "DISK", owner, color, borderColor, smile, radius, getArea());
    }
    
}
