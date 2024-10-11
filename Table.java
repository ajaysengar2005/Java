// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Table {
   public Table() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the Number : ");
      int var2 = var1.nextInt();

      for(int var3 = 1; var3 <= 10; ++var3) {
         System.out.println("" + var2 + "*" + var3 + "=" + var2 * var3);
      }

   }
}
