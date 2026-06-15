package data;

// 1. IS A
// 2. Đặc điểm: Con trùng hoàn toàn Cha, gửi Cha giữ hết khỏi làm gì.
//              Con dị biệt, làm như bình thường.
// 3. Phễu, nhớ thỏa hiệp nếu cần, đổi thứ tự biến cho thuận chiều.
// 4. Hàm của Con: có quyền làm dị biệt như bình thường (ảnh hưởng tổ lái con trỏ).
//    Phiên bản kế thừa Level 1 chưa xài abstract thì Con chỉ làm phễu là xong
//    xài 100% ở Cha, ngứa tay muốn qua mặt cứ làm @Override, dị biệt thích thì làm.

// CLASS CON THỪA KẾ TỪ CHA SHAPE, CHA NÀY LÀ ABSTRACT, CHO NÊN CON CHỈ CÓ 2 LỰA CHỌN DUY NHẤT:
// 4.1. Con làm biếng không thèm làm điều Cha nói, không thèm viết code cho hàm abstract của Cha,
//      tức là Con lúc này chứa hàm abstract từ Cha, nếu class chứa hàm abstract thì chỉ là khái niệm, mày không hoàn hảo.

// Nếu 1 class là abstract giống như bản Concept vậy không thể vận hành 1 cách hoàn hảo được, 
// do đó nó KHÔNG THỂ NEW ĐỂ TẠO OBJECT.
// Cha không thể new vì chưa hoàn hảo, Con cũng thể, không new, DÒNG HỌ VÔ SINH, KHÔNG ĐÚC ĐƯỢC OBJECT.

// 4.2. Vì bài này HCN là rõ ràng có 2 cạnh rất cụ thể, tính được ngay S, P, sợ gì mà không viết code.
// Con phải có trách nhiệm hoàn tất điều Ba nói, viết code cho hàm abstract,
// vì nếu không làm thì nó vô sinh, không new được do không hoàn hảo,
// new xong rồi chấm getS() làm gì có code mà chạy.
// Con nếu không muốn vô sinh, thì PHẢI VIẾT CODE CHO TẤT CẢ HÀM ABSTRACT CỦA CHA,
// IMPLEMENT ALL OF PARENT'S ABSTRACT METHODS.
// implement the body of a function, the body of parent's abstract methods.
// @Override

// TA KHÔNG ĐEM BÁN, SỬ DỤNG ĐIỀU KHÔNG HOÀN HẢO.

public class Rectangle extends Shape {
    
    private double a, b; // width, length.

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    // Phần dị biệt thì con phải làm.
    // CÁC VUA HÙNG ĐÃ CÓ CÔNG DỰNG NƯỚC, BÁC CHÁU TA PHẢI CÙNG NHAU GIỮ NƯỚC.
    // BA: TAO CHỈ NÓI VẬY, MÀY MUỐN LÀM SAO THÌ LÀM, ĐÂY, CON LÀM NÈ.
    
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", "RECTANGLE", owner, color, borderColor, a, b, getArea());
    }
    
}
