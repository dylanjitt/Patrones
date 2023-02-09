package SegundoParcial;

import java.util.List;
import java.util.function.BiFunction;

public class P3ej3 {

	public static void main(String[] args) {
		
		 List<Estudiante> listaEstudiantes = List.of(new Estudiante("Hugo", 90), new Estudiante("Jose", 40), new Estudiante("Emanuel", 95));
		 
		 listaEstudiantes.stream().map(P3ej2::aprobacionEstudiante).forEach(System.out::println);
		 
		 BiFunction<Estudiante, Estudiante, Double> operacion = (a, b) -> (a.nota + b.nota) / 2;
		 
		 System.out.println(operacion.apply(new Estudiante("Dylan", 80), new Estudiante("Ander", 90)));
	}
	
	public static Boolean aprobacionEstudiante(Estudiante e) {
		if (e.nota>=51) {
			return true;
		}
		return false;
	}

}
