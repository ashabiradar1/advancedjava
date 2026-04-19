//5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and display
//the concerned color whenever the specific tab is selected in the Pan.

package swings;
import javax.swing.*;
import java.awt.*;
public class p5b {

	    JFrame frame;
	    JTabbedPane tabbedPane;

	    public p5b() {
	        // Create frame
	        frame = new JFrame("Tabbed Pane Example");
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create tabbed pane
	        tabbedPane = new JTabbedPane();

	        // Create panels for each tab
	        JPanel redPanel = new JPanel();
	        redPanel.setBackground(Color.RED);

	        JPanel bluePanel = new JPanel();
	        bluePanel.setBackground(Color.BLUE);

	        JPanel greenPanel = new JPanel();
	        greenPanel.setBackground(Color.GREEN);

	        // Add tabs
	        tabbedPane.addTab("RED", redPanel);
	        tabbedPane.addTab("BLUE", bluePanel);
	        tabbedPane.addTab("GREEN", greenPanel);

	        // Add tabbed pane to frame
	        frame.add(tabbedPane);

	        // Show frame
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        new p5b();
	    }
	}


