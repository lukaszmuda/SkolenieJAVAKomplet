package edu.GUISwing.LabelsAndButtons;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.GrayFilter;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LabelDemo extends JFrame{

	public LabelDemo(){
		super("JLabel Demo");
		setSize(600,100);
		setResizable(false);
		
		JPanel content = (JPanel) getContentPane();
		content.setLayout(new GridLayout(1,5,4,4));
		
		JLabel label = new JLabel();
		label.setText("JLabel");
		//vsetky komponenty a aj JLabel su prioritne priehladne
		//preto je pozadie sive
		label.setBackground(Color.white);
		content.add(label);
		
		label = new JLabel("JLabel", SwingConstants.CENTER);
		//tymto nastavime komponent nepriehladnym
		label.setOpaque(true);
		label.setBackground(Color.white);
		content.add(label);
		
		label = new JLabel("JLabel");
		label.setFont(new Font("Helvetica", Font.BOLD, 18));
		label.setOpaque(true);
		label.setBackground(Color.white);
		content.add(label);
		
		ImageIcon icon = new ImageIcon("icon.gif");
		label = new JLabel("JLabel", icon, SwingConstants.RIGHT);
		label.setVerticalTextPosition(SwingConstants.TOP);
		label.setOpaque(true);
		label.setBackground(Color.white);
		content.add(label);
		
		ImageIcon disabledImage = new ImageIcon(GrayFilter.createDisabledImage(icon.getImage()));
		label = new JLabel("JLabel", icon, SwingConstants.RIGHT);
		label.setVerticalTextPosition(SwingConstants.TOP);
		label.setOpaque(true);
		label.setBackground(Color.white);
		content.add(label);
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new LabelDemo();

	}

}
