package thread1;

public class T63 {
	public static void main(String[] args) {
		Fanote a = new Fanote();
		new Thread(a,"老师1").start();
		new Thread(a,"老师2").start();
		new Thread(a,"老师3").start();
	}
}
class Fanote implements Runnable{
	private int note=80;
	public void run() {
		while(true) {
			if(note>0) {
			Thread tr = Thread.currentThread();
			String a_name = tr.getName();
			System.out.println(a_name+"发第"+note--+"本学习笔记");
			}
		}
	}
}