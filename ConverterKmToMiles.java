import java.util.Scanner;
public class ConverterKmToMiles {
    public static void main(String[] args) {
        System.out.println("Enter the Range in Kilometer : ");
        Scanner sc = new Scanner(System.in);
        double k = sc.nextInt();
        double converter = k/1.609;
        System.out.println("Your Range in Miles : " + converter);
    }
    
}
