
public class Quiz {
	
	public static int sumEvens(int beg, int end)
	{
		int sum = 0;
		if(beg%2==1) beg++;
		for(int i = beg; i <= end; i +=2){
			sum += i;
		}
		return sum;
	}
	public static int sumOdds(int beg, int end)
	{
		int sum = 0;
		if(beg%2==0) beg++;
		for(int i = beg; i <= end; i +=2){
			sum += i;
		}
		return sum;
	}
	
	public static int sumOdds2(int beg, int end)
	{
		int sum = 0;
		
		for(int i = beg; i <= end; i++){
			if(i%2==1)  sum += i;
		}
		return sum;
	}
	
	public static double sumSeries(int n)
	{
		double sum = 0.0;
		for(int i = 1; i <=n; i++)
		{
			if(i%2 == 0)
				sum -= 1.0/i;
			else
				sum += 1.0/i;
		}
		return sum;
	}
	
	public static void numTriangle(int n)
	{
		for(int i=1; i <= n; i++){
			for(int k = 1; k <= i; k++)
				System.out.print(i);
			System.out.println();
		}
	}
	
	public static void numTriangle2(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			int ns = n-i;
			for(int j = 0; j < ns; j++)
			{
				System.out.print("&");
			}
			for(int k = 1; k <= i*2; k++)
			{
				System.out.print(i*2);
			}
			for(int j = 0; j < ns; j++)
			{
				System.out.print("&");
			}
			System.out.println();
		}
	}
	public static void numTriangle3(int n)
	{
		for(int i = n; i >= 1; i--)
		{
			
			for(int j = 1; j<=n-i+1; j++)
			{
				System.out.print(i);
			}
			
			System.out.println();
		}
	}
	public static void oddTriangle(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = n-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i*2; k+=2) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
	public static void whatsIt()
	{
		for(int i = 0; i < 4; i++){
			for (int j = 1; j <= 4; j++)
			{
				for (int k = i; k <= 4; k++)
				{
					System.out.print("#");
				}
				for(int m = 0; m < j; m++){
					System.out.print("?");
				}
			}
			System.out.println();
			
		}
	}
	public static boolean hasAnOddDigit(int x)
	{
		while(x>0){
			int d = x%10;
		    if(d%2==1)
		    	return true;
		    x = x/10;
		}
		return false;
	}
	
	public static void hashStars() {
		for (int i = 1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("#");
			}
			for(int j=i; j<=6; j++) {
				System.out.print("**");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static int biggestDigit(int num)
	{
		int big = 0;
		while(num>0)
		{
			int digit = num%10;
			if(digit> big)
				big = digit;
			num/=10;
		}
		return big;
	}
	
	public static int biggestDigit2(int num)
	{
		String s = ""+num;
		int search = 9;
		int pos = -1;
		while(pos<0)
		{
			pos = s.indexOf("" +search);
			System.out.println(search + " " + pos);
			search--;
		}
		return search;
	}
	
	public static void mc1()
	{
		int n = 2005;
		for(int i = 0; i < 50; i++)
			n = (n+3)/2;
		
		System.out.println(n);
		
		int p = 3, q = 1, sum = 0;
		while(p <=10)
		{
			sum += p%q;
			p++;
			q++;
		}
		System.out.println(sum);
		
		int count1 = 0, count2 = 0, inc = 1;
		for(int i = 0; i < 11; i++)
		{
			count1 += inc;
			inc = -inc;
			count2 += inc;
		}
		System.out.println(count1-count2);
		double x = 1.5;
		x++;
		System.out.println(x);
	}
	
	public static void ticTacToe(int x, int y) {
		for(int i = 1; i <= x; i++) {
			
			for(int j = 1; j<=y; j++) {
				//if(i%2==0 && j%2==0 || i%2==1 && j%2==1) {
				if((i+j)%2==1) {
					System.out.print("O");
				}
				else {
					System.out.print("X");
				}
			}

			System.out.println();
		}
	}
	public static int sumTo(int x) {
		int sum = 0;
		int i = 0;
		while (sum <x) {
			i++;
			sum += i;
		}
		return i;
	}
	public static int sumTo2(int x) {
		int sum = 0;
		int i=0;
		for(i = 1; sum<x; i++) {
			sum+=i;
		}
		return i-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumEvens(4, 10));
		System.out.println("sum odds 5 to 12 " + sumOdds(5,12));
		System.out.println("sum odds 5 to 12 " + sumOdds2(5,12));
		//numTriangle(4);
		//numTriangle2(4);
		numTriangle3(8);
		whatsIt();
		System.out.println("9876 " + biggestDigit(9876));
		System.out.println("1234 " + biggestDigit(1234));
		System.out.println("5 " + biggestDigit(5));
		System.out.println("80 " + biggestDigit(80));
		System.out.println("2234" + hasAnOddDigit(2234));
		System.out.println("2284" + hasAnOddDigit(2284));
		
		System.out.println("fractions 100 " + sumSeries(100));
		//mc1();
		//System.out.println("1234 " + biggestDigit2(1234));
		oddTriangle(4);
		ticTacToe(4,6);
		ticTacToe(5,8);
		ticTacToe(8,7);
		ticTacToe(5,3);
		hashStars();
		System.out.println(sumTo(13));
		System.out.println(sumTo(21));
		System.out.println(sumTo2(13));
		System.out.println(sumTo2(21));
	}

}
