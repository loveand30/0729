import java.util.Scanner;

public class Rotto_zzang {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int a;
//		a=10;
//		int b=5;
		
		int i;
		int []aa = new int[6];
		
		for(i=0; i<aa.length; i++) {
			aa[i] = (int)(Math.random()*45+1);
			int j=0;
			while(j<i){
				if (aa[i]==aa[j]) { 
					aa[i]=(int)(Math.random()*45+1);}
				else j++;
				
				
			}
			System.out.print(aa[i]+" ");
		}
	}
	
	
}
