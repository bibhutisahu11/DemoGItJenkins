package demo;

public class Sorting1 {

	public static void main(String[] args) {
int[]a={10,12,17,8,6,5};
	int temp;
	for(int i=0;i<=a.length-2;i++){
		for(int j=0;j<=a.length-2;j++){
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			System.out.println(temp);
		}
	}
	}
}
