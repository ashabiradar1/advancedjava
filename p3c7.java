//Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
//defined function truncate()

package StringExercise;
		import java.util.Scanner;

public class p3c7 {

	    // User-defined function
	    public static String truncate(String str, int maxLength) {
	        if (str.length() <= maxLength) {
	            return str; // No need to truncate
	        } else {
	            return str.substring(0, maxLength) + "...";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        System.out.print("Enter maximum length: ");
	        int length = sc.nextInt();

	        String result = truncate(input, length);

	        System.out.println("Truncated string: " + result);

	        sc.close();
	    }
	}


