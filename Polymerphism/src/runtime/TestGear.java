package runtime;

public class TestGear {

	public static void main(String[] args) {
Bike1[]b=new Bike1[2];
b[0]=new Hero();
b[1]=new Bajaj();
for(Bike1 bk:b){
	System.out.println(bk);
	bk.gear();
}

	}

}
interface Bike1{
	void gear();
}
class Hero implements Bike1{
	public void gear(){
		System.out.println("push backwards for changing gear");
	}
	public void sit(){
		System.out.println("sit somfortably");
	}
	public String toString(){
		return "Hero";
	}
}
class Bajaj implements Bike1{
	public void gear(){
		System.out.println("push front wards for gear change");
	}
	public void cc(){
		System.out.println("220 cc bike");
		
	}
	public String toString(){
		return "Bajaj";
	}
}
