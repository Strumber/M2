
import java.util.Scanner;

import javax.swing.JOptionPane;
 
public class Nivell2b{
     
    public static void main(String[] args) {
    	int numF =Integer.parseInt(JOptionPane.showInputDialog("Introdueix un nombre:"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa triangle  invertit dels '*'");
		System.out.println("____________________________");
        System.out.println();
        for(int numBl = 0, numAst = (numF*2)-1; numAst>0; numBl++, numAst -= 2){
             
            //Afegir espais en blanc
            for(int i=0; i < numBl; i++){
                System.out.print(" ");
            }
             
            //Asteriscs
            for(int j=numAst; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }   
}

