public class Strings {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKL";
        System.out.println("the length of txt is: " + txt.length()); //length function 
        String txtver2 = "Hello World";
        System.out.println(txtver2.toUpperCase()); //toUpperCase function
        System.out.println(txtver2.toLowerCase()); //toLowerCase function
        String txtver3 = "Please locate where 'locate' occurs !";
        System.out.println(txtver3.indexOf("locate")); //indexOf function

        String txtver4 = "HELLO";
        System.out.println(txtver4.charAt(0));
        System.out.println(txtver4.charAt(3));

        String txt1 = "Hello";
        String txt2 = "Hello";

        String txt3 = "Greetings";
        String txt4 = "Great things";

        System.out.println(txt1.equals(txt2)); //true
        System.out.println(txt3.equals(txt4)); //false

        String txt5 = "  HELLO WORLD  ";
        System.out.println("Before: [" + txt5 + "]");
        System.out.println("After: [" + txt5.trim() + "]");
   }    
}
