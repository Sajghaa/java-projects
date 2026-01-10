import java.util.Scanner;

public class TemperatureConverterBasic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" === BASIC TEMPERATURE CONVERTER ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose option (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            
            System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);
            
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            
            System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, celsius);
            
        } else {
            System.out.println(" Invalid choice! Please enter 1 or 2.");
        }
        
        scanner.close();
    }
}