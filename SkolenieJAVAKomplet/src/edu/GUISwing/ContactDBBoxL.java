package edu.GUISwing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ContactDBBoxL extends JFrame implements ActionListener {
	
	private JPanel informationPanel;
	private JPanel listPanel;
	private JList contactList;
	private final JTextField tfName = new JTextField(20);
	private final JTextField tfMobile = new JTextField(20);
	private JButton btnAdd = new JButton("Add");
	private JButton btnClear = new JButton("Clear");
	
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(ClassNotFoundException e){
			Logger.getLogger(ContactDBBoxL.class.getName()).log(Level.SEVERE, null, e);
		} catch (InstantiationException e) {
			Logger.getLogger(ContactDBBoxL.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			Logger.getLogger(ContactDBBoxL.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			Logger.getLogger(ContactDBBoxL.class.getName()).log(Level.SEVERE, null, e);
			e.printStackTrace();
		}
		ContactDBBoxL dbFrame = new ContactDBBoxL();

	}
	
	public ContactDBBoxL(){
		initGui();
	}
	
	public void initGui(){
		
		Box verticalBoxLeft, verticalBoxRight;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1,2));
		
		verticalBoxLeft = Box.createVerticalBox();
		verticalBoxLeft.add(Box.createRigidArea(new Dimension(70,20)));
		verticalBoxLeft.add(new JLabel("Meno"));
		verticalBoxLeft.add(tfName);
		verticalBoxLeft.add(Box.createVerticalStrut(10));
		verticalBoxLeft.add(new JLabel("Tel.c.:"));
		verticalBoxLeft.add(tfMobile);
		verticalBoxLeft.add(Box.createVerticalStrut(25));
		verticalBoxLeft.add(btnAdd);
		btnAdd.addActionListener(this);
		
		informationPanel = new JPanel();
		informationPanel.add(verticalBoxLeft);
		informationPanel.setBorder(BorderFactory.createTitledBorder("Informacie"));
		
		contactList = new JList();
		contactList.setModel(new DefaultListModel());
		verticalBoxRight = Box.createVerticalBox();
		verticalBoxRight.add(new JScrollPane(contactList));
		verticalBoxRight.add(Box.createRigidArea(new Dimension(80,10)));
		verticalBoxRight.add(btnClear);
		btnClear.addActionListener(this);
		listPanel = new JPanel();
		listPanel.setBorder(BorderFactory.createTitledBorder("Kontakty"));
		listPanel.add(verticalBoxRight);
		contentPane.add(informationPanel);
		contentPane.add(listPanel);		
		setSize(600,250);
		setResizable(false);
		setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(btnAdd)){
			DefaultListModel contactModel = (DefaultListModel) contactList.getModel();
			contactModel.addElement(tfName.getText() + " " + tfMobile.getText());
			tfName.setText("");
			tfMobile.setText("");
			
		}else{
			contactList.setModel(new DefaultListModel());
		}
		
	}

}
