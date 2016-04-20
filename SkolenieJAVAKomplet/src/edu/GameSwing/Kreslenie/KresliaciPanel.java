package edu.GameSwing.Kreslenie;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class KresliaciPanel extends JPanel{
	
	public KresliaciPanel() {
		this.setPreferredSize(new Dimension(400,300));
		this.setFont(new Font("Courier", Font.BOLD, 20));
		this.setBackground(Color.RED);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//kreslenie textu
		g.drawString("Ahoj", 50, 80);
		g.setColor(Color.GREEN);
		g.drawString("Nazdar", 120, 70);
		g.setColor(Color.WHITE);
		g.drawString("Čau", 10, 210);
		
		//kreslenie ciar
		g.drawLine(30, 30, 200, 90);
		g.drawLine(50, 110, 90, 30);
		g.setColor(Color.MAGENTA);
		g.drawLine(10, 250, 360, 40);
		
		//kreslenie a vyplnovanie tvarov
		g.setColor(Color.BLACK);
		g.drawRect(300, 20, 65, 35);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(200, 150, 50, 30);
		g.drawRect(200, 150, 50, 30);
		
		g.fillOval(320, 260, 70, 30);
		g.setColor(Color.CYAN);
		g.drawOval(320, 260, 70, 30);
		
		
		
		
	}

}
