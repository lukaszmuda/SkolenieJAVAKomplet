package edu.GUISwing.LayoutManagers;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.plaf.metal.MetalBorders;

public class CalcIntGridBagLayout extends JFrame{
	
	private JLabel jLblOut = new JLabel("123456789", SwingConstants.RIGHT);
	private JButton jBtnMc = new JButton("Mc");
	private JButton jBtnMplus = new JButton("M+");
	private JButton jBtnMminus = new JButton("M-");
	private JButton jBtnMmr = new JButton("MR");
	private JButton jBtnC = new JButton("C");
	private JButton jBtnAdd = new JButton("+ / -");
	private JButton jBtnDel = new JButton("/");
	private JButton jBtnNas = new JButton("*");
	private JButton jBtnSedem = new JButton("7");
	private JButton jBtnOsem = new JButton("8");
	private JButton jBtnDevet = new JButton("9");
	private JButton jBtnMinus = new JButton("-");
	private JButton jBtnStyri = new JButton("4");
	private JButton jBtnPat = new JButton("5");
	private JButton jBtnSest = new JButton("6");
	private JButton jBtnPlus = new JButton("+");
	private JButton jBtnJeden = new JButton("1");
	private JButton jBtnDva = new JButton("2");
	private JButton jBtnTri = new JButton("3");
	private JButton jBtnNula = new JButton("0");
	private JButton jBtnBod = new JButton(".");
	private JButton jBtnRov = new JButton("=");
	
	
	
	public CalcIntGridBagLayout() {
		super.setTitle("Kalkulacka interface");
		initGui();
	}
	
	public void initGui(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		GridBagConstraints constraints = new GridBagConstraints();
		
		//potrebujeme nadefinovat vnutornu vypln komponentu (sirka,vyska)
		constraints.ipadx = 15;
		constraints.ipady = 10;
		
		//tymto nastavime, ze komponent bude vyplnat bunku v mriezke plne do sirky aj vysky
		constraints.fill = GridBagConstraints.BOTH;
		
		//nastavime layout manager pre nas kontajner
		this.getContentPane().setLayout(new GridBagLayout());
		
		//nastavenie fontu a oramovanie labelu
		jLblOut.setFont(new Font("Monospaced", 1, 24));
		jLblOut.setBorder(new MetalBorders.TextFieldBorder());
		
		//nastavenie vonkajsej vyplne komponentu
		constraints.insets = new Insets(10,10,10,10);
		
		/*	gridwidth specifikuje pocet buniek potrebnych na zobrazenie komponentu
			REMAINDER specifikuje, ze je to posledny komponent v riadku
			pretoze mame nastavenu vlastnost BOTH v metode fill vyssie tak komponent sa roztiahne
			do celeho riadku
		*/		
		constraints.gridwidth = GridBagConstraints.REMAINDER;
		
		this.getContentPane().add(jLblOut, constraints);
		constraints.insets = new Insets(0,0,0,0);
		constraints.gridwidth = 1;
		
		//tymto nastavime umiestnenie prveho buttona na 0 stlpec a 1 riadok (Q: 1? A: na 0 mame label)
		constraints.gridx = 0;
		constraints.gridy = 1;
		this.getContentPane().add(jBtnMc, constraints);
		constraints.gridx = 1;
		constraints.gridy = 1;
		this.getContentPane().add(jBtnMplus, constraints);
		constraints.gridx = 2;
		constraints.gridy = 1;
		this.getContentPane().add(jBtnMminus, constraints);
		constraints.gridx = 3;
		constraints.gridy = 1;
		this.getContentPane().add(jBtnMmr, constraints);
		constraints.gridx = 0;
		constraints.gridy = 2;
		this.getContentPane().add(jBtnC, constraints);
		constraints.gridx = 1;
		constraints.gridy = 2;
		this.getContentPane().add(jBtnAdd, constraints);
		constraints.gridx = 2;
		constraints.gridy = 2;
		this.getContentPane().add(jBtnDel, constraints);
		constraints.gridx = 3;
		constraints.gridy = 2;
		this.getContentPane().add(jBtnNas, constraints);
		constraints.gridx = 0;
		constraints.gridy = 3;
		this.getContentPane().add(jBtnSedem, constraints);
		constraints.gridx = 1;
		constraints.gridy = 3;
		this.getContentPane().add(jBtnOsem, constraints);
		constraints.gridx = 2;
		constraints.gridy = 3;
		this.getContentPane().add(jBtnDevet, constraints);
		constraints.gridx = 3;
		constraints.gridy = 3;
		this.getContentPane().add(jBtnMinus, constraints);
		constraints.gridx = 0;
		constraints.gridy = 4;
		this.getContentPane().add(jBtnStyri, constraints);
		constraints.gridx = 1;
		constraints.gridy = 4;
		this.getContentPane().add(jBtnPat, constraints);
		constraints.gridx = 2;
		constraints.gridy = 4;
		this.getContentPane().add(jBtnSest, constraints);
		constraints.gridx = 3;
		constraints.gridy = 4;
		this.getContentPane().add(jBtnPlus, constraints);
		constraints.gridx = 0;
		constraints.gridy = 5;
		this.getContentPane().add(jBtnJeden, constraints);
		constraints.gridx = 1;
		constraints.gridy = 5;
		this.getContentPane().add(jBtnDva, constraints);
		constraints.gridx = 2;
		constraints.gridy = 5;
		this.getContentPane().add(jBtnTri, constraints);
		constraints.gridx = 0;
		constraints.gridy = 6;
		
		//aby nula bola na dvoch bunkach(stlpcoch) potrebujeme nastavit gridwidth na 2
		constraints.gridwidth = 2;
		this.getContentPane().add(jBtnNula, constraints);
		constraints.gridwidth = 1;
		constraints.gridx = 2;
		constraints.gridy = 6;
		this.getContentPane().add(jBtnBod, constraints);
		constraints.gridx = 3;
		constraints.gridy = 5;
		
		//aby = bolo na dvoch bunkach (riadkoch) potrebujeme nastavit gridheight na 2
		constraints.gridheight = 2;
		this.getContentPane().add(jBtnRov, constraints);
		pack();
				
	}
	
	public static void main(String[] args) {
		new CalcIntGridBagLayout().setVisible(true);
	}

}
