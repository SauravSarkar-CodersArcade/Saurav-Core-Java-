package Patterns;

import java.util.Scanner;

public class ZigZagPattern {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i=1; i<=3; i++){
            for (int j=1; j<=n; j++){
                if (((i+j)%4 == 0) || (i==2 && j%4==0)){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
