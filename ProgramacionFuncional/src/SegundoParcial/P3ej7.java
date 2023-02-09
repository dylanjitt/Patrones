package SegundoParcial;

import java.util.function.BiFunction;

public class P3ej7 {

	public static void main(String[] args) {
		String operacion = "8*5";
		int a = numcheck(operacion.charAt(0));
		int b = numcheck(operacion.charAt(2));
		System.out.println(getOperador(operacion).apply(a,b));
	}
	
	public static int numcheck (char a) {
		
			if (a=='1')return 1;
			else if (a=='2')return 2;
			else if (a=='3')return 3;
			else if (a=='4')return 4;
			else if (a=='5')return 5;
			else if (a=='6')return 6;
			else if (a=='7')return 7;
			else if (a=='8')return 8;
			else if (a=='9')return 9;
			else if (a=='0')return 0;
			return 0;
		}
	
	public static BiFunction<Integer, Integer, Integer> getOperador(String s) {
		
		char opcion = s.charAt(1);
		
        switch (opcion) {
            case '+':
                BiFunction<Integer, Integer, Integer> suma = (x,y)->x+y;
                return suma;                
            case '-':
            	BiFunction<Integer, Integer, Integer> resta = (x,y)->x-y;
                return resta;                
            case '*':
            	BiFunction<Integer, Integer, Integer> multiplicacion = (x,y)->x*y;
                return multiplicacion;
            case '/':
            	BiFunction<Integer, Integer, Integer> division = (x,y)->x/y;
                return division; 
            default:
                throw new AssertionError();
        }
    }

}	
/*	public static void charType2 (String s) {
		//int operador;
		int op1=(int)s.charAt(0);
		int op2=(int)s.charAt(2);
		
			
			char a = s.charAt(1);
			
			if (a=='+') {
				System.out.println(obtenerOperador(1).apply(op1, op2));
			}
			else if (a=='-') {
				System.out.println(obtenerOperador(2).apply(op1, op2));;
			}
			else if (a=='*') {
				System.out.println(obtenerOperador(3).apply(op1, op2));
			}
			else if (a=='/') {
				System.out.println(obtenerOperador(4).apply(op1, op2));
			}	
	}*/
	


