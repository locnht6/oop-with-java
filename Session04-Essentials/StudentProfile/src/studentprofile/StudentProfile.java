package studentprofile;

import java.util.Scanner;

public class StudentProfile {

    public static void main(String[] args) {
        inputProfile();
    }
    
    // Thí nghiệm về việc nhập xuất, làm đơn giản, không OOP, không class.
    public static void inputProfile() {
        // Nhập vào thông tin SV gồm tên, năm sinh, địa chỉ và in ra.
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please input name: ");
        name = sc.nextLine().toUpperCase();
        System.out.print("Please input yob: ");
        
        // LỆNH TÀ CHIÊU ĐỂ XÓA BUFFER
//        yob = sc.nextInt();
//        
//        // nextInt() để lại rác trong buffer, ít nhất là enter, tệ hơn là phím cách + phần dư + enter,
//        // xóa bộ đệm trước khi vào chuỗi - fflush(standard input stdin)
//        // Âu Dương Phong solution, lợi dụng lệnh nextLine() hốt sạch buffer kể cả enter.
//        sc.nextLine(); // ghi chơi vậy thôi, không gán biến, mục tiêu hốt sạch rác.

        // CHÁNH ĐẠO: Quách Tĩnh Solution
        yob = Integer.parseInt(sc.nextLine());
                      // hàm static, chấm mà xài, không cần new, không cần nhớ lại data đã xử lí.
        
        System.out.print("Please input address: ");
        address = sc.nextLine();
        
        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("---End of profile---");
    }
    
}
