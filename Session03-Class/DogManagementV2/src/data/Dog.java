package data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dog {
    private String name;   //___
    private int yob;       //___
    private double weight; //___

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    // Sủa, tức là show ra cảnh báo chính chủ nhà mình.
    public void bark() {
        System.out.printf("|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
    // Khi mua điện thoại mở hộp có sổ ghi thông số máy, mở máy vào Setting => thông số máy.
    // Mọi object quanh ta tiềm ẩn 1 hành động cơ bản show toàn bộ info chi tiết/mức cơ bản.
    // Tương đương hành động gặp chú CA, show CCCD, gặp cô ngân hàng, show CCCD.
    // Mặc định Java cung cấp 1 hàm tự sinh code sẵn show ra toàn bộ info mà đã được đổ, đang có,
    // hành động này được gọi là hàm toString(), biến mọi info thành chuỗi.
    
    @Override   // Chữ này không nhầm với Overload, liên quan đến INHERITANCE.
    // Cả 2 keyword dính dáng đến tính 50 sắc thái, POLYMORPHISM, đa xạ đa hình.
    public String toString() {
        return String.format("|%-10s|%4d|%4.1f|", name, yob, weight);
    }
    
    // toString() là một hàm rất rất đặc biệt.
    
    public int getAge() {
        //return 2026 - yob; // viết hard-code, mỗi năm cập nhật code 1 lần.
        // ngon: lấy giờ Windows - yob
        return LocalDate.now().getYear() - yob;
    }
    
}