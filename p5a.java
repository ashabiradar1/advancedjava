//5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display them on console
//whenever the countries are selected on the list.

package swings;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class p5a {

	    JFrame frame;
	    JList<String> countryList;

	    public p5a() {
	        // Create frame
	        frame = new JFrame("Country List");
	        frame.setSize(300, 300);
	        frame.setLayout(new FlowLayout());
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Country array
	        String countries[] = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList
	        countryList = new JList<>(countries);

	        // Set selection mode (single selection)
	        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Add ListSelectionListener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    String selected = countryList.getSelectedValue();
	                    System.out.println("Selected Country: " + selected);
	                }
	            }
	        });

	        // Add JList inside scroll pane
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        frame.add(scrollPane);

	        // Show frame
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        new p5a();
	    }
	}


