//1. Write a Java program to iterate through all elements in a linked list starting at the
//specified position ( 2 nd ) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))

package Linkedlist;
import java.util.LinkedList;
import java.util.ListIterator;
public class pc1 {
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

	        // Create ListIterator starting from 2nd position (index 1)
	        ListIterator<String> iterator = colors.listIterator(1);

	        // Iterate from 2nd element
	        System.out.println("Elements from 2nd position:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
}
	


