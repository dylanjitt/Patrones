package primerParcial;

import java.util.function.BiFunction;

public class A {

	public static void main(String[] args) {
		String s = "5+8";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		
		System.out.println(s.charAt(0)+s.charAt(2));
		int operador=0;
		int op1=s.charAt(0);
		int op2=s.charAt(2);
		
			
			char a = s.charAt(1);
			
			if (a=='+') {
				operador=1;
			}
			else if (a=='-') {
				operador=2;
			}
			else if (a=='*') {
				operador=3;
			}
			else if (a=='/') {
				operador=4;
			}
	
	//System.out.println(op1+' '+a+' '+op2);
	//System.out.println(obtenerOperador(operador).apply(op1, op2));

	}
	
	public static BiFunction<Integer,Integer, Integer> obtenerOperador(int opcion) {
        switch (opcion) {
            case 1:
                BiFunction<Integer,Integer, Integer> suma = (x,y)->x+y;
                return suma;                
            case 2:
            	BiFunction<Integer,Integer, Integer> resta = (x,y)->x-y;
                return resta;                
            case 3:
            	BiFunction<Integer,Integer, Integer> multiplicacion = (x,y)->x*y;
                return multiplicacion;
            case 4:
            	BiFunction<Integer,Integer, Integer> division = (x,y)->x/y;
                return division; 
            default:
                throw new AssertionError();
        }
    }

}
