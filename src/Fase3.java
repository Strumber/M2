import java.util.*;

import javax.swing.JOptionPane;

public class Fase3 {

	public static void main(String[] args) {

		HashMap<Integer, String> contenidor = new HashMap<Integer, String>();
		// HashMap<Integer,String> vagades = new HashMap<Integer,String>();
		int repetit = 0;

		String nom = JOptionPane.showInputDialog("Introdueix el teu nom:");
		System.out.println("Nom Introduït : " + nom);

		for (int p = 0; p < nom.length(); p++) {
			char caracter = nom.charAt(p);
			System.out.println(caracter);

			for (int r = 0; r < nom.length(); r++) {
				if (nom.charAt(r) == caracter) {

					repetit++;

				}

			}

			contenidor.put(p + 1, "Caracter " + nom.charAt(p) + " Repetit " + repetit + " Vagada/es");
			repetit = 0;
		}

		System.out.println(contenidor);

	}

}
