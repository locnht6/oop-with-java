package bena;

import data.Disk;
import data.Rectangle;
import data.Shape;

public class BeNa {

    public static void main(String[] args) {
        
        playWithShapes();
        
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
    
}
