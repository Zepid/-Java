package asd;

abstract class /*final*/ Animal{
	String name;
	void shout() {
		System.out.println("�У�");
	}
	abstract void run();
	public Animal(String name) {
		System.out.println("name="+name);
	}
}

class Dog extends Animal{
//	public void printname() {
//		System.out.println("name="+super.name);
//	}
	public Dog() {
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
		Dog gd=new Dog();
		gd.name="����";
//		gd.printname();
		gd.shout();
		gd.run();
	}
}