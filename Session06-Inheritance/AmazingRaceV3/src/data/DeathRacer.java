package data;

// CLB của những gã thích đua đến chết, gom những class, object mà có chung hành động đua, khoogn care chuyện gì khác.
// CLB là nơi tập hợp những người chung tiếng nói, hành động, giao tiếp/Interface.
// Cũng là hình thức gom Khuôn, gom object phân loại về cái gì đó, nhóm gì đó,
// lỏng lẽo hơn kế thừa, không care đặc điểm, di truyền đặc điểm, chung hành động vào chơi chung.
// MOTOR, DOG, ... IS A MEMBER OF, IS A DEADRACER.
// ANH EM MÌNH LÀ STUDENT, SINH RA LÀ SV,
// ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, SÁT THỦ, GAME THỦ, ... 
// ANH EM MÌNH NHÌN THEO DÒNG HỌ: CHÁU Ở NHÀ NGOAN LẮM.
// 1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON, HỘI NHÓM XÃ HỘI,
// HỘI BÀ CON: DI TRUYỀN VÀ KẾ THỪA.
// HỘI XÃ HỘI: CÙNG NHAU LÀM GÌ ĐI, CÙNG NHAU CHIẾN!!!

// CLB chỉ quan tâm hành động, trong đây chỉ chứa hành động.
// CLB để anh em tự mình hành động theo cách của mình,
// vào CLB tiếng Anh mình speakEnglish() theo giọng của mình,
// đua thì đua theo cách của mình: lạng lách, tháo thắng, tung mình trên yên xe, cà chân chống tóe lửa,...
// Interface CLB để mọi người tự chơi theo cách của mình - chơi - hành động là abstract.
// CHỈ NÓI NỘI QUY CLB THÔI NHEN, MỌI NGƯỜI THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI.
// CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT,
// không cần ghi ra từ khóa abstract ở cả tên của CLB và tên hàm,
// VÌ CLB HÀM Ý/NGẦM HIỂU CHỈ CÓ NỘI QUY ĐỂ MỌI NGƯỜI THEO, NỘI QUY CHUNG CHUNG
// ĐỂ MỌI NGƯỜI THEO - IMPLEMENT - NGẦM HIỂU INTERFACE LÀ ABSTRACT, ABSTRACT LÀ NÊU Ý TƯỞNG.

// JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHƯNG...!!!
public interface DeathRacer {
    
    // Phàm ai đã chọn nghề tham gia đua thủ, thì phải đua!!!
    // public abstract double runToDead(); // không cần từ abstract
    public double runToDead();
    public void showHowToDead(); // gáy
    
}
