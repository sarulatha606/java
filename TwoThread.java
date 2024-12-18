package java3;

public class TwoThread extends Thread{
	
	public void run() {
		for (int i = 1; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
	}
		
		for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }

}
	public static void main(String args[]) {
		TwoThread t1=new TwoThread();
		t1.start();	
		}
}