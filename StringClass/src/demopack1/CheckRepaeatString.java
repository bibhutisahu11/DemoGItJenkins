package demopack1;

public class CheckRepaeatString {

	public static void main(String[] args) {
		String input = "annotaionabcdnnfgdhnndskjnn";
		int index = input.indexOf("nn");
	
		int count = 0;
		while (index != -1) {
		    count++;
		    input = input.substring(index + 1);
		    System.out.println(input);
		    index = input.indexOf("nn");
		    System.out.println(index);
		}
		System.out.println("No of 'nn' in the input is : " + count);
	}
	
}
