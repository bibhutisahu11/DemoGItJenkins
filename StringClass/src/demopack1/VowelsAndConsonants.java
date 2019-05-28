package demopack1;

public class VowelsAndConsonants {

	public static void main(String[] args) {
String a="i love football15";
int vowels=0;
int consonants=0;
int digits =0;
int spaces=0;
a=a.toLowerCase();
for(int i=0;i<a.length();i++){
	char ch=a.charAt(i);

    if(ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowels;

}
    else if((ch >= 'a'&& ch <= 'z')) {
        ++consonants;
    }
    else if( ch >= '0' && ch <= '9')
    {
        ++digits;
    }
    else if (ch ==' ')
    {
        ++spaces;
    }
}
System.out.println("Vowels: " + vowels);
System.out.println("Consonants: " + consonants);
System.out.println("Digits: " + digits);
System.out.println("White spaces: " + spaces);
	}

}
