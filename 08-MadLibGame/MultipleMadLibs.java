import java.util.Scanner;
import java.util.Random;

public class MultipleMadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println(" === MULTIPLE MAD LIBS ===\n");
        
        System.out.println("Choose a story theme:");
        System.out.println("1. Space Adventure ");
        System.out.println("2. Fairy Tale ");
        System.out.println("3. Mystery ");
        System.out.println("4. School Day ");
        System.out.println("5. Random Surprise! ");
        System.out.print("Enter choice (1-5): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); 
        
        if (choice == 5) {
            choice = random.nextInt(4) + 1; 
            System.out.println("\n Random choice: " + 
                (choice == 1 ? "Space Adventure" : 
                 choice == 2 ? "Fairy Tale" : 
                 choice == 3 ? "Mystery" : "School Day"));
        }
        
        switch (choice) {
            case 1:
                spaceAdventure(scanner);
                break;
            case 2:
                fairyTale(scanner);
                break;
            case 3:
                mysteryStory(scanner);
                break;
            case 4:
                schoolDay(scanner);
                break;
            default:
                System.out.println("Invalid choice! Using Space Adventure.");
                spaceAdventure(scanner);
        }
        
        scanner.close();
    }
    
    public static void spaceAdventure(Scanner scanner) {
        System.out.println("\n SPACE ADVENTURE MAD LIBS");
        System.out.println("Please provide the following words:\n");
        
        System.out.print("Adjective: ");
        String adj1 = scanner.nextLine();
        
        System.out.print("Noun (plural): ");
        String noun1 = scanner.nextLine();
        
        System.out.print("Planet name: ");
        String planet = scanner.nextLine();
        
        System.out.print("Alien species: ");
        String alien = scanner.nextLine();
        
        System.out.print("Space vehicle: ");
        String vehicle = scanner.nextLine();
        
        System.out.print("Verb (ending in -ing): ");
        String verb1 = scanner.nextLine();
        
        System.out.print("Adverb: ");
        String adverb1 = scanner.nextLine();
        
        System.out.print("Type of food: ");
        String food = scanner.nextLine();
        
        System.out.print("Exclamation: ");
        String exclamation = scanner.nextLine();
        
        System.out.print("Number: ");
        String number = scanner.nextLine();
        
        String story = "\n *** SPACE ADVENTURE ***\n\n" +
                      "Captain's Log, Stardate " + number + ".\n" +
                      "Our " + adj1 + " spaceship, the USS " + noun1 + 
                      ", has arrived at Planet " + planet + ".\n" +
                      "We encountered the " + alien + ", who travel in " + 
                      vehicle + "s while " + verb1 + " " + adverb1 + ".\n" +
                      "They offered us " + food + " as a peace offering.\n" +
                      "I exclaimed, \"" + exclamation.toUpperCase() + "! " +
                      "This is one small step for " + noun1 + 
                      ", one giant leap for " + alien + "kind!\"\n" +
                      "Mission accomplished. End of log.\n";
        
        displayStory(story);
    }
    
    public static void fairyTale(Scanner scanner) {
        System.out.println("\n FAIRY TALE MAD LIBS");
        System.out.println("Please provide the following words:\n");
        
        System.out.print("Adjective: ");
        String adj1 = scanner.nextLine();
        
        System.out.print("Noun (person): ");
        String person = scanner.nextLine();
        
        System.out.print("Noun (animal): ");
        String animal = scanner.nextLine();
        
        System.out.print("Magical object: ");
        String object = scanner.nextLine();
        
        System.out.print("Verb (past tense): ");
        String verb1 = scanner.nextLine();
        
        System.out.print("Royal title: ");
        String title = scanner.nextLine();
        
        System.out.print("Castle feature: ");
        String feature = scanner.nextLine();
        
        System.out.print("Emotion: ");
        String emotion = scanner.nextLine();
        
        System.out.print("Number: ");
        String number = scanner.nextLine();
        
        System.out.print("Magical word: ");
        String magicWord = scanner.nextLine();
        
        String story = "\n *** ONCE UPON A TIME ***\n\n" +
                      "Once upon a time, in a " + adj1 + " kingdom far away,\n" +
                      "there lived a " + person + " with a talking " + animal + ".\n" +
                      "One day, they found a magical " + object + " that " + 
                      verb1 + " whenever they said the magic word.\n\n" +
                      "The " + title + " of the castle declared, \"" + 
                      "Whoever can climb the " + feature + " in " + number + 
                      " days shall win my " + emotion + " heart!\"\n\n" +
                      "With courage and the magic word \"" + magicWord.toUpperCase() + 
                      "\", our hero succeeded!\n" +
                      "And they lived " + adj1.toLowerCase() + " ever after.\n" +
                      "The End. \n";
        
        displayStory(story);
    }
    
    public static void mysteryStory(Scanner scanner) {
        System.out.println("\n MYSTERY MAD LIBS");
        System.out.println("Please provide the following words:\n");
        
        System.out.print("Adjective: ");
        String adj1 = scanner.nextLine();
        
        System.out.print("Noun (person's job): ");
        String job = scanner.nextLine();
        
        System.out.print("Time of day: ");
        String time = scanner.nextLine();
        
        System.out.print("Place: ");
        String place = scanner.nextLine();
        
        System.out.print("Color: ");
        String color = scanner.nextLine();
        
        System.out.print("Noun (object): ");
        String object = scanner.nextLine();
        
        System.out.print("Verb (past tense): ");
        String verb1 = scanner.nextLine();
        
        System.out.print("Suspicious sound: ");
        String sound = scanner.nextLine();
        
        System.out.print("Clue: ");
        String clue = scanner.nextLine();
        
        System.out.print("Mystery solution: ");
        String solution = scanner.nextLine();
        
        String story = "\n *** THE CASE OF THE " + object.toUpperCase() + " ***\n\n" +
                      "It was a " + adj1 + " " + time + " when Detective " + job + 
                      " arrived at " + place + ".\n" +
                      "The only evidence: a " + color + " " + object + 
                      " that had been " + verb1 + ".\n\n" +
                      "\"" + sound.toUpperCase() + "!\" came a sudden noise.\n" +
                      "The detective examined the " + clue + " carefully.\n" +
                      "After hours of deduction, the truth was revealed:\n\n" +
                      "\"" + solution + "!\" the detective exclaimed.\n" +
                      "Another mystery solved. Case closed. \n";
        
        displayStory(story);
    }
    
    public static void schoolDay(Scanner scanner) {
        System.out.println("\n SCHOOL DAY MAD LIBS");
        System.out.println("Please provide the following words:\n");
        
        System.out.print("Adjective: ");
        String adj1 = scanner.nextLine();
        
        System.out.print("Subject (school): ");
        String subject = scanner.nextLine();
        
        System.out.print("Teacher's name: ");
        String teacher = scanner.nextLine();
        
        System.out.print("Noun (plural): ");
        String noun1 = scanner.nextLine();
        
        System.out.print("Verb (ending in -ing): ");
        String verb1 = scanner.nextLine();
        
        System.out.print("School supply: ");
        String supply = scanner.nextLine();
        
        System.out.print("Food (plural): ");
        String food = scanner.nextLine();
        
        System.out.print("Number: ");
        String number = scanner.nextLine();
        
        System.out.print("Grade (A, B, C, etc.): ");
        String grade = scanner.nextLine();
        
        System.out.print("Exclamation: ");
        String exclamation = scanner.nextLine();
        
        String story = "\n *** THE " + adj1.toUpperCase() + " SCHOOL DAY ***\n\n" +
                      "Today in " + subject + " class, Mr./Ms. " + teacher + 
                      " announced a pop quiz on " + noun1 + ".\n" +
                      "Everyone started " + verb1 + " frantically!\n\n" +
                      "I accidentally threw my " + supply + " across the room,\n" +
                      "which hit the " + food + " on the lunch menu board.\n" +
                      "It revealed question #" + number + ": \"What is 2+2?\"\n\n" +
                      "\"" + exclamation.toUpperCase() + "! I know this!\" I shouted.\n" +
                      "I got a " + grade + "+ on the quiz!\n" +
                      "Best. School. Day. Ever. 🎓\n";
        
        displayStory(story);
    }
    
    public static void displayStory(String story) {
        System.out.println("\n" + "=".repeat(60));
        System.out.println(" YOUR CREATED STORY:");
        System.out.println("=".repeat(60));
        System.out.println(story);
        System.out.println("=".repeat(60));
        
        System.out.println("\n STORY RATING: ");
        String[] ratings = {
            "Hilarious! You should be a writer!",
            "Very funny! Great word choices!",
            "Good story! Creative and entertaining!",
            "Interesting... unique combination of words!"
        };
        
        Random random = new Random();
        System.out.println(ratings[random.nextInt(ratings.length)]);
    }
}