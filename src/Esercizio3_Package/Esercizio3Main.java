package Esercizio3_Package;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Esercizio3Main {

	static Map<String, String> rubrica = new HashMap<>(); // HashMap object definition

	public static void main(String[] args) {

		Scanner esercizioTre = new Scanner(System.in);

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 3 - - - - - - - - - -");
		System.out.println("");

		System.out.println("Operazioni possibili");
		System.out.println("");
		System.out.println("1) Inserire nuovo contatto");
		System.out.println("2) Cancella contatto esistente");
		System.out.println("3) Cerca telefono contatto");
		System.out.println("4) Cerca nome contatto");
		System.out.println("5) Stampa contatti");
		System.out.println("");
		System.out.println("Scegli un numero da 1 a 5:");

		String scelta = esercizioTre.nextLine();

		String sceltaSwitch = scelta;

		switch (sceltaSwitch) {
		case "1":
			inserisciContatto(esercizioTre);
			break;
		case "2":
			cancellaContatto(esercizioTre);
			break;
		case "3":
			cercaTelefono(esercizioTre);
			break;
		case "4":
			cercaNome(esercizioTre);
			break;
		case "5":
			stampaContatti();
			break;
		}

	}

	public static void inserisciContatto(Scanner _scanner) {

		System.out.println("Inserisci nome:");
		String nome = _scanner.nextLine();

		System.out.println("Inserisci numero:");
		String numero = _scanner.nextLine();

		rubrica.put(nome, numero);
		System.out.println(nome + " " + numero + " inserito con successo.");
	}

	public static void cancellaContatto(Scanner _scanner) {

		System.out.println("Inserisci nome da cancellare:");
		String nome = _scanner.nextLine();

		if (rubrica.containsKey(nome)) {
			rubrica.remove(nome);
			System.out.println(nome + " eliminato con successo.");
		} else {
			System.out.println("Contatto non presente in rubrica");
		}
	}

	public static void cercaTelefono(Scanner _scanner) {

		System.out.println("Inserisci telefono da cercare:");
		String numero = _scanner.nextLine();

		if (rubrica.containsKey(numero)) {
			String nome = rubrica.get(numero);
			System.out.println("Numero " + numero + " trovato con nome " + nome);
		} else {
			System.out.println("Numero non presente in rubrica");
		}

	}

	public static void cercaNome(Scanner _scanner) {

		System.out.println("Inserisci nome da cercare:");
		String nome = _scanner.nextLine();

		if (rubrica.containsKey(nome)) {
			String numero = rubrica.get(nome);
			System.out.println("Nome " + nome + " trovato con numero " + numero);
		} else {
			System.out.println("Nome non presente in rubrica");
		}
	}

	public static void stampaContatti() {

	}

}
