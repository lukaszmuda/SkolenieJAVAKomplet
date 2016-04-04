package edu.GUISwing;

import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JRootPane;


public class SumaFrameTester {

	public static void main(String[] args) {
		
		SumaFrame suma = new SumaFrame("Suma program");
		
		//nastavenie velkosti okna
		suma.setSize(500,100);
		
		/*standardne sa okno objavi v lavom hornom rohu
		 *ak chceme vycentrovat okno na obrazovku, najprv musime zistit rozlisenie obr.
		 *pomocou metody getToolkit(), ktora je metodou triedy Window vieme komunikovat s OS
		 *a pomocou metody getScreenSize() zistime rozmery obr.
		 */
		Dimension dim = suma.getToolkit().getScreenSize();
		
		//pre vycentrovanie potrebujeme odpocitat polovicku sirky a dlzky okna od polovicky sirky a dlzky obrazovky
		suma.setLocation(dim.width/2-suma.getWidth()/2, dim.height/2-suma.getHeight()/2);
		
		/*-------------------------------------------------------
		 * nastavenie okna bez title baru a hornych troch tlacidiel
		 *ked uz to raz nastavime a dame visible, tak sa to uz potom neda menit
		 *-------------------------------------------------------
		 */
		//suma.setUndecorated(true);
				
		/*------------------------------------------------------
		 * na nastavenie velkosti okna pri spusteni napr. na maximalizovanie sluzi metoda setExtendedState()
		 * so statickou premennou triedy Frame
		 * -----------------------------------------------------
		 */
		//suma.setExtendedState(Frame.MAXIMIZED_BOTH);
		
		/*------------------------------------------------------
		 * ked chceme pouzit vlastnu ikonu okna pouzijeme metodu
		 * setIconImage(), ktora je v triede java.awt.Frame
		 * 
		 * velkost obrazka nas netrapi, pretoze JFrame resizene akykolvek
		 * obr. posunuty metode setIconImage()
		 * -----------------------------------------------------
		 */
		
		ImageIcon img = new ImageIcon("icon.gif");
		suma.setIconImage(img.getImage());
		
		suma.setVisible(true);
		/*-----------------------------------------------------
		 * zavretim okna sa aplikacia neukonci(iba Netbeans framework to umoznuje) teda musime to osetrit
		 *alebo prikazom nizsie alebo v nasom pripade v triede SumaFrame v metode windowClosing()
		 *-----------------------------------------------------
		 */
		//suma.setDefaultCloseOperation(suma.EXIT_ON_CLOSE);
		suma.setDefaultCloseOperation(suma.DO_NOTHING_ON_CLOSE);
		
		
		
		

	}

}
