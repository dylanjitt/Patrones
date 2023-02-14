package practica4;


public class PasajeSolidario extends Pasaje {
	
	private int numVuelo;
	private LugarVuelo destino;
	private LugarVuelo origen;
	private Avion avion;
	private Pasajero pasajero;
	private String numAsiento;
	private double costo;
	private double descuentoPercentage;
	//private double precioFinal = costo-(costo*(descuentoPercentage/100));
	
	public double precioFinal (double costo, double descuentoPercentage) {
		double pf = costo-(costo*(double)(descuentoPercentage/100));
		return pf;
	}
	
	public PasajeSolidario() {}

	public int getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(int numVuelo) {
		this.numVuelo = numVuelo;
	}

	public LugarVuelo getDestino() {
		return destino;
	}

	public void setDestino(LugarVuelo destino) {
		this.destino = destino;
	}

	public LugarVuelo getOrigen() {
		return origen;
	}

	public void setOrigen(LugarVuelo origen) {
		this.origen = origen;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Pasajero getPasajero() {
		return pasajero;
	}

	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}

	public String getNumAsiento() {
		return numAsiento;
	}

	public void setNumAsiento(String numAsiento) {
		this.numAsiento = numAsiento;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getDescuentoPercentage() {
		return descuentoPercentage;
	}

	public void setDescuentoPercentage(double descuentoPercentage) {
		this.descuentoPercentage = descuentoPercentage;
	}
	
	@Override
	public void infoPasaje() {
		System.out.println("--------------------------");
		System.out.println("Tipo pasaje: SOLIDARIO");
		System.out.println("Numero de Vuelo: "+numVuelo);
		System.out.print("Origen: ");
		origen.showInfo();
		System.out.print("Destino: ");
		destino.showInfo();
		avion.showInfo();
		pasajero.showInfo();
		System.out.println("Numero de asiento: "+numAsiento);
		System.out.println("Precio Inicial: "+costo);
		System.out.println("Descuento aplicado: "+descuentoPercentage+"%");
		System.out.println("Precio Final: "+precioFinal(costo,descuentoPercentage));
		
	}

}
