package data;

// Trong Khuôn chứa các chi tiết mô tả object, vd:
// Tượng có chiều cao, chiều cao đế...
// CMND/CCCD cũng là Khuôn để chứa các info mô tả công dân,
// CaSi là Khuôn chứa các info mô tả mọi object đi hát,
// TEMPLATE, FORM, ...
// Khuôn thì phải kín, code phải viết trong class.
// Khuôn là hình dáng của 1 object sẽ xuất hiện trong tương lai, chứa đựng đặc tính/đặc điểm và hành vi (xử lí info - hàm).

// Nhóm các bạn Dog chia sẻ chung nhiều đặc điểm: tên:___; cân nặng:___;
public class Dog {
    private String name;   //___
    private int yob;       //___
    private double weight; //___
    
    // Phếu dùng để rót/chế/đổ/fill vật liệu đưa vào, lấp đầy các chi tiết chừa sẵn chỗ bên trong.
    // Khuôn rỗng ở các chi tiết.
    // Phễu là 1 hàm rất đặc biệt, nó xử lí: ép dòng dữ liệu/vật liệu chảy vào đúng chỗ bên trong - có xử lí - hàm theo quan điểm của lập trình.
    // Mỗi lần gọi phễu, sử dụng phễu tương đương việc đúc 1 bức tượng mới, tạo 1 object mới.
    // Lưu ý hàm này tên phải trùng 100% tên class, chữ hoa từng đầu từ - quy ước.
    // Tên hàm phễu không có giá trị trả về, không được có VOID, vì VOID sẽ nhầm lẫn với các ứng xử/hành động của object.
    // Hàm phễu nhận vật liệu vào, chờ khô, ra được chính object thuộc nhóm Dog đang đề cập,
    // trả về ngay object sẽ được tạo trong tương lai, đúng không gian mình đang đứng đã là object,
    // không cần giá trị trả về, thậm chí không được dùng void,
    // trong khi đó nhờ phễu ra chính object này.
    public Dog(String iName, int iYob, double iWeight) {
        name= iName;
        yob = iYob;
        weight = iWeight;
    }
    
    // sủa() là hành động của object Dog.
    // speak() là hành động của Person.
    // scanChannel() là hành động của Tivi, showMovie().
    public void bark() {
//        System.out.println("gogogo... my name is " + name);
//        System.out.println("gogogo... my yob is " + yob);  

        System.out.printf("|GOGO|%-10s|%4d|%4.1f|\n", name, yob, weight);
    }
    
}
