import java.util.Scanner;

public class Expre {
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the value of v : ");
        float v = ss.nextFloat();
        System.out.println("Enter the value of u : ");
        float u = ss.nextFloat();
        System.out.println("Enter the value of a : ");
        float a = ss.nextFloat();
        System.out.println("Enter the value of s : ");
        float s = ss.nextFloat();
        float res = ((v*v) -(u*u))/(2*(a*s));
        System.out.println("Evaluation of expression is : " + res);

    }
    
}
