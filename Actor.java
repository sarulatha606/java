package java2;
import java.util.Scanner;

public class Actor {
	public static void main(String args[]){
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a actor name :");
		String actor=obj.nextLine();
		switch(actor) {
		case "Vijay":
			System.out.println("1.MASTER");
			System.out.println("2.LEO");
			System.out.println("3.BIGIL");
			System.out.println("4.KURUVI");
			System.out.println("5.PULI");
			System.out.println("ENTER A MOVIE NAME");
			String Movie=obj.nextLine();
			switch(Movie)
			{
			case "MASTER":
				System.out.println("MASTER IS A BLOCKBUSTER MOVIE ");
				break;
			case "LEO":
				System.out.println(" LEO IS A HIT MOVIE ");
				break;
			case "BIGIL":
				System.out.println(" BIGIL IS A BLOCKBUSTER MOVIE BASED WOMEN FOOTBALL ");
				break;
			case "KURUVI":
				System.out.println(" KURUVI IS A AVERAGE FAMILY MOVIE ");
				break;
			case "PULI":
				System.out.println(" PULI IS A FLOP MOVIE ");
				break;
			default:
				System.out.println("please enter the available movie name");
		
			
			}
			break;
		case "Rajini":
			System.out.println("JAILER");
			System.out.println("BAASHHA");
			System.out.println("SIVAJI");
			System.out.println("VETTAIYAN");
			System.out.println("LINGAA");
			System.out.println("Enter a movie name :");
			String Movie1=obj.nextLine();
			switch(Movie1) {
			case "JAILER":
				System.out.println("JAILER IS A BLOCKBUSTER MOVIE");
			case "BAASHHA":
				System.out.println("BAASHHA IS A SUPERHIT MOVIE");
			case "SIVAJI":
				System.out.println("SIVAJI IS A HIT MOVIE");
			case "VETTAIYAN":
				System.out.println("VETTAIYAN IS A FLOP MOVIE");
			case "LINGAA":
				System.out.println("LINGAA IS A FLOP MOVIE");
			default:
				System.out.println("please enter the available movie name");
		
			}
			break;
		case"SK":
			System.out.println("AMARAN");
			System.out.println("DON");
			System.out.println("REMO");
			System.out.println("PRINCE");
			System.out.println("HERO");
			System.out.println("please enter a Movie name ");
			String Movie2=obj.nextLine();
			
			switch(Movie2) {
			case "AMARAN":
				System.out.println("AMARANIS A SUPER BLOCKBUSTER MOVIE");
				break;
			case"DON":
				System.out.println("DON IS A SUPERHIT MOVIE");
				break;
			case "REMO":
				System.out.println("REMO IS A HIT MOVIE");
				break;
			case "PRINCE":
				System.out.println("PRINCE IS A FLOP MOVIE BUT ALSO THAT IS A COMEDY MOVIE");
				break;
			case "HERO":
				System.out.println("HERO IS A FLOP MOVIE");
				break;
			default:
				System.out.println("please enter the available movie name");
		
			}
			break;
		default:
		case"actor":
			System.out.println("please enter the available Actor name ");
			}
	   
	}

}
