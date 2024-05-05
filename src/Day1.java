import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner dev = new Scanner(System.in);
        int m = dev.nextInt();
        int n = dev.nextInt();

        // System.out.println("Adding two numbers:" + (m + n));
        int k = dev.nextInt();
        System.out.println("Adding three numbers:" + (m + n + k));

        // <---combo of two numbers--->
        int m = dev.nextInt();
        int n = dev.nextInt();
        int k = dev.nextInt();
        System.out.println("combo of two numbers:" + (m + n));
        System.out.println("combo of two numbers:" + (m + k));
        System.out.println("combo of two numbers:" + (n + k));

        // <---Celsius to fahrenheit--->
        float m = dev.nextInt();
        System.out.println("converting celsius " + m + " to fahrenheit: " + ((m * 9)
                / 5 + 32));

        // fahrenheit to celsius
        float n = dev.nextInt();
        System.out.println("converting fahrenheit " + n + " to celsius: " + ((n - 32)
                * 5) / 9);

        // Perimeter Of a Square
        int side = dev.nextInt();
        System.out.println(4 * side);

        // area of circle
        System.out.print("Enter the radius of circle: ");
        int radius = dev.nextInt();

        double pi = 3.142;
        double area = pi * radius * radius;

        System.out.printf("%.4f\n", area);

        // total surface area of cylinder
        System.out.print("Radius of cylinder: ");
        int r = dev.nextInt();
        System.out.print("height of cylinder: ");
        int h = dev.nextInt();

        double pi = 3.142;

        System.out.printf("%.4f\n", 2 * pi * r * (r + h));

        // perimeter od a rectangle
        System.out.print("length of rectangle: ");
        int l = dev.nextInt();
        System.out.print("width of rectangle : ");
        int w = dev.nextInt();

        System.out.println("perimeter of rectangle: " + l * w);

        // converting dolar to rupes
        System.out.print("Enter the dollar: ");
        float dollar = dev.nextFloat();

        System.out.println(dollar * 82.88);
    }
}
