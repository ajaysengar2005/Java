import java.util.Scanner;

public class Greater {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value : ");
        int a = sc.nextInt();
        System.out.println("Enter the second value : ");
        int b = sc.nextInt();
        if(a>b)
        {
            System.out.println("A is greater than B"); 
        }
        else{
            System.out.println("B is greater than A ");
        }
    }
    
}
