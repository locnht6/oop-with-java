package parentchild;

public class ParentChild {

    public static void main(String[] args) {
        
        playWithPointer();
        
    }
    
    public static void playWithPointer() {
        
        Parent p = new Parent("BIỆT THỰ", "1000 BTC");
        p.showProfile();
        // p. // Xổ tất cả của Cha.
        
        Child c1 = new Child("CĂN HỘ", "100 BTC");
        c1.showProfile();
        // c1. // Xổ tất cả của Con (Cha cho + @Override + thêm khác nữa!).
        c1.sayHello();
        
        Parent c2 = new Child("NHÀ PHỐ", "100 ETH");
        c2.showProfile(); // Gọi Cha nhưng chạy Con - @Override, để Con lái xe.
        // c2.sayHello(); // Không xổ ra của riêng Con dù đã new Con và có sẵn trong RAM luôn.
        // Mình đang cư xử như Cha, dùng danh nghĩa Cha, mày biết Cha tao là ai không?
        // Hù theo kiểu của Cha, tuân theo hành động của Ba.
        // Khai báo kiểu Cha, chấm theo Cha.
        // HV đang cư xử như HCN.
        // Con đang dùng danh nghĩa Cha, thì phải cư xử như Cha.
        // Tổ lái con trỏ xuống đáy vùng new Con sẽ lấy được hàm sayHello().
        // Cách 1:
        // Child x = cần trỏ vùng new Con.
        Child x = (Child)c2; // Mày hãy ráng xuống vùng new Child lấy cho tao cái tọa độ vùng new Child,
                             // tao giữ lại trong x.
        x.sayHello();
        
        // Cách 2: nương theo cách 1, nhưng không tốn 1 con trỏ Child.
        // (Child)c2. // Không xổ vì dấu chấm có độ ưu tiên cao, ăn theo data type.
        ((Child)c2).sayHello(); // Dấu ngoặc thay đổi độ ưu tiên, ép xong đi đã rồi hãy chấm,
                                // kéo sợi thun xong chưa, xong rồi đó.
                                // Miễn là lấy được tọa độ thì chấm, tọa độ gán vào biến chấm thì quá tầm thường.
                                
    }
    
}
