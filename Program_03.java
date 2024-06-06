//Given an integer n,return the number of trailing zeroes in n! 

import java.util.Scanner;

public class Program_03 {
    public static int trailingZero(int n) {
        int sum = 0;
        while (n / 5 > 0) {
            sum = sum + (n / 5);
            n = n / 5;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int ans = trailingZero(n);
        System.out.println(ans);
        sc.close();
    }
}
