package demo;

import java.util.Arrays;

public class NumberOccurencesTest {

	public static void main(String[] args) {

	        int[] a = {1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1};
	        int  counter=1;
	        for(int i=0;i<=a.length-1;i++){
	        	if(a[i]!='@')
	        	{
	        	if(a[i]==a[i+1]){
	        		counter++;
	        		a[i+1]='@';
	        	}
	        	System.out.println(a[i]+" "+counter);
	        	}
	        	
	        }

	}}
