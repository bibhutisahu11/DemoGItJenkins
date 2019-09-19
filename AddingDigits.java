import java.util.Scanner;


public class AddingDigits {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String inputstring=scan.next();
		char[]arr=inputstring.toCharArray();
		int sum=0;
		boolean flagRegex = inputstring.matches("([A-Za-z]+[0-9]|[0-9]+[A-Za-z])[A-Za-z0-9]*");
		  if (flagRegex == true) {
		for(int i=0;i<arr.length;i++){
			char c=arr[i];
			
			if(Character.isDigit(c)){
				sum=sum+Character.getNumericValue(c);
			}
		}
		  
		
		System.out.println(sum);}
		else{
			System.out.println("not alphanumeric");
		}
		

	}
}