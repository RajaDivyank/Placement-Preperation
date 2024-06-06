//Write a program to take 2 number from users and find out the distance between them.

import java.util.Scanner;

public class Program_06 {
    public static int findDistance(int n1, int n2) {
        int number = n1 ^ n2;
        int count = 0;
        while (number > 0) {
            if (number % 2 != 0) {
                count++;
            }
            number = number / 2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int n2 = sc.nextInt();
        System.out.println(findDistance(n1, n2));
    }
}
