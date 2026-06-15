package bena;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

public class BeNa {

    public static void main(String[] args) {
        
        //playWithShapes();
        sortShapes();
        
    }
    
    public static void playWithShapes() {
        
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", "<3", 6.0);
        Shape d2 = new Disk("MÁ", "MAGENTA", "PINK", ":x", 6.0);
        
        r1.paint(); // paint() của Con - Rectangle, chạy của Rectangle.
        r2.paint(); // paint() của Cha - Shape, chạy của Con - Rectangle, Con vượt mặt.
        d1.paint(); // paint() của Con - Disk, chạy của Disk.
        d2.paint(); // paint() của Cha - Shape, chạy của Disk.
                    // Cha không có code, không lo, vì Con qua mặt.
                    // Chơi trò Khai Con new Con không ảnh hưởng,
                    //          Khai Cha new Con không ảnh hưởng.
        // Không lo lắng nếu Cha không hoàn hảo, Con cân hết,
        // paint() ở trên chính là hiện tượng đa hình - POLYMORPHISM.
        
    }
    
    public static void sortShapes() {
        
        // Sắp xêp các hình.
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MAGENTA", 5.0, 6.0);
        Shape r2 = new Rectangle("TÍA", "MAGENTA", "PINK", 6.0, 5.0);
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA", 7.0);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA", 8.0);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA", 9.0);
        ((Square)s3).sayHi();
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEUX", "<3", 6.0);
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEUX", ":x", 6.0);
        
        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEUX", 6, 8, 10);
        
        r1.paint(); // paint() của Rectangle, chạy của Rectangle.
        r2.paint(); // paint() của Shape, chạy của Rectangle.
        s1.paint(); // paint() của Square, chạy của Square.
        s2.paint(); // paint() của Rectangle, chạy của Square.
        s3.paint(); // paint() của Shape, chạy của Square.
        d1.paint(); // paint() của Disk, chạy của Disk.
        d2.paint();
        t1.paint();
        t2.paint();
        // Chấp Cha, Ông Nội thế nào, luôn luôn chạy paint() đúng ngữ cảnh.
        
        // Sắp xêp
        // Shape arr[] = new Shape[9];
        // Có 9 biến Shape đặt tên là arr[0], arr[1], arr[2]...
        // Mới có 9 con trỏ, chưa có object nào.
        // arr[0] arr[1] arr[i] = cần lắm luôn bằng, trỏ, tọa độ của vùng new Rectangle() new Disk() new Triangle().
        // Là một Shape, IS A Shape, cùng họ, cùng kiểu mới chung mảng,
        // cần tọa độ new nào đó thả vào arr[i]
        // arr[0] = new Rectangle(...);
        // arr[1] = new Disk(...);
        // arr[2] = r1; // 2 chàng trỏ 1 nàng
        
        Shape arr[] = new Shape[]{
            r1, r2, s1, s2, s3, d1, d2, t1, t2
        };
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            x.paint();
        } // GỌI ÔNG NỘI, ABSTRACT ĐÓ NHEN, NHƯNG KHÔNG SỢ,
          // VÌ TÙY CON LÀ AI, THÌ @OVERRIDE, GỌI ÔNG NỘI, NHƯNG CON CHÁU QUA MẶT TÙY TÌNH HUỐNG.
        // HIỆN TƯỢNG TỪ 1 HÀM PAINT() NHƯNG CÓ N CÁCH VIẾT CODE KHÁC NHAU Ở MỨC CON CHÁU,
        // CÓ N CÁCH CHẠY KHÁC NHAU LÚC RUN-TIME,
        // TỪ 1 HÀM PAINT() MÀ CÓ ĐẾN RẤT NHIỀU CÁCH CÀI ĐẶT/THỰC THI,
        // TỪ 1 BIẾN HÌNH, ĐA HÌNH DẠNG, ĐA CÁCH THỨC, ĐA NHÂN CÁCH, 50 SẮC THÁI, BIẾN HÓA KHÔN LƯỜNG, TRANSFORMER.
        // TỪ 1 BIẾN HÓA RA NHIỀU QUA HÌNH DẠNG @OVERRIDE.
        // HIỆN TƯỢNG NÀY, KĨ THUẬT NÀY GỌI LÀ TÍNH ĐA ÁNH XẠ, ĐA HÌNH DẠNG, ĐA SẮC THÁI, POLYMORPHISM.
        // 1 HÀM CHA (TỔ) CÓ N HÀM CON @OVERRIDE, HIỆN TƯỢNG ĐA HÌNH DẠNG.
        
        // CHA LÊN TIẾNG PAINT() ĐÁM CON HƯỞNG ỨNG LIỀN,
        // ĐẠI CA LÊN TIẾNG, ĐÀN EM XÁCH MÃ TẤU, HÀNG.
        
        // CÂU BÁC HỒ: AI CÓ SÚNG DÙNG SÚNG...
        // ĐA DẠNG CÁCH THỨC GIẾT GIẶC CỦA NHÂN DÂN.
        // HIỆN TƯỢNG ĐA HÌNH, VIỆC GIẾT GIẶC RẤT ĐA DẠNG, NHƯNG GỌI CHUNG LÀ GIẾT GIẶC.
        
        // OOP: ABSTRACTION, ENCAPSULATION, INHERITANCE, POLYMORPHISM.
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getArea() > arr[j].getArea()) {
                    Shape t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("After sorting ascending by S");
        for (Shape x : arr) {
            x.paint();
        }
        
    }
    
}
