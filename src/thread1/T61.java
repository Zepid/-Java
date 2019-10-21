package thread1;

public class T61 {
	public static void main(String[] args) {
//		Th1 a = new Th1();
//		a.start();	
		new Th1().start();
		new Th2().start();
		
	}
}
class Th1 extends Thread{
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("我是线程1!");
		}
	}
}
class Th2 extends Thread{
	public void run() {
		for(int j=0;j<50;j++) {
			System.out.println("我是线程2!");
		}
	}
}