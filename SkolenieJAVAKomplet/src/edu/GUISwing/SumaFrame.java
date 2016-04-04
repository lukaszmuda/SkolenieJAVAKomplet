package edu.GUISwing;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class SumaFrame extends JFrame implements ActionListener, WindowListener {

	private JTextField cislo1 = new JTextField();
	private JTextField cislo2 = new JTextField();
	private JButton sucet = new JButton("+");
	private JLabel vysledok = new JLabel("0.0", JLabel.RIGHT);
	
	public SumaFrame(String str) {
		super(str);
		this.setLayout(new GridLayout(2,4));
		add(new JLabel("Cislo 1", JLabel.CENTER));
		add(new JLabel("Cislo 2", JLabel.CENTER));
		add(new JLabel("Operator", JLabel.CENTER));
		add(new JLabel("Vysledok", JLabel.CENTER));
		add(cislo1);
		add(cislo2);
		add(sucet);
		add(vysledok);
		sucet.addActionListener(this);
		this.addWindowListener(this);		
	}
	
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		
		//alebo hned ukoncime program tymto prikazom, alebo osetrime
		//ukoncenie programu dialogovym oknom
		//System.exit(0);	
		
		//ak chceme pouzit toto tak musime nastavit DO_NOTHING_ON_CLOSE
		//ako setDefaultCloseOperation
		int potvrdenie = JOptionPane.showOptionDialog(this, "Really exit?", "Exit confirmation!",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
		
		if(potvrdenie == 0){ //ak je stlacene yes tak je hodnota 0
			this.dispose();
			System.exit(0);
		}
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(sucet)){
			try{
				int c1 = Integer.parseInt(cislo1.getText());
				int c2 = Integer.parseInt(cislo2.getText());
				int v = c1 + c2;
				vysledok.setText(String.valueOf(v));
				
			}catch(NumberFormatException e){
				System.out.println("Zly ciselny format " + e.getMessage());
			}
		}
		
	}

}
