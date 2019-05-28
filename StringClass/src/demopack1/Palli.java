package demopack1;

import java.util.Scanner;

public class Palli {

	public static void main(String[] args) {
		Scanner  scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.next();
		

String s2="";
for(int i=s1.length()-1;i>=0;i--){
	s2+=s1.charAt(i);
	
}
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));

	}

}
