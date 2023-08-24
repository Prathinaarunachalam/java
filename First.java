package java_ass;
import java.util.*;
public class First {
	public static void main(String args[]) {
		int i,n=10,a,d;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a:");
		a=sc.nextInt();
		for(i=1;i<=n;i++) {
			d=i*a;
			System.out.println(i  + "x" +  a+ "=" +d );
		}
		sc.close();
	}
}

	
	


