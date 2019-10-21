package thread1;

public class Ttaxi {
	public static void main(String[] args) {
		Tp a = new Tp();
		new Thread(a,"Taxi1").start();
		new Thread(a,"Taxi2").start();
		new Thread(a,"Taxi3").start();
		new Thread(a,"Taxi4").start();
		new Thread(a,"Taxi5").start();
	}
}
class Tp implements Runnable{
	private int passenger=100;
	public void run() {
		while(true) {
			if(passenger>0) {
			Thread tr = Thread.currentThread();
			String a_name = tr.getName();
			System.out.println(a_name+"ËÍµÚ"+passenger--+"Ãû³Ë¿Í");
			}
		}
	}
}