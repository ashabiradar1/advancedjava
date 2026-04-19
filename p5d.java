//5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
//display the concerned color whenever the specific tab is selected in the Pan

package swings;
import javax.swing.*;
import java.awt.*;

public class p5d {

	    JFrame frame;
	    JTabbedPane tabbedPane;

	    public p5d() {
	        // Create frame
	        frame = new JFrame("CMY Tabbed Pane");
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create tabbed pane
	        tabbedPane = new JTabbedPane();

	        // Create panels
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add tabs
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add tabbed pane to frame
	        frame.add(tabbedPane);

	        // Make frame visible
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        new p5d();
	    }
	}


