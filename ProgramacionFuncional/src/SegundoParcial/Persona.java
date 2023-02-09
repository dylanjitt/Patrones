package SegundoParcial;

public class Persona {
	
	String nombre;
	int edad;
	String CI;
	
	public Persona(String nombre, int edad, String cI) {
		this.nombre = nombre;
		this.edad = edad;
		CI = cI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCI() {
		return CI;
	}

	public void setCI(String cI) {
		CI = cI;
	}
	
	public String mostrar() {
		return nombre+", "+edad+" años, ("+CI +")"+esMayorDeEdad();
	}
	
	public String esMayorDeEdad() {
		if (this.edad>=21) {
			return "(Mayor de Edad) ";
		}
		return "";
	}
	
	

}
