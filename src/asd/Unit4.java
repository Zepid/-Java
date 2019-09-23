package asd;

abstract class /*final*/ Animal{
	String name;
	void shout() {
		System.out.println("Ω–£°");
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
		super("π∑µ∞£°");
	}
	void shout() {
		System.out.println("ÕÙÕÙ£°");
	}
	void run() {
		System.out.println("”√Ω≈");
	}
	
}
public class Unit4 {
	public static void main(String[] args) {
		Dog gd=new Dog();
		gd.name="π∑µ∞";
//		gd.printname();
		gd.shout();
		gd.run();
	}
}