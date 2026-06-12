package studentmanagement;

import data.Student;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        saveStudents();
        //inputAStudent();
    }
    
    // hard-code như mọi khi, đổ sẵn value.
    public static void saveStudents() {
        
        Student s1 = new Student("SE686868", "LỘC PHÁT", 1998, 6.8);
        Student s2 = new Student("SE682204", "BẤT TỬ", 2004, 0.4);
        
        s1.showProfile();
        s2.showProfile();
        
        // xem chấm khi có public private.
        System.out.println("Check the public/private:");
        String s1Name = s1.name;
        System.out.println("s1 name: " + s1Name); // LỘC PHÁT
        System.out.println("s1 name: " + s1.getName());
        System.out.println("s1 name: " + s1.name);
        // khi sờ trực tiếp đặc điểm, tức là ta chạm trực tiếp biến, chạm biến - get() set()
        
//        s1.name = "KHÔNG HỌC BÀI";
//        s1.setName("CÀY RANK KHÔNG CÀY CODE");
//        System.out.println("After không học bài");
        s2.name = "ĐỔI NGÀNH CŨNG LÀ LỰA CHỌN";
        
        s1.showProfile();
        s2.showProfile();
        
        // static là vùng nhớ dùng chung cho các object cùng loại,
        // ai cũng nghĩ là của mình, nhưng thực tế là chung,
        // nếu 1 ai đó tác động, thì tất cả bị ảnh hưởng.
        System.out.println("s1 yob: " + s1.yob);
        System.out.println("s2 yob: " + s2.yob);
        
        System.out.println("s1 name: " + s1.name); // ĐỔI NGÀNH...
        System.out.println("s2 name: " + s2.name); // ĐỔI NGÀNH...
        
        // Vùng static xài chung cho mọi object, cho nên giá trị của vùng này là chung cho tất cả các SV hiện tại và tương lai.
        // Không nên tư hữu cái đồ xài chung.
        // s1.name = s2.name = s3.name = Student.name
        // Sờ vào static đừng sờ qua kiểu tư hữu mà nên sờ theo kiểu Class chấm static.
        System.out.println("Student name: " + Student.name); // ĐỔI NGÀNH...
        // Có 2 loại chấm: chấm qua biến object hàm ý non-static, đồ thuộc từng object
        // tui.yob khác ban.yob khác banAy.yob
        // Chấm thứ 2: đồ static xài chung, new cả tỉ lần cũng chỉ là 1 vùng ram, chung cho cả đám,
        // vậy chấm qua cả đám hợp lí hơn.
        s1.sayHi();
        Student.sayHi();
        
    }
    
    // Tôi muốn nhập từ bàn phím hồ sơ của ai đó, y chang như đăng kí member vào 1 website.
    // Cần có bàn phím để nhập, Scanner tiệm photo, Camera, WebCam, Bàn phím cơ, Touchpad...
    // -> thuộc Nhóm đưa data vào máy tính/class Scanner.
    // Cần có biến trung gian để hứng value từ bàn phím vào,
    // có vật liệu rồi, gọi phễu mà new của Student.
    public static void inputAStudent() {
        String id, name;
        int yob;
        double gpa; // local variable, nằm trong Stack Segment trong ram.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please input id: ");
        id = sc.nextLine();
        System.out.print("Please input name: ");
        name = sc.nextLine();
        System.out.print("Please input yob: ");
        yob = sc.nextInt();
        System.out.print("Please input gpa: ");
        gpa = sc.nextDouble();
        
        // Đủ data vật liệu rồi, đúc SV, y chang nhấn nút Register sau khi đã fill vào form.
        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
    }
    
}
