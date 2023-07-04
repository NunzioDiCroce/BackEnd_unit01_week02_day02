package Esercizio3_Package;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3Main {

	public static void main(String[] args) {

		Map<String, String> rubrica = new HashMap<>(); // HashMap object definition

		Scanner esercizioTre = new Scanner(System.in);

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 3 - - - - - - - - - -");
		System.out.println("");

		System.out.println(" Operazioni possibili");
		System.out.println("");
		System.out.println(" 1) Inserire nuovo contatto");
		System.out.println(" 2) Cancella contatto esistente");
		System.out.println(" 3) Cerca telefono contatto");
		System.out.println(" 4) Cerca nome contatto");
		System.out.println(" 5) Stampa contatti");
		System.out.println("");
		System.out.println(" Scegli un numero da 1 a 5:");

		String scelta = esercizioTre.nextLine();

		String sceltaSwitch = scelta;

		switch (sceltaSwitch) {
		case "1":
			inserisciContatto();
			break;
		case "2":
			cancellaContatto();
			break;
		case "3":
			cercaTelefono();
			break;
		case "4":
			cercaNome();
			break;
		case "5":
			stampaContatti();
			break;
		}

	}

	public static void inserisciContatto() {

	}

	public static void cancellaContatto() {

	}

	public static void cercaTelefono() {

	}

	public static void cercaNome() {

	}

	public static void stampaContatti() {

	}

}
