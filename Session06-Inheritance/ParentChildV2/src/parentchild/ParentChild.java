package parentchild;

public class ParentChild {

    public static void main(String[] args) {
        
        playWithPointer();
        
    }
    
    public static void playWithPointer() {
        
        Parent p = new Parent("BIỆT THỰ", "1000 BTC");
        p.showProfile();
        // p. // Xổ tất cả của Cha.
        
        Child c1 = new Child("CĂN HỘ", "100 BTC", "NEW CAR");
        c1.showProfile();
        // c1. // Xổ tất cả của Con (Cha cho + @Override + thêm khác nữa!).
        
        Parent c2 = new Child("NHÀ PHỐ", "100 ETH", "NEW MOTOR");
        c2.showProfile();
                                
    }
    
}
