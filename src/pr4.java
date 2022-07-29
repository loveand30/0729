
public class pr4 {

		public static void main(String[] args) {
			
		int x, y;
		for(x=1, y=100; x<=100&&y>=1; x+=2, y-=3) {
			if(x>y)break;
		}
			System.out.printf("x=%d, y=%d", x, y);
			
//			for(int i=1; i<=10; i++) {
//				System.out.print(i+"\t");
//			}
			
		}
}
