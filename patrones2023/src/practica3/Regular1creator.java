package practica3;

public class Regular1creator extends CreatorPasaje {

	@Override
	public PasajeRegular create() {
		PasajeRegular pasaje = new PasajeRegular();
		
		int numVuelo = 777;
		LugarVuelo origen = new LugarVuelo( "La Paz");
		origen.setPais("Bolivia");
		origen.setAeropuerto("Aeropuerto Internacional El Alto");
		
		LugarVuelo destino = new LugarVuelo("Buenos Aires");
		destino.setPais("Argentina");
		destino.setAeropuerto("Aeropuerto Internacional Ezeiza");
		
		Avion avion = new Avion("Boeing", 777);
		int cap =200;
		avion.setCapacidad(cap);
		avion.setNroAsientos(cap);
		
		Pasajero pasajero = new Pasajero("Damon Albarn", "849356");
		String numAsiento = "2D";
		double costoPasaje = 1400.00;
		
		pasaje.setNumVuelo(numVuelo);
		pasaje.setOrigen(origen);
		pasaje.setDestino(destino);
		pasaje.setAvion(avion);
		pasaje.setPasajero(pasajero);
		pasaje.setNumAsiento(numAsiento);
		pasaje.setCosto(costoPasaje);
		
		
		
		return pasaje;
	}

}
