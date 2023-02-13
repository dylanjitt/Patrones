package practica3;

public class Solidario1creator extends CreatorPasaje {

	@Override
	public PasajeSolidario create() {
		PasajeSolidario pasaje = new PasajeSolidario();
		
		int numVuelo = 658;
		LugarVuelo origen = new LugarVuelo( "La Paz");
		origen.setPais("Bolivia");
		origen.setAeropuerto("Aeropuerto Internacional El Alto");
		
		LugarVuelo destino = new LugarVuelo("Santa Cruz");
		destino.setPais("Bolivia");
		destino.setAeropuerto("Aeropuerto Internacional Viru Viru");
		
		Avion avion = new Avion("Boeing", 777);
		int cap =200;
		avion.setCapacidad(cap);
		avion.setNroAsientos(cap);
		Pasajero pasajero = new Pasajero("Sara Biyin", "696969");
		String numAsiento = "10D";
		double costoPasaje = 400.00;
		double descuento = 24.00;
		
		pasaje.setNumVuelo(numVuelo);
		pasaje.setOrigen(origen);
		pasaje.setDestino(destino);
		pasaje.setAvion(avion);
		pasaje.setPasajero(pasajero);
		pasaje.setNumAsiento(numAsiento);
		pasaje.setCosto(costoPasaje);
		pasaje.setDescuentoPercentage(descuento);
	
		return pasaje;
	}
}
