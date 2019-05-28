package demopack1;

import java.util.Scanner;

public class NonRepeatingCharacterPrint {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a string");
		String s=scn.next();
	
		char[] carr = s.toCharArray();
		String nrs = "";
		for(int i=0;i<=carr.length-1;i++){
			char c = carr[i];
			int counter=0;
			for(int j=0;j<=carr.length-1;j++){
				if(c == carr[j]){
					counter=counter+1;
				}
			}
			if(counter == 1){
				nrs=nrs+carr[i];
				break;
			}
		}
		System.out.println(nrs);
	}

}
