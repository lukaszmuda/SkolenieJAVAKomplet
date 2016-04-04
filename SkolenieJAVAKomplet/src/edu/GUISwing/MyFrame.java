package edu.GUISwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {
	
	private JButton closeButton = new JButton("Close");
	private JButton messageButton = new JButton("Hide");
	private JLabel label = new JLabel("Java programming is easy",JLabel.CENTER);
	
	public MyFrame(String str) {
		super(str);
		add(messageButton,"North");
		add(closeButton, "South");
		add(label, "Center");
		messageButton.addActionListener(this);
		closeButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		//potrebujeme zistit aky prvok Event(arg0) vykonal a na zaklade toho konat
		if(arg0.getSource().equals(messageButton)){
			if(messageButton.getText().equals("Show")){
				label.setVisible(true);
				messageButton.setText("Hide");
			}else{
				label.setVisible(false);
				messageButton.setText("Show");
			}
		}else if(arg0.getSource().equals(closeButton)){
			System.exit(0);
		}
		
	}

	
}
