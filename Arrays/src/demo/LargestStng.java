package demo;


public class LargestStng {
	public static void main(String[] args) {
		int index=0;
		int largest=0;
		String [] s = {"dfsdf","jvvvvvnvnv","sdf","dffg"};
		for(int i=0; i<=s.length-1; i++){
			if(largest < s[i].length()){
				largest = s[i].length();
				index = i;
			}
		}
		System.out.println("largest string is : "+s[index]);
	}
	
}
