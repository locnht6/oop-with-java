package dogmanagement;

import data.Dog;
import java.time.LocalDate;

public class DogManagement {

    public static void main(String[] args) {
        
        System.out.printf("|%-10s|%-4s|%-4s|\n", "Name", "Yob", "Weig");
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        System.out.println("Show all of info by using toString() method");
        String chDetails = chiHu.toString();
        System.out.println(chDetails);
        System.out.println(ngaoDa.toString());
        
        System.out.println("GỌI THẦM TÊN EM");
        System.out.println(ngaoDa); // Điều gì diễn ra khi ta sout(biến object)?
        // Khi in biến con trỏ/biến object/biến tham chiếu reference,
        // thì thay vì in ra địa chỉ như bên C, Java ngầm đi tìm hàm toString() mà gọi,
        // hàm ý rằng đi đến tọa độ đang trỏ in hết thông tin.
        
        // Nếu không có toString() mà ngoan cố gọi nó để in ra,
        // Java sẽ in ra con số Hexa, mã băm vùng ram, hash number, gom data thành 1 con số đại diện vùng ram.
        // Hash number, thuật toán MD5, SHA-1, SHA-256.
        
        System.out.println("NĐ age: " + ngaoDa.getAge());
    }
    
}
