package primerParcial;

import java.util.ArrayList;
import java.util.List;

public class p2ej7 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		numeros.add(12);
		numeros.add(4);
		numeros.add(3);
		numeros.add(15);
		numeros.add(79);
		numeros.add(1);
		numeros.add(89);
		numeros.add(0);

		System.out.print("La lista contiene ");
		System.out.print(numeros.stream().filter(num -> isPrime2(num)).count());
		System.out.println(" Numeros Primos. ");
		System.out.println(numeros);
	}

	
	public static boolean isPrime2 (int n) {
		int acc=0;
		for (int i =1; i<= n; i++){
			 if ((n%i==0)){
			 acc++;
			 }
			 }
			 if(acc==2){
				 return true;
			}else {
				return false;
			}

	}
}
