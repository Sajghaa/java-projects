import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = input.nextInt();

        System.out.print("Enter second number: ");
        int b = input.nextInt();

        System.out.print("Enter third number: ");
        int c = input.nextInt();

        int greatest;

        if (a > b) {
            if (a > c) {
                greatest = a;
            } else {
                greatest = c;
            }
        } else {
            if (b > c) {
                greatest = b;
            } else {
                greatest = c;
            }
        }

        System.out.println("The greatest number is: " + greatest);

        input.close();
    }
}