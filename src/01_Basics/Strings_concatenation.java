public class Strings_concatenation {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String name = "Tom";

        int age = 25;
        System.out.println("My name is " + name + " and I am " + age + " years old.");

        String firstName2 = "John ";
        String lastname2 = "Doe";
        System.out.println(firstName2.concat(lastname2)); // can use concat() to concatenate strings

        String a = "Java ";
        String b = "is ";
        String c = "fun!";
        String result = a.concat(b).concat(c);
        System.out.println(result);
    }

}
