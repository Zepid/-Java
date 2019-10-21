package thread1;

public class T62 {
	public static void main(String[] args) {
		Xin a = new Xin();
		new Thread(a).start();
		for(int i=0;i<100;i++)
		System.out.println("main!");
	}
}
class Xin implements Runnable{
	
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("new!");
		}
	}
}