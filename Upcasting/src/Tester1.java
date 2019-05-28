
public class Tester1 {

	public static void main(String[] args) {
		Animal animal = new Dog(); //upcasting
		animal.move();
	//  animal.bark(); //not allowed
	}

}

class Animal{
	void move(){
		System.out.println("animal moving..");
	}
}

class Dog extends Animal{
	
	void move() {
		System.out.println("dog moving..");
	}
	void bark(){
		System.out.println("dog barking..");
	}
}