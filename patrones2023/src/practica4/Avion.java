package practica4;

public class Avion {

	private String marca;
	private int modelo;
	private int capacidad;
	private int nroAsientos;
	
	public Avion(String marca, int modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public int getNroAsientos() {
		return nroAsientos;
	}

	public void setNroAsientos(int nroAsientos) {
		this.nroAsientos = nroAsientos;
	}
	
	public void showInfo() {
		System.out.println("Avión: "+marca+" "+modelo);
		System.out.println("capacidad para "+capacidad+" personas, nro. asientos: "+nroAsientos);
	}
}
