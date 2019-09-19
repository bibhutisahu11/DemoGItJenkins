import java.util.Scanner;


public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the number");
		  Scanner scan = new Scanner(System.in);
		  int num = scan.nextInt();
		  int rem, temp, res=0;
		 
		          temp=num;
		          res = 0;
		 
		          while(temp!=0)
		          {
		              rem=temp%10;
		              temp=temp/10;
		              res=res+(rem*rem*rem);
		          }
		          if(num==res)
		              System.out.println(num+" is armstrong");
		          else
		           System.out.println(num+" is not armstrong");
		     }

	}


