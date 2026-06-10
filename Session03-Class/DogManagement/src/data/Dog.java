package data;

// Trong Khuôn chứa các chi tiết mô tả object, vd:
// Tượng có chiều cao, chiều cao đế...
// CMND/CCCD cũng là Khuôn để chứa các info mô tả công dân,
// CaSi là Khuôn chứa các info mô tả mọi object đi hát,
// TEMPLATE, FORM, ...
// Khuôn thì phải kín, code phải viết trong class.

// Nhóm các bạn Dog chia sẻ chung nhiều đặc điểm: tên:___; cân nặng:___;
public class Dog {
    private String name;   //___
    private int yob;       //___
    private double weight; //___
    
    // Phếu dùng để rót/chế/đổ/fill vật liệu đưa vào, lấp đầy các chi tiết chừa sẵn chỗ bên trong.
    // Khuôn rỗng ở các chi tiết.
    public Dog(String iName, int iYob, double iWeight) {
        name= iName;
        yob = iYob;
        weight = iWeight;
    }
}
