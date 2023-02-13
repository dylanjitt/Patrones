package practica3;

public class Infante1creator extends CreatorPasaje {

	@Override
	public PasajeInfantes create() {
		PasajeInfantes pasaje = new PasajeInfantes();
		
		int numVuelo = 777;
		LugarVuelo origen = new LugarVuelo( "La Paz");
		origen.setPais("Bolivia");
		origen.setAeropuerto("Aeropuerto Internacional El Alto");
		
		LugarVuelo destino = new LugarVuelo("Arica");
		destino.setPais("Chile");
		destino.setAeropuerto("Aeropuerto Internacional Chacalluta");
		
		Avion avion = new Avion("Boeing", 777);
		int cap =250;
		avion.setCapacidad(cap);
		avion.setNroAsientos(cap);
		Pasajero pasajero = new Pasajero("Michael Eyzaguirre", "777777");
		String numAsiento = "7B";
		double costoPasaje = 1200.00;
		
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
