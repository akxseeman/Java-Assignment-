import java.util.Scanner;

public class Day7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        // for (int i = 0; i <= a.length - 1; i++) {
        // System.out.println(a[i]);

        // }
        // for (int i = a.length - 1; i >= 0; i--) {
        // System.out.println(a[i]);

        // }
        // for (int i = 0; i <= a.length - 1; i++) {

        // if (i % 2 == 0) {
        // System.out.print(a[i]);
        // }

        // }
        // for (int i = 0; i <= a.length - 1; i++) {

        // if (i % 2 == 1) {
        // System.out.print(a[i]);
        // }

        // }
        // for (int i = 0; i <= a.length - 1; i++) {

        // if (a[i] % 2 == 0) {
        // System.out.print(a[i]);
        // }

        // }
        // for (int i = 0; i <= a.length - 1; i++) {

        // if (a[i] % 2 == 1) {
        // System.out.print(a[i]);
        // }

        // }
        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] % 2 == 1) {
                System.out.print(a[i]);
            }

        }

    }
}
