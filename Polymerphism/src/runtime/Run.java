package runtime;
abstract class Car{
	abstract void start();
}
class Benz extends Car{
	void start(){
		System.out.println("Benz starts");
	}
}
class Audi extends Car{
	void start(){
		System.out.println("Audi starts");
	}
}
public class Run {
static void cal(Car a1){
	a1.start();
}
	public static void main(String[] args) {
		
		cal(new Benz());
		cal(new Audi());
		
	}

}
