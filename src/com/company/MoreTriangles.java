package com.company;
public class MoreTriangles {

	public static void eights(){

		for(int i = 8; i >=2; i = i - 2){
			for(int j = 0; j < (8-i)/2; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void alternate(int n) {
		for(int i = 1; i <=n; i++) {
			if(i%2==1) {
				for(int k = 1; k <= i; k++) {
					System.out.print(k);
				}
			}
			else {
				for(int k = i; k>=1; k--) {
					System.out.print(k);
				}
			}
			System.out.println();
		}
	}

		public static void isosceles(int n) {
		for (int i = 1; i <=n; i++) {
			for(int s = 1; s <= n-i; s++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			for(int k = i-1; k>0; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	public static void upSideDown(int big, int small){
		int n = big-small;
		for (int i = 0; i <= n; i++){
			for(int k = 0; k < i; k++){
				System.out.print(" ");
			}
			for(int j = big-i; j >= small; j--){
				System.out.print(j);
			}
			for(int j = small+1; j <= big-i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eights();
		System.out.println();
		alternate(7);
		System.out.println();
		alternate(4);
		System.out.println();
		isosceles(5);
		System.out.println();
		isosceles(8);
		System.out.println();
		upSideDown(9,5);
		System.out.println();
		upSideDown(8,3);
		System.out.println();
		upSideDown(7,1);
	}

}
/**
 *
 88888888
  666666
   4444
    22

 1
 21
 123
 4321
 12345
 654321
 1234567

 1
 21
 123
 4321

 1
 121
 12321
 1234321
 123454321

 1
 121
 12321
 1234321
 123454321
 12345654321
 1234567654321
 123456787654321

 987656789
  8765678
   76567
    656
     5

 87654345678
  765434567
   6543456
    54345
     434
      3

 7654321234567
  65432123456
   543212345
    4321234
     32123
      212
       1

 */