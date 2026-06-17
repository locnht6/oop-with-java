package studentmanagement;

import java.util.ArrayList;
import java.util.List;
import data.Student;
import java.util.HashSet;
import java.util.Set;

public class StudentManagement {

//    public static void main(String[] args) {
//        
//        //playWithArrayList();
//        //sortArrayListManually();
//        //playWithSet();
//        
////        Student xxx = searchStudent("se123456");
////        if (xxx != null) // null được quyền kết hợp với == !=, có trỏ null đáy ram hay không?
////            xxx.showProfile();
////        else
////            System.out.println("Not found!!!");
//        
//        sortStudentList();
//        
//    }
        
//    public static void main(String[] args) {
//        
//        List<Student> arr = initData(); // arr ở đây trỏ thẳng vào Túi có 5 SV.
//        System.out.println("The student list");
////        for (Student x : arr) {
////            x.showProfile();
////        }
//        for (Student x : initData()) {
//            x.showProfile();
//        }
//        
//    }
        
    public static void main(String[] args) {
        
        List<Student> arr = initData();
        // 5 9 4 2 8
        Student xxx = searchAStudent(arr, "se888888");
        if (xxx == null)
            System.out.println("Not found!");
        else { // vi diệu nè
            xxx.showProfile();
            // Nếu tìm thấy, tui sẽ update dữ liệu luôn, sửa điểm của bạn Tám thành 6789.
            xxx.setGpa(6789);
        }
        // In ra kết quả thì biết
        System.out.println("The student list after updating SE8");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    // Hàm chuẩn bị DATA. Hàm trả về 1 cái Túi/ArrayList/Danh sách SV.
    // Đọc đúng: hàm trả về tọa độ vùng new ArrayList() mà bên trong có sẵn 1 đống cardvisit ghi địa chỉ SV,
    // hàm trả về vị trí 1 cái túi có sẵn/mua rồi, trong túi có...
    // List<Student> arr = new gì đó.
    // initData = new ArrayList() nào đó
    public static List<Student> initData() {
        
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        return arr; // initData() = arr = new ArrayList()
        // Tên hàm cùng trỏ vào giỏ vừa new - 2 chàng arr, tên hàm cùng trỏ 1 nàng new ArrayList()
        
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
    
    // Một cái túi List Cha (nhiều Con ArrayList, Vector, ...) có 1 cơ chế sort tự động các thẻ bài/biến tham chiếu/biến con trỏ bên trong,
    // cơ chế này thì phải xài Interface (Comparable và Comparator),
    // cuối cùng vẫn là so sánh và đảo thứ tự,
    // ta dùng trước cơ chế tự viết sort, so sánh và đổi thứ tự trỏ.
    public static void sortArrayListManually() {
        
        List<Student> arr = new ArrayList(); // new là có Túi, có hành động, có chỗ chứa đồ.
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        // Mở khóa dây của giỏ, nhét 1 thẻ bài vào, thẻ bài ghi thông tin trỏ tới SV AN 9.0,
        // thẻ bài nằm ở vị trí đầu tiên trong giỏ (0) [0].
        // Bệnh nhân cứ nằm ở phòng, new nằm trong HEAP,
        // thông tin bệnh nhân + phòng -> ghi vào excel/1 dòng trong danh sách bác sĩ cầm trên tay, arr đấy,
        // arr là cái túi cái excel chứa tọa độ của bệnh nhân.
        
        arr.add(binh); // 1 thẻ bài được thêm vào giỏ trỏ BÌNH 4.9
        arr.add(binh); // add trùng, đã có trước đó 1 thẻ bài trỏ vùng new BÌNH 4.9 rồi
                       // Thêm 1 thẻ bài nữa ghi info trỏ BÌNH 4.9
        // danh sách 3 người, 1 người ghi trùng 2 lần
        // In danh sách
        binh.setName("AHUHU");
        System.out.println("The student list");
        for (Student x : arr) {
            // x = con trỏ/thẻ bài thứ 0, thẻ bài thứ 1, thẻ bài thứ n,
            // x lưu tọa độ nằm trong thẻ bài thứ i, tức trỏ vùng new thứ i.
            x.showProfile();
        }
        // LẤY TRỰC TIẾP TỪNG CON TRỎ, KHÔNG CHƠI TRÒ QUÉT FOR EACH,
        // ~~~ [i] bên mảng, vị trí thứ i, biến thứ i, chính là chứa trong nó tọa độ vùng new.
        System.out.println("The student list (printed by using for i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
        // Xóa BÌNH cuối trong giỏ, tức là loại bỏ thẳng đi 1 thẻ bài,
        // biến mất 1 con trỏ luôn, size() sẽ giảm đi 1 đơn vị,
        // mảng không có trò này, xin bao nhiêu, fix bấy nhiêu, còn bấy nhiêu, không cho xóa
        arr.remove(2);
        
        System.out.println("THE LAST student list (printed by using for i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
        // Thẻ bài (0) get(0) luôn có ghi trên thẻ bài info của SV AN 9 ở xa
        // Thẻ bài (1) get(1) luôn có ghi trên thẻ bài info của SV BÌNH 4.9 ở xa
        // Tôi muốn sắp tăng dần theo điểm
        // sure, phải đổi lại info trỏ, cách trỏ, ghi lại cái thẻ bài trỏ lại đi
        // Thẻ bài 0 phải trỏ vào Bình 4.9
        // Thẻ bài 1 phải ghi lại info trỏ, trỏ vào AN 9.0
        // [i] = [j] đổi info trỏ
        // hàm .set(thẻ nào vị trí thẻ bài, thông tin tọa độ mới)
        Student tmpStudent = arr.get(0); // lấy tọa độ vùng new AN 9, thảy vào tmp
        arr.set(0, arr.get(1)); // get(1) được tọa độ BÌNH 4.9, thảy tọa độ vào thẻ 0
        arr.set(1, tmpStudent); // sửa đồng thời thẻ 1, trỏ vùng mới
                                // vùng tmp đang trỏ, AN 9.0 xưa kia
        
        System.out.println("The student list sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
                                
    }
    
    // Set: nhóm Túi/Giỏ hàng hiệu, mỗi món 1 lần tính, xuất hiện 1 lần,
    // không có 2-n thẻ bài trong giỏ trỏ cùng 1 vùng new,
    // mỗi thẻ bài trong giỏ này trỏ duy nhất 1 vùng new,
    // Set chia 2 loại Giỏ chi tiết hơn: 
    // HashSet: đồ đưa vào lộn xộn thứ tự,
    // TreeSet: đồ đưa vào tự động sắp xếp,
    // ArrayList đưa vào giữ nguyên thứ tự, vào ra đúng thứ tự, get() set() add()
    public static void playWithSet() {
        
        Set<Student> arr = new HashSet();
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        Student ahihi = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(ahihi);
        ahihi.setName("Ahuhu");
        // Có new có vùng nhớ mới, đã có ai trỏ đâu, quan tâm gì info trùng của vùng new.
        arr.add(binh);
        arr.add(binh); // add trùng rồi, có 1 thẻ bài trước đó đã trỏ vùng BÌNH
        // Âm thầm loại bỏ add trùng
        // Vào ra không theo đúng thứ tự, add() vào thì oke, không có hàm get ra()
        // Muốn lấy info trong Set chỉ có cách for each
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    // Tìm kiếm 1 SV trong danh sách, hàm trả về object.
    // Đọc đúng là: hàm trả về tham chiếu đến 1 vùng new,
    // hàm trả về cái thẻ bài, trên thẻ có khắc tọa độ vùng new,
    // hàm trả về địa chỉ mà object new đang nằm,
    // ~~~ Student x; // cần lắm luôn 1 tọa độ new Student
    public static Student searchStudent(String id) { // tên hàm là 1 tọa độ searchStudent()
        
        // Mò trong ArrayList, mảng [] lấy được thẻ bài, thảy ra ngoài cái thẻ bài,
        // thảy ra ngoài hàm cái tọa độ ghi trong thẻ bài, chính là trỏ đến object Student.
        List<Student> arr = new  ArrayList();  
        Student binh = new Student("SE123456", "BÌNH LÊ", 2003, 4.9);
        
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);
        
        // Quét đầu đến cuối giỏ, lôi từng thẻ bài ra, get(i),
        // hỏi tiếp ê mày, MSSV là mấy, get(i).getId(),
        // if (id cần tìm == id vừa lấy trong giỏ) return thẻ bài khớp info,
        // return tọa độ ghi trong thẻ bài, return vùng new SV tìm thấy.
        Student tmp = arr.get(0);
        String tmpId = tmp.getId(); // tmpId = arr.get(0).getId()
        // if (tmpId == id đưa vào) thì return, không thấy thì return null.
        if (tmpId.equalsIgnoreCase(id))
            return tmp; // trả về tọa độ vùng new trong thẻ bài 0.
        
        return null;
        
    }
 
    // CÁC HÀM XỊN SÒ, SORT, SEARCH, CHUẨN BỊ KHO DATA.
    // 3 HÀM NÀY ĐỀU LÀ STATIC CHO MỤC TIÊU THỬ NGHIỆM, NÓ CHƯA LÀ TƯ DUY OOP.
    // TƯ DUY OOP LÀ: CÁC HÀM PHẢI NẰM TRONG OBJECT NÀO ĐÓ.
    // CHẾ TẠO CÁI TỦ, THÙNG CHỨA, CÓ CÁC HÀNH ĐỘNG: THÊM, XÓA, SỬA.
    public static void sortStudentList() {
        
        // Cần chuẩn bị danh sách SV: mua cái Túi - new Túi(), có các hồ sơ SV, new SV()
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        // Túi đang có chứa thẻ bài, cardvisit, 5 biến con trỏ, tham chiếu,
        // thông tin trên card chính là địa chỉ vùng new Student() trên HEAP.
        // Y chang bác sĩ cầm danh sách Excel chứa info các bệnh nhân, bệnh nhân cứ nằm phòng bệnh,
        // bác sĩ đi thăm sau. Bác sĩ đi thăm, nhìn danh sách, thấy số phòng,
        // chính là địa chỉ từng bệnh nhân.
        // Bệnh Nhân 1, Bệnh Nhân 2, Thẻ 1, Thẻ 2, Card 1, Card 2 chính là biến con trỏ, trên đó có địa chỉ object.
        // ~~~ get(i) - lấy được cái thẻ
        System.out.println("The student list before sorting ascending by gpa");
        for (Student x : arr) {
            // x = arr.get(i); // lấy tọa độ địa chỉ ghi trên thẻ thứ i cất vào x.
            x.showProfile();
        }
        
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                }
            }
        }
        
        System.out.println("The student list after sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
    }
    
    //            Student x = cần trỏ 1 vùng new SV()
    // Tên hàm là một biến SV, tên hàm này cần trỏ 1 vùng new SV()
    // Hàm trả về giá trị thì tên hàm ~~~ giá trị.
    // double r = sqrt(4);
    //                                   arr trỏ 1 cái Giỏ có sẵn,
    //                                   Giỏ ArrayList new ở đâu đó ko care,
    //                                   trong Giỏ có gì không care vội, lục lọi sau,
    // Xài hàm này ta cần chuẩn bị sẵn 1 cái Túi/Giỏ ở đâu đó trước rồi,
    // có đồ bên trong luôn, đưa vị trí Giỏ có sẵn đó vào hàm,
    // y tá đưa bác sĩ danh sách bệnh nhân nằm sẵn ở các phòng rồi,
    // đưa mảng/Túi ArrayList có sẵn từ main() vào hàm này - okie.
    // Nhưng không hay, lập trình là mọi thứ nằm trong hàm -> C.
    // Mọi hàm nằm trong object -> OOP.
    // Bài này đang thử nghiệm, ta đưa toàn bộ data vào trong hàm cái đã.
    public static Student searchAStudent(List<Student> arr, String id) {
        
        // Rà qua các phần tử trong mảng, Giỏ, lôi từng thẻ/con trỏ,
        // hỏi thẻ đó, ê, cho tao biết SV này có id mấy, (i).getId()
        // trỏ vào new Student()
        // if (id mới tìm == id cần tìm đưa vào) thì return tọa độ/địa chỉ trên thẻ, cái thẻ.
        // Nếu không thấy, return null; // tên hàm trỏ vào null, không có SV, chấm bị Exception.
        // SV không tìm thấy, chấm vô nghĩa!!!
        // Ta cần danh sách SV, để for,
        // cần chuẩn bị danh sách SV: mua cái Túi - new Túi(), có các hồ sơ SV, new SV()
        if (arr.isEmpty()) // đưa Túi rỗng mới mua, có gì đâu mà search
            return null; // cho mày tọa độ null trả về
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        // đi hết for không return được, sure không thấy, null.
        return null;
        
    }
    
}
