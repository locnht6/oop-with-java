package stringclass;

public class StringClass {

    public static void main(String[] args) {
        playWithString();
    }
    
    public static void playWithString() {
        
        String s1 = new String("HELLO"); // ~~~  new Integer(2003);
        String s2 = new String("HELLO");
        
        String s3 = "HELLO"; // Khuyến khích viết cách này, tự nhiên.
        String s4 = "HELLO"; // new String ngầm.
        String s5 = "Hello";
        
        // Hỏi:
        // s1 có bằng s2 không?
        System.out.println("s1 == s2? " + (s1 == s2)); // false
        
        // s2 có bằng s3 không?
        System.out.println("s2 == s3? " + (s2 == s3)); // false
        
        // s3 có bằng s4 không?
        System.out.println("s3 == s4? " + (s3 == s4)); // true
        
        // CHUỖI NEW NGẦM LÀ POOL
        
        // s4 có bằng s5 không?
        System.out.println("s4 == s5? " + (s4 == s5)); // false
        // POOL CHẢNH, PHÂN BIỆT HOA THƯỜNG.
        
        // CHO NÊN CÙNG 1 KẾT LUẬN: KHÔNG SO SÁNH 2 CHUỖI QUA TOÁN TỬ BẰNG BẰNG,
        // VÌ LÚC ĐÚNG LÚC SAI DO CHUNG POOL HAY KHÔNG.
        // SO 2 BIẾN OBJECT LÀ VÔ NGHĨA.
        // BẮT BUỘC VÀO VÙNG NEW MÀ SO SÁNH, CHẤM ĐỂ MÀ SO SÁNH
        // .compareTo() .equals()
        
        // MỌI OBJECT MÌNH TẠO RA HAY NGƯỜI TA TẠO SẴN RA THÌ LUÔN NÊN CÓ 2 HÀM ỨNG VỚI 2 LOẠI CÂU HỎI:
        // TAO BẰNG MÀY KHÔNG? TAO.EQUALS(MÀY)
        // TAO SO VỚI MÀY NHƯ THẾ NÀO? TAO.COMPARETO(MÀY)
        // CHẤM ĐỂ SO BÊN TRONG,
        // HÀM Ở CHỖ CÓ DATA THÌ TIỆN XỬ LÍ.
        
        System.out.println("s4 vs s5 (core): " + s4.equals(s5)); // false
        
    }
    
}
