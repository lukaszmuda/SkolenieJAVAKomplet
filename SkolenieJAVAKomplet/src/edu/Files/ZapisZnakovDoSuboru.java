package edu.Files;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ZapisZnakovDoSuboru {

	public static void main(String[] args) throws IOException{
		
		String nazovSuboru = "znaky.txt";
		PrintWriter vystupnySubor = new PrintWriter(new FileWriter(nazovSuboru));
		String veta = "teraz je ten spravny cas";
		for(int i = 0; i < veta.length(); i++){
			vystupnySubor.write(veta.charAt(i));
			vystupnySubor.write('\n');
		}
		vystupnySubor.close();

	}

}
