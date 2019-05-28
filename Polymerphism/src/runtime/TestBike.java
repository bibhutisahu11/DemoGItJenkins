package runtime;

public class TestBike {
	static void ride (Bike b1){
		b1.start();
	}

	public static void main(String[] args) {
ride(new Ninja());
ride(new HeroHonda());
	}

}
interface Bike{
	void start();
		
	}
class HeroHonda implements Bike{
	public void start(){
		System.out.println("starts with kick");
	}
}
class Ninja implements Bike{
	public void start(){
		System.out.println("self start");
	}
}