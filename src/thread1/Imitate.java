package thread1;

public class Imitate {
	public static void main(String[] args) {
		Jc a = new Jc();
		new Thread(a,"��1����").start();
		new Thread(a,"��2����").start();
		new Thread(a,"��3����").start();
	}
}
class Jc implements Runnable{
	private int thel=60;
	public void run(){		
		while(true) {
			if(thel>0) {
			Thread tr = Thread.currentThread();
			String a_name = tr.getName();
			System.out.println(a_name+"�������ص�"+thel--+"����");
			}
		}
		
	}
}