package edu.Files;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;


public class ToDoList {
	
	static String nazovSuboru = "todo.txt";
	//ked chceme presnu cestu tak napr. "c:\\data\\todo.txt" - musia tam byt dvoje backsladges

	public static void main(String[] args) {
		
		int menuItem = -1;
		while(menuItem != 0){
			menuItem = menu();
			switch(menuItem){
			case 1:
				showList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				removeItem();
				break;
			case 0:
				break;
			default:
				System.out.println("Neznama polozka menu!");
			}
		}
	}
	
	static int menu(){
		int vyber;
		Scanner vstup = new Scanner(System.in);
		System.out.println("\nHlavne Menu\n");
		System.out.println("0. Ukonci program");
		System.out.println("1. Zobraz to-do zoznam");
		System.out.println("2. Pridaj polozku do zoznamu");
		System.out.println("3. Odstran polozku zo zoznamu");
		System.out.println();
		System.out.println("Zadaj vyber: ");
		vyber = vstup.nextInt();
		return vyber;
	}
	
	static void showList(){
		System.out.println("\nTo-do Zoznam\n");
		try{
			Scanner vstupnySubor = new Scanner(new FileReader(nazovSuboru));
			String riadok;
			int cislo = 1;
			while(vstupnySubor.hasNextLine()){
				riadok = vstupnySubor.nextLine();
				System.out.print(cislo + " ");
				System.out.println(riadok);
				++cislo;				
			}
			System.out.println();
			vstupnySubor.close();
		}
		catch(IOException ioe){
			System.out.println("Neviem pristupit ku suboru!");
		}
		
	}
	
	static void addItem(){
		System.out.println("\nPridaj polozku\n");
		try{
			Scanner vstup = new Scanner(System.in);
			PrintWriter vystupnySubor = new PrintWriter(new FileWriter(nazovSuboru, true));
			System.out.print("Zadaj polozku: ");
			String polozka = vstup.nextLine();
			vystupnySubor.println(polozka);
			vystupnySubor.close();
			
		}
		catch(IOException ioe){
			System.out.println("Neviem pristupit k suboru!");
		}
		
	}
	
	static void removeItem(){
		int volba;
		showList();
		Scanner vstup = new Scanner(System.in);
		System.out.println("Ktoru polozku chcete vymazat? ");
		volba = vstup.nextInt();
		ArrayList<String> polozky = new ArrayList<String>();
		int cislo = 1;
		try{
			Scanner vstupnySubor = new Scanner(new FileReader(nazovSuboru));
			String polozka;
			while(vstupnySubor.hasNextLine()){
				polozka = vstupnySubor.nextLine();
				if(cislo != volba)
					polozky.add(polozka);
				++cislo;
			}
			PrintWriter vystupnySubor = new PrintWriter(new FileWriter(nazovSuboru));
			for(int i = 0; i < polozky.size(); i++){
				vystupnySubor.println(polozky.get(i));
			}
			vystupnySubor.close();
		}
		catch(IOException ioe){
			System.out.println("Neviem pristupit k suboru!");
		}
		
	}

}
