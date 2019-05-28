package compiletime;

public class Demo {
	static void add(int a,int b){
		System.out.println(a+b);
	}
	static void add(int a,double b,int c){
		System.out.println(a+b+c);
	}
	static void add(double a,double b){
		System.out.println(a+b);
	}

	public static void main(String[] args) {
     add(2.2,3.5);
     add(8,9.3,9);
     add(8,7);
	}

}
