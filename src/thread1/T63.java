package thread1;

public class T63 {
	public static void main(String[] args) {
		Fanote a = new Fanote();
		new Thread(a,"��ʦ1").start();
		new Thread(a,"��ʦ2").start();
		new Thread(a,"��ʦ3").start();
	}
}
class Fanote implements Runnable{
	private int note=80;
	public void run() {
		while(true) {
			if(note>0) {
			Thread tr = Thread.currentThread();
			String a_name = tr.getName();
			System.out.println(a_name+"����"+note--+"��ѧϰ�ʼ�");
			}
		}
	}
}