//1. Write a java program for getting different colors through ArrayList interface and search whether
//the color &quot;Red&quot; is available or not
package ArrayList;
import java.util.ArrayList;
public class pb1 {

	    public static void main(String[] args) {
	        
	        // Create an ArrayList of colors
	        ArrayList<String> colors = new ArrayList<>();

	        // Add elements to the list
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Red");
	        colors.add("Black");

	        // Display the list
	        System.out.println("List of colors: " + colors);

	        // Search for "Red"
	        if (colors.contains("Red")) {
	            System.out.println("Red color is available in the list.");
	        } else {
	            System.out.println("Red color is NOT available in the list.");
	        }
	    }
	}


