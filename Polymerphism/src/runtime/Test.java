package runtime;

public class Test {
	static void wish(A a1){
		a1.m1();
	}

	public static void main(String[] args) {
		wish(new A());
         wish(new B());
         wish(new C());
	
		
		
	}

}
class A{
	 void m1(){
		System.out.println("m1 running in A....");
	}
}
class B extends A{
	 void m1(){
		System.out.println("m1 running in B....");
	}
}
class C extends A{
	 void m1(){
		System.out.println("m1 running in C....");
	}
}
