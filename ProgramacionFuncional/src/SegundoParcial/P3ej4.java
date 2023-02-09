package SegundoParcial;

import java.util.List;

public class P3ej4 {
	public static void main(String[] args) {
		
		List<Pelicula> peliculas = List.of(new Pelicula("Star Wars, Episodio III, revenge of the sith",4), new Pelicula("Morbius",5),new Pelicula("Baby Boss",1));
		
		peliculas.stream().map(P3ej4::showMovie).forEach(System.out::print);
	}

	public static String showMovie(Pelicula p) {
		if (p.rating>=4) {
			return p.nombre ;
		}
		return " ";
	}
	
	//TODO implementar metodo de cantidad de estrellas...
	public void stars (int n) {
		for (int i=0; i<= n; i++) {
			System.out.print('*');
		}
		System.out.println();
	}
}
