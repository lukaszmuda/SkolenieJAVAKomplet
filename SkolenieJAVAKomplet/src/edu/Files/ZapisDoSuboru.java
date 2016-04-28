package edu.Files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class ZapisDoSuboru {

	public static void main(String[] args) throws IOException {
		
		String nazovSuboru = "grades.txt";
		PrintWriter vystupnySubor = new PrintWriter(new FileWriter(nazovSuboru));
		
		vystupnySubor.println(85);
		vystupnySubor.println(77);
		vystupnySubor.close();

	}

}
