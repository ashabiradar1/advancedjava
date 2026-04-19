//5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada, Denmark,
//France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and display the capital of the
//countries on console whenever the countries are selected on the list.

package swings;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
public class p5c {

	    JFrame frame;
	    JList<String> countryList;
	    HashMap<String, String> capitalMap;

	    public p5c() {
	        // Create frame
	        frame = new JFrame("Country Capitals");
	        frame.setSize(350, 300);
	        frame.setLayout(new FlowLayout());
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Country list
	        String countries[] = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Create map for capitals
	        capitalMap = new HashMap<>();
	        capitalMap.put("USA", "Washington, D.C.");
	        capitalMap.put("India", "New Delhi");
	        capitalMap.put("Vietnam", "Hanoi");
	        capitalMap.put("Canada", "Ottawa");
	        capitalMap.put("Denmark", "Copenhagen");
	        capitalMap.put("France", "Paris");
	        capitalMap.put("Great Britain", "London");
	        capitalMap.put("Japan", "Tokyo");
	        capitalMap.put("Africa", "No single capital"); // continent
	        capitalMap.put("Greenland", "Nuuk");
	        capitalMap.put("Singapore", "Singapore");

	        // Add listener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    String country = countryList.getSelectedValue();
	                    String capital = capitalMap.get(country);
	                    System.out.println("Country: " + country + " | Capital: " + capital);
	                }
	            }
	        });

	        // Add to frame
	        frame.add(new JScrollPane(countryList));

	        // Show frame
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        new p5c();
	    }
	}


