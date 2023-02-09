package primerParcial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParcialEj3 {
	public static void main(String[] args) {
		String numbers= "9 7 3 6 2 9 3 7";
		
		//numbers.chars().forEach(numchar->letters(numchar));
		System.out.println();
	}
	
	
	public static String letters (char num) {
		switch (num) {
		case ' ': {
			System.out.print(" ");
			
		}
		case '1': {
			System.out.print("uno ");
		}
		case '2': {
			System.out.print("dos ");
			
		}
		case '3': {
			System.out.print("tres ");
			
		}
		case '4': {
			System.out.print("cuatro ");
			
		}
		case '5': {
			System.out.println("cinco ");
			
		}
		case '6': {
			System.out.println("seis ");
			
		}
		case '7': {

			System.out.println("siete");
		}
		case '8': {
			System.out.println("ocho");
		
		}
		case '9': {
			System.out.println("nueve");
			
		}
		case '0': {
			System.out.println("cero");
		
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	}

}
