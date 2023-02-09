package SegundoParcial;

import java.util.List;

public class P3ej5 {
	public static void main(String[] args) {
		List<String> palabras = List.of("Hola", "Bueno", "Aexddg");
		
		palabras.stream().map(P3ej5::isVocal3).forEach(System.out::println);
	}
	
	public static String isVocal3 (String s) {
		int acc=0;
		for (int i =0; i<s.length(); i++) {
			char a = s.charAt(i);
			if (isVocal(a)) {
				acc++;
			}
		}
		if (acc>=3) {
			return s;
		}
		return " ";
	}
		
	public static Boolean isVocal (char c) {
		if (c=='a') {
			return true;
		}else if (c=='e') {
			return true;
		}else if (c=='i') {
			return true;
		}else if (c=='o') {
			return true;
		}else if (c=='u') {
			return true;
		}else {
			return false;
		}
	}

}
