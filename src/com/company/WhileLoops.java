package com.company;

public class WhileLoops {
    public static int addOdds(int n) {
        int sum = 0;
        int x = 1;
        while (x <= n) {
            sum += x;
            x+=2;
        }
        return sum;
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
    public static int howManyYears(double startpop, double endpopulation) {
        double pop = startpop;
        int years = 0;
        while (pop < endpopulation) {
            pop *=1.0113;
            years++;
        }
        return years;

    }

    public static void printSum(int n) {
        int sum = 1;
        int i = 2;
        System.out.print(1);
        while (i <= n) {
            System.out.print(" + " + i);
            i++;
            sum += i;
        }
        System.out.println(" = " + sum);
    }

    public static boolean isPerfectSquare2(int n)
    {
        int p = 1, sum = 0;
        while(sum<n)
        {
            sum +=p;
            p +=2;
        }
        return (sum == n);
    }

    public static void main(String[] args) {
        System.out.println("odds to 5 are " + addOdds(5));
        System.out.println("odds to 7 are " + addOdds(7));
        System.out.println("odds to 9 are " + addOdds(9));

        int m = 123;
        System.out.println("Sum of digits of " + m + " is " + sumDigits(m));
        m = 38076;
        System.out.println("Sum of digits of " + m + " is " + sumDigits(m));
        m = 5;
        System.out.println("Sum of digits of " + m + " is " + sumDigits(m));


        System.out.println("years 120 mil " +howManyYears(111.2, 120));
        System.out.println("years 150 mil " +howManyYears(111.2, 150));

        printSum(8);
        printSum(12);
        printSum(4);
        
        int n = 63;
        System.out.println(n + " is a perfect square - " + isPerfectSquare2(n));
        n = 64;
        System.out.println(n + " is a perfect square - " + isPerfectSquare2(n));



    }
}
