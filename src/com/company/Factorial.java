
public class Factorial {
	public long calcFactorial(int n)
	{
		long fact = 1;
		
		for(int i = n; i >1; i--)
		{
			fact *=i;
		}
		return fact;
	}

	public double calcE()
	{
		double e = 1;
		double olde = 0;
		int x = 1;
		while(e-olde > .001)
		{
			olde = e;
			e += 1.0/calcFactorial(x);
			x ++;
		}
		return e;
	}
	
	public double calcEX(int x)
	{
		double ex = 1;
		double oldex = 0;
		int y = 1;
		while(ex-oldex > .001)
		{
			oldex = ex;
			//double p = Math.pow(x, y);
			//long f = calcFactorial(y);
			//System.out.println(p + " " + f);
			//ex += p/f;
			ex += Math.pow(x,y)/calcFactorial(y);
			y++;
		}
		return ex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial f = new Factorial();
		for(int y = 1; y <=20; y++)
		{
			long x = f.calcFactorial(y);
			System.out.println(y + " factorial is " + x);
		}
		
		// calculate e
		double e = f.calcE();
		System.out.println("e is " + e);
		System.out.printf("e is %2.3f \n", e);
		
		// e to the x
		for(int y = 1; y <=5; y++)
		{
			double z = f.calcEX(y);
			//System.out.println("e to the power " + y + " is " +z);
			System.out.printf("e to the power %d is %2.3f\n", y, z);
	
		}
	}

}
/*
1 factorial is 1
2 factorial is 2
3 factorial is 6
4 factorial is 24
5 factorial is 120
6 factorial is 720
7 factorial is 5040
8 factorial is 40320
9 factorial is 362880
10 factorial is 3628800
11 factorial is 39916800
12 factorial is 479001600
13 factorial is 6227020800
14 factorial is 87178291200
15 factorial is 1307674368000
16 factorial is 20922789888000
17 factorial is 355687428096000
18 factorial is 6402373705728000
19 factorial is 121645100408832000
20 factorial is 2432902008176640000
e is 2.7182539682539684
e is 2.718 
e to the power 1 is 2.718
e to the power 2 is 7.389
e to the power 3 is 20.086
e to the power 4 is 54.598
e to the power 5 is 148.413
*/