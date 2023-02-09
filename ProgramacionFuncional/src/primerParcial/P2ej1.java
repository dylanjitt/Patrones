package primerParcial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class P2ej1 {
	
	public static void main(String[] args) {

		String cadena = "hello there";
		
		int contador =0;
		
		//cadena.chars().filter((char a) -> a.anyMatch('a'));
		
		for(int i =0; i<cadena.length(); i++) {
			if(cadena.charAt(i)!=' '&&cadena.charAt(i)!='a'&& cadena.charAt(i)!='e'&&cadena.charAt(i)!='i'&&cadena.charAt(i)!='o'&&cadena.charAt(i)!='u') {
				contador ++;
			}
		}
		
		System.out.println("La cadena tiene "+contador+" consonantes");
		//System.out.println("La cadena tiene "+contarVocales(cadena)+" vocales");
		
	}
	
	//public static int contarVocales(String cadena) {
	//	return cadena.chars().filter(!('a'||'e'||'i'||'o'||'u')).count();
	//}

}
