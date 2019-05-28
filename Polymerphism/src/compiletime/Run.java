package compiletime;

public class Run {

	public static void main(String[] args) {
		Bird b=new Dove();
		takeBird(b);
	}
static void takeBird(Bird b1){
	System.out.println("take bird with bird");
	b1.fly();
}
static void takeBird(Dove b1){
	System.out.println("take bird with bird");
	b1.fly();
}
}



class Bird{
	void fly(){
		System.out.println("fly() of bird....");
	}
}class Dove extends Bird{
	void fly(){
		System.out.println("fly() of Dove....");
	}
}