package data;

import java.util.Random;

public class Cat extends Pet{
    
    public static final double MAX_SPEED = 50;
    
    private String ribbon; // ruy-băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);
        this.ribbon = ribbon;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    @Override
    public double run() {
        // Trong cuộc sống có những "thứ-object" sinh ra cho mình mấy trò ngẫu nhiên,
        // như vậy chúng thuộc Nhóm/Khuôn Ngẫu Nhiên, class Ngẫu Nhiên xuất hiện.
        // JDK có sẵn cái Khuôn này rồi, tên là Random ~~~ Scanner ~~~ Math.
        Random mayNgauNhien = new Random();
        double speed = mayNgauNhien.nextDouble() * MAX_SPEED; // trả cho mình con số trong khoảng (0, 1) * 50 = gần 50.
        return speed; // trả về tốc độ gần 50, hên xui random.
        
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%-4s|%4.1f|\n", "CAT", name, yob, weight, ribbon, run());
    }
        
}
