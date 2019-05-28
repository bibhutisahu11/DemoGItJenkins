package demo;

public class Demo {

	public static void main(String[] args) {
int[]a=new int[4];
a[0]=2;
a[1]=8;
a[2]=8;
a[3]=a[0]+10;
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
	}
for(int i:a){
	System.out.println(i);
}
}
}