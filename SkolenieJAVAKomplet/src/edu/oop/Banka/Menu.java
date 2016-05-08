package edu.oop.Banka;

import java.util.Scanner;

public class Menu {

	//instancne  premenne
	Scanner vstup = new Scanner(System.in);
	
	Bank banka = new Bank();
	boolean exit;
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.runMenu();
	}
	
	public void runMenu(){
		printHeader();
		while(!exit){
			printMenu();
			int choice = getInput();
			performAction(choice);
		}
		
	}

	private void performAction(int choice) {
		switch(choice){
		case 0:
			System.out.println("Dakujeme za pouzitie nasej aplikacie. Dovidenia.");
			System.exit(0);
			break;
		case 1:
			createAccount();
			break;
		case 2:
			makeDeposit();
			break;
		case 3:
			makeWithdraw();
			break;
		case 4:
			listBalances();
			break;
		default:
			System.out.println("Neznama chyba!!");
			
		}
		
	}

	private void listBalances() {
		// TODO Auto-generated method stub
		
	}

	private void makeWithdraw() {
		// TODO Auto-generated method stub
		
	}

	private void makeDeposit() {
		// TODO Auto-generated method stub
		
	}

	private void createAccount() {
		String firstName, lastName, ssn, accountType = "";
		double initialDeposit = 0;
		//budeme overovat, ci uzivatel zadal spravny typ uctu
		boolean valid = false;
		while(!valid){
			System.out.print("Zadajte typ uctu(bezny/sporiaci): ");
			accountType = vstup.nextLine();
			if(accountType.equalsIgnoreCase("bezny")||accountType.equalsIgnoreCase("sporiaci")){
				valid = true;
			}else{
				System.out.println("Zadany nespravny typ uctu. Prosim zadajte sporiaci/bezny");
			}
		}
		System.out.print("Zadajte meno: ");
		firstName = vstup.nextLine();
		System.out.print("Zadajte priezvisko: ");
		lastName = vstup.nextLine();
		System.out.print("Zadajte ssn:");
		ssn = vstup.nextLine();
		
		valid = false;
		while(!valid){
			System.out.print("Zadajte pociatocny zostatok: ");
			try{
				initialDeposit = Double.parseDouble(vstup.nextLine());
			}catch(NumberFormatException e){
				System.out.println("Zadajte prosim cislo!");
			}
			if(accountType.equalsIgnoreCase("bezny")){
				if(initialDeposit < 100){
					System.out.println("Bezny ucet vyzaduje minimum 100 EUR");
				}else{
					valid = true;
				}
			}
			if(accountType.equalsIgnoreCase("sporiaci")){
				if(initialDeposit < 50){
					System.out.println("Sporiaci ucet vyzaduje minimum 50 EUR");
				}else{
					valid = true;
				}
			}
		}
		Account account;
		if(accountType.equalsIgnoreCase("bezny")){
			account = new CheckingAccount(initialDeposit);
		}else{
			account = new SavingAccount(initialDeposit);
		}
		
		
		
	}

	private int getInput() {
		int choice = -1;
		do{
			System.out.print("Zadajte svoj vyber: ");
			try{
				choice = Integer.parseInt(vstup.nextLine());
				
			}catch(NumberFormatException e){
				System.out.println("Nespravny vyber operacie!!\nZadajte cislo operacie!");
			}
			if(choice < 0 || choice > 4){
				System.out.println("Vyber mimo rozsah! (0 - 4)");
			}
		}while(choice < 0 || choice > 4);
		return choice;
	}

	private void printMenu() {
		System.out.println("Vyber operacie: ");
		System.out.println("1) Novy ucet");
		System.out.println("2) Vklad na ucet");
		System.out.println("3) Vyber z uctu");
		System.out.println("4) Zostatok na ucte");
		System.out.println("0) Koniec");
		
	}

	private void printHeader() {
		System.out.println("+--------------------------------+");
		System.out.println("|            Vitajte !           |");
		System.out.println("|         Super Banka App        |");
		System.out.println("+--------------------------------+");
		
		
	}
}
