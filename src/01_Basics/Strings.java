public class Strings {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKL";
        System.out.println("the length of txt is: " + txt.length()); //length function 
        String txtver2 = "Hello World";
        System.out.println(txtver2.toUpperCase()); //toUpperCase function
        System.out.println(txtver2.toLowerCase()); //toLowerCase function
        String txtver3 = "Please locate where 'locate' occurs !";
        System.out.println(txtver3.indexOf("locate")); //indexOf function
    }
    
}
