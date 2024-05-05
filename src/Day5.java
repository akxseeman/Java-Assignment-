import java.util.Scanner;

class Day5 {

    int b = 0;

    int opium(int n) {

        // factors of numbers it has no-output and input
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // System.out.print(i + " ");

        // }
        // }

        // count factors of numbers it has output and input
        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // System.out.print(i + " ");
        // b++;
        // }
        // }
        // return b;

        // check prime or not with no-output and input
        // 10

        // common facotrs for 2 integers with no-output and input 2 intgers
        // for (int i = 1; i <= m; i++) {
        // if (n % i == 0 && m % i == 0) {
        // System.out.print(i + " ");
        // }
        // }

        // greatest common facotrs for 2 integers with no-output and input 2 intgers
        // for (int i = n; i >= 1; i--) {
        // if (n % i == 0 && m % i == 0) {
        // System.out.print(i + " ");
        // break;
        // }

        // }

        // lowest common facotrs for 2 integers with no-output and input 2 intgers
        // for (int i = 3; i <= m; i++) {
        // if (n % i == 0 && m % i == 0) {

        // System.out.print(i + " ");
        // break;
        // }

        // }

        // sum of n natural number with input and output
        int b = (n * (n + 1) / 2);
        return b;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        // int m = scan.nextInt();
        Day5 c = new Day5();
        int res = c.opium(n);
        System.out.print(res);

    }
}