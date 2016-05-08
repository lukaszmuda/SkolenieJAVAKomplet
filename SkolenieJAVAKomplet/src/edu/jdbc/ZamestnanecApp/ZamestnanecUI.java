package edu.jdbc.ZamestnanecApp;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ZamestnanecUI extends JFrame {

	private JPanel contentPane;
	private JTextField priezviskoTextField;
	private JTable table;
	
	private ZamestnanecDAO zamestnanecDAO;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZamestnanecUI frame = new ZamestnanecUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ZamestnanecUI() {
		
		//vytvorenie DAO
		try{
			zamestnanecDAO = new ZamestnanecDAO();
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		setTitle("Vyhladavanie zamestnancov");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Zadaj priezvisko:");
		panel.add(lblNewLabel);
		
		priezviskoTextField = new JTextField();
		panel.add(priezviskoTextField);
		priezviskoTextField.setColumns(10);
		
		JButton btnHladaj = new JButton("Hladaj");
		btnHladaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				try{
					String priezvisko = priezviskoTextField.getText();
					List<Zamestnanec> zamestnanci = null;
					
					if(priezvisko != null && priezvisko.trim().length() > 0){
						zamestnanci = zamestnanecDAO.najdiZamestnanca(priezvisko);
						
					}else{
						zamestnanci = zamestnanecDAO.getZamestnanci();
					}
					
					//vytvorime model a updatetujeme tabulku
					ZamestnanecTableModel model = new ZamestnanecTableModel(zamestnanci);
					table.setModel(model);
					/*
					for(Zamestnanec z: zamestnanci){
						System.out.println(z);
					}*/
					
				}catch(Exception exc){
					JOptionPane.showMessageDialog(ZamestnanecUI.this, "Error: " + exc, "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		panel.add(btnHladaj);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton btnPridajYame = new JButton("Pridaj zamestnanca");
		btnPridajYame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				//vytvorime dialog
				PridajZamestnancaDialog dialog = new PridajZamestnancaDialog(ZamestnanecUI.this, zamestnanecDAO);
				
				//zobrazime dialog
				dialog.setVisible(true);
			}
		});
		panel_1.add(btnPridajYame);
	}

	public void refreshZamestnancov() {
		try{
			List<Zamestnanec> zamestnanci = zamestnanecDAO.getZamestnanci();
			
			ZamestnanecTableModel model = new ZamestnanecTableModel(zamestnanci);
			
			table.setModel(model);
		}catch(Exception e){
			JOptionPane.showMessageDialog(this, "Error: " + e, "Error", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
