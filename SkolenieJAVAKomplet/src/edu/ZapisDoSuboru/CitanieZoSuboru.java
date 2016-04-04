package edu.ZapisDoSuboru;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CitanieZoSuboru {

	public static void main(String[] args) throws IOException{
		
		String nazovSuboru = "grades.txt";
		Scanner vstupnySubor = new Scanner(new FileReader(nazovSuboru));
		
		int stupen;
		while(vstupnySubor.hasNextLine()){
			stupen = Integer.parseInt(vstupnySubor.nextLine());
			System.out.println(stupen);
		}
		
	}

}
