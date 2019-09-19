
interface A{
	void m1();
}

public class B  implements A{
	
	public void m1(){
		System.out.println("in b");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new B();
a1.m1();
	}

}
