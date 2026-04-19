//3. Write a Java program to insert the specified element at the end of a linked list.( using
//l_listobj.offerLast(&quot;Pink&quot;))

package Linkedlist;
import java.util.LinkedList;
public class pc3 {
	    public static void main(String[] args) {
	        
	        // Create a LinkedList
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");

	        // Display original list
	        System.out.println("Original List: " + colors);

	        // Insert element at the end using offerLast()
	        colors.offerLast("Pink");

	        // Display updated list
	        System.out.println("Updated List after adding 'Pink' at the end: " + colors);
	    }
	}

