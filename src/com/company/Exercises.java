import java.util.Scanner;

public class Exercises {
	
	public static int addOdds(int n)
	{
		int sum = 0;
		for (int i = 1; i <= n; i+=2)
		{
			sum += i;
		}
		return sum;
	}
	public static int addOdds2(int n)
	{
		int sum = 0;
		int x = 1;
		while (x <= n){
			sum += x;
			x++;
		}
		return sum;
	}
	
	public static int howManyYears(double startpop, double endpopulation) {
		double pop = startpop;
		int years = 0;
		while (pop < endpopulation) {
			pop *=1.0113;
			years++;
		}
		return years;
		
	}
	
	
	
	public static int sumDigits(int n)
	{
		int num = n;
		int sum = 0;
		while(num >= 1)
		{
			int dig = num%10;
			sum += dig;
			num/=10;
		}
		return sum;
	}
	
	public static void sillyNumbers()
	{
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <=9; j++) {
				for(int k = 0; k < 3; k++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	
	}
	
	public static void sillyNumbers2() {
		for(int i = 0; i < 4; i++) {
			for (int j = 9; j > 0; j--) {
				for(int k = 0; k < j; k++) {
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}
	
	public static void dollarsAndStars() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j< i; j++) {
				System.out.print("**");
			}
			for(int k = 0; k < 7-i; k++) {
				System.out.print("$");
			}
			for(int m = 0; m < 7-i; m++) {
				System.out.print("**");
			}
			for(int k = 0; k < 7-i; k++) {
				System.out.print("$");
			}
			for(int j = 0; j< i; j++) {
				System.out.print("**");
			}
		
		System.out.println();
		}
	}
	
	public static void printStarTriangle(int n)
	{
		for (int i = 1; i <= n; i++)
		{
			for(int j = 1; j < n-i+1; j++)
				System.out.print(" ");
			for (int k = 1; k <= 2*i-1; k++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void printSum(int n)
	{
		
		int sum = 1;
		System.out.print("1");
		for(int i = 2; i <=n; i++)
		{
			sum += i;
			System.out.print(" + " + i);
		}
		System.out.println(" = " + sum);
	}
	public static void printSum2(int n){
		int sum = 1;
		int i = 2;
		System.out.print(1);
		while (i<=n){
			System.out.print(" + " + i);
			i++;
			sum += i;
		}
		System.out.println(" = " + sum);
	}

	public static boolean isPerfectSquare(int n)
	{
		int sum = 0;
		for(int i = 1; i <= n; i+=2)
		{
			sum +=i;
			if (sum == n)
				return true;
		}
		return false;
	}
	public static boolean isPerfectSquare2(int n)
	{
//		int p = 1, sum = 0;
//		while(sum<n)
//		{
//			sum +=p;
//			p +=2;
//		}
//		return (sum == n);
		int count = 1;

		while (true)
		{
			n -= count;
			count += 2;

			if (n == 0) return true;
			if (n < 0) return false;

		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("odds to 5 are " + addOdds(5));
		System.out.println("odds to 7 are " + addOdds(7));
		System.out.println("odds to 9 are " + addOdds(9));

		int n = 63;
		System.out.println(n + " is a perfect square - " + isPerfectSquare2(n));
		n = 64;
		System.out.println(n + " is a perfect square - " + isPerfectSquare2(n));
		
		
		printSum2(8);
		
		int m = 123;
		System.out.println("Sum of digits of " + m + " is " + sumDigits(m));
		
		//printStarTriangle(6);
		
		System.out.println("years 120 mil " +howManyYears(111200000, 120000000));
		System.out.println("years 150 mil " +howManyYears(111200000, 150000000));
		System.out.println("years 150 mil " +howManyYears(120000000, 200000000));
//		//		sillyNumbers();
//		sillyNumbers2();
//		dollarsAndStars();

	}

}
/*
odds to 5 are9
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
Sum of digits of 123 is 6
years 120 mil 7
years 150 mil 27
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
999999999888888887777777666666555554444333221
$$$$$$$**************$$$$$$$
**$$$$$$************$$$$$$**
** **$$$$$**********$$$$$****
******$$$$********$$$$******
********$$$******$$$********
**********$$****$$**********
************$**$************
*/