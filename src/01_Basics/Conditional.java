public class Conditional {
    public static void main(String[] args) {
        boolean isRaining = true;

        if (isRaining) {
            System.out.println("Bring an umbrella !");
            // block of code to be executed if the condition is true
            int x = 20;
            int y = 18;
            if (x > y) {
                System.out.println("x is greater than y");
            }
            boolean isLightOn = true;

            if (isLightOn) {
                System.out.println("The light is on.");
            }
        }
    }

}
