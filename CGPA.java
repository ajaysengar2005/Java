import java.util.Scanner;
public class CGPA {
    public static void main(String[] args){
        System.out.println("Enter Marks out of 100 :");
        Scanner sc = new Scanner(System.in);
        double s1 = sc.nextInt();
        double s2 = sc.nextInt();
        double s3 = sc.nextInt();
        double s4 = sc.nextInt();
        double s5 = sc.nextInt();
        double cgpa = (((s1+s2+s3+s4+s5)/5)/9.5);
        System.out.println("CGPA : " + cgpa);
    }
}

