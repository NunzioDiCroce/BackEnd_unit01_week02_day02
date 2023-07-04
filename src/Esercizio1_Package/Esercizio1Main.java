package Esercizio1_Package;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1Main {

	public static void main(String[] args) {

		Scanner esercizioUno = new Scanner(System.in);

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -");
		System.out.println("");

		System.out.println("Inserisci il numero di parole da censire:");
		String n = esercizioUno.nextLine();
		int nInt = Integer.parseInt(n);

		Set<String> distinteSet = new HashSet<>(); // HashSet object creation
		Set<String> duplicateSet = new HashSet<>(); // HashSet object creation

		System.out.println("Inserisci le " + n + " parole:");
		for (int i = 0; i < nInt; i++) {
			String parola = esercizioUno.nextLine();
			// System.out.println(parola);
			if (!distinteSet.add(parola)) {
				duplicateSet.add(parola);
			}
		}

		System.out.println("");
		System.out.println("Queste sono le parole duplicate: ");
		for (String _parola : duplicateSet) {
			System.out.println(_parola);
		}

		System.out.println("");
		System.out.println("Le parole distinte sono: " + distinteSet.size());

		System.out.println("");
		System.out.println("Questo è l'elenco delle parole distinte: ");
		for (String _parola : distinteSet) {
			System.out.println(_parola);
		}

		System.out.println("");
		System.out.println("Termine programma");

		esercizioUno.close();
	}

}
