package SegundoParcial;

import java.util.function.Function;

public class Estudiante {
	
	String nombre;
	double nota;
	
	public Estudiante(String nombre, double nota) {
		this.nombre=nombre;
		this.nota=nota;
	}
	
	@Override
	public String toString() {
		return "Estudiante{"+ "nombre="+nombre+", nota="+nota+"}";
	}
	
	public void applyFunction(Function<Double, Double> operador) {
		this.nota = operador.apply(nota);
	}

}
