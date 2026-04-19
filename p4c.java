//4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour Glass
//is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is pressed by
//implementing the event handling mechanism with addActionListener( ).

package swings;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class p4c implements ActionListener {
	    JFrame frame;
	    JButton btnClock, btnHourGlass;
	    JLabel label;

	    public p4c() {
	        // Create frame
	        frame = new JFrame("Image Button Demo");
	        frame.setSize(500, 300);
	        frame.setLayout(new FlowLayout());
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Load images (Make sure images are in project folder)
	        ImageIcon clockIcon = new ImageIcon("clock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hourglass.png");

	        // Create buttons with images
	        btnClock = new JButton("Digital Clock", clockIcon);
	        btnHourGlass = new JButton("Hour Glass", hourGlassIcon);

	        // Create label
	        label = new JLabel("Press a button");
	        label.setFont(new Font("Arial", Font.BOLD, 18));

	        // Add ActionListener
	        btnClock.addActionListener(this);
	        btnHourGlass.addActionListener(this);

	        // Add components
	        frame.add(btnClock);
	        frame.add(btnHourGlass);
	        frame.add(label);

	        // Show frame
	        frame.setVisible(true);
	    }

	    // Event handling
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == btnClock) {
	            label.setText("Digital Clock is pressed");
	        } else if (e.getSource() == btnHourGlass) {
	            label.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        new p4c();
	    }
	}


