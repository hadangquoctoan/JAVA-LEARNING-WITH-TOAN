public class Logical {
    public static void main(String[] args) {
        boolean isLoggedIn = true;
        boolean isAdmin = false;
        System.out.println("Regular user: " + (isLoggedIn && !isAdmin)); //Logical and and Logical not
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
        System.out.println("Not logged in: "+ (!isLoggedIn)) ;
    }   
}
