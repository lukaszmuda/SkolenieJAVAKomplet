package edu.core.pole;

public class Pole {

	public static void main(String[] args) {
		//deklaracia pola
		int[] celeCisla;
		float[] desatinneCisla;
		
		//vytvorenie pola celych cisel s 10 prvkami
		celeCisla = new int[10];
		
		//vytvorenie pola desatinnych cisel s 20 prvkami
		desatinneCisla = new float[20];
		
		//priradenie hodnot do pola celych cisel
		//pole je indexovane od 0
		celeCisla[0] = 100;
		celeCisla[1] = 150;
		celeCisla[2] = 46;
		
		//pokus o pristup k prvku mimo rozsah pola vyvola ArrayIndexOutOfBounds exception
		//napr. celeCisla[10] = 11;
		
		//inicializacia pola priamo pri deklaracii
		int[] cisla = {15, 2, 9, 200, 18};
		
		

	}

}
