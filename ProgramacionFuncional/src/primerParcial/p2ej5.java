package primerParcial;

public class p2ej5 {
public static void main(String[] args) {
		
		Integer numero = 657581209;
		//String num = numero.toString();	
		//recorrerImperativo(num);
		System.out.println(numero);
		System.out.println("----------");
		System.out.print("el numero ingresado tiene ");
		System.out.print(numero.toString().chars().filter(numchar->numchar%2==0).count());
		System.out.println(" numeros pares.");
		System.out.println("----------");
		numero.toString().chars().filter(numchar->numchar%2==0).forEach(i->System.out.println((char)i));
	}
	
	public static void recorrerImperativo(String cadena) {
		//int contador=0;
		for (int i =0; i< cadena.length(); i++) {
			char numero = cadena.charAt(i);
			if ((int)numero%2==0) {
				System.out.println(numero);
				//contador++;
			}
		
		}
		System.out.println("----------");
		//System.out.println("En la cadena hay "+contador+" numeros Impares");
		
		
	}
	
}
