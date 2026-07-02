package Mini_Project;

import java.util.Scanner;

public class student_management {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);

        System.out.println("Student name is: ");
        String name = a.nextLine();

        System.out.println("Student's score is: ");
        int score = a.nextInt();
        
        System.out.println(name + " co diem = "+score);
        a.close();        
    }
    
}
