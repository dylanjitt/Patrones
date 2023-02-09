package SegundoParcial;

import java.util.List;
import java.util.stream.IntStream;

public class PFSegundoParcial {

	public static void main(String[] args) {
		System.out.println("-------------PRIMER ORDEN------");
		System.out.println(suma(5,6));//funcion de primer orden

		System.out.println("---------ORDEN SUPERIOR---------");
		List<Integer> lista =List.of(4, 4,8,9,5,4,2,8);
		
		lista.stream().map(PFSegundoParcial::operacion).forEach(System.out::println);//funcion de orden superior
		System.out.println(lista);
		
		System.out.println("-----ORDEN SUPERIOR OBJETOS-----");
		//-List
		List<Cuadrilatero>cuadrilateros = List.of(new Cuadrilatero(5, 3, 5),new Cuadrilatero(9, 8, 10),new Cuadrilatero(9, 9, 9));
		cuadrilateros.stream().map(cuadrilatero-> cuadrilatero.alto*cuadrilatero.ancho*cuadrilatero.largo)
		//.filter(volumen->volumen>100)
		.forEach(System.out::println);
		
		System.out.println("----------------------");
		
		int sumaVolumen = cuadrilateros.stream().map(cuadrilatero -> cuadrilatero.alto*cuadrilatero.ancho*cuadrilatero.largo)
				.reduce(0, (a,b)-> a*b);
		
		System.out.println("Suma Volumen: "+sumaVolumen);
		
		//Sumar los elementos de una lista
		
		
		List<Integer> listaEnteros =List.of(6,4,8,4,4,322);
		
		int acumulador = listaEnteros.stream().reduce(0, (a,b)-> operacionAcumuladora(a,b));
		
		System.out.println(acumulador);
		
		System.out.println("---------------REDUCE CON OBJETOS------------");
		
		System.out.println(cuadrilateros.stream().reduce(new Cuadrilatero(0,0,0), (a,b)->acumuladorCuadrilatero(a,b)));
		
		
		///
		int total1 = 0;
		
		for (int i=0; i<=10; i++) {
			total1 =total1+i;
		}
		
		System.out.println(total1);
		
		System.out.println(IntStream.rangeClosed(0, 10).reduce(0, (total2, i)->total2+i));
		///usando reduce calculamos el factorial de un numero 5!= 5*4*3*2*1
	}
	
	public static Cuadrilatero acumuladorCuadrilatero(Cuadrilatero a, Cuadrilatero b) {
		Cuadrilatero resultado = new Cuadrilatero(a.alto+b.alto,a.ancho+b.ancho,a.largo+b.largo);
		return resultado;
	}
	
	public static int operacionAcumuladora(int a, int b) {
		return ((a+b)/2);
	}

	public static int suma(int i, int j) {
		
		return i+j;
	}
	
public static int operacion(int i) {
		
		return i+6+7-4;
	}
	

}
