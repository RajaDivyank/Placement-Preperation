// Given an integer n,return the nth digit of the infinite integer sequence [1,2,3,4,5,6,.....].

import java.util.Scanner;

public class Program_04 {
    public static int findIndexValue(int n) {
        StringBuilder str = new StringBuilder();
        int i = 1;
        while (str.length() < n) {
            str.append(i);
            i++;
        }
        return Integer.parseInt(str.charAt(n - 1) + "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findIndexValue(n));
    }
}
