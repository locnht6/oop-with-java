package studentmanagementv2;

import data.Cabinet;

public class StudentManagementV2 {

    public static void main(String[] args) {
        
        Cabinet se = new Cabinet();
        Cabinet ia = new Cabinet();
        
        System.out.println("ADD SE");
        se.addAStudent(); // #1
        
        System.out.println("ADD IA");
        ia.addAStudent(); // #1
        ia.addAStudent(); // #2
        
        System.out.println("SE students");
        se.printStudentList(); // 1 SV
        
        System.out.println("IA students");
        ia.printStudentList(); // 2 SV
        
    }
    
}
