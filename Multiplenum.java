package javaprogram;
import java.util.Scanner;
public class Multiplenum {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int Number=obj.nextInt();
		
		if(Number%2==0) {
			System.out.println(Number + " is a multiple of 2.");}
			else {
				System.out.println(Number + " is a not multiple of 2.");
			}
		}
	}
	
	


