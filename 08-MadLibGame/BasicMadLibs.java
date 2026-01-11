import java.util.Scanner;

public class BasicMadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(" === BASIC MAD LIBS GAME ===\n");
        
        // Collect words from user
        System.out.print("Enter an adjective: ");
        String adjective1 = scanner.nextLine();
        
        System.out.print("Enter a noun: ");
        String noun1 = scanner.nextLine();
        
        System.out.print("Enter a verb (past tense): ");
        String verb1 = scanner.nextLine();
        
        System.out.print("Enter an adverb: ");
        String adverb1 = scanner.nextLine();
        
        System.out.print("Enter another adjective: ");
        String adjective2 = scanner.nextLine();
        
        System.out.print("Enter another noun: ");
        String noun2 = scanner.nextLine();
        
        System.out.print("Enter a place: ");
        String place = scanner.nextLine();
        
        System.out.print("Enter a celebrity name: ");
        String celebrity = scanner.nextLine();
        
        System.out.print("Enter a silly word: ");
        String sillyWord = scanner.nextLine();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println(" YOUR MAD LIBS STORY:");
        System.out.println("=".repeat(50));
        
        String story = "\nOne " + adjective1 + " day, a " + noun1 + " decided to " + 
                      verb1 + " " + adverb1 + " to the " + adjective2 + " " + noun2 + 
                      " in " + place + ". To everyone's surprise, " + celebrity + 
                      " showed up and shouted, \"" + sillyWord.toUpperCase() + "!\" " +
                      "It was the most " + adjective1 + " day ever!";
        
        System.out.println(story);
        
        scanner.close();
    }
}