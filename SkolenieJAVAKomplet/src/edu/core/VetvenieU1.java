package edu.core;
import javax.swing.JOptionPane;

/**
 * Program urci absolutnu hodnotu celeho cisla
 * @author Lukas Zmuda
 *
 */

public class VetvenieU1 {

	public static void main(String[] args) {
		int cislo;
		int temp;
		
		String cisloString;
		
		cisloString = JOptionPane.showInputDialog("Zadaj cele cislo:");
		cislo = Integer.parseInt(cisloString);
		temp = cislo;
		
		if(cislo < 0)
			cislo = -cislo;
		
		JOptionPane.showMessageDialog(null, "Absolutna hodnota cisla " + temp + " je " + cislo, "Absolutna hodnota", JOptionPane.INFORMATION_MESSAGE);
	}
}
