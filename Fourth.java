package java_ass;
import java.util.*;
public class Fourth {
    public static void main(String args[]) {
    	String a;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter any url:");
    	a=sc.nextLine();
    	String b = a.substring(a.indexOf('@')+1);
    	System.out.println(b);
    	sc.close();
    }
}
