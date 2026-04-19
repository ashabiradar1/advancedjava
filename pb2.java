//2. Write a java program for getting different colors through ArrayList interface and remove the
//2nd element and color &quot;Blue&quot; from the ArrayList

package ArrayList;
import java.util.ArrayList;
public class pb2 {
	    public static void main(String[] args) {
	        
	        // Create an ArrayList
	        ArrayList<String> colors = new ArrayList<>();

	        // Add elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original List: " + colors);

	        // Remove 2nd element (index 1)
	        colors.remove(1);

	        // Remove color "Blue"
	        colors.remove("Blue");

	        // Display updated list
	        System.out.println("Updated List: " + colors);
	    }
	}


