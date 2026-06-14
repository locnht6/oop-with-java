package data;

// 1. Phát hiện được IS A đọc 1 chiều, lập tức tiếp cận làm Khuôn mới kiểu mới,
// gõ extends Class Cha.

// 2. Khai báo đặc tính cho Con, nếu trùng lại với Cha, tương đồng Cha, để Cha lo,
// không cần khai báo lại đặc tính Con nếu Cha có tương đương.

// 3. Làm phễu cho Con, giữ bản sắc cho Con, tôn trọng phễu đầu vào của Con,
// sự khác biệt góc nhìn Cha và Con, Cha cần 3 cạnh, Con chỉ cần 2 cạnh vuông.

public class RightTriangle extends Triangle {

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
    } // new Con chính là new Cha, cắt TGV chính là cắt TG,
      // new Con chính là new 1 phiên bản Cha.
    
    // Con muốn qua mặt khi hắn có hàm trùng tên 100% với Cha.
    @Override
    public void paint() {
        
        System.out.printf("|%-10s|%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n", "R.TRIANGLE", owner, color, a, b, c, getArea());
        
    }
    
}

// LIÊN QUAN ĐẾN KẾ THỪA, CÓ 2 ĐIỀU:
// DI TRUYỀN: CHA CÓ GÌ CON ĐƯỢC XÀI NẤY, CHA THÊM CON THÊM, CHA BỚT, CON BỊ BỚT THEO.
// BIẾN DỊ: CON KHÁC CHA À NHEN, ĐIỀU GÌ XẢY RA - KĨ THUẬT DRIFT, RÊ BÁNH.
