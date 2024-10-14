import java.util.Arrays;
import java.util.Scanner;
public class stringorder
 {
    public static String sortString(String Args) {
        char tempArray[] = Args.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }

    public static void main(String[] args) 
    {
        System.out.print("Enter the String :  ");
        Scanner sc = new Scanner(System.in);
        String inputString;
        inputString = sc.nextLine();
        String outputString = sortString(inputString);
        System.out.println("Given String : " + inputString);
        System.out.println("Output String : " + outputString);
    }
}

