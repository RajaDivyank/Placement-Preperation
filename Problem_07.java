import java.util.Scanner;

public class Problem_07 {
    public static int findFriends(int pizza, int friends) {
        int temp = friends;
        for (int i = 0; i < pizza; i++) {
            if (pizza % temp != 0) {
                temp++;
            }
        }
        int count = 0;
        while (temp > 0) {
            count = count + temp % 10;
            temp = temp / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of pizza : ");
        int pizza = sc.nextInt();
        System.out.print("Enter number of friends : ");
        int friends = sc.nextInt();
        System.out.println(findFriends(pizza, friends));
    }
}