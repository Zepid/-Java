package asd;

abstract class /*final*/ Animal2{
	String name;
	void shout() {
		System.out.println("�У�");
	}
	abstract void run();
	public Animal2(String name) {
		System.out.println("name="+name);
	}
}

class Dog1 extends Animal2{
//	public void printname() {
//		System.out.println("name="+super.name);
//	}
	public Dog1() {
		super("������");
	}
	void shout() {
		System.out.println("������");
	}
	void run() {
		System.out.println("�ý�");
	}
	
}
public class Unit4 {
	public static void main(String[] args) {
		Dog1 gd=new Dog1();
		gd.name="����";
//		gd.printname();
		gd.shout();
		gd.run();
	}
}