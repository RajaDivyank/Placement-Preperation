import java.util.Scanner;

public class Problem_08 {
    public static int countCommasInRange(int n) {
        int count = 0;
        if (n < 999) {
            return count;
        } else {
            for (int i = 1; i <= n; i++) {
                count = count + countCommasInNumber(i);
            }
            return count;
        }
    }

    public static int countCommasInNumber(int number) {
        String str = Integer.toString(number);
        String formateNumber = String.format("%,d", number);
        System.out.println(formateNumber);
        return formateNumber.length() - str.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        System.out.println(countCommasInRange(n));
    }
}
