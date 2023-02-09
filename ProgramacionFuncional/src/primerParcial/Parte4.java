package primerParcial;

public class Parte4 {
	//456788765

	public static void main(String[] args) {
		Integer numero = 45678765;
		String num = numero.toString();
		//recorrerImperativo(num);
		num.chars().forEach(i->{System.out.println((char)i);});
		System.out.println("---------------------");
		System.out.println(num);

	}
	
	public static void recorrerImperativo(String cadena) {
		for (int i =0; i< cadena.length(); i++) {
			System.out.println(cadena.charAt(i));
		}
	}
	
	

}
