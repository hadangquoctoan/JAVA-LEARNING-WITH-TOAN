import java.util.Scanner;

public class Conditional_v2 {
    public static void main(String[] args) {
        boolean isRaining = false;

        if (isRaining) {
            System.out.println("Bring an umbrella!");
        } else {
            System.out.println("No rain today, no need for an umbrella!");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age (a): ");
        int a = scanner.nextInt();

        if (a < 18) {
            System.out.println("You are under 18!");
        } else if (a > 23) {
            System.out.println("You are a fucking adult");            
        }
         else {
            System.out.println("You are 18 or older!");
        }

        scanner.close();
    }

}
