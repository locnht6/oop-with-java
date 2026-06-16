package amazingracev3;

import data.*;

public class AmazingRaceV3 {

    public static void main(String[] args) {
        runToDead();
    }
    
    public static void runToDead() {
        
        // CÓ QUYỀN CÓ AI ĐÓ CHẠY NGANG NHẢY VÔ ĐUA LUÔN,
        // MĨ NHÂN NGƯ CỦA CHÂU TINH TRÌ NHẢY VẢO.
        
        Dog d1 = new Dog("NGÁO ĐÁ", 2026, 50.0);
        // Chấm full hàm của Con, đủ code hàm Cha, hàm CLB.
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        // Chầm full hàm Cha, khai Cha, chạy không sợ vì đa hình Con qua mặt,
        // tổ lái con trỏ được, new Dog mà sợ gì.
        // Tao là "danh nghĩa Cha" thì chỉ xổ Cha thôi,
        // mày biết Bố tao là ai không? Hù theo kiểu Bố.
        
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        // Ngộ nhỡ dấu chấm thì sao?
        // chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        // tao là đua thủ chỉ quan tâm đua thôi.
        // Chạy không sợ vì Con qua mặt, có đủ hàm @Override đã làm rồi, đa hình tiếp.
        // Ép con trỏ được luôn, vì vẫn là new Dog mà sợ gì.
        
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");
        
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2};
        // racer[0] = new Dog(...);
        // racer[1] = new Motor(...);
        // Toàn bộ là DeadthRacer, đa hình là đa hình trên runToDead() showHowToDead()
        // Con tự lo, Con Motor chạy theo Motor, Con Dog chạy theo Dog.
        
        System.out.println("The racing records");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
        
    }
    
}
