package edu.GameSwing.Kreslenie;

import javax.swing.JFrame;

public class MojProgram extends JFrame{
	
	public MojProgram(){
		this.setTitle("Jednoduchy Kresliaci Program");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		KresliaciPanel panel = new KresliaciPanel();
		this.add(panel);
		
		this.pack();
	}

	public static void main(String[] args) {
		MojProgram program = new MojProgram();
		program.setVisible(true);

	}

}
