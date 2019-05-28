package demopack1;

import java.util.Scanner;

public class PrintOccurences {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String a1=scn.next();
		System.out.println("enter the string to count");
		String a2=scn.next();
		char cha=a2.charAt(0);
		int count=0;
		for(int i=0;i<a1.length()-1;i++){
			if(a1.charAt(i)==cha){
				count++;
			}
			
		}
System.out.println(count);
	}

}
