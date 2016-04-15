package edu.GameSwing;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class MojPanel extends JPanel{

	public MojPanel() {
		this.setBackground(Color.green);
		//nastavime velkost panelu
		this.setPreferredSize(new Dimension(400,300));
	}
}