package java3;
interface Faather{
	void age();
	void gender();
}
interface Mother{
	void age();
	void gender();
}
class Sonn implements Faather,Mother{
	public void age() {
		System.out.println("12");
	}
	public void gender() {
		System.out.println("f");
	}
}
class Daughter implements Faather,Mother{
	public void age() {
		System.out.println("34");
	}
	public void gender() {
		System.out.println("m");
	}
}
public class MultipleInterface {
	public static void main(String[] args) {
		Sonn s1=new Sonn();
		s1.age();
		s1.gender();
		Daughter d1=new Daughter();
		d1.age();
		d1.gender();
	}

}
