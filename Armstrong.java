package javaprogram;
import java.util.Scanner;

public class Armstrong {
	 public static void main(String[] args) {
	        Scanner obj = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = obj.nextInt();
	        int originalNumber = number; 
	        int result = 0,digits = 0;
	         
	       
	        int temp = number;
	        while (temp != 0) {
	            digits++;
	            temp /= 10;
	        }

	        
	        temp = number;
	        while (temp != 0) {
	            int digit = temp % 10;
	            result += Math.pow(digit, digits);
	            temp /= 10;
	        }

	       	        if (result == originalNumber) {
	            System.out.println(originalNumber + " is an Armstrong number.");
	        } else {
	            System.out.println(originalNumber + " is not an Armstrong number.");
	        }

	      	    }
}
