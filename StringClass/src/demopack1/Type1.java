package demopack1;

public class Type1 {

	public static void main(String[] args) {
int []a={67,46,68,55,89};
int big=a[0];
for(int i=0;i<a.length;i++){
	if(big<a[i]){
		big=a[i];
	}
}
System.out.println(big);
	}

}
