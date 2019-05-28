package demopack1;

import java.util.Scanner;

public class PrintCharOfString {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("Enter a string");
String s1=scn.next();
String s2="";
char c;
for(int i=0;i<=s1.length()-1;i++){
	c=s1.charAt(i);
	if((s2.indexOf(c))== -1){
		s2=s2+c;
	}

}
System.out.println(s2);

	}

}
