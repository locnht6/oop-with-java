package wrapperclass;

public class WrapperClass {

    public static void main(String[] args) {
        
        //playWithIntegers();
        //playWithPointers();
        playWithPool();
        
    }
    
    public static void playWithIntegers() {
        
        int n1 = 2003; // 4 byte
        Integer n2 = new Integer("2003"); // 2 vùng ram đó heng
        Integer n3 = new Integer(2003); // 2 vùng ram
        Integer n4 = 2003; // new ngầm, vẫn 2 vùng ram
        // Tự nhiên hơn, vẫn phải new ngầm.
        // n2, n3, n4 trỏ 3 vùng ram new Integer, lõi vùng new là int 2003.
        
        // In thì sao?
        System.out.println("n1: " + n1); // primitive, xài luôn
        System.out.println("n2: " + n2); // gọi thầm tên em
        System.out.println("n3: " + n3.toString());
        System.out.println("n4: " + n4.intValue());
        
        // Integer n4 = 2003;
        Integer n5 = n1; // CPU xử lí giống nhau, new ngầm Integer(),
        // nhét vào trong lõi Integer vùng new á, con số int 2003 core/lõi.
        // Cơ chế boxing/đóng hộp: khi ta gói cái primitive -> object.
        System.out.println("n5: " + n5); // gọi thầm tên em.
        
        // int n6 = 2003; // primitive
        int n6 = n5; // chuyện gì? Mở hộp quà
        // Unboxing: khi ta mở hộp, lấy value lõi để gán ra primitive,
        // vẫn tương thích, phù hợp.
        // Unboxing: object -> primitive.
        System.out.println("n6: " + n6);
        
        // Integer n5 = n1; // trỏ vùng new 2003 riêng của nó.
        n5 = 2000; // điều gì diễn ra trong ram?
        // vùng new mới Integer(lõi 2000),
        // không quan tâm vùng new Cũ (2003)
        // int yob = 2003; yob = 2000; // vẫn vùng ram cũ, ON-OFF lại.
        // Vậy thì Integer không có khái niệm Set(), tức là mỗi lần gán value là 1 lần new mới,
        // không xài lại vùng new cũ.
        // Không có cơ chế Set() lại cái gì đã đổ lúc new, không cho phép thay đổi value lõi,
        // tức là read-only, chỉ đọc, không cho chỉnh sửa.
        // Integer chỉ có hàm get() không hàm set()
        // Một class bất kì nào khác, kể cả Integer, mà chỉ có hàm get() không có hàm set(),
        // không có hàm cho thay đổi bên trong, ngoại trừ lúc đúc, class read-only đặc điểm,
        // thì class này được gọi là Immutable Class.
        // Class nào mà cho phép thay đổi value đã được đúc, gọi là Mutable Class.
        
        // CÓ TỔNG CỘNG 8 CÁI WRAPPER/TRAI BAO CLASS ỨNG VỚI 8 THẰNG PRIMITIVE.
        // Byte     Short       Integer     Long        Float       Double      Boolean     Character
        // byte     short       int         long        float       double      boolean     char
        
    }
    
    // Học về so sánh 2 object, học về vùng new.
    public static void playWithPointers() {
        
        int n0 = 2003;
        int n00 = 2003;
        // Hỏi: n0 có bằng n00 không?
        if (n0 == n00)
            System.out.println("2 thằng này n0 và n00 bằng nhau");
        else
            System.out.println("2 thằng này n0 và n00 không bằng nhau");
        
        Integer n1 = new Integer("2003");
        Integer n2 = new Integer(2003); // không khuyến khích
        Integer n3 = 2003; // khuyến khích
        Integer n4 = 2005;
        
        // Hỏi:
        // n3 có bằng n4 không?
        // So sánh 2 tọa độ, 2 địa chỉ vùng new khác nhau,
        // đi so sánh 2 biến object, biến con trỏ làm sao được.
        if (n3 == n4)
            System.out.println("2 thằng này n3 và n4 bằng nhau");
        else
            System.out.println("2 thằng này n3 và n4 không bằng nhau");
        // Nhưng bản chất lõi là bằng nhau vì cùng 2003.
        // Chốt hạ: cấm tuyệt đối không dùng toán tử so sánh truyền thống:
        // > >= < <= == khi đem đi so sánh 2 biến object/biến tham chiếu/con trỏ.
        // Muốn so sánh 2 biến, không nên, mà phải vào bên trong vùng trỏ đó coi có value gì để mà so sánh thì mới hợp lí.
        
        // n3 ơi mày có value gì vậy, tao muốn so sánh với value của n4,
        // đi vào vùng new mà SO SÁNH.
        // SO BÊN TRONG VÙNG NEW MỚI LÀ ĐÚNG, VÌ SO SÁNH ĐẶC ĐIỂM, CHỨ AI ĐI SO SÁNH NICK NAME.
        
        // ĐI VÀO VÙNG NEW TỨC LÀ CHẤM . LẤY VALUE LÕI, CÂU HỎI EQUALS() COMPARETO()
        // N3. N4.
        // VIỆC SO SÁNH DIỄN RA Ở ĐÂU - HÀM SO SÁNH() ĐẶT Ở ĐÂU?
        System.out.println("n3 vs n4 (core): " + n3.equals(n4));
        System.out.println("n3 vs n4 (core): " + n3.compareTo(n4));
        
    }
    
    // Pool là 1 vùng ram chứa các vùng new của Wrapper, String,
    // giống như hồ bơi ngoài đời, nhiều object tắm chung,
    // chỉ áp dụng kĩ thuật hồ bơi trong 1 số tình huống đặc biệt, không nhầm với static
    public static void playWithPool() {
        
        Integer n1 = new Integer("2000");
        Integer n2 = new Integer(2000); // ít dùng, từ JDK 10 trở đi không nên
        Integer n3 = 2000;  // cả 2 boxing
        Integer n4 = 2000;
        
        // n3 có bằng n4 không? Hỏi con trỏ thôi, so sánh địa chỉ thôi.
   
        System.out.println("n3 == n4: " + (n3 == n4)); // 2 vùng new khác nhau
        
        // Không bằng về con trỏ, nhưng bằng về value bên trong, vào trong mà so sánh
        System.out.println("n3 == n4(core): " + n3.equals(n4)); // 2 vùng new khác nhau, nhưng value lõi = nhau => true.
        
        // n2 vs n3: n2 có bằng n3 không, n1 với n2 có bằng nhau không?
        // 4 thằng không bằng nhau về con trỏ, value của card, thẻ bài,
        // mỗi thằng là thẻ bài, ghi địa chỉ vùng new, trỏ new khác nhau mà,
        // KHÔNG BẰNG VỀ CON TRỎ, KHÔNG TRỎ CHUNG,
        // CHỈ BẰNG BÊN TRONG LÕI!!!
        System.out.println("n1 == n2? " + (n1 == n2)); // false
        System.out.println("n2 == n3? " + (n2 == n3)); // false
        
        // GÁN MỚI TRỎ MỚI VÌ READ-ONLY, IMMUTABLE CLASS
        
        // VI DIỆU:
        Integer n5 = 127;
        Integer n6 = 127;
        // n5 bằng n6 không? so con trỏ thôi, lõi thì bằng nhau rồi.
        // -129-false, -128-true ... 0-true ... 127-true, 128-false
        // True: [-128, 127] [-2^7, 2^7 - 1] - khoảng giá trị của byte.
        // Chơi new ngầm trong đoạn -128 đến 127 thì xài Pool.
        // n5 = 127 => ~~~ new ngầm Integer(127)
        // n6 = 127 => không new ngầm, xài ké 127 ở trên, 2 chàng 1 nàng.
        // n7 = 127 => mình tắm chung nhé, 3 chàng 1 nàng.
        System.out.println("n5 == n6? " + (n5 == n6)); // true
        Integer n7 = 127; // POOL
        System.out.println("n5 == n7? " + (n5 == n7)); // true
        
        // Có 256 vùng new [-128, 127] dùng chung cho n biến Integer,
        // nếu xài kiểu boxing new ngầm.
        
        Integer n8 = new Integer(127); // tọa độ khác
        
        // hỏi n7 và n8 có bằng nhau không?
        System.out.println("n7 == n8? " + (n7 == n8)); // false
        
        Integer n9 = new Integer("127");
        System.out.println("n8 == n9? " + (n8 == n9)); // false
        // Không xài pool, tọa độ khác rồi
        
        // CHỐT HẠ: CẤM TUYỆT ĐỐI SO SÁNH 2 BIẾN OBJECT QUA TOÁN TỬ ==,
        // VÌ ĐI SO SÁNH 2 ĐỊA CHỈ, LÚC BẰNG LÚC KHÔNG DO CÓ POOL HAY KHÔNG,
        // CHÍNH XÁC PHẢI SO SÁNH 2 OBJECT QUA DẤU CHẤM, VÀO TRONG LẤY DATA MÀ SO,
        // CHẤM ĐỂ SO SÁNH OBJECT!!!
        
    }
    
}
