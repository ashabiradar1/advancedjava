//4. Write a java program for getting different colors through ArrayList interface and extract the
//elements 1st and 2nd from the ArrayList object by using SubList()

package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class pb4 {
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

	        // Extract 1st and 2nd elements (index 0 to 2, 2 is exclusive)
	        List<String> subList = colors.subList(0, 2);

	        // Display extracted elements
	        System.out.println("Extracted Elements (1st and 2nd): " + subList);
	    }
	}


