package SegundoParcial;

import java.util.Stack;
import java.util.function.BiFunction;

public class Posfija {

	public static void main(String[] args) {

		Stack<Integer> numeros = new Stack<>();
		String operacion = "4 5 + 1 -";
		while (!numeros.isEmpty()) {
		int int2;
		int int1;
			for (int i =0; i<operacion.length(); i++) {
				char a = operacion.charAt(i);
				
				if (a=='0'||a=='1'||a=='2'||a=='3'||a=='4'||a=='5'||a=='6'||a=='7'||a=='8'||a=='9') {
					numeros.push(numbers(a));	
				}
				else if (a=='+'||a=='-'||a=='*'||a=='/') {
					int2=numeros.pop();
					int1=numeros.pop();
					int c =getOperador(a).apply(int1, int2);
					int1=c;
				}

			}
	//		System.out.println(int1);
		}
	}

	public static BiFunction<Integer, Integer, Integer> getOperador(char opcion) {
		
		//char opcion = s.charAt(1);
		
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
	
	public static int numbers (char a) {
		
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

}
