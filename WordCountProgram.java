import java.util.Scanner;

public class WordCountProgram {

    public static void main(String[] args) {
        // Create a scanner object for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Get the sentence input from the user
        String sentence = getSentenceInput(scanner);
        
        // Count the number of words in the sentence
        int wordCount = countWords(sentence);
        
        // Display the word count
        System.out.println("The sentence has " + wordCount + " words.");
        
        // Close the scanner
        scanner.close();
    }

    // Method to get a sentence input from the user
    public static String getSentenceInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        return scanner.nextLine(); // Return the sentence entered by the user
    }

    // Method to count the number of words in a sentence
    public static int countWords(String sentence) {
        // Split the sentence into words using space as a delimiter
        String[] words = sentence.split("\\s+"); // "\\s+" matches one or more spaces
        
        // Return the number of words in the sentence
        return words.length;
    }
}
