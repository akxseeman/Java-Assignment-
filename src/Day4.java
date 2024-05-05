import java.util.Scanner;

class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // find the odd number
        // System.out.println("Enter the number");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.print(2 * i - 1);
        // }

        // find the even number
        // System.out.println("Enter the number");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.print(2 * i);
        // }

        // multiple of 2
        // System.out.println("Enter the number");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i += 2) {
        // System.out.print(i + " ");
        // }

        // n multipe of 5
        // System.out.println("Enter the number");
        // int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.print(i * 5 + " ");
        // }

        // n multipe of 2&5 7
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 5 == 0 || i % 7 == 0) {

                System.out.print(i + " ");
            }

        }

    }
}