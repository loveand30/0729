import java.util.Scanner;
import java.util.GregorianCalendar;

public class MyCalender {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		GregorianCalendar gr=new GregorianCalendar();
		
		System.out.print("몇 년 : "); int year=sc.nextInt();
		System.out.print("몇 월 : "); int month=sc.nextInt();
		
		int day=1;
		int sum=0;
		for(int i=1; i<year; i++) {
			if(year%400==0||(year%4==0&&year%1000!=0
					))
			{
				sum += 366;
				
			}
			else {
				sum += 365;
			}
		}
		for(int i=1; i<month; i++) {
			sum += getLastDay(year, i);
		}
		
		sum++;
		int space=sum%7;
		for (int i=0; i<space; i++)		{
			
		System.out.print("* ");
//		case 0 : System.out.println("일"); break;
//		case 1 : System.out.println("월"); break;
//		case 2 : System.out.println("화"); break;
//		case 3 : System.out.println("수"); break;
//		case 4 : System.out.println("목"); break;
//		case 5 : System.out.println("금"); break;
//		case 6 : System.out.println("토"); break;
//		
		}
		
		}
		static int getLastDay(int year,int month) {
			int lastDay=0;
			if(month==2) {
				if (year%400==0||(year%4==0&&year%1000!=0
						))
					return 29;
				else return 28;
			}else if(month !=2) {
				if (month==1||month==3||month==5||month==7||month==8||month==10||month==12)
					lastDay = 31;
				else lastDay = 30;
			}
			return lastDay;
		
		
	}
}
