
public class Triangles {
	public static final int N = 8;
	public static void main(String[] args) {
		
		int stars = 1;
		int counter = 8;
		
		for(int i = 1; i <= N; i++)
		{
			for(int j = 1; j < counter; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= stars; k++)
			{
				//System.out.print(" ");
				System.out.print(i);
			}
			System.out.println();
			stars++;
			counter--;
		}

	}

}
/*public static void main(String[] args) {
		int n = 7;
		int stars = 1;
		int counter = 7;

		for(int i = 1; i <= n; i++)
		{
			for(int j = 1; j <= n-i; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				//System.out.print(" ");
				System.out.print(i);
			}
			System.out.println();
			stars++;
			counter--;
		}

	}

}

/*
      1
     22
    333
   4444
  55555
 666666
7777777
*/