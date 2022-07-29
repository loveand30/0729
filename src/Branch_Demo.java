import java.util.Scanner;

public class Branch_Demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		for(int i=1; i<101; i++) {
//			if(i%7==0) {System.out.print(i+" ");
//			}
//			
//			}
//		
//		a :
//		for(int i=65; i<91; i++) {
//			int j=65;
////			b:
//			while(j<=i) {
//				System.out.printf("%c", j);
//				if(j==70) break a;
//				
//				j++;
//				
//			}
//			System.out.println();
//		}
//	
	String systemPassword = "ABCD";
	System.out.println("Input password");
	String userPassword=sc.nextLine();
	int i;
	for(i=0; i<4; i++) {
		if(systemPassword.charAt(i)==userPassword.charAt(i)) continue;
		else break;
	}if (i==4) 
		System.out.println("성공");
		else System.out.println("Failure");
	
		
	}
}
