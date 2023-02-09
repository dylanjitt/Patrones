package SegundoParcial;

public class P3ej1 {

	public static void main(String[] args) {
		String cadena = "1 2 3 4 5 6 7";
		
		literalConverter(cadena);

	}
	
	public static void literalConverter (String c) {
		c.chars().forEach(i->System.out.print(intWord((char)i)));
	}
	
	public static String intWord (char a) {
		if (a=='0') {
			return "cero";
		}else if (a=='1') {
			return "uno";
		}else if (a=='2') {
			return "dos";
		}else if (a=='3') {
			return "tres";
		}else if (a=='4') {
			return "cuatro";
		}else if (a=='5') {
			return "cinco";
		}else if (a=='6') {
			return "seis";
		}else if (a=='7') {
			return "siete";
		}else if (a=='8') {
			return "ocho";
		}else if (a=='9') {
			return "nueve";
		}else if (a==' ') {
			return " ";
		}else {
			return "Parametro no valido";
		}
	}
	

}
