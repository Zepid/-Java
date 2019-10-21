package thread1;

public class Imitate {
	public static void main(String[] args) {
		Jc a = new Jc();
		new Thread(a,"第1引擎").start();
		new Thread(a,"第2引擎").start();
		new Thread(a,"第3引擎").start();
	}
}
class Jc implements Runnable{
	private int thel=60;
	public void run(){		
		while(true) {
			if(thel>0) {
			Thread tr = Thread.currentThread();
			String a_name = tr.getName();
			System.out.println(a_name+"正在下载第"+thel--+"部分");
			}
		}
		
	}
}