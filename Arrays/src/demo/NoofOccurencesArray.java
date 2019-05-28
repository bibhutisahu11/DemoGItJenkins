package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class NoofOccurencesArray {

	public static void main(String[] args) {
int[]arr1={10,12,13,14,12,13,11,10,10,13,15,15};
int[] arr2 = new int[arr1.length];
Arrays.sort(arr1);

for (int i = 0; i < arr1.length; i++) {
    arr2[i]++;
    if (i+1 < arr1.length) 
    {
        if (arr1[i] == arr1[i + 1]) {
            arr2[i]++;
            i++;
        }
    }
}

for (int i = 0; i < arr1.length; i++) {
    if(arr2[i]>0)
    System.out.println(arr1[i] + ":" + arr2[i]);
}


	}

}
