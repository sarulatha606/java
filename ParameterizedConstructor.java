package java2;

public class ParameterizedConstructor {
	int id;String name;
	ParameterizedConstructor(int i,String s)
	{
		id=i;
		name=s;
		
	}
void display()
{
	System.out.println(id+" "+name);
}
public static void main(String arg[]) {
	ParameterizedConstructor p1=new ParameterizedConstructor(1,"saru");
	ParameterizedConstructor p2=new ParameterizedConstructor(2,"swetha");
	p1.display();
	p2.display();
}
}
