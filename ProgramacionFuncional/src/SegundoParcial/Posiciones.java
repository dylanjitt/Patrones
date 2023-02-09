package SegundoParcial;

public class Posiciones {
	
	double latitud;
	double longitud;
	double altitud;
	double velocidad;
	
	public Posiciones(double latitud, double longitud, double altitud, double velocidad) {
		this.latitud = latitud;
		this.longitud = longitud;
		this.altitud = altitud;
		this.velocidad = velocidad;
	}

	public double getAltitud() {
		return altitud;
	}

	public void setAltitud(double altitud) {
		this.altitud = altitud;
	}

	@Override
	public String toString() {
        return ""+altitud;
    }

}
