//Q2. Write a Java Program for Counting how many times a substring appears in a main string
//using user defined function countOccurrences()

package StringExercise;
import java.util.Scanner;
public class p3b2 {

	    // User-defined function
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0;
	        int index = 0;

	        // Loop through the main string
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index = index + subStr.length(); // Move forward
	        }

	        return count;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the main string: ");
	        String mainStr = sc.nextLine();

	        System.out.print("Enter the substring: ");
	        String subStr = sc.nextLine();

	        int result = countOccurrences(mainStr, subStr);

	        System.out.println("Number of occurrences: " + result);

	        sc.close();
	    }
	}



