import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // ascii value to character
        // String b=dev.next();
        // char c=b.charAt(0);
        // System.out.print((by te)c);

        // equivalent ascii character
        // int n = scan.nextInt();
        // char c = (char) n;
        // System.out.println(c);

        // lower ascii or not
        // System.out.print("Enter the ascii character:");
        // int a = scan.nextInt();

        // if (a >= 97 && a <= 127) {
        // System.out.println("yes");
        // } else {
        // System.out.println("no");
        // }

        // number ascci value or not
        // System.out.print("Enter the number:");
        // int n = scan.nextInt();

        // if (n >= 48 && n <= 57) {
        // System.out.print("yes")
        // } else {
        // System.out.print("no");
        // }

        // multiplication and addition
        // System.out.print("Enter the number:");
        // int n = scan.nextInt();
        // int m = scan.nextInt();
        // if (n % 2 == 0 && m % 2 == 0) {
        // System.out.println(n * m);
        // } else {
        // System.out.println(n + m);
        // }

        // positive or negative number
        // System.out.print("Enter the given number:");
        // int n = scan.nextInt();

        // if (n > 0) {
        // System.out.println("positive");
        // } else if (n < 0) {
        // System.out.println("negative");
        // } else {
        // System.out.println("Zero");
        // }

        // absolute zero
        // System.out.print("Enter the given number: ");
        // int n = scan.nextInt();
        // int m = Math.abs(n);
        // System.out.println(m);

        // print the smallest number
        // System.out.print("Enter the given number: ");
        // int n = scan.nextInt();
        // int m = scan.nextInt();
        // int k = Math.min(n, m); //math function
        // System.out.println(k);

        // print the largest number in 3 numbers
        // System.out.print("Enter the given number: ");
        // int n = scan.nextInt();
        // int m = scan.nextInt();
        // int k = scan.nextInt();
        // int l = Math.max(Math.max(m, n), k); // math function
        // System.out.println(l);

        // reminder of 2 number
        // System.out.println("Enter the numbers of two number n m");
        // int n = scan.nextInt();
        // int m = scan.nextInt();

        // if (n > m) {
        // System.out.print(n % m);
        // } else {
        // System.out.println("-1");
        // }

        // Grading system
        // System.out.println("Enter the mark");
        // int n = scan.nextInt();

        // if (0 < n && 100 > n) {
        // if (n >= 90) {
        // System.out.println("A+");
        // } else if (n >= 80) {
        // System.out.println("A");
        // } else if (n >= 70) {
        // System.out.println("B+");
        // } else if (n >= 60) {
        // System.out.println("B");
        // } else if (n >= 50) {
        // System.out.println("C+");
        // } else if (n >= 40) {
        // System.out.println("C");

        // } else {
        // System.out.println("Fail");
        // }
        // } else {
        // System.out.println("Invalid");
        // }

        // find the smallest number
        // System.out.println("Enter the numbers of two number n m k l");
        // int n = scan.nextInt();
        // int m = scan.nextInt();
        // int k = scan.nextInt();
        // int l = scan.nextInt();

        // if (n <= m && n <= k && n <= l) {
        // System.out.println(n);
        // } else if (m <= n && m <= k && m <= l) {
        // System.out.println(m);
        // } else if (k <= n && k <= m && k <= l) {
        // System.out.println(k);
        // } else {
        // System.out.println(l);
        // }

        // find the largest number
        // System.out.println("Enter the numbers of two number n m k l");
        // int n = scan.nextInt();
        // int m = scan.nextInt();
        // int k = scan.nextInt();
        // int l = scan.nextInt();

        // if (n >= m && n >= k && n >= l) {
        // System.out.println(n);
        // } else if (m >= n && m >= k && m >= l) {
        // System.out.println(m);
        // } else if (k >= n && k >= m && k >= l) {
        // System.out.println(k);
        // } else {
        // System.out.println(l);
        // }

        // swap 2 numbers
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println("Before Swaping");
        System.out.println(n1 + " " + n2);

        int tempn1 = n1;
        n1 = n2;
        n2 = tempn1;
        System.out.println("After swapping ");
        System.out.println(n1 + " " + n2);

    }
}