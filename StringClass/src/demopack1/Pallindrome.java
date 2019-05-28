package demopack1;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.next();
		String s2="";
		for(int i=s1.length()-1;i>=0;i--){
			s2+=s1.charAt(i);}
			if(s1.equalsIgnoreCase(s2)){
				System.out.println("palindrome");
			}
				else{
					System.out.println("not pallindrome");
					
				}
			}
		}

	


