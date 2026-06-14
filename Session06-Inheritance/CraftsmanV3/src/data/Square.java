package data;

// Phát hiện 1 điều thú vị: HV IS A (KIND OF), A SPECIAL CASE, A VERSION HCN.
// Nói ngắn gọn: HV là HCN, luôn đúng, đọc 1 chiều thôi, HV dư sức tham dự vào mảng HCN.
// Độ lại 1 Khuôn mới từ Khuôn cũ, mới có được câu HV là phiên bản mới từ HCN.
// HV là HCN, Khuôn HV rõ ràng là 1 dạng Khuôn HCN,
// V, HCN cùng nhà, chung mảng, for sắp xếp được.
// Cách tiếp cận sự tương đồng giữa các Khuôn, kế thừa dùng lại - INHERITANCE/INHERIT.
// Viết theo cách cũ: 2 Khuôn độc lập, không chung mảng.
//               mới: 2 anh em về chung 1 nhà.
// Kế thừa chỉ dành cho gần gũi người nhà, series phiên bản,
// HCN gọi tên là class Cha, parent, super, base, phiên bản gốc.
// HV gọi tên là class Con, child, sub, derived.
// HV là HCN, cho nên HV sẽ có tất cả mọi thứ mà HCN có, không cần viết lại code.
// HV là HCN, nó phải hành xử như HCN, hàm xài lại luôn.
// Kế thừa không phải là copy % paste, đây là cách lười gõ.
// Kế thừa là xài lại 100% không cần gõ lại code - đúng ngoài đời luôn.

// 1. Khi chơi với kế thừa, phải tôn trọng phễu gốc của Con,
// Vuông trước khi chơi với Rectangle, Vuông vẫn là Vuông, phễu có 3 tham số,
// để đúc 1 V: owner, color, edge.
// Phễu V vẫn cần, Khuôn cần có phễu để nhận vật liệu, phễu chảy thẳng lên CN, vì V là CN,
// dữ liệu của V chính là dữ liệu CN.

// 2. Nhân tử chung

public class Square extends Rectangle{
    
    // HV là HCN, không cần làm lại những gì HCN đã làm, không cần field, HCN có rồi.
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
        // Dung hòa cha con, HV có cạnh edge chính là HCN có cạnh edge, edge.
    } // super chính là ~~~ new Rectangle(o, c, w, l);
      // đẩy/đổ vật liệu cho Cha giữ giùm, vì không cần làm lại.
      // new Square() => cắt HV, tạo HV chính là cắt HCN,
      // new Square() chính là new HCN(), cắt HV, chính là cắt HCN.
    
    // Con có hàm trùng tên 100% với hàm Cha,
    // Con qua mặt Cha, phủ quyết, vờ như không thấy hàm Cha,
    // đặc trưng cho 1 thứ gọi là tính đa hình, đa xạ, đa ánh xạ, đa nhân cách,
    // 50 sắc thái, transformer, POLYMORPHISM.
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-15s|%-10s|%4.1f| -- |%7.2f|\n", "SQUARE", owner, color, width, getArea());
    }
    
}
