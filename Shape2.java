package java2;
class Shape1{
	double parameter;
	float area;
	Shape1(double Parameter,float Area){
		this.parameter=Parameter;
		this.area=Area;
}
	public void display() {
		System.out.println("parameter:"+parameter+"\n"+"area:"+area);
		System.out.println("parameter *area="+parameter*area);
	}
}
class Rectangel extends Shape1{
	
	Rectangel(double Parameter,float Area){
		super(Parameter,Area);
	}
	public void display2() {
		System.out.println("parameter:"+parameter+"\n"+"area:"+area);
		System.out.println("parameter *area="+parameter*area);
	}
}
class Circle extends Shape1{
	Circle(double Parameter,float Area){
		super(Parameter,Area);
	}
	public void display3() {
		System.out.println("parameter:"+parameter+"\n"+"area:"+area);
		System.out.println("parameter *area="+parameter*area);
	}
}
class Triangle extends Shape1{
	Triangle(double Parameter,float Area){
		super(Parameter,Area);
	}
	public void display4() {
		System.out.println("parameter:"+parameter+"\n"+"area:"+area);
		System.out.println("parameter *area="+parameter*area);
	}
}
public class Shape2 {

	public static void main(String[] args) {
		Shape1 s1=new Shape1(123,445);
		System.out.println(s1.parameter);
		
	
	
	
		
		
	}
}