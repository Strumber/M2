import java.util.ArrayList;

public class Fase4 {

	public static void main(String[] args) {
		ArrayList<Character> nom = new ArrayList<Character>();
		byte ultimaP = 0;
		nom.add('J');
		nom.add('o');
		nom.add('r');
		nom.add('d');
		nom.add('i');
		
		ArrayList<Character> cognom = new ArrayList<Character>();
		cognom.add('A');
		cognom.add('l');
		cognom.add('b');
		cognom.add('i');
		cognom.add('o');
		cognom.add('l');
		
		
		ArrayList<Character> FullName = new ArrayList<Character>();
		
		for (int i=0; i < nom.size() ;  i ++) {//recorre la primera matriu nom per afegir cada char a la nova matriu FullName
			
			FullName.add(nom.get(i));
			ultimaP = (byte)i;
					
		}
		
		FullName.add(' ');
		
		for (int j=0; j < cognom.size(); j++) {//recorre la segona matriu cognom per afegir cada char al la matriu FullName
			
			FullName.add(cognom.get(j));
			
		}

		for (char imprimir:FullName) {// Imprimeix per consola la matriu FullName (nom + ' ' + cognom) fusionada
			System.out.print(imprimir);
		}
	}

}
