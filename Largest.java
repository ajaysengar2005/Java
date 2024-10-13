import java.util.Scanner;
class Largest{
    public static void main(String[] args) {
       try( Scanner sc =  new Scanner(System.in)){
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Give Value of array");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int large = arr[0];
        int secondlarge = arr[0];
        for(int i=0; i<n; i++)
        {
            for(int j=n; j>=0; j--)

            {
              if(large<arr[i])
              {
                  secondlarge = large;
                  large = arr[i];
               
              }
            if(large == secondlarge)
              {
                large = arr[i];
              }
            }
        }
        
        System.out.println("Largest Value is "+ large);
        System.out.println("Second Largest Value is "+ secondlarge);
      }
        
    }
}
