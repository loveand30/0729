import java.util.Random;

public class DoWhile_Demo3 {
	public static void main(String[] args) {
		int a,b,i=0;
		do {
			a = (int)(Math.random()*10+1);
			b = (int)(Math.random()*10+1);
			i++;
		}while(a==b||5>=i && i >=1);
		System.out.println(i);
		System.out.printf("%d, %d",a,b);
	}
}
