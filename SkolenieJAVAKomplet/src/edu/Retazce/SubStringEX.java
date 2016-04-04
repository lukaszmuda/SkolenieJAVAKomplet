package edu.Retazce;

public class SubStringEX {

	public static void main(String[] args) {
		String a = "Java je uzasna.";
		System.out.println(a);
		
		System.out.println("Pocet znakov retazca a: " + a.length());

		//vytvorime novy retazec, ktory je podretazcom a
		//od 6. znaku az do konca (indexovanie zacina nulou)
		String b = a.substring(5);
		System.out.println(b);
		
		//vytvorime novy retazec, ktory je podretazcom a
		//od 6. znaku po 7 vratane
		String c = a.substring(5, 7);
		System.out.println(c);
	}

}
