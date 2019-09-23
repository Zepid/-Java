package asd;

interface Animal1{
	void shout();
}
public class Unit4plus {
	public static void main(String[] args) {
		
		class Cat implements Animal1{
			public void shout() {
				System.out.println("~~");
			}
		}
		animalShout(new Cat());
		
		
		animalShout(new Animal1(){
			public void shout() {
				System.out.println("~~");
			}
		});
		
	}
	
	
	public static void animalShout(Animal1 an) {
		an.shout();
	}
}