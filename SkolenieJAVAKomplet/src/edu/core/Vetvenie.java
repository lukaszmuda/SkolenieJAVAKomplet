package edu.core;

public class Vetvenie {

	public static void main(String[] args) {
		
		int skore = 72;
		char znamka = ' ';
		
		//neuplna podmienka
		if(skore > 90)
			znamka = 'A';
		System.out.println("Tvoja znamka je: " + znamka);

		//!!POZOR
		if(skore >= 60)
		System.out.println("Presiel!");
		System.out.println("Nepresiel!");
		
		//a teraz spravne => uplna podmienka
		if(skore >= 60)
			System.out.println("Presiel!");
		else
			System.out.println("Nepresiel!");
		
		//vnorene if
		if(skore >= 90)
			System.out.println("Tvoja znamka je A");
		else if(skore >= 80)
			System.out.println("Tvoja znamka je B");
		else if(skore >= 70)
			System.out.println("Tvoja znamka je C");
		else if(skore >= 60)
			System.out.println("Tvoja znamka je D");
		else
			System.out.println("Tvoja znamka je F");
		
		//ternarny operator
		int a = 0,b = 0,max;
		
		if(a >= b)
			max = a;
		else
			max = b;
		//toto je analogicke vyrazu
		max = (a >= b)? a : b;
		
		//parovanie else
		int teplota = 10;
		if(teplota >= 20)
			if(teplota >= 30)
				System.out.println("Spravna teplota na plavanie");
			else
				System.out.println("Spravna teplota pre golf");
		else
			System.out.println("Spravna teplota na tenis");
		
		//znamka pouzitim switch-a
		switch(znamka){
		case 'A':
			System.out.println("Znamka je A");
			break;
		case 'B':
			System.out.println("Znamka je B");
			break;
		case 'C':
			System.out.println("Znamka je C");
			break;
		case 'D':
			System.out.println("Znamka je D");
			break;
		
		}
	}

}
