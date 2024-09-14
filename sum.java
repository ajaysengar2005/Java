// Q1. Sum of three Numbers and taking input from user.
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        System.out.println("Enter the three Numbers : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("Sum Of Three Numbers is : "+ sum);
    }
    
}
