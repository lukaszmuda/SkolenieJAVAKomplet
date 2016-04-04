package edu.ZapisDoSuboru;

import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PripisanieDoSuboru {

	public static void main(String[] args) throws IOException {
		
		String nazovSuboru = "grades.txt";
		PrintWriter vystupnySubor = new PrintWriter(new FileWriter(nazovSuboru, true)); //ked nedame true tak to znamena ze chceme vytvorit novy subor
		Scanner vstup = new Scanner(System.in);
		int stupen = 0;
		System.out.println("Zadaj stupen (-1 pre exit): ");
		stupen = vstup.nextInt();
		
		while(stupen != -1){
			vystupnySubor.println(stupen);
			System.out.println("Zadaj stupen (-1 pre exit): ");
			stupen = vstup.nextInt();			
		}
		vystupnySubor.close();
	}

}
