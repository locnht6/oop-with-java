package data;

// Square kế thừa ai?
// Nếu kế thừa Shape? Mình phải làm những việc gì?
// extends Shape
// khai báo dị biệt, edge
// phễu, bản sắc, thỏa hiệp, đảo
// implement all abstract method, viết code cho 3 hàm

// Nếu kế thừa HCN? Ta phải làm những việc gì?
// extends HCN
// không biến dị so HCN không cần làm đặc điểm
// phễu thỏa hiệp, bản sắc, đảo thứ tự
// không cần làm gì thêm vì Cha HCN quá ổn
// nếu muốn độ lại thì cứ làm
// Shape - Ông Nội, Rectangle - Cha, Square - Con.
public class Square extends Rectangle {

    // Không cần khai báo gì thêm: V là CN có 2 cạnh == nhau.
    // Nếu muốn biến dị cứ làm.
    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    
    // Muốn in riêng, không muốn in chung với Cha Rectangle.
    @Override
    public void paint() {     
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f| -- | -- |%7.2f|\n", "SQUARE", owner, color, borderColor, a, getArea());      
    }
    
    public void sayHi() {
        System.out.println("Fightinggg!!!");
    }
    
}
