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

		// - - - - - - - - - - - - - - - - - - - - secondFunction call and data entry
		System.out.println(
				"Inserisci un numero intero N per ottenere una lista ordinata di N interi casuali da 0 a 100:");
		String nSecond = esercizioDue.nextLine();
		int nSecondInt = Integer.parseInt(nSecond);

		List<Integer> secondList = new ArrayList<>(); // ArrayList object creation
		for (int i = 0; i < nSecondInt; i++) {
			secondList.add((int) (Math.random() * 101));
		}
		System.out.println("secondList: " + secondList);

		List<Integer> secondListNew = secondFunction(secondList);
		System.out.println("secondListNew: " + secondListNew);
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("");

		// - - - - - - - - - - - - - - - - - - - - thirdFunction call and data entry
		System.out.println(
				"Inserisci un numero intero N per ottenere una lista ordinata di N interi casuali da 0 a 100:");
		String nThird = esercizioDue.nextLine();
		int nThirdInt = Integer.parseInt(nThird);

		List<Integer> thirdList = new ArrayList<>(); // ArrayList object creation
		for (int i = 0; i < nThirdInt; i++) {
			thirdList.add((int) (Math.random() * 101));
		}
		System.out.println("thirdList: " + thirdList);

		System.out
				.println("Inserisci \"true\" per stampare i numeri in posizione pari, \"false\" in posizione dispari:");
		String nThird2 = esercizioDue.nextLine();
		boolean nThird2Boolean = Boolean.parseBoolean(nThird2);

		thirdFunction(thirdList, nThird2Boolean);

		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - -");
		System.out.println("");

		System.out.println("Termine programma");

		esercizioDue.close();
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
	public static List<Integer> secondFunction(List<Integer> _list) {
		List<Integer> secondList = new ArrayList<>(_list);
		Collections.reverse(secondList);
		_list.addAll(secondList);
		return _list;
	}

	// - - - - - - - - - - - - - - - - - - - - thirdFunction definition
	public static void thirdFunction(List<Integer> _thirdList, boolean _pariDispari) {
		for (int i = _pariDispari ? 0 : 1; i < _thirdList.size(); i += 2) {
			System.out.println(_thirdList.get(i));
		}
	}
}
