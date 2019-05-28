package runtime;

public class Test2 {
static void call(D d1){
	d1.t1();
}
	public static void main(String[] args) {
      call(new  D());
      call(new  E());
      call(new  F());

	}

}

class D{
	
void t1(){
	System.out.println("t1 running in D....");
}
}
class E extends D{
void t1(){
	System.out.println("t1 running in E");
}
}
class F extends D{
void t1(){
	System.out.println("t1 running in F");
}}
