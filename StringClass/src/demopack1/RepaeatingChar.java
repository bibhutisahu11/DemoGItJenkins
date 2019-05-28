package demopack1;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class RepaeatingChar {

	public static void main(String[] args) {
		String s1 = "abcdaabccc";
		Set<Character> s = new HashSet<Character>();
		for(int i=0;i<=s1.length()-1;i++){
			s.add(s1.charAt(i));
		}
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			char c = (Character) itr.next();
			 int counter=0;
			for(int i=0;i<=s1.length()-1;i++){
				if(c==s1.charAt(i)){
					counter++;
				}
			}
			System.out.println(c+" : "+counter);
		}
	}
}
