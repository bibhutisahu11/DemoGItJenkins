package demo;

public class TestStudent {

	public static void main(String[] args) {
Student[] s=new Student[3];
s[0]=new Student(231);
s[1]=new Student(244);
s[2]=new Student(250);
for(int i=0;i<s.length; i++){
	System.out.println(s[i]);
}
for(Student k:s){
	System.out.println(k);
}
	}

}
