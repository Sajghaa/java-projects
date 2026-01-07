import java.util.Scanner;

public class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        
        System.out.println(" === ROBUST ODD/EVEN CHECKER ===");
        
        while (running) {
            System.out.print("\nEnter a number (or 'q' to quit): ");
            
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                checkAndDisplay(number);
            } 
            else if (scanner.hasNext("q") || scanner.hasNext("Q")) {
                running = false;
                System.out.println("Goodbye(Adios)! 👋");
            } 
            else {
                String invalid = scanner.next(); // Clear invalid input
                System.out.println(" Invalid input! Please enter a whole number.");
                System.out.println("   You entered: '" + invalid + "'");
            }
        }
        
        scanner.close();
    }
    
    public static void checkAndDisplay(int number) {
        boolean isEven = (number & 1) == 0;
        
        System.out.println("\n Analysis for: " + number);
        System.out.println("---------------------");
        
        if (isEven) {
            System.out.println(" " + number + " is EVEN");
            System.out.println("   • Divisible by 2 without remainder");
            System.out.println("   • Last digit is 0, 2, 4, 6, or 8");
        } else {
            System.out.println(" " + number + " is ODD");
            System.out.println("   • Not divisible by 2 evenly");
            System.out.println("   • Last digit is 1, 3, 5, 7, or 9");
        }

        System.out.println("\n Mathematical Properties:");
        System.out.println("   • " + number + " % 2 = " + (number % 2));
        System.out.println("   • " + number + " / 2 = " + (number / 2.0));
        
        if (number == 0) {
            System.out.println("   • Zero is the only number that is neither positive nor negative!");
        }
        
        if (number < 0) {
            System.out.println("   • Negative numbers follow the same odd/even rules!");
        }
    }
}