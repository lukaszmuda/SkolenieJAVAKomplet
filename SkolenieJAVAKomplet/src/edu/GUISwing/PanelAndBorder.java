package edu.GUISwing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.*;

import java.awt.color.*;

public class PanelAndBorder extends JFrame {

	public PanelAndBorder() {
		this.setTitle("Border tester");
		this.setSize(455,450);
		
		JPanel content = (JPanel) getContentPane();
		content.setLayout(new GridLayout(6, 2, 5, 5));
		
		JPanel p = new JPanel();
		p.setBorder(new BevelBorder(BevelBorder.RAISED));
		p.add(new JLabel("RAISED Bevel border"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new BevelBorder(BevelBorder.LOWERED));
		p.add(new JLabel("LOWERED Bevel Border"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new LineBorder(Color.black, 4, true));
		p.add(new JLabel("Black Line Border s hrubkou 4"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new EmptyBorder(10, 10, 10, 10));
		p.add(new JLabel("Empty border s hrubkou 10"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		p.add(new JLabel("RAISED Etched border"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
		p.add(new JLabel("LOWERED Etched border"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));
		p.add(new JLabel("RAISED Soft bevel border"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new SoftBevelBorder(SoftBevelBorder.LOWERED));
		p.add(new JLabel("LOWERED Soft bevel border"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new TitledBorder(new LineBorder(Color.black,2), "Titulny text"));
		p.add(new JLabel("Titled border pouzivajuci Line Border"));
		content.add(p);
		
		p = new JPanel();
		p.setBorder(new TitledBorder(new EmptyBorder(10,10,10,10), "Titulny text"));
		p.add(new JLabel("Titled border pouzivajuci Empty Border"));
		content.add(p);
		
		Color c1 = new Color(86,86,86);
		Color c2 = new Color(192,192,192);
		Color c3 = new Color(204,204,204);
		
		Border b1 = new BevelBorder(EtchedBorder.RAISED, c3, c1);
		Border b2 = new MatteBorder(3, 3, 3, 3, c2);
		Border b3 = new BevelBorder(EtchedBorder.LOWERED,c3, c1);
		
		p = new JPanel();
		p.setBorder(new CompoundBorder(new CompoundBorder(b1, b2),b3));
		p.add(new JLabel("Compound border"));
		content.add(p);
		
		
		
		
	}
}
