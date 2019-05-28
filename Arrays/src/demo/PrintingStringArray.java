package demo;

import java.util.Arrays;

public class PrintingStringArray {

	public static void main(String[] args) {
String []arr=new String[3];
arr[0]="java";
arr[1]="lava";
arr[2]="gava";
for(String s:arr){
	System.out.println(s);
}
System.out.println(Arrays.toString(arr));
	}

}
