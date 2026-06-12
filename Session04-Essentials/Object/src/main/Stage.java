package main;

import data.Student;

public class Stage {
    
    public static void main(String[] args) {
        //checkObjectV1();
        //checkObjectV2();
        //checkObjectV3();
        //checkObjectV4();
        //checkObjectV5();
        //checkObjectV6();
        
        Student x = checkObjectV7(); // x = tọa độ của ai đó new, ai đó new đã được return qua tên hàm.
        x.showProfile(); // AHIHI
        x.setName("EM KHÔNG ĐỔI NGÀNH");
        x.showProfile(); // EM KHÔNG ĐỔI NGÀNH
        checkObjectV7().showProfile(); // AHIHI
    }
  
    public static void checkObject() {
        
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
    
    // Kiểm tra việc new trùng thông tin xem sao?
    public static void checkObjectV1() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);       
        Student s2 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        s1.showProfile();
        s2.showProfile();
        
        // Chứng minh 2 new là 2 object khác nhau, 2 vùng clone khác nhau, dù đổ info giống nhau.
        // Ở ngoài đời: vào tiệm sách, tô tượng, chọn 2 tượng "giống nhau", nhưng vẫn là 2.
        s1.setName("DỖI RỒI, KHÔNG HỌC BÀI!!!");
        s1.showProfile(); // DỖI...
        s2.showProfile(); // AN
        
        System.out.println("Check duplication if any?");
        System.out.println(s1); // gọi thầm tên em // DỖI...
        System.out.println(s2);                    // AN
    }
    
    // MẤT TỌA ĐỘ, MẤT DẤU VÙNG NEW, CÓ THỂ CÓ ĐIỀU NÀY HAY KHÔNG, NẾU CÓ THÌ HẬU TRƯỜNG DIỄN RA ĐIỀU GÌ?
    // BIẾN CÓ QUYỀN THAY ĐỔI CHỖ TRỎ!!!
    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);       
                            // object/instance/đủ info được đổ, nằm vùng nào đó trong HEAP,
                            // new trả về tọa độ vùng clone,
                            // cả nguyên dòng từ new ...; được xem là tọa độ/giá trị phức tạp.
        // con trỏ, lưu tọa độ vùng new,
        // biến object, lưu tọa độ vùng clone,
        // reference variable, tao chiếu tọa độ chỗ khác heng,
        // BIẾN CON TRỎ/OBJECT/THAM CHIẾU BẢN CHÁT LÀ CẦN TRỎ, CẦN LƯU 1 TỌA ĐỘ VÙNG NEW CLONE.
        // Vậy không ai cấm mình trỏ vùng new mới.
        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        s1.showProfile();
        // Biến có quyền thay đổi value nó lưu trữ, vì thay đổi value nên nó mới là biến,
        // variable - sự biến đổi.
        // sếp -> CaSi Sơn Tùng...;
        // sếp -> là "gã" trả lương, đánh giá KPI làm việc của mình.
        // s1 li dị AN chơi với BL,
        // biến object thay chỗ trỏ, chiếu, tọa độ,
        // tao cần lắm luôn 1 tọa độ vùng new.
        
        // Tôi muốn lấy lại vùng clone AN thì sao, mất dấu rồi???
        // Lưu ý: khi 1 object/vùng new clone không có ai trỏ tới, mất con trỏ,
        // do con trỏ gán qua vùng new khác, thì ta mất dấu tọa độ vùng new cũ,
        // Java: JVM máy ảo chạy bên Windows, giám sát vùng ram app viết bằng Java, có cà chớn không, giết app, gửi cảnh báo khi chơi try-catch,
        // có vùng new mồ côi nào không, vùng không có con trỏ, HEAP có object nào không có con trỏ hay không.
        // Bộ phận giám sát này của máy ảo Java gọi là Công Ty Môi Trường Đô Thị,
        // GARBAGE COLLECTOR, clear, available cho new clone khác,
        // free(con trỏ bên C - free vùng malloc() calloc()) HEAP.
        // Việc clear ram HEAP của Java diễn ra định kì, bao nhiêu giây, phút...
        // Tuy nhiên mình có thể gọi ngay luôn.
        System.gc();
    }
    
    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);       
        
        // Trước khi s1 chơi với BÌNH, không muốn mất AN,
        // vậy cần ghi ra đâu đó cái tọa độ vùng new của AN,
        // trước khi đãng trí quên tên, thì ghi ra giấy, danh bạ.
        Student x = s1;
        // x là biến object, tao rất rất cần tọa độ 1 vùng new.
        // Tự new oke, nhưng có thằng nào new trước rồi chưa, cho tao cùng chơi với,
        // cho tao tọa độ đi, tao không new nữa.
        // x trỏ đến AN ở trên.
        
        s1.setName("EM KHÔNG TIN THẦY");
        
        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        // s1 đã bỏ AN, đi với BÌNH,
        // x đang là AN của ngày hôm qua, xưa cũ bị s1 ruồng bỏ.
        s1.showProfile(); // BÌNH LÊ
        x.showProfile(); // AN NGUYỄN NHƯNG BỊ THAY THÀNH EM KHÔNG TIN THẦY.
        
        System.out.println("Check thầy LUÔN đúng");
        s1.setName("AHUHU, THẦY LUÔN ĐÚNG");
        x.showProfile(); // EM KHÔNG TIN THẦY
        s1.showProfile(); // AHUHU,...
    }
    
    // HAI CHÀNG THEO/TRỎ 1 NÀNG.
    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);       
        Student s2 = s1; // 2 thằng cùng nhìn 1 hướng tọa độ, 2 chàng trỏ 1 nàng.
        // s1, s2 cùng lưu 1 tọa độ, cùng trỏ vùng new clone AN.
        s1.setName("ANH CỤC SÚC");
        
        s2.showProfile(); // CỤC SÚC
        s1.showProfile(); // CỤC SÚC
        
        // sếp
        // sky              ---> CaSi Sơn Tùng
        // anh lạc trôi
        
        // an-game
        // tèo              ---> BẠN NÀO ĐÓ       
    }
    
    public static void checkObjectV5() {
        //Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        
        // Object vô danh, sinh ra mà không thèm đặt tên, chỉ khóc 1 tiếng rồi pass away.
        //s1.showProfile();
        // s1 chấm tức là vào vùng tọa độ chấm để làm gì đó.
        // new ... cũng chính là tọa độ, được đẩy cho s1, s1 và new ... là như nhau.
        // s1 chấm cũng như new chấm.
        
        new Student("SE666789", "AHIHI", 1999, 8.9).showProfile();
        // cờ hó chạy ra đường không có ông chủ cầm xích, Exciter hốt luôn.
        // Không có con trỏ, óe lên 1 lần, rồi chết bởi Garbage Collector.
        // Object vô danh, anonymous object.
        // Muốn reuse object, chấm nhiều lần thì phải có tên gọi.
    }
    
    // KHAI BÁO BIẾN RỒI GÁN SAU.
    public static void checkObjectV6() {
        Student s1; // tớ với cậu sẽ nói xấu dìm hàng 1 thằng bạn heng.
                    // s1 là đứa tao với mày sẽ chơi nó, troll, lên confession.
                    // s1 cần lắm luôn trỏ vùng new, sẵn sàng để trỏ.
        // Thằng đó đây, giờ trỏ nè.
        s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        
        s1.showProfile();
    }
     
    // HÀM TRẢ VỀ OBJECT, KHÔNG TRẢ PRIMITIVE.
    // Đọc đúng phải là: hàm này trả về tọa độ của 1 object đã new đâu đó.
    //            Student x = ...;
    //            Student s1 = ...;
    //            int a;
    //            int f(); sqrt(); // tên hàm là 1 biến vì nó tương đương 1 giá trị.
    // Tên hàm này cũng là 1 biến/biến object.
    // Giá trị của hàm này, biến này là tọa độ vùng new nào đó.
    public static Student checkObjectV7() {      
        Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        // s1 em đang nắm tọa độ vùng new clone trong HEAP đó anh.
        return s1; // em ném cái tọa độ đó vào tên hàm,
                   // tên hàm là tọa độ, Student f() mà, f() là tọa độ mà,
                   // 2 chàng trỏ 1 nàng new, f() và s1 cùng trỏ new.
        // Từ trong hàm đã ném được tọa độ vùng new clone HEAP ra ngoài,
        // lát hồi hàm chạy xong, mất mẹ nó biến s1 vì s1 nằm trong STACK.
    }
    
}