//Q6. Write a Java Program for Capitalizing the first letter of each word. using user defined function
//capitalizeWords()

package StringExercise;
		import java.util.Scanner;

public class p3c6 {

	    // User-defined function
	    public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+"); // Split by spaces
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.length() > 0) {
	                // Capitalize first letter + باقي الكلمة
	                result.append(Character.toUpperCase(word.charAt(0)))
	                      .append(word.substring(1).toLowerCase())
	                      .append(" ");
	            }
	        }

	        return result.toString().trim(); // Remove extra space at end
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        String output = capitalizeWords(input);

	        System.out.println("Capitalized string: " + output);

	        sc.close();
	    }
	}


