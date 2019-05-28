package runtime;

public class TestAnimal {
	static void animalActivity(Animal a1){
		a1.makeSound();
		a1.eat();
		a1.birth();
		if (a1 instanceof Tiger){
			Tiger t1=(Tiger)a1;
			t1.hunt();
		}
		else {
	
			Cow c1=(Cow)a1;
			c1.play();
		}
	}
		

	public static void main(String[] args) {
		animalActivity(new Tiger());
		animalActivity(new Cow());

	}

}
interface Animal{
	void makeSound();
	void eat();
	void birth();
	
}
class Tiger implements Animal{
	
public void makeSound(){
	System.out.println("tiger sound");

}
public void eat(){
	System.out.println("tiger eats deer");
}
public void birth(){
	System.out.println("Danger ones");
}
public void hunt(){
	System.out.println("Hunts for food");
}
}
class Cow implements Animal{
	public void makeSound(){
		System.out.println("cow sound");

	}
	public void eat(){
		System.out.println(" eats grass");
	}
	public void birth(){
		System.out.println("cute ones");
}
	public void play(){
		System.out.println("plays with human");
	}
}