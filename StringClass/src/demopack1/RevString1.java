package demopack1;

import java.util.Scanner;

public class RevString1 {

	public static void main(String[] args) {
Scanner scn=new Scanner(System.in);
System.out.println("enter a string");
String s1=scn.next();
s1=s1.toLowerCase();
int n=s1.length();
int flag=1;
for(int i=0;i<n/2;i++){
	if((s1.charAt(i)) !=(s1.charAt(n-1-i))){
		flag=0;
		break;
		
	}
}
if( flag==1){
	System.out.println("paliindrome");
}
else{
	System.out.println("not pallinfrome");
}
	}

}
