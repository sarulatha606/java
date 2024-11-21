package java2;
import java.util.Scanner;
public class Actress {
	public static void main(String args[]) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a Actress name:");
		String Actress=obj.nextLine();
		switch(Actress) {
		case"SAMANTHA":
			System.out.println("Enter a co-actor name");
			String movie=obj.nextLine();
			switch(movie) {
			case "Vijay":
			System.out.println("THERI");
			System.out.println("MERSAL");
			System.out.println("KATTHI");
			break;
			case"SK":
				System.out.println("SEEMARAJA");
				
			break;
			case"Suriya":
				System.out.println("24");
				System.out.println("ANJAAN");
				break;
			default:
				System.out.println("PLEASE ENTER A AVAILABLE CO-STAR");
				break;
			}
			break;
		case"NAYANTHRA":
			
			System.out.println("Enter a co-actor name");
			String movie1=obj.nextLine();
			switch(movie1) {
			case "Vijay":
			System.out.println("BIGIL");
			System.out.println("");
			
			break;
			case"SK":
				System.out.println("ME.LOCAL");
			break;
			case"Rajini":
				System.out.println("DARBAR");
				System.out.println("AANATHAA");
				System.out.println("CHANDRAMUKI");
				break;
			default:
				System.out.println("PLEASE ENTER A AVAILABLE CO-STAR");
				break;
			}
			break;
		case"KAJAL":
			System.out.println("Enter a co-actor name");
			String movie2=obj.nextLine();
			switch(movie2) {
			case "Vijay":
			System.out.println("JILLA");
			System.out.println("THUPPAKI");
			
			break;
			case"DHANUSH":
				System.out.println("MAARI");
			break;
			case"Suriya":
				System.out.println("MATTRAAN");
			
				break;
			default:
				System.out.println("PLEASE ENTER A AVAILABLE CO-STAR");
				break;
			}
			break;
			default:
				System.out.println("PLEASE ENTER THE AVAILABLE ACTRESS");
		}
		
	}
}
