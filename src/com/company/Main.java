package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        System.out.println(m.multByTwo(64));
        System.out.println(m.multByTwo(8));
        m.countTo(10);
    }
    public  int multByTwo(int n){
        int count = 0;
        int product = 2;
        while(product <=n){
            product *=2;
            count++;
        }
        return count;
    }
    public void countTo(int n){
        int i = 0;
        while(i<=n){
            System.out.print(i + " ");
            i++;
        }
    }
}
