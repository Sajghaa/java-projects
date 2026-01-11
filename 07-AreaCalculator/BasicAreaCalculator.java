import java.util.Scanner;

public class BasicAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" === BASIC AREA CALCULATOR ===");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.print("Choose shape (1-3): ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                calculateCircleArea(scanner);
                break;
            case 2:
                calculateRectangleArea(scanner);
                break;
            case 3:
                calculateTriangleArea(scanner);
                break;
            default:
                System.out.println(" Invalid choice!");
        }
        
        scanner.close();
    }
    
    public static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        
        double area = Math.PI * radius * radius;
        
        System.out.println("\n CIRCLE CALCULATION:");
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area = π × radius²\n");
        System.out.printf("     = %.2f × %.2f²\n", Math.PI, radius);
        System.out.printf("     = %.2f\n", area);
        
        double circumference = 2 * Math.PI * radius;
        System.out.printf("\nAdditional info:\n");
        System.out.printf("Circumference: %.2f\n", circumference);
        System.out.printf("Diameter: %.2f\n", 2 * radius);
    }
    
    public static void calculateRectangleArea(Scanner scanner) {
        System.out.print("Enter the length: ");
        double length = scanner.nextDouble();
        
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.println("\n RECTANGLE CALCULATION:");
        System.out.printf("Length: %.2f\n", length);
        System.out.printf("Width:  %.2f\n", width);
        System.out.printf("Area = length × width\n");
        System.out.printf("     = %.2f × %.2f\n", length, width);
        System.out.printf("     = %.2f\n", area);
        
        if (length == width) {
            System.out.println(" This rectangle is actually a SQUARE!");
        }
        
        System.out.printf("\nAdditional info:\n");
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", Math.sqrt(length*length + width*width));
    }
    
    public static void calculateTriangleArea(Scanner scanner) {
        System.out.println("\nChoose calculation method:");
        System.out.println("1. Base and height");
        System.out.println("2. Three sides (Heron's formula)");
        System.out.print("Choose (1 or 2): ");
        
        int method = scanner.nextInt();
        
        if (method == 1) {
            System.out.print("Enter the base: ");
            double base = scanner.nextDouble();
            
            System.out.print("Enter the height: ");
            double height = scanner.nextDouble();
            
            double area = 0.5 * base * height;
            
            System.out.println("\n TRIANGLE CALCULATION (Base × Height):");
            System.out.printf("Base:   %.2f\n", base);
            System.out.printf("Height: %.2f\n", height);
            System.out.printf("Area = ½ × base × height\n");
            System.out.printf("     = 0.5 × %.2f × %.2f\n", base, height);
            System.out.printf("     = %.2f\n", area);
            
        } else if (method == 2) {
            System.out.print("Enter side A: ");
            double a = scanner.nextDouble();
            
            System.out.print("Enter side B: ");
            double b = scanner.nextDouble();
            
            System.out.print("Enter side C: ");
            double c = scanner.nextDouble();
            
            if (a + b > c && a + c > b && b + c > a) {
                double s = (a + b + c) / 2; 
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                
                System.out.println("\n TRIANGLE CALCULATION (Heron's Formula):");
                System.out.printf("Side A: %.2f\n", a);
                System.out.printf("Side B: %.2f\n", b);
                System.out.printf("Side C: %.2f\n", c);
                System.out.printf("Semi-perimeter (s) = (a + b + c) / 2\n");
                System.out.printf("                   = (%.2f + %.2f + %.2f) / 2\n", a, b, c);
                System.out.printf("                   = %.2f\n", s);
                System.out.printf("Area = √[s(s-a)(s-b)(s-c)]\n");
                System.out.printf("     = √[%.2f × %.2f × %.2f × %.2f]\n", 
                                 s, s-a, s-b, s-c);
                System.out.printf("     = %.2f\n", area);
                
                determineTriangleType(a, b, c);
                
            } else {
                System.out.println(" These sides cannot form a triangle!");
                System.out.println("   Triangle inequality theorem: sum of any two sides must be greater than the third side.");
            }
        } else {
            System.out.println(" Invalid choice!");
        }
    }
    
    public static void determineTriangleType(double a, double b, double c) {
        System.out.println("\n TRIANGLE TYPE:");
        
        if (a == b && b == c) {
            System.out.println("Equilateral - All sides equal");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles - Two sides equal");
        } else {
            System.out.println("Scalene - All sides different");
        }
        
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        
        if (Math.abs((sides[2]*sides[2]) - (sides[0]*sides[0] + sides[1]*sides[1])) < 0.001) {
            System.out.println("Right Triangle - Satisfies a² + b² = c²");
        }
    }
}