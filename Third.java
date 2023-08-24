package java_ass;
import java.util.*;
public class Third {
	public static void main(String args[]) {
		String a;
		int vowels=0,consonant=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string:");
		a=sc.nextLine();
		for (int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u') {
				vowels++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("Vowels:"+vowels);
		System.out.println("Consonants:"+consonant);
        sc.close();
	}
	
	

}
