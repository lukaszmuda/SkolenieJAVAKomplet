package edu.jdbc.ZamestnanecApp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.math.BigDecimal;

public class PridajZamestnancaDialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField menoTextField;
	private JTextField priezviskoTextField;
	private JTextField emailTextField;
	private JTextField platTextField;
	
	//pridame
	private ZamestnanecDAO zamDAO;
	private ZamestnanecUI zaApp;
	
	public PridajZamestnancaDialog(ZamestnanecUI zaApp, ZamestnanecDAO zamDAO){
		this();
		this.zaApp = zaApp;
		this.zamDAO = zamDAO;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PridajZamestnancaDialog dialog = new PridajZamestnancaDialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public PridajZamestnancaDialog() {
		setTitle("Pridaj zamestnanca");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		{
			JLabel lblMeno = new JLabel("Meno");
			contentPanel.add(lblMeno, "2, 2, right, default");
		}
		{
			menoTextField = new JTextField();
			contentPanel.add(menoTextField, "4, 2, fill, default");
			menoTextField.setColumns(10);
		}
		{
			JLabel lblPriezvisko = new JLabel("Priezvisko");
			contentPanel.add(lblPriezvisko, "2, 4, right, default");
		}
		{
			priezviskoTextField = new JTextField();
			contentPanel.add(priezviskoTextField, "4, 4, fill, default");
			priezviskoTextField.setColumns(10);
		}
		{
			JLabel lblEmail = new JLabel("Email");
			contentPanel.add(lblEmail, "2, 6, right, default");
		}
		{
			emailTextField = new JTextField();
			contentPanel.add(emailTextField, "4, 6, fill, default");
			emailTextField.setColumns(10);
		}
		{
			JLabel lblPlat = new JLabel("Plat");
			contentPanel.add(lblPlat, "2, 8, right, default");
		}
		{
			platTextField = new JTextField();
			contentPanel.add(platTextField, "4, 8, fill, default");
			platTextField.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Uložiť");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					
						ulozZamestnanca();
					}

					
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Zrušiť");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	protected void ulozZamestnanca(){
		
		//ziskame data z formu
		String meno = menoTextField.getText();
		String priezvisko = priezviskoTextField.getText();
		String email = emailTextField.getText();
		
		String platStr = platTextField.getText();
		BigDecimal plat = konvertujStringNaBigDecimal(platStr);
		
		Zamestnanec zam = new Zamestnanec(priezvisko, meno, email, plat);
		
		//ulozime do DB
		try{
			zamDAO.pridajZamestnanca(zam);
			
			//zavrieme dialog
			setVisible(false);
			dispose();

			//refreshneme gui list
			zaApp.refreshZamestnancov();
			
			//zobrazime spravu
			JOptionPane.showMessageDialog(zaApp, "Zamestnanec uspesne pridany!","Zamestnanec pridany", JOptionPane.INFORMATION_MESSAGE);
						
		}catch(Exception e){
			JOptionPane.showMessageDialog(zaApp, "Chyba pridania zamestnanca: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			
		}
		
		
		
	}

	protected BigDecimal konvertujStringNaBigDecimal(String platStr){
		BigDecimal vysledok = null;
		
		try{
			double platDouble = Double.parseDouble(platStr);
			vysledok = BigDecimal.valueOf(platDouble);
		}catch(Exception e){
			System.out.println("Nespravna hodnota. Nastavenie na 0.0");
			vysledok = BigDecimal.valueOf(0.0);
		}
		return vysledok;
	}

}
