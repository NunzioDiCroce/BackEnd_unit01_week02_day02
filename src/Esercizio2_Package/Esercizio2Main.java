package Esercizio2_Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Esercizio2Main {

	// - - - - - - - - - - - - - - - - - - - - main class definition
	public static void main(String[] args) {

		Scanner esercizioDue = new Scanner(System.in);

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 2 - - - - - - - - - -");
		System.out.println("");

		// - - - - - - - - - - - - - - - - - - - - firstFunction call and data entry
		System.out.println(
				"Inserisci un numero intero N per ottenere una lista ordinata di N interi casuali da 0 a 100:");
		String n = esercizioDue.nextLine();
		int nInt = Integer.parseInt(n);

		List<Integer> firstList = firstFunction(nInt);

		System.out.println("firstList: " + firstList);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("");

	}

	// - - - - - - - - - - - - - - - - - - - - firstFunction definition
	public static List<Integer> firstFunction(int _N) {

		List<Integer> firstList = new ArrayList<>(); // ArrayList object creation

		for (int i = 0; i < _N; i++) {
			firstList.add((int) (Math.random() * 101));
		}
		Collections.sort(firstList);
		return firstList;
	}
	// - - - - - - - - - - - - - - - - - - - - secondFunction definition

	// - - - - - - - - - - - - - - - - - - - - thirdFunction definition

}
