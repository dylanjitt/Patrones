package SegundoParcial;

public class Cuenta extends Persona {

	Persona titular = new Persona(nombre, getEdad(), getCI());
	
	double cantidad;
	
	public Cuenta(String nombre, int edad, String cI, double cantidad) {
		   super(nombre, edad, cI);
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	protected void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	@Override
	public String mostrar() {
		return nombre+", "+edad+" años, ("+CI +")"+esMayorDeEdad()+"Estado de cuenta: "+cantidad+" Bs.";
		
	}
	
	public void ingresar(double cantidad) {
		setCantidad(this.cantidad+cantidad);
	}
	
	public void retirar (double cantidad) {
		setCantidad(this.cantidad-cantidad);
	}

}
