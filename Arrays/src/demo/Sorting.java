package demo;

public class Sorting {
	public static void main(String[] args) {

	int a[]={6,5,8,9,12,7};
	System.out.println(a.length);
	System.out.println("arrays before sort");
	for(int k:a){
		System.out.println(k);
	}
	
	System.out.println("arrays after sorting");
	int temp;
	for(int i=0;i<=a.length-2;i++){
		for(int j=0;j<=a.length-2;j++){
			if(a[j] > a[j+1]){
				temp = a[j];
				a[j]= a[j+1];
				a[j+1]=temp;
				

			}

	}
}
	for(int i:a){
		System.out.println(i);

	}

	}


}
