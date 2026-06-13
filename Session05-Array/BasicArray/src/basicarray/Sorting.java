package basicarray;

public class Sorting {
    
    // Thêm 1 main() khác ngoài main() ban đầu, main() này phải mở lên rồi Shift-F6,
    // còn F6 đứng ở class nào cũng được, ưu tiên/default chạy main() đầu tiên được tạo ra,
    // có thể đổi main() default nếu muốn: Nhấn phải chuột trên tên project -> Properties -> Run -> Chọn main().
    public static void main(String[] args) {
        
        //sortPrimitiveArray();
        sortStudentList();
        
    }
    
    public static void sortPrimitiveArray() {
        
        int arr[] = new int[]{1000, -1000, 1000, 5, 10, -15, -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // if thằng đầu lớn hơn thằng sau, đổi ngay và luôn.
                if (arr[i] > arr[j]) { // [i] trước [j]
                    int t = arr[i];    // mày trước tao, mà lại lớn hơn tao thì đổi.
                    arr[i] = arr[j];
                    arr[j] = t;
                } // > tăng dần, < giảm dần         
            }
        }
    
        System.out.println("After sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        
    }
    
    public static void sortStudentList() {
        
        Student arr[] = new Student[]{
            new Student("SE9", "CHÍN", 19, 9),
            new Student("SE5", "NĂM", 15, 5),
            new Student("SE7", "BẢY", 17, 7),
            new Student("SE3", "BA", 13, 3),
            new Student("SE8", "TÁM", 18, 8),
        };
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()) {
                    Student t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        
        System.out.println("The student list after sorting ascending by gpa");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
}
