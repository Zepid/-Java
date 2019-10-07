package asd;

abstract class /*final*/ Animal2{
	String name;
	void shout() {
		System.out.println("Ω–£°");
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
		Dog1 gd=new Dog1();
		gd.name="π∑µ∞";
//		gd.printname();
		gd.shout();
		gd.run();
	}
}