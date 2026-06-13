package basicarray;

public class BasicArray {

    public static void main(String[] args) {
        //playWithPrimitiveArray();
        //playWithPrimitiveArrayV2();
        //playWithPrimitiveArrayV3();
        //playWithAnObject();
        //playWithObjectArray();
        //playWithObjectArrayV2();
        //sortPrimitiveArray();
        //sortObjectArray();
        //sortPrimitiveArrayV2();
        sortObjectArrayV2();
    }
    
    public static void playWithPrimitiveArray() {
        //double vol[365]; cấm tuyệt đối trong lệnh khai báo gõ kích thước mảng, số phần tử.
        
        double v[] = {0, 5, 10, 15, 20, 25, 30}; // mảng 7 phần tử, 7 biến double,
        // có sẵn value v[0] = 0; v[1] = 5;...
        //  STACK       HEAP
        
        v[0] = 6868;
        System.out.println("v[0]: " + v[0] + " | v[1] = " + v[1]);
        System.out.printf("Element 0: %.1f\n", v[0]);
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
        
        // TOÁN TẬP HỢP
        // N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, ...}
        // V x e N, với mọi x thuộc tập hợp N, tức là x sẽ là mấy, có value là mấy, vì tập hợp toàn là số.
        // x = -5 là sai, thuộc N kia mà.
        // x = 0, x = 1, x = 2, x = 3, x = 4, ...
        // x sure phải là số tự nhiên đã, lấy value trong N
        // V x là integer e N.
        // x = N[0] = 0, x có thể là số tự nhiên đầu tiên,
        // x = N[1] = 1, x có thể là số tự nhiên kế tiếp,
        // chữ với mọi, với mỗi chính là kĩ thuật giúp ta duyệt qua toàn bộ value của 1 tập hợp, rọi đèn pin từ trái sang phải,
        // lôi hết các element phần tử/giá trị của tập hợp.
        
        System.out.println("The array v has values of");
        for (double x : v) {
            // Với mọi biến double x nó sẽ càn quét qua toàn bộ phần tử mảng,
            // x thuộc tập hợp v, x có quyền bằng phần tử v thứ 1, x = v[0],
            // x = v[1], x = v[2], ... x = v[i]
            // sout(x0 ~~~ sout(v[i])
            // phần tử thứ i của mảng double v là 1 biến double v[i] -> x là biến double có gì sai.
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public static void playWithPrimitiveArrayV2() {
        double arr[] = new double[11]; // ngoặc [] là mảng, xin số biến
                                        // ngoặc () là gọi phễu của Khuôn heng
                                        // có new là có vùng chà bá lửa, có vùng ram bự chứa đến 11 biến double,
                                        // với giá trị mặc định của các biến là 0.
        // arr[0] là 1 biến double, arr[i] là biến double, primitive,
        // primitive là giá trị đơn xài luôn, không có chấm à nhen.
                                        
        arr[0] = 68;
        arr[1] = 79;
        arr[2] = 100;
        
        // In mảng bình thường
        System.out.println("The array arr has");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        // Quan trọng: tên mảng bản thân là 1 biến má mì, tú ông, tú bà, con trỏ, reference,
        // trỏ vào đầu 1 dãy rất nhiều biến khác.
        // Nó là biến má mì vì quản lí ở dưới rất nhiều em chân dài trai ngành...
        // Hỏi má mì ơi, bà có bao nhiêu lính, má mì trả lời rằng tao có 365,
        // đây chính là đặc điểm của má mì, quản lí nhiều lính...
        // má mì ơi bà có bao nhiêu lính, má mì chấm length
        
    }
    
    public static void playWithPrimitiveArrayV3() {
        int a = 10;
        // a chấm sổ cái đầu mày, a là 10 rõ ràng đòi gì nữa.
        int a1 = 10, a2 = 100, a3, a4, a5, a6, a7, a8, a9, a11; // khai báo lẻ
        System.out.println(a2 + " ");
        
        int arr1[] = {5,    10, 15, 20, 25, 30}; // có nhiều biến chung arr, implicit new
        // cụ thể là arr[0] [1] [2] ...
        
        int arr2[] = new int[]{5, 10, 15, 20, 25, 30}; // explicit new
        
        int[] arr3 = {5, 10, 15, 20, 25, 30};
        // đưa nhiều value thì phải có nhiều biến tương ứng,
        // có nhiều biến lắm luôn và value tương ứng.
        
        int[] arr; // arr là biến má mì, con trỏ, trỏ vùng new cực bự, trỏ object chứa rất nhiều biến int khác.
        arr = new int[30];
        
        System.out.println("The array arr has");
        arr[0]= 100;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for (int x : arr) {
            // x = arr[0] tao xin value thằng đầu tien.
            // x = arr[1] tao xin value thằng kế, [i]
            System.out.print(x + " ");          
        }
        System.out.println();
        // arr[0] chấm xổ ra gì? không xổ ra gì, primitive xài luôn, chấm gì vì nó là 100.
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
 
    public static void playWithAnObject() {
        // Muốn lưu hồ sơ 1 SV, ta cần 2 thứ: biến, tên tắt, con trỏ, reference và vùng new clone đổ phễu.
        // Muốn lưu 1 giá trị bình thường, ta cần 2 thứ: biến primitive và value đơn.
        int a = 100;
        Student x; // Mình cùng nói xấu đứa kia x đi.
        // Đã là SV, thì chắc chắn showProfile(), công dân thì phải có CCCD.
        x = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        
        // hạ cánh nơi anh - cho con trỏ hạ cánh xuống 1 chỗ cực kì cool.
        x = null; // trỏ vùng mới, hạ cánh đáy của ram,
                  // gán địa chỉ 0, con số 0 vào trong biến con trỏ,
                  // biến con trỏ lưu tọa độ đáy ram, chứa toàn số 0, byte null,
                  // nhà đầu phố (số nhà 0) tối thui, không có gì,
                  // nhà null.
        x.showProfile();
    }
    
    public static void playWithObjectArray() {
        // Tôi muốn lưu hồ sơ 50 SV, tôi cần chuẩn bị những gì?
        // 50 biến/tên tắt,
        // 50 value - 50 vùng new
        Student s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13; //...
        //s1 = new Student(id, name, 0, 0)
        
        // 50 biến cái đã, mảng các biến SV.
        Student s[] = new Student[50]; // 50 bạn SV, chưa có object thực
                                       // s[0], s[1], s[2] ~~~ s1, s2, s3 ở khai báo lẻ.
        s[0] = new Student("SE123456", "AN NGUYỄN", 2001, 5.6);
        s[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.7);
        s[2] = new Student("SE123458", "CƯỜNG VÕ", 2001, 5.8);
        
        System.out.println("The student list");
//        s[0].showProfile();
//        s[1].showProfile();
//        s[2].showProfile();
        
        System.out.println("Cường lower: " + s[2].getName().toLowerCase().charAt(0));

        for (int i = 0; i < 3; i++) {
            s[i].showProfile();
        }
        
        // Biến SC còn lại từ s[3]...s[49] giá trị default là gì?
        // Default null hạ cánh đáy ram.
        // Nguyên tắc chơi với mảng object cấm tuyệt đối for hết nếu mảng chưa gán full vì phần còn lại trỏ đáy ram mặc định,
        // còn phần gán rồi thì chạy bình thường.
        // Mảng object bắt buộc phải for đến count là số phần tử đã được gán.
    }
    
    public static void playWithObjectArrayV2() {     
        
        Student arr[] = new Student[2];
        
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);
        // in mảng
        System.out.println("The student list before sorting");
//        for (int i = 0; i < arr.length; i++) {
//            //arr[i].showProfile();
//            System.out.println(arr[i]);
//        }

        for (Student x : arr) {
            // x = từng phần tử của mảng, tập hợp, vào từng phần tử lấy value,
            // với mỗi, duyệt qua toàn bộ mảng.
            // x = arr[0]; x = arr[1]; x = arr[i] cho tao cùng nhìn cái coi,
            // arr[i].showProfile() ~~~ x.showProfile()
            // 2 chàng 1 nàng.
            System.out.println(x); // gọi thầm tên em - toString()
        }
        
        // Tôi muốn in mảng tăng dần ascending về điểm, về lí BÌNH 5.0 | AN 9.0
        // arr[0] đang trỏ sai, mày đầu mảng thì phải trỏ new BÌNH 5.0,
        // arr[1] đang trỏ sai, đang trỏ 5.0 là sai, nhì mảng, phải trỏ AN 9.0,
        // cần hoán đổi việc trỏ.
        // arr[0] trỏ BÌNH 5.0 đang giữ bởi arr[1]
        // arr[1] ơi cho tao arr[0] xin vùng ram BÌNH 5.0 đi,
        arr[0] = arr[1]; // trỏ BÌNH 5.0
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    public static void sortPrimitiveArray() {
        
        int a = 9, b = 5;
        // Quy ước a đứng trước b khi in ra kết quả.
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        // Tôi muốn in giá trị a b tăng dần.
        // Đổi giá trị cho nhau là xong.
//        a = b; // a lấy giá trị của b, b đang là 5, do đó a đã là 5.
//        b = a; // b lấy giá trị của a, a đang là 5 luôn rồi (1 giá trị tại 1 thời điểm).
//               // Đúng ra phải là b = a cũ xưa xưa, 9 đó,
//               // đúng chuẩn phải backup a trước khi a chơi với giá trị mới.
        // Biến trung gian, tờ giấy nháp ghi lại cái sắp bị quên là 9 trong a.
        int t = a; // a 9 cất vào t.
        a = b;     // a lấy 5 của b.
        b = t;     // b lấy a cũ đang trong t là 9.
        System.out.println("After sorting: a: " + a + " | b: " + b); 
        
    }
    
    public static void sortObjectArray() {
        
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 9.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 5.0);
        
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        Student t = arr[0]; // arr[0] cho tao tọa độ bạn AN 9, trỏ cùng, backup.
        arr[0] = arr[1]; // arr[1] đang trỏ BÌNH 5.0, ngồi sau trỏ nhỏ, đưa nhỏ cho [0].
        arr[1] = t; // trỏ vào AN 9.0
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    public static void sortPrimitiveArrayV2() {
        
        int a = 4, b = 10;
        System.out.println("Before sorting: a: " + a + " | b: " + b);
        // Nếu có trục trặc thứ tự thì mới đổi.
        // Trong sắp xếp tăng dần, thì thằng trước phải bé hơn thằng sau.
        // Nếu đứng trước mà lớn hơn đứng sau, 9 5 | 8 4,
        // sure phải đổi value, hoán đổi.
        // Chỉ hoán đổi khi có trục trặc, thằng trước lớn hơn thằng sau.
        // if thằng trước > thằng sau, đổi ngay và luôn.
        if (a > b) { // do ta quy ước a > b
            int t = a;
            a = b;
            b = t;
        }    
        System.out.println("After sorting: a: " + a + " | b: " + b);  
        
    }
    
    public static void sortObjectArrayV2() {
        
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 2001, 4.0);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 2000, 8.0);
        
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        Student t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
}
