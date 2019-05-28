package demo;

import java.util.HashSet;

public class ArrayCount {

	public static void main(String[] args) {
int[]a={10,12,13,12,12,13};
HashSet s=new HashSet();
for(int i:a){
	s.add(i);
}
for(Object i:s){
	System.out.println(i);
}
	}

}
