package java2;
import java.util.Scanner;
public class NestedFor {
	public static void main(String args[]) {
	System.out.print("Enter a number");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
	}
}
