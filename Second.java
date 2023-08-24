package java_ass;
import java.util.*;
public class Second {
	public static void main(String args[]) {
		int month,year;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter month no.:");
		month=sc.nextInt();
		System.out.print("Year:");
		year=sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("January");
			System.out.println("The no. of days in this month is 31");
			break;
		case 2:
			System.out.println("Feburary");
			if(year%4==0||year%400==0&&year%100!=0) {
				System.out.println("The no. of days in this month is 29");
			}
			else {
				System.out.println("THe no. of days in this month is 28");
			}
			break;
		case 3:
			System.out.println("March");
			System.out.println("The no. of days in this month is 31");
			break;
		case 4:
			System.out.println("April");
			System.out.println("The no. of days in this month is 30");
			break;
		case 5:
			System.out.println("May");
			System.out.println("The no. of days in this month is 31");
			break;
		case 6:
			System.out.println("June");
			System.out.println("The no. of days in this month is 30");
			break;
		case 7:
			System.out.println("July");
			System.out.println("The no. of days in this month is 31");
			break;
		case 8:
			System.out.println("August");
			System.out.println("The no. of days in this month is 31");
			break;
		case 9:
			System.out.println("September");
			System.out.println("The no. of days in this month is 30");
			break;
		case 10:
			System.out.println("October");
			System.out.println("The no. of days in this month is 31");
			break;
		case 11:
			System.out.println("November");
			System.out.println("The no. of days in this month is 30");
			break;
		case 12:
			System.out.println("December");
			System.out.println("The no. of days in this month is 31");
			break;
		default:
			System.out.println("Invalid");	
		}
		sc.close();
	}
}
