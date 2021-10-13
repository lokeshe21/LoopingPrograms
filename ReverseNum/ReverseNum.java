package ja.pac1;

public class ReverseNum {
	public static void main(String[] args) {
		int n=1020304;
		ReverseNum ob=new ReverseNum();
		ob.outpt(n);
		
		
	}

	private void outpt(int n) {
		int num=n;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
			
		}
		System.out.print(sum);
		
		
	}

}

/*output
 * 4030201*
 */
