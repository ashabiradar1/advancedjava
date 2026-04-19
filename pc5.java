//5. Write a Java program that swaps two elements ( first and third elements ) in a linked list ( using
//Collections.swap(l_list, 0, 2))

package Linkedlist;
import java.util.LinkedList;
import java.util.Collections;
public class pc5 {
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

	        // Swap first (index 0) and third (index 2) elements
	        Collections.swap(colors, 0, 2);

	        // Display updated list
	        System.out.println("List after swapping 1st and 3rd elements: " + colors);
	    }
	}


