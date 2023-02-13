package practica3;

public class Infante2creator extends CreatorPasaje {

	@Override
	public PasajeInfantes create() {
		PasajeInfantes pasaje = new PasajeInfantes();
		
		int numVuelo = 869;
		LugarVuelo origen = new LugarVuelo("Lima");
		origen.setPais("Peru");
		origen.setAeropuerto("Aeropuerto Internacional Jorge Chavez");
		
		LugarVuelo destino = new LugarVuelo("Santiago");
		destino.setPais("Chile");
		destino.setAeropuerto("Aeropuerto Internacional Arturo Merlino Benitez");
		
		Avion avion = new Avion("aribus", 888);
		int cap =230;
		avion.setCapacidad(cap);
		avion.setNroAsientos(cap);
		Pasajero pasajero = new Pasajero("Luz Noceda", "420024");
		String numAsiento = "13A";
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
