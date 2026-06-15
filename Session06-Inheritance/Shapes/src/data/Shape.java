package data;

// Là khái niệm chung cho mọi loại hình nào đó: Vuông, Tròn, Chữ Nhật, Tam Giác, Hình Bình Hành...
public abstract class Shape {
    
    protected String owner;
    protected String color;
    protected String borderColor;
    
    // Thêm cạnh a, b, c, radius, rất vô duyên.

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
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

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    
    // Hình nói chung sẽ có S, P. Vấn đề là tính thế nào? Tùy hình mà tính, không thể nói cụ thể được lúc này.
    // S, P là 1 khái niệm đề cập đặc tính và hành vi của Hình Học nói chung,
    // nó là chung chung, không cụ thể.
    // Cụ thể để mỗi hình Tròn, Vuông, CN, HBH sẽ lo.
    // Nói về ý tưởng, gọi là abstract.
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();
    
}
