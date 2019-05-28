package demo;

public class TestInterface {

	public static void main(String[] args) {
		Person []p=new Person[2];
		p[0]=new Anniyan();
		p[1]=new Remo();
		for(int i=0;i<p.length;i++){
			System.out.println(p[i].toString());
			p[i].behave();
		}
		
		

	}

}
 interface Person{
	void behave();
}

 class Anniyan implements Person{
public String toString(){
	return "Anniyan";
}
public void behave(){
	System.out.println("crime scene behaves like an anniyan");
}
public void kill(){
	System.out.println("kills if someone's rrule is broken");
}
}
class Remo implements Person{ 
	public String toString(){
		return "Remo";
	}
	public void behave(){
		System.out.println("Remo the loverboy behavior");
	}
	public void jolly(){
		System.out.println("party...enjoys life");
	}
}

