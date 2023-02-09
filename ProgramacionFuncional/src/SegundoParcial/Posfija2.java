package SegundoParcial;

import java.util.Stack;

public class Posfija2 {

	public static void main(String[] args) {
		String expresion = "4 5 + 1 -";
		String[] operacion = expresion.split(" ");

		Stack<String> numeros = new Stack<>();
		Stack<String> resultado= new Stack<>();

		for (int i = operacion.length-1;i>=0;i--) {
			numeros.push(operacion[i]);
		}

		String op = "+-*/%"; 
		while (!numeros.isEmpty()) {
			if(op.contains(""+numeros.peek())) {
				resultado.push(num(numeros.pop(),resultado.pop(),resultado.pop())+"");
			}else {
				resultado.push(numeros.pop());
			}
		}
		System.out.println(resultado.peek());

	}
	
	public static int num(String o, String n2, String n1) {
		int nn1=Integer.parseInt(n1);
		int nn2=Integer.parseInt(n2);
		
		if(o.equals("+"))return (nn1+nn2);
		if(o.equals("-"))return (nn1-nn2);
		if(o.equals("*"))return (nn1*nn2);
		if(o.equals("/"))return (nn1/nn2);
		return 0;
	}

}
