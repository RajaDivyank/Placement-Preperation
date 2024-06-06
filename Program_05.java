//Take an input in the form of Binary String that contains only 0's and 1's
//and convert this number into string that represented the integer part.

import java.util.Scanner;

public class Program_05 {

    public static double binaryToInteger(String str) {
        String[] temp = str.split("\\.");
        int firstPart = Integer.parseInt(temp[0]);
        int secondPart = Integer.parseInt(temp[1]);
        double sum = 0;
        for (int i = 0; i < temp[0].length(); i++) {
            sum = sum + (firstPart % 10 * Math.pow(2, i));
            firstPart = firstPart / 10;
        }
        for (int i = temp[1].length(); i >= 0; i--) {
            sum = sum + (secondPart % 10 * Math.pow(2, -i));
            secondPart = secondPart / 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string : ");
        String str = sc.nextLine();
        System.out.println(str);
        System.out.println(binaryToInteger(str));
    }
}
