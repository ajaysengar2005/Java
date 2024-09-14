import java.util.Scanner;
public class Greeting {
    public static void main (String[] args){
        System.out.println("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " Good Morning");
    }
    
}
