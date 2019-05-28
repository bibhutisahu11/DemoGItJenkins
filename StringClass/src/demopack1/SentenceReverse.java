package demopack1;

public class SentenceReverse {

	public static void main(String[] args) {
String s1="this is java";
String[]arr=s1.split(" ");

String s2=" ";
for(int i=arr.length-1;i>=0;i--) {
	s2=s2+arr[i];
	s2=s2+" ";
	}
System.out.print(s2);


}
}