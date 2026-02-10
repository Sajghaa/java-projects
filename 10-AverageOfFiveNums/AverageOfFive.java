import java.util.Scanner;

public class AverageOfFive{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i<=5; i++){
            sum += input.nextInt();
        }

        double average  = sum / 5.0;

        System.out.println("Average = " + average);

        input.close();
    }
}