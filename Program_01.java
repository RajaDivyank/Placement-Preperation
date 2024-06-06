//Given teo string needle and haystack, return the index of the first occurrence of the needle
// in haystack,or -1 if needle is not part of haystack.

import java.util.Scanner;

public class Program_01 {
    public static int findOccurrence(String haystack, String needle) {
        int answer = haystack.indexOf(needle, 0);
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.nextLine();
        String needle = sc.nextLine();
        System.out.println(findOccurrence(haystack, needle));
        sc.close();
    }
}