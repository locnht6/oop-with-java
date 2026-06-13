package basicarray;

public class BasicArray {

    public static void main(String[] args) {
        //playWithPrimitiveArray();
        playWithPrimitiveArrayV2();
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
    
}
