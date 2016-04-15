package edu.core;

public class FormatovanyVystup {

	public static void main(String[] args) {
		double x = 15.674;
		double y = 235.73;
		double z = 9525.9864;
		
		System.out.println("Hodnoty premennych x,y,z s dvoma des. miestami");
		System.out.printf("x = %.2f %n",x);
		System.out.printf("y = %.2f %n",y);
		System.out.printf("z = %.2f %n",z);
		System.out.println("Hodnoty premennych x,y,z s troma des. miestami");
		System.out.printf("x = %.3f %n",x);
		System.out.printf("y = %.3f %n",y);
		System.out.printf("z = %.3f %n",z);

	}

}
