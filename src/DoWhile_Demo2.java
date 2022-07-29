import java.util.Scanner;

public class DoWhile_Demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String yes;
		do {
		System.out.print("정수 한개 :");
		int su=sc.nextInt();
		System.out.print(su+"는"+((su%2==0)? "짝수 입니다.":"홀수 입니다."));
		System.out.print("Afain(y/n)?:");
		yes=sc.next();
		
		
		}while(yes.equals("y")||yes.equals("Y"));
			
	}
	}

