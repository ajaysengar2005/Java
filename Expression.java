import java.util.Scanner;

public class Expression {
    public static void main(String[] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter the Value of a :");
        float a = ss.nextFloat();
        System.out.println("Enter the Value of b :");
        float b = ss.nextFloat();
        System.out.println("Enter the Value of c :");
        float c = ss.nextFloat();
        System.out.println("Enter the Value of d :");
        float d = ss.nextFloat();
        float res = a/b  * d/c;
        System.out.println("Result of the expression is :" + res);


    }
    
}
