package edu.GUISwing.LayoutManagers;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Layouts extends JFrame {
	
	public Layouts() {
		super("Ukazka layout manazerov");
		this.setSize(500,460);
		JDesktopPane desktop = new JDesktopPane();
		this.getContentPane().add(desktop);
		
		JInternalFrame fr1 = new JInternalFrame("Flow layout", true, true);
		fr1.setBounds(10, 10, 150, 150);
		Container c = fr1.getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		desktop.add(fr1,0);
		fr1.show();
		
		JInternalFrame fr2 = new JInternalFrame("Grid layout", true, true);
		fr2.setBounds(170, 10, 150, 150);
		c = fr2.getContentPane();
		c.setLayout(new GridLayout(2,2));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		desktop.add(fr2,0);
		fr2.show();
		
		JInternalFrame fr3 = new JInternalFrame("Border layout", true, true);
		fr3.setBounds(330, 10, 150, 150);
		c = fr3.getContentPane();
		c.add(new JButton("1"), BorderLayout.NORTH);
		c.add(new JButton("2"), BorderLayout.EAST);
		c.add(new JButton("3"), BorderLayout.SOUTH);
		c.add(new JButton("4"), BorderLayout.WEST);
		desktop.add(fr3,0);
		fr3.show();
		
		JInternalFrame fr4 = new JInternalFrame("Box layout - x", true, true);
		fr4.setBounds(10, 170, 250, 80);
		c = fr4.getContentPane();
		c.setLayout(new BoxLayout(c, BoxLayout.X_AXIS));
		c.add(new JButton("1"));
		c.add(Box.createHorizontalStrut(2));
		c.add(new JButton("2"));
		c.add(Box.createGlue());
		c.add(new JButton("3"));
		c.add(Box.createHorizontalGlue());
		c.add(new JButton("4"));
		desktop.add(fr4,0);
		fr4.show();		
	}

	public static void main(String[] args) {
		
		Layouts frame = new Layouts();
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}
}
