package studentmanagement;

import data.Student;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        //saveAStudent();
        inputAStudent();
    }
    
    // hard-code như mọi khi, đổ sẵn value.
    public static void saveAStudent() {
        Student an = new Student("SE686868", "TAY CHƠI", 2001, 0.5);
        an.showProfile();
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
