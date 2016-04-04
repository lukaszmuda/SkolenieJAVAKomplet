package edu.GUISwing.LabelsAndButtons;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleButton {

	public static void main(String[] args) {
		MojFrame frame = new MojFrame();
		frame.show();

	}

}

class MojFrame extends JFrame{
	public MojFrame() {
		final JButton button = new JButton("Stlac ma!");
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				button.setText("Dakujem!");
				
			}
		});
		add(button);
		pack();
	}
}


