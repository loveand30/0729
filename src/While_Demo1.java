import java.util.Scanner;

public class While_Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
		System.out.print("정수 한개 :");
		int su=sc.nextInt();
		System.out.print(su+"는"+((su%2==0)? "짝수 입니다.":"홀수 입니다."));
		System.out.println("Afain(y/n)?:");
		String yes=sc.next();
		
		if(yes.equals("n")||yes.equals("N")) break;
		
		}
	}
}	
