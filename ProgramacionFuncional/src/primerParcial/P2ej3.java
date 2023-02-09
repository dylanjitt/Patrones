package primerParcial;

public class P2ej3 {
	public static void main(String[] args) {
		
		Integer numero = 999988998;
		String num = numero.toString();	
		System.out.println(numero);
		recorrerImperativo(num);
		
	}
	
	public static void recorrerImperativo(String cadena) {
		int contador=0;
		for (int i =0; i< cadena.length(); i++) {
			char numero = cadena.charAt(i);
			if ((int)numero%2==1) {
				//System.out.println(numero);
				contador++;
			}
		
		}
		System.out.println("----------");
		System.out.println("En la cadena hay "+contador+" numeros Impares");
		
		
	}

}
