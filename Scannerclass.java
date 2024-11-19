package javaprogram;
import java.util.Scanner;

public class Scannerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");
        int number = obj.nextInt();

        
        if (number >= 1 && number <= 10) {
            System.out.println("Multiplication Table for " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number +"x"+ i+ " = " + (number * i));
            }
        } else {
            System.out.println("Please enter a valid number between 1 and 10.");
        }

	}

}
