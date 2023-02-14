package practica4;


public class PasajeInfantes extends Pasaje {
	
	private int numVuelo;
	private LugarVuelo destino;
	private LugarVuelo origen;
	private Avion avion;
	private Pasajero pasajero;
	private String numAsiento;
	private double costo;
	//private double precioFinal = costo*(double)0.8;
	
	public PasajeInfantes() {}
	
	public double precioFinal (double costo) {
		double pf = costo*(double)0.8;
		return pf;
	}

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
	
	@Override
	public void infoPasaje() {
		System.out.println("--------------------------");
		System.out.println("Tipo pasaje: INFANTES");
		System.out.println("Numero de Vuelo: "+numVuelo);
		System.out.print("Origen: ");
		origen.showInfo();
		System.out.print("Destino: ");
		destino.showInfo();
		avion.showInfo();
		pasajero.showInfo();
		System.out.println("Numero de asiento: "+numAsiento);
		System.out.println("Precio Inicial: "+costo);
		System.out.println("Descuento aplicado: INFANTIL (20%)");
		System.out.println("Precio Final: "+precioFinal(costo));
		
	}

}
