package javaprogram;

public class IfClass {
 public static void main(String args[]) {
	 int start = 1, end = 10; 
      

     System.out.println("Even Numbers:");
     for (int i = start; i <= end; i++) {
         if (i % 2 == 0) { 
             System.out.println(i);
         }
     }

     System.out.println("Odd Numbers:");
     for (int j = start; j <= end; j++) {
         if (j % 2 != 0) { 
             System.out.println(j);
         }
     }
 }
}
