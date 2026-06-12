package data;

public class Student {
    private static String id;   
    public static String name;
    
    public int yob;
    private double gpa;

    public Student(String id, String name, int yob, double gpa) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    }
    
    // gáy điểm
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n", id, name, yob, gpa);
    } // non-static chơi với ai? chơi với non-static là rõ ràng, vì cùng object,
      // chơi với cả static vì là 1 phần chung được tách ra.
    
    // chơi hàm static xem sao
    public static void sayHi() {
        System.out.println("Hi everyone, my name is: " + name);
        //System.out.println("Hi everyone, my yob is: " + yob);
        // Không biết yob nào để mà in vì clone nhiều yob quá, vì nhiều SV
        // static chỉ chơi với staitc vì cùng khu vực.
    }
    
}
