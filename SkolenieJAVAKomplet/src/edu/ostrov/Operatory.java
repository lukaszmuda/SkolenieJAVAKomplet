package edu.ostrov;

public class Operatory {

	public static void main(String[] args) {
		
		//operator priradenia =
		//======================
		int x = 5;
		
		//aritmeticke operatory
		//=====================
		
		int a,b;
		a = 10;
		b = 3;
		int c = 100;
		int e = 1000;
		int d = 200;
		
		System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b)); //celociselny podiel vzhladom k datovym typom
		System.out.println("a % b = " + (a % b)); //zvysok po deleni cisla a cislom b
		
		a = a + 3; //pripocita 3 ku hodnote premennej a
		a += 3; //pripocita 3 ku hodnote premennej a
		a++; //pripocita 1 ku hodnote premennej a
		
		b = b - 1;
		b -= 1;
		b--;
		
		//nefunguje a**, a//, a%%
		
		//relacne operatory
		//=================
		System.out.println(c + " < " + d +(c < d));
		System.out.println(c + " > " + d +(c > d));
		System.out.println(c + " >= " + d +(c >= d));
		System.out.println(c + " <= " + d +(c <= d));
		System.out.println(c + " == " + d +(c == d));
		System.out.println(c + " != " + d +(c != d));
		
		//logicke operatory
		//=================
		//&& - AND, || - OR, ! - NOT
		System.out.println((c < d)||(c++ > a)); //skratene vyhodnotenie vyrazu
		System.out.println((c < d)|(c++ > a));
		System.out.println((c == d)&&(d++ > a)); // skratene vyhodnotenie
		System.out.println((c == d)&(d++ > a));
		System.out.println(c);
		System.out.println(d);
		
		
		
		
		
		

	}

}
