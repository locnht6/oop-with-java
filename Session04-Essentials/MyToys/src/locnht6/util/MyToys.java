package locnht6.util;

import java.util.Scanner;

public class MyToys {

    // final = const bên C, biến hằng số, không cho thay đổi value ngoại trừ lúc mới khai báo.
    public static final double PI = 3.1415;
    public static final double VAT = 0.1;
    public static final int MAX_ELEMENTS = 500;
    private static Scanner sc = new Scanner(System.in); // dành cho nội bộ thôi.

    // Ta sẽ gặp 1 dạng nhập dữ liệu như sau:
    // nhập dài, rộng HCN, bán kính Hình Tròn, a b c của Tam Giác, điểm thi các môn, cột điểm các môn, menu,
    // nhập số: trôi lệnh, ngoài biên, cà chớn - try-catch, lặp bắt nhập lại.
    // Suy nghĩ tốt hơn: ta làm hàm nhập số, trả về số đã nhập, chặn hết mọi thứ.
    
    public static int getAnInteger() {
        int n;
        
        do {
            try {
                System.out.print("Input an integer: ");
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer?");
            }           
        } while (true); // while (còn đúng) thì DO again
    }

                                                // errMsg, lower, upper
    public static int getAnInteger(String inputMsg) {
        int n;
        
        do {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println("Do you know how to input an integer?");
            }           
        } while (true); // while (còn đúng) thì DO again
    }

}
