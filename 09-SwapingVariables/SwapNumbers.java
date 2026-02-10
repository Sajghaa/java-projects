import java.util.Scanner;
public class SwapNumbers{
    public static void  main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number");
        int a  = input.nextInt();

        System.out.print("Enter second number");
        int b = input.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        input.close();

    }
}