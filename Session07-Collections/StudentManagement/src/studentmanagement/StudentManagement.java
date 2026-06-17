package studentmanagement;

import java.util.ArrayList;
import java.util.List;
import data.Student;

public class StudentManagement {

    public static void main(String[] args) {
        playWithArrayList();
    }
    
    public static void playWithArrayList() {
        
        // Student[] arr = new Student[500];
        
        // arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô,
        // món đồ phải đi mua, new, thảy vào.
        // Tên mảng chính là má mì, quản lí nhiều đồ, tên túi luôn.
  
        // List arr = new ArrayList(); // đựng lộn xộn đủ loại con trỏ,
        // đúng nghĩa túi Doraemon, món gì cũng đựng, đựng tham chiếu thôi heng,
        // nhét được NhanVien, GiangVien, Animal, Dog, ....
        
        // Túi đồng nhất chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList(); // túi đựng đồng nhất 1 loại, GENERIC.
        
        // List<Student> arr = new ArrayList<>();
        // List<Student> arr = new ArrayList<Student>();
        // arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ.
        // Nhét đồng nhất món đồ dễ chấm chung được, đa hình được.
        
        // Mở ngăn tủ, túi, nhét đồ vô
        // arr[i] = new Student(...) // mảng
        // arr.add(new Student(...)); // lưu con trỏ thôi, new Student() thoải mái bên ngoài, trong vùng HEAP.
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        arr.add(s1); // giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ.
        // 2 chàng 1 nàng.
        arr.add(s2); // sinh ra thêm con trỏ nữa [1]
                     // add() vô tận, mảng [length - 1] hết mức
                     // new cứ nằm HEAP, SV cứ ở nhà, CN cứ ở xưởng, BN cứ ở phòng điều trị.
        // add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài, sinh ra con trỏ.
        arr.add(s1); // add trùng nè, 1 tên người vào danh sách.
        // Set không báo lỗi, nhưng chỉ lấy 1.
        
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.0));
        // new cứ lên HEAP mà nằm, Bệnh Nhân cứ về phòng, tớ nắm thẻ bài.
        // 1 con trỏ nữa lại được add vào.
        
        // hỏi xem túi đang có bao nhiêu đồ
        // arr.length hỏi túi mà, hỏi má mì mà, tên mảng mà
        System.out.println("The bag has: " + arr.size() + " món đồ.");
        // 4 Sinh Viên in ra, nhưng thực ra chỉ có 3 Sinh Viên, do có người đếm trùng.
        
        // In mọi người ra, tủ có gì, chứa bên trong 1 đống con trỏ,
        // mảng: [i].showProfile().
        // Tủ ArrayList[con-trỏ 1, con-trỏ 2, con-trỏ 3, ... nếu add() thêm]
        // add() đẩy vào 1 con trỏ, tọa độ, thẻ bài
        // get(vị trí thẻ bài muốn lấy), trả về tọa độ con trỏ thứ i, trả về địa chỉ vùng new đang trỏ.
        // [i] lấy được tham chiếu bạn thứ i,
        // get(i) lấy được chỗ ngồi tham chiếu con trỏ thẻ bài thứ i
        // a, thẻ này trỏ bạn SV kia kìa.
        
        // in bản đầu tiên
        // arr[i].showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0); // trả về tọa độ con trỏ thẻ bài bạn thứ 0
        // trả về tọa độ gán vào biến Student khác nằm cùng tọa độ okie.
        System.out.println("The student list");
        xxx.showProfile();
        
        // bạn 1 get(0), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ cùng làm gì
        arr.get(1).showProfile(); // trả về con trỏ.
        
        System.out.println("In xịn sò");
        for (Student x : arr) { // Không sợ NULL POINTER add() đến đâu thêm con trỏ đến đó.
            // x = arr.get(i) = arr[i]
            x.showProfile();
        }
        
        System.out.println("In xịn sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            // arr[i].showProfile();
            arr.get(i).showProfile();
        }
        
        // Có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, món đồ, gạch tên 1 người khỏi danh sách,
        // vùng new Student() bị mất hay không tùy vào mấy con trỏ trỏ nó.
        // size() giảm liền, mảng không có, fix cứng số con trỏ.
        // set() đảo con trỏ, trỏ sang vùng khác (get() set() xưa nay của các object).
        
    }
    
}
