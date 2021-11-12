package com.company;
import java.util.Scanner;

public class Loops {
	
		
	public static int sumUpToWhile(int n)
	{
		int sum = 0;
		int i = 1;	//initialize
		
		while (i <= n)	//test
		{
			
			sum += i;
			i++;		//increment
		}
		
		return sum;
	}
	
	public static int sumUpToFor(int n)
	{
		int sum = 0;

		for(int i = 1; i <= n; i++) { //initialize, test, increment
			sum += i;
		}

		return sum;
	}
	
	public static void biggest()
	{
		Scanner s = new Scanner(System.in);
		int max = -77777777;
		System.out.println("give me a number");
		int x = s.nextInt();
		while (x != 0) {
			if(x>max) {
				max = x;
			}
			System.out.println("give me a number");
			x = s.nextInt();
		}
		System.out.println(max);
	}
	public static boolean isPrime1(int n)
	{
		boolean noFactors = true;
		
		if (n<=1)
			return false;
		
		for (int m = 2; noFactors; m++)
		{
			if(m * m > n)
				break;
			if(n % m == 0)
				noFactors = false;
		}
		return noFactors;
	}
	
	public static boolean isPrime2(int n)
	{
		if(n <= 1)
			return false;
		
		int m = 2;
		
		while(m * m <= n)
		{
			if(n % m == 0)
				return false;
			m++;
		}
		return true;
	}
	
	public static void doublefor(int x) {
		for(int p=0, q=x; p<x && q>0; p++,q--) {
			System.out.println(p + " and " + q);
		}
	}
	
	public static void doWhile()
	{
		Scanner sc = new Scanner(System.in);
		int n;
		
		do
		{
			System.out.print("Enter an integer from 4 to 20: ");
			n = sc.nextInt();
		} while(n < 4 || n > 20);
		
		System.out.println("1 + 2 .....+ " + n + " = " + sumUpToFor(n));
	}
	
	public static void nested(int n)
	{
		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void upsideDownTriangle(int n)
	{
		for (int i = n; i >0; i--)
		{
			for(int j = 1; j <= i; j++)
			{
				System.out.print(""+i);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1 = sumUpToWhile(8);
		System.out.println("Sum up to 8 using while loop " + s1);
		
		int s2 = sumUpToFor(10);
		System.out.println("Sum up to 10 using for loop " + s2);
		
		System.out.println(isPrime1(14));
		
		System.out.println(isPrime2(25));
		biggest();
		
		//doWhile();
		//nested(6);
		//System.out.println();
		//upsideDownTriangle(7);
		//eights();
		//triangle(9);
		
	}
	
	public static void eights()
	{
		for(int i = 8; i >0; i-=2)
		{
			for(int s = 0; s < (8-i)/2; s++)
				System.out.print(" ");
			for(int k = 1; k <=i; k++)
				System.out.print(i);
			System.out.println();
		}
	}
	
	public static void triangle(int height)
	{
		for(int i = 1; i <=height; i++)
		{
			for(int s = 1; s <= height-i; s++)
				System.out.print(" ");
			for(int num = 1; num <= i; num++)
				System.out.print(num);
			System.out.println();
		}
	}

	
}
