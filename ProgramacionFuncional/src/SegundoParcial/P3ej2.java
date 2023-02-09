package SegundoParcial;

import java.util.List;

public class P3ej2 {

	public static void main(String[] args) {
		
		 List<Estudiante> listaEstudiantes = List.of(new Estudiante("Hugo", 90), new Estudiante("Jose", 40), new Estudiante("Emanuel", 95));
		 
		 listaEstudiantes.stream().map(P3ej2::aprobacionEstudiante).forEach(System.out::println);

	}
	
	public static String aprobacionEstudiante(Estudiante e) {
		if (e.nota>=51) {
			return e.nombre;
		}
		return " ";
	}
	
	

}
