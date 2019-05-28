package demo;

public class InterfaceArrays {

	public static void main(String[] args) {
		Person1[]p=new Person1[2];
		p[0]=new Anniyan1();
		p[1]=new Remo1();
for(Person1 per:p){
	System.out.println(per.toString());
	per.behavior();
	
}
	}

}
interface Person1{
	void behavior();
	
}
 class Anniyan1 implements Person1{
	public String toString(){
		return "Anniyan";
	}
	public void behavior(){
		System.out.println("crime scene anniyan behavior");
	}
	public void kill(){
		System.out.println("kills if rule is broken");
	}
}
 class Remo1 implements Person1{
	 public String toString(){
		 return "Remo";
	 }
	 public void behavior(){
		System.out.println("When see gurls behave like romeo"); 
	 }
	 public void jolly(){
		 System.out.println("enjoy;s life");
	 }
 }