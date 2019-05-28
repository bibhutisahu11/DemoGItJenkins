package demo;

public class LargestAndSmallest {

	public static void main(String[] args) {
int n[]= new int[]{7,76,88,34,6,2,8,10,33};
int smallest=n[0];
int largest=n[0];
for(int i=1;i<n.length;i++){
	if(n[i]>largest)
		largest=n[i];
	else if(n[i]<smallest)
		smallest=n[i];
	}
	System.out.println("largest no is:"+largest);
	System.out.println("smallest no is:"+smallest);

}
	}


