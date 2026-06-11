package dogmanagement;

import data.Dog; // đi mượn cái Khuôn Dog ở ngăn data về đúc
                 // ~ #include <stdio.h> bên C

public class DogManagement {

    public static void main(String[] args) {
        int         yob             =       2001;
    // data type  tên gọi/biến          value, single, đơn, primitive
        
        Dog         chiHu           = new Dog("CHI HU HU", 2021, 0.5);
    // data type  tên biến object       phức tạp, object
                                      // malloc() calloc()
                                      // memory allocation
        
        // có bao nhiêu data types? 2: primitive, object.
        
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        // Kiểm tra xem khi đổ vào Khuôn, đứa sau có đè đứa trước hay không?
        System.out.println("CH barks again");
        chiHu.bark();
        
        // 1 biến tại 1 thời điểm lưu 1 value.
        int x = 68;
        System.out.println("x: " + x);
        x = 79;
        System.out.println("x again: " + x);
        
        // Ăn nhiều thì ú
        chiHu.updateWeight(5.0);
        System.out.println("After online course");
        chiHu.bark();
        ngaoDa.bark();
        
        int chiHuYob = chiHu.getYob();
        System.out.println("CH YOB: " + chiHuYob);
        System.out.println("NĐ YOB: " + ngaoDa.getYob());
    }
    
}
