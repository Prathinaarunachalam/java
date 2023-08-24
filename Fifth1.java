package java_ass;
import java.io.*;
public class Fifth1 {
	public static void main(String args[]) throws IOException {
		try {
			int x = Integer.parseInt("200");
			int y = Integer.parseInt("200");
			int z = x+y;
			System.out.println("the sum of x and y is :"+z);
			File a = new File("C:\\Users\\hai\\Desktop\\com\\java.txt");
			BufferedReader b=new BufferedReader(new FileReader(a));
			String c;
			while((c=b.readLine())!=null) {
				System.out.println(c);
			}
			int p = 4/0;
			System.out.println(p);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception");
		}
		catch(NullPointerException e) {
			System.out.println("parses of string from int exception");
		}
		catch(FileNotFoundException e) {
			System.out.println("exception occurs");
		}
		finally {
			System.out.println("Excecution completed");
		}
	}
}
