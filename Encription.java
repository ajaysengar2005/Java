import java.util.Scanner;

public class Encription {
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Grade : ");
        char g = ss.next().charAt(0);
        char en = (char)(g+8);// Grade was encripted by 8
        System.out.println("Encripted Grade is : " + en);

    }
    
}
