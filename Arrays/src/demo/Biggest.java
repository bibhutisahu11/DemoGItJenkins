package demo;

public class Biggest {

	public static void main(String[] args) {
		int []a={10,12,17,1,5,6};
int big=a[0];
int small=a[0];
for(int i=0;i<a.length;i++){
	if(big<a[i]){
		big=a[i];
	}
	else if(small>a[i]){
		small=a[i];
	}
}
System.out.println("Biggest:"+big);
System.out.println("smallest:"+small);
	}

}
