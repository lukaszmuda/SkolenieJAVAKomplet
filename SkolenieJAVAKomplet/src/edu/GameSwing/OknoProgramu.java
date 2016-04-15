package edu.GameSwing;

import javax.swing.JFrame;

public class OknoProgramu extends JFrame{

	public OknoProgramu() {
		this.setTitle("Hlavne Okno Programu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MojPanel panel = new MojPanel();
		this.add(panel);	
		//mame nastavenu velkost panelu tak toto nemusime
		//this.setSize(400, 300);
		
		//potrebujeme okno prisposobit panelu preto
		this.pack();
		
	}
	
	public static void main(String[] args) {
		OknoProgramu okno = new OknoProgramu();
		okno.setVisible(true);

	}

}
