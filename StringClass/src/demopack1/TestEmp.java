package demopack1;

public class TestEmp {

	public static void main(String[] args) {
Emp1 e1=new Emp1("amar",1001);
Emp1 e2=new Emp1("aMAr",1001);
System.out.println(e1.equals(e2));


	}

}
class Emp1{
	String name;
	int id;
	Emp1(String name,int id){
		this.name=name;
		this.id=id;
	}
	public String toString(){
		return "["+name+","+id+"]";
	}

public boolean equals (Object x){
	Emp1 e=(Emp1)x;
	return name.equalsIgnoreCase(e.name) && id==e.id;
}
}