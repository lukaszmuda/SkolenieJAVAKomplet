package edu.GUISwing;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

public class ListAppFrame extends JFrame implements ActionListener{

	private DefaultListModel zdrojModel;
	private DefaultListModel cielModel;
	private JList zdroj;
	private JList ciel = new JList();
	private JButton pridajBtn = new JButton(">>");
	private JButton odoberBtn = new JButton("<<");
	
		
	public ListAppFrame(String titulka) {
		super(titulka);
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		zdrojModel = new DefaultListModel();
		zdrojModel.addElement("Banan");
		zdrojModel.addElement("Jablko");
		zdrojModel.addElement("Ceresna");
		zdrojModel.addElement("Hruska");
		zdrojModel.addElement("Slivka");
		zdrojModel.addElement("Borievka");
		zdrojModel.addElement("Kiwi");
		zdrojModel.addElement("Ananas");
		zdroj = new JList(zdrojModel);
		
		zdroj.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		zdroj.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3),"" + "Shop",0,0,null, Color.RED));
		zdroj.setSelectedIndex(0);
		zdroj.setSelectionBackground(Color.BLACK);
		zdroj.setSelectionForeground(Color.WHITE);
		
		cielModel = new DefaultListModel();
		ciel.setModel(cielModel);
		ciel.setSelectionBackground(Color.BLACK);
		ciel.setSelectionForeground(Color.WHITE);
		ciel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.DARK_GRAY,3),"" + "Fruit Basket",0,0,null, Color.RED));
		
		//vytvorenie GUI
		
		//pre tlacidla v strede vytvorime vlastny layout
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1,20,20));
		panel.add(new JLabel());
		panel.add(pridajBtn);
		panel.add(odoberBtn);
		panel.add(new JLabel());
		//vytvorime layout pre celu aplikaciu
		this.setLayout(new GridLayout(1,3,20,20));
		this.add(zdroj);
		this.add(panel);
		this.add(ciel);
		
		//este potrebujeme obsluzit udalosti ktore mozu nastat
		pridajBtn.addActionListener(this);
		odoberBtn.addActionListener(this);		
	}	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(pridajBtn)){
			if(zdroj.getSelectedValue() != null){
				String str = (String) zdroj.getSelectedValue();
				if(str != null){
					cielModel.addElement(str);
					ciel.setSelectedIndex(0);
					zdrojModel.removeElement(str);
					zdroj.setSelectedIndex(0);
				}
			}
		}
		if(arg0.getSource().equals(odoberBtn)){
			if(ciel.getSelectedValue() != null){
				String str = (String) ciel.getSelectedValue();
				if(str != null){
					zdrojModel.addElement(str);
					zdroj.setSelectedIndex(0);
					cielModel.removeElement(str);
					ciel.setSelectedIndex(0);
					
				}
			}
		}
		
	}

}
