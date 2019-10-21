package thread1;

public class T1 {
	public static void main(String[] args) {
		Daoshu a = new Daoshu();
//		a.start();
//		new Daoshu().start();
		
//		Thread b = new Thread(a);
//		b.start();
		new Thread(a,"´°¿Ú1").start();
		new Thread(a,"´°¿Ú2").start();
		for(int i=0;i<15;i++) {
//			System.out.println("asd");
		}
	}
}
//class Daoshu extends Thread{
//	public void run() {
//		for(int j=0;j<15;j++) {
//			System.out.println("qwe");
//		}
//	}
//}

class Daoshu implements Runnable{
	private int tickets=10;
	public void run() {
		while(true) {
			if(tickets>0) {
			Thread tb = Thread.currentThread();
			String b_name = tb.getName();
			System.out.println(b_name+"Âô"+tickets--);
			}
		}
	}
}