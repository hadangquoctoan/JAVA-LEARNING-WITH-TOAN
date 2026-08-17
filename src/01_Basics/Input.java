package Source_Code_Mau;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("Your name is:");
        String name = a.nextLine();
        System.out.println("Your age is:");
        int age = a.nextInt();
        System.out.println("My name is " +name+ ",age="+age);
        a.close();
    }
}