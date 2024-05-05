import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        // System.out.println("Enter the given number: ");
        // int n = dev.nextInt();
        // if (n % 2 == 0) {
        // System.out.println("yes,it is even");
        // } else {
        // System.out.println("no");
        // }

        // multiple of 5
        // System.out.print("enter the given number ");
        // int n = dev.nextInt();
        // if (n % 5 == 0 || n % 3 == 0 || n % 7 == 0) {
        // System.out.print("yes");
        // } else {
        // System.out.print("no");
        // }

        // two digit number or not
        // System.out.print("enter the given number ");
        // int n = dev.nextInt();
        // if (n > 99 && n < 1000 && n % 10 == 0 && n % 5 == 0 && n % 2 == 0) {
        // System.out.print("yes");
        // } else {
        // System.out.print("no");
        // }

        // Number ends with zero or not
        // System.out.print("Enter the given number: ");
        // int n = dev.nextInt();
        // if (n % 10 == 0) {
        // System.out.print("yes it is end with zero");
        // } else {
        // System.out.print("no");
        // }

        System.out.print("Enter the given alpha: ");
        String c = dev.next();
        char b = c.charAt(0);
        if (b >= 97 && b <= 122) {
            System.out.print("yes");
        } else {
            System.out.print("no");
        }

    }
}
