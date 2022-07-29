
public class pr5 {
	public static void main(String[] args) {
		
		int count=1;
		int a=65;
		while(count<=26) {
			
		System.out.print((char)a);
		count++;
		//---------------------------
		
			if (count%5==0) {
				System.out.println();
		//---------------------------
				if (count%10==0) {
					a-=32;
				}else{
					a+=32;
			}
			}
		a++;
		
		}
	}
}