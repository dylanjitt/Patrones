package SegundoParcial;

import java.util.List;

public class P4ej3 {

	public static void main(String[] args) {
		List <Persona3> personas = List.of(new Persona3("Mateo Andres", "Sanjines", 34), new Estudiante3("Carlos Antonio", "Santana Gonzales", 35));

		contador(personas);
	}
	
	public static void contador(List<Persona3> p) {
        int acc = 0;
        long avg = p.stream().count();
        long sum = p.stream().mapToLong(Persona3::getEdad).sum();
        acc = (int) (sum / avg);
        System.out.println("Promedio de edades : " + acc);

    }

}
