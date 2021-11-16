package com.company;

public class AdvForLoops {
    public static void main(String[] args) {
        printOddDesign();
    }
    public static void printOddDesign(){
        for(int i = 1; i <=9; i+=2){
            for(int j = 0; j < (11-i)/2; j++){
                System.out.print("-");
            }
            for(int k = 1; k <=i; k++){
                System.out.print(i);
            }
            for(int j = 0; j < (11-i)/2; j++){
                System.out.print("-");
            }
            System.out.println();
        }

   }
}
