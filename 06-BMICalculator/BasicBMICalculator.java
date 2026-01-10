import java.util.Scanner;

public class BasicBMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("🏋️ === BASIC BMI CALCULATOR ===");
        
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        
        double bmi = weight / (height * height);
        
        System.out.println("\n YOUR BMI RESULT:");
        System.out.printf("Weight: %.1f kg\n", weight);
        System.out.printf("Height: %.2f m\n", height);
        System.out.printf("BMI: %.1f\n", bmi);
        
        System.out.print("Category: ");
        
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
        
        scanner.close();
    }
}