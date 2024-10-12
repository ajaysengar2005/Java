import java.util.Scanner;
public class Comparision{
public static void main(String[] args)
{
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the fist No :");
    int num1 = sc.nextInt();
    System.out.print("Enter the second No :");
    int num2 = sc.nextInt();
    if(num1 > num2){
        System.out.println("The first No." + num1 + " is greater.");
    }
    else{
        System.out.println("The second No."+ num2 +" is greater.");
    }
}
}
