package asd;

//import asd.*;
public class Factory{
	public void factory(){
		
	}
	public Animal creat(String c) {
		switch(c){
		case "Dog":
		return new Dog();
		case "Cat":
		return new Cat();
		default:
		break;
	}
		return null;
	
	}

}