import java.util.Scanner;

public class Calculator {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vlue of a :");
         float a = sc.nextFloat();
        System.out.println("Enter the value of b : ");
         float b = sc.nextFloat();
        System.out.println("Enter Arithmatic Operator :");
        char op = sc.next().charAt(0);

        switch(op){
            case '+' : System.out.println(a+b);
            break;

            case '-' : System.out.println(a-b);
            break;

            case '*' : System.out.println(a*b);
            break;

            case '/' : System.out.println(a/b);
            break;

            default : System.out.println("Invalid Opeerator");
        }
    }
    
}
