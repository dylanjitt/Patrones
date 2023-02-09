package primerParcial;

public class ParcialEj1 {
	public static void main(String[] args) {
		int numero = 24;
		System.out.print(numero+ " = ");
		divisores(numero);
	}
	
	public static void divisores(int numero) {
		
		for (int i = 2; i<=numero;i++) {
			while (numero%i==0) {
				System.out.print(i+" ");
				numero=numero/i;
			}
			
		}
		
		// 24/2= 12,%0 12/2= 6,%0, 6/2=3,%0, 3/2-> 3/3 = 1.
	}

}
