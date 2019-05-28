package demo;

public class TestS {

	public static void main(String[] args) {
Student1[]s=new Student1[3];
s[0]=new Student1(231);
s[1]=new Student1(456);
s[2]=new Student1(789);
for(int i=0;i<s.length;i++){
	System.out.println(s[i]);
}
for(Student1 k:s){
	System.out.println(k);
}
	}

}
class Student1{
	int stid;
	Student1(int stid){
		this.stid=stid;
	}
	public String toString(){
		return"Student id is:"+stid;
	}
}