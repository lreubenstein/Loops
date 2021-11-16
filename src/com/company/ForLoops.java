package com.company;

public class ForLoops {
    public static void main(String[] args) {
        System.out.println(addEvens(6));
        System.out.println(addEvens(10));
        System.out.println(addEvens(14));

        printSquaresBack(8);
        printSquaresBack(6);
        printSquaresBack(3);

   		sillyNumbers();
		sillyNumbers2();
		dollarsAndStars();

    }
    public static int addEvens(int n){
        int sum = 0;
        for(int i = 2; i <=n; i+=2){
            sum += i;
        }
        return sum;
    }

    public static void printSquaresBack(int n){

        for(int i = n; i >1; i--){
            System.out.print(i*i + ", ");
        }
        System.out.println(1);
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
}
