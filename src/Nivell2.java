import java.util.ArrayList;

import javax.swing.*;
public class Nivell2 {

	public static void main(String[] args) {
		System.out.println("Programa triangle de numeros");
		System.out.println("____________________________");
		int num =Integer.parseInt(JOptionPane.showInputDialog("Introdueix un nombre:"));
		int num1 =1;
		ArrayList<Integer> imp = new ArrayList<Integer>();
		//String text="";
		//String cadena = "*";
 
		for (int i=0;i<num; i++){
			imp.add(num1);
	
			System.out.println(imp);
			num1++;
		}
		
	
	}

}
