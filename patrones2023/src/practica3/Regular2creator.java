package practica3;

public class Regular2creator extends CreatorPasaje {

	@Override
	public PasajeRegular create() {
		PasajeRegular pasaje = new PasajeRegular();
		
		int numVuelo = 445;
		LugarVuelo origen = new LugarVuelo( "Barcelona");
		origen.setPais("España");
		origen.setAeropuerto("Aeropuerto Josep Tarradellas Barcelona-El Prat");
		
		LugarVuelo destino = new LugarVuelo("Cochabamba");
		destino.setPais("Bolivia");
		destino.setAeropuerto("Aeropuerto Internacional Jorge Wilstermann");
		
		Avion avion = new Avion("General Electric", 656);
		int cap =250;
		avion.setCapacidad(cap);
		avion.setNroAsientos(cap);
		
		Pasajero pasajero = new Pasajero("La Rosalia", "849356");
		String numAsiento = "69A";
		double costoPasaje = 2100.00;
		
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
