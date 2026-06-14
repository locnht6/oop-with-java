package data;

// OOP: Object Oriented Programming/Paradigm
public class Rectangle {
    
    private String owner;
    private String color;
    private double width;
    private double length;
    private double area; // = width * length
    // Nếu ta xem S là đặc điểm của miếng đất HCN, điều này không sai nhưng...
    // area được tính toán bởi đặc tính khác, area -> derived attribute/field - đặc điểm/đặc tính dẫn xuất.
    // Chơi với field dẫn xuất, coi chừng tính bất đồng bộ, inconsistency,
    // dữ liệu không nhất quán: đổ qua phễu w = 5, l = 10, area = 300 là toang.
    // Không chơi đổ từ phễu, ghi area = w * l lúc khai báo, tự tin chưa,
    // nhưng nếu ta setW(cạnh mới) mà quên cập nhật lại S là toang.
    
    // Bản chất: area là liên quan đến tính toán, không có sẵn, tức nó là hàm xử lí data,
    // vậy hàm phải thuộc về object phù hợp, việc tính S() là hàm của HCN là hoàn toàn hợp lí,
    // ai có nhiều info, gã đó nên xử lí thông tin này thay vì để kẻ khác.
    
    public Rectangle(String owner, String color, double width, double length) { // đổ area vào, kiểm tra tương thích width * length không?
        this.owner = owner;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return String.format("|%-10s|%-15s|%-15s|%4.1f|%4.1f|", "RECTANGLE", owner, color, width, length);
    }
    
    public void paint() {
        System.out.printf("|%-10s|%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n", "RECTANGLE", owner, color, width, length, getArea());
    }
    
    // Hàm soái ca loại 4, có ra có vào, reuse ở các lệnh khác.
    public double getArea() {
        return width * length;
    }
        
}
