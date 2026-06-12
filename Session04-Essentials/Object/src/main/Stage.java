package main;

import data.Student;

public class Stage {
    
    public static void main(String[] args) {
        
        Student s1 = new Student("SE686868", "LỘC PHÁT", 1998, 6.8);
        // biến object
        // biến đối tượng       OBJECT, INSTANCE, HIỆN THÂN, THỂ HIỆN... CỤ THỂ
        // object variable
        // reference variable
        //                      1. new là clone vùng ram từ Khuôn (static if any)
        //                      2. gọi phễu đổ data vào vùng clone
        //                      3. chốt lại tọa độ vùng new thảy cho ai đó giữ
        //                         thảy cho biến object giữ
        
        s1.showProfile(); // LỘC PHÁT
        
        s1 = new Student("SE666789", "ĐẠI GIA", 2001, 9.9);
        // sếp -> CaSi Sơn Tùng
        // sếp -> người quyết định mức lương cho người đi làm thuê
        // tí -> mày ở nhà, tao ở nhà
        // tí -> Trạng Tí
        s1.showProfile(); // ĐẠI GIA
        // Mất tọa độ LỘC PHÁT rồi,
        // mất tọa độ vùng ram/object thì điều gì xảy ra?
        // Công ty Môi Trường Đô Thị, GARBAGE COLLECTOR, vùng ram object không ai trỏ sẽ bị thu hồi, object bị giết,
        // HEAP được clear - free(con trỏ bên C), vùng HEAP trả lại cho new object mới.
        System.gc();      
    }
    
}
