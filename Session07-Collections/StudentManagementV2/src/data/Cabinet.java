package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cabinet {
    
    // Màu sắc, giá tiền, nhãn tủ là đặc trưng, mình ko care, mua Tủ đựng nhiều đồ.
    private List<Student> arr = new ArrayList(); // ~~~ new ArrayList() là đủ, add() vào tính sau
    
    private Scanner sc = new Scanner(System.in);

    // Phễu này được gọi là phễu rỗng/empty constructor/default constructor
    public Cabinet() {
    }

    // Tủ thì có hành động cơ bản: mở khóa kéo ra, bỏ đồ vô, loại bỏ, thêm, chỉnh sửa, tìm kiếm, sắp xếp, ...
    public void addAStudent() {
        
        String id, name;
        int yob;
        double gpa;
        
        System.out.println("Input student profile #" + (arr.size() + 1));
        System.out.print("Input id: ");
        id = sc.nextLine().toUpperCase().trim(); // trả về chuỗi cắt khoảng trắng dư đầu đuôi và đổi chuỗi vừa cắt qua HOA.
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase().trim();
        
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add a new student successfully!!!");
        
    }
    
    public void printStudentList() {
        
        if (arr.isEmpty()) {
            System.out.println("There is no student to print!!!");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }

}
