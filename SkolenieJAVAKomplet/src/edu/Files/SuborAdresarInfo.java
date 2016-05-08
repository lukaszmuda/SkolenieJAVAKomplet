package edu.Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SuborAdresarInfo {

	public static void main(String[] args) throws IOException{
		Scanner vstup = new Scanner(System.in);
		
		System.out.println("Zadaj subor alebo adresar: ");
		
		Path path = Paths.get(vstup.nextLine());
		
		if(Files.exists(path)){
			System.out.printf("%n%s existuje", path.getFileName());
			
			
		}

	}

}
