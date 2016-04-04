package edu.GUISwing.LayoutManagers;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutPhone extends JFrame{

	public GridLayoutPhone() {
		setTitle("Mobilna klavesnica - priklad na Grid Layout");
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		vytvorGui();
	}
	
	private void vytvorGui() {
		setLayout(new GridLayout(4,3));
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
		add(new JButton("6"));
		add(new JButton("7"));
		add(new JButton("8"));
		add(new JButton("9"));
		add(new JButton("+"));
		add(new JButton("0"));
		add(new JButton("#"));		
	}

	public static void main(String[] args) {
		GridLayoutPhone frame = new GridLayoutPhone();
		frame.setSize(220, 240);
		frame.setVisible(true);

	}

}
