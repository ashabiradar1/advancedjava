//2. Write a Java program to iterate a linked list in reverse order (using
//objlist.descendingIterator())

package Linkedlist;
import java.util.LinkedList;
import java.util.Iterator;
public class pc2 {
	    public static void main(String[] args) {
	        
	        // Create a LinkedList
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display original list
	        System.out.println("Original List: " + colors);

	        // Get descending iterator
	        Iterator<String> iterator = colors.descendingIterator();

	        // Iterate in reverse order
	        System.out.println("List in Reverse Order:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}
	


