package asd;

//import Animal1.*;
//import Factory.*;

public class Example1{
	public static void main(String[] args){
		Factory factory=new Factory();
		Animal Dog = factory.creatAnimal('d');
		Animal Cat = factory.creatAnimal('c');
	}
}