package SegundoParcial;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LaunchPosiciones {

	public static void main(String[] args) {
		List<Posiciones> posiciones = List.of(new Posiciones(54.0, 33.3, 69.5, 42.7),new Posiciones(33.3, 42.5, 37.8, 67.9),new Posiciones(77.6, 25.1, 88.3, 57.4));
		
		maxAlt(posiciones);
		minAlt(posiciones);
	}
	
	public static void maxAlt(List<Posiciones>p) {
		System.out.print("Maxima altitud: ");
		System.out.println(p.stream().max(Comparator.comparingDouble(Posiciones::getAltitud)).get());
		
	}
	
	public static void minAlt(List<Posiciones>p) {
		System.out.print("Minima altitud: ");
		System.out.println(p.stream().min(Comparator.comparingDouble(Posiciones::getAltitud)).get());
		
	}

}
