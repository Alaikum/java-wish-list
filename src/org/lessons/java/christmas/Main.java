package org.lessons.java.christmas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> listaNatale = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		boolean continua = true;

		do {
			System.out.printf("Attualmente hai %d regali in lista.\nInserisci qui un nuovo desiderio:\n",
					listaNatale.size());
			listaNatale.add(s.nextLine());
			System.out.println("-------Vuoi continuare? S/N-------");
			if (s.nextLine().trim().toLowerCase().equals("n"))
				continua = false;
		} while (continua);

		s.close();
		// STAMPA LISTA ORDINATA
		Collections.sort(listaNatale);
		System.out.println(listaNatale);

	}

}
