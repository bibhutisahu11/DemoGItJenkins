package com;

public class Tester {

	public static void main(String[] args) {
		Animal abc = new Dog();
		
		move(abc);
	}
	
	static void move(Animal a1){
		a1.move();
	//	a1.bark();
	}

}

class Animal{
	void move(){
	}
}

class Cat extends Animal{
	
	void move() {
		System.out.println("cat moving");
	}
	void howl(){
		
	}
}

class Dog extends Animal{
	void move() {
		System.out.println("dog moving");
	}
	void bark(){
		
	}
}