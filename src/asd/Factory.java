package asd;

import asd.*;
public class Factory{
	public Object Factory(final char name){
		switch(name){
			case 'd':
			return new Dog();
			case 'c':
			return new Cat();
			default:
			break;
		}
		return null;
	}

	public Animal creatAnimal(char c) {
		// TODO Auto-generated method stub
		return null;
	}
}