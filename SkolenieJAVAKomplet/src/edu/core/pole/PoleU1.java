package edu.core.pole;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Program vypocita priemernu znamku piatich studentov zadanu na vstupe
 * 
 * @author Lukas
 *
 */
public class PoleU1 {

	public static void main(String[] args) {
		final int POCET_STUDDENTOV = 5;
		int[] znamky = new int[POCET_STUDDENTOV];
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					System.in));
			for (int i = 0; i < POCET_STUDDENTOV; i++) {
				System.out.print("Zadaj znamku studenta c." + (i + 1) + ": ");
				String str = reader.readLine();
				znamky[i] = Integer.parseInt(str);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		int spolu = 0;
		for (int i = 0; i < POCET_STUDDENTOV; i++) {
			spolu += znamky[i];

		}
		System.out.println("Priemerna znamka: " + (float) spolu
				/ POCET_STUDDENTOV);

	}
}