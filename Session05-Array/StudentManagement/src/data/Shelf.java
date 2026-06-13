package data;

import java.util.Scanner;

public class Shelf {

    // Đặc điểm của 1 cái tủ bất kì là gì: màu sơn:___; giá tiền:___; nhà sản xuất:___;
    // số ngăn/không gian chứa đồ:___các món đồ nhét vào;
    // món đồ là object, chứa nhiều đồ, nhiều object, rõ ràng đến thời điểm này là ta cần mảng object,
    // tủ sẽ chứa 1 list/mảng/danh sách các đối tượng,
    // ứng dụng của mảng, góp phần tạo dựng nên object khác.
    // OOP: tìm các object, chúng phối hợp, trộn nhau.
    private String color;
    private String label; // tủ chén, tủ hồ sơ

    // chứa cái gì?
    private Student[] ds = new Student[300];
    private Scanner sc = new Scanner(System.in);
    private int count = 0; // mới mua tủ về, số hồ sơ = 0,
                           // nhét thêm 1 hồ sơ thì count++,
                           // chơi mảng object chỉ for đến count.

    // Tui có không gian chứa info, tui sẽ giải quyết việc nhập xuất.
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }
    
    // DATA + HÀM XỬ LÍ CỦA TỦ NHÂN CÁCH HÓA, TOÀN BỘ SẼ LÀ NON-STATIC,
    // NẾU KHÔNG CÁC TRƯỜNG ĐẠI HỌC, BỘ MÔN XÀI CHUNG DANH SÁCH SINH VIÊN LÀ TOANG,
    // ĐỒ ĐẠC, HÀNH XỬ PHẢI THUỘC VỀ OBJECT.

    public void inputAStudent() {

        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");
        id = sc.nextLine(); // TODO: kiểm tra id trùng

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        ds[count] = new Student(id, name, yob, gpa);
        count++;
        System.out.println("Add student successfully!");
        
    }
    
    public void printStudentList() {
        
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile(); // for hết là toang!!!
        }
        
    }
    
    public void searchAStudent() {
        
        // search là quét/duyệt/đi từ trái sang phải lôi cổ từng SV[i] ra,
        // hỏi hắn mã số mày là mấy?
        // so sánh với mã số muốn tìm? nếu == mã số of SV[i] SV[i].getId() báo tìm thấy,
        // còn tìm hết không thấy thì báo rằng not found.
        // THUẬT TOÁN TRÂU BÒ/VÉT CẠN/TÁT CẠN.
        String id;
        
        System.out.print("Input the id that you want to search: ");
        id = sc.nextLine();
        
        for (int i = 0; i < count; i++) { // đi đến chỗ đổ cuối cùng thôi heng.
            if (ds[i].getId().equalsIgnoreCase(id)) {
                // tìm thấy tại vị trí [i].
                System.out.println("Student found!!! Here she/he is");
                ds[i].showProfile(); // in kết quả liền.
                return; // tìm thấy thì dừng hàm luôn, không for gì nữa.
            }
        }
        
        // Sống sót đến đây, sure, không có thấy id cần tìm, nếu thấy đã dừng sớm ở trên rồi,
        // đi hết for mà không thoát được, báo không thấy.
        System.out.println("Student not found!!!");
        // Dùng biến flag phất cờ nếu thấy và không, if () in ra câu gì.
        
    }
 
}
