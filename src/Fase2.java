import java.util.ArrayList;

public class Fase2 {

	public static void main(String[] args) {
		// Fase 2

		// Canvia la taula per una llista (List<Character>)
		// Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó,
		// imprimeix: ‘CONSONTANT’.
		// Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen
		// números!’.

		ArrayList<Character> nom = new ArrayList<Character>();

		nom.add('J');
		nom.add('0');
		nom.add('r');
		nom.add('d');
		nom.add('i');

		
		
		for (int i=0; i < nom.size() ;  i ++) {
			
			if ( nom.get(i)=='a' || nom.get(i)=='e' || nom.get(i)=='i' || nom.get(i)=='o' || nom.get(i) == 'u')  {//Verifica si la lletra es una vocal
				System.out.println("La lletra '"+nom.get(i)+ "' del teu nom és una Vocal");
			}else if (nom.get(i)>=48 && nom.get(i)<= 57){
				System.out.println("'"+nom.get(i)+ "' ELS NOMS DE PERSONES NO CONTENEN NUMEROS !!!!");//verifica que el char introduit esta entre el codi AscII 48 al 57 que correspon als nombres (0-9)
				
			}else {
				System.out.println("La lletra '"+nom.get(i)+ "' del teu nom és una Consonant"); // en el cas que no sigui ni nombre ni vocal
			}
			
		}

	}
}
