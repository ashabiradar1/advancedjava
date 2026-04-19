//4. Write a Java program to display elements and their positions in a linked list ( using
//l_listobj.get(p) )

package Linkedlist;
import java.util.LinkedList;

public class pc4 {
	    public static void main(String[] args) {
	        
	        // Create a LinkedList
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements
	        colors.add("Red");
	        colors.add("Blue");
	        colors.add("Green");
	        colors.add("Yellow");
	        colors.add("Black");

	        // Display elements with their positions
	        System.out.println("Elements and their positions:");
	        for (int i = 0; i < colors.size(); i++) {
	            System.out.println("Position " + i + " : " + colors.get(i));
	        }
	    }
	}

	