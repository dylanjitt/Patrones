package practica4;

public class FactoryPasajes {
	
	public static Pasaje make(String type) {
		
		Pasaje pasaje;
		int numVuelo;
		LugarVuelo origen;
		LugarVuelo destino;
		Avion avion;
		int cap;
		Pasajero pasajero;
		String numAsiento;
		double costoPasaje;
		
		switch (type.toLowerCase()){
		case "regular1": {
			
			pasaje = new PasajeRegular();
			numVuelo = 777;
			origen = new LugarVuelo( "La Paz");
			origen.setPais("Bolivia");
			origen.setAeropuerto("Aeropuerto Internacional El Alto");
			
			destino = new LugarVuelo("Buenos Aires");
			destino.setPais("Argentina");
			destino.setAeropuerto("Aeropuerto Internacional Ezeiza");
			
			avion = new Avion("Boeing", 777);
			cap =200;
			avion.setCapacidad(cap);
			avion.setNroAsientos(cap);
			
			pasajero = new Pasajero("Damon Albarn", "849356");
			numAsiento = "2D";
			costoPasaje = 1400.00;
			
			((PasajeRegular) pasaje).setNumVuelo(numVuelo);
			((PasajeRegular) pasaje).setOrigen(origen);
			((PasajeRegular) pasaje).setDestino(destino);
			((PasajeRegular) pasaje).setAvion(avion);
			((PasajeRegular) pasaje).setPasajero(pasajero);
			((PasajeRegular) pasaje).setNumAsiento(numAsiento);
			((PasajeRegular) pasaje).setCosto(costoPasaje);
			
			break;
			
		}case "regular2": {
			
			pasaje = new PasajeRegular();
			numVuelo = 445;
			origen = new LugarVuelo("Barcelona");
			origen.setPais("España");
			origen.setAeropuerto("Aeropuerto Josep Tarradellas Barcelona-El Prat");
			
			destino = new LugarVuelo("Cochabamba");
			destino.setPais("Bolivia");
			destino.setAeropuerto("Aeropuerto Internacional Jorge Wilstermann");
			
			avion = new Avion("General Electric", 656);
			cap =250;
			avion.setCapacidad(cap);
			avion.setNroAsientos(cap);
			
			pasajero = new Pasajero("La Rosalia", "849356");
			numAsiento = "69A";
			costoPasaje = 2100.00;
			
			((PasajeRegular) pasaje).setNumVuelo(numVuelo);
			((PasajeRegular) pasaje).setOrigen(origen);
			((PasajeRegular) pasaje).setDestino(destino);
			((PasajeRegular) pasaje).setAvion(avion);
			((PasajeRegular) pasaje).setPasajero(pasajero);
			((PasajeRegular) pasaje).setNumAsiento(numAsiento);
			((PasajeRegular) pasaje).setCosto(costoPasaje);
			
			break;
		}case "solidario1": {
			
			pasaje = new PasajeSolidario();
			numVuelo = 658;
			origen = new LugarVuelo( "La Paz");
			origen.setPais("Bolivia");
			origen.setAeropuerto("Aeropuerto Internacional El Alto");
			
			destino = new LugarVuelo("Santa Cruz");
			destino.setPais("Bolivia");
			destino.setAeropuerto("Aeropuerto Internacional Viru Viru");
			
			avion = new Avion("Boeing", 777);
			cap =200;
			avion.setCapacidad(cap);
			avion.setNroAsientos(cap);
			pasajero = new Pasajero("Sara Biyin", "696969");
			numAsiento = "10D";
			costoPasaje = 400.00;
			double descuento = 24.00;
			
			((PasajeSolidario) pasaje).setNumVuelo(numVuelo);
			((PasajeSolidario) pasaje).setOrigen(origen);
			((PasajeSolidario) pasaje).setDestino(destino);
			((PasajeSolidario) pasaje).setAvion(avion);
			((PasajeSolidario) pasaje).setPasajero(pasajero);
			((PasajeSolidario) pasaje).setNumAsiento(numAsiento);
			((PasajeSolidario) pasaje).setCosto(costoPasaje);
			((PasajeSolidario) pasaje).setDescuentoPercentage(descuento);
			break;
		}case "solidario2": {
			
			pasaje = new PasajeSolidario();
			numVuelo = 888;
			origen = new LugarVuelo( "Pando");
			origen.setPais("Bolivia");
			origen.setAeropuerto("Aeropuerto Internacional El Alto");
			
			destino = new LugarVuelo("Albuquerque");
			destino.setPais("Nuevo Mexico - Estados Unidos");
			destino.setAeropuerto("Aeropuerto Internacional Sunport");
			
			avion = new Avion("Boeing", 420);
			cap =300;
			avion.setCapacidad(cap);
			avion.setNroAsientos(cap);
			pasajero = new Pasajero("Howard Hamlin", "123456");
			numAsiento = "10D";
			costoPasaje = 8000.00;
			double descuento = 50.00;
			
			((PasajeSolidario) pasaje).setNumVuelo(numVuelo);
			((PasajeSolidario) pasaje).setOrigen(origen);
			((PasajeSolidario) pasaje).setDestino(destino);
			((PasajeSolidario) pasaje).setAvion(avion);
			((PasajeSolidario) pasaje).setPasajero(pasajero);
			((PasajeSolidario) pasaje).setNumAsiento(numAsiento);
			((PasajeSolidario) pasaje).setCosto(costoPasaje);
			((PasajeSolidario) pasaje).setDescuentoPercentage(descuento);
			break;
			
		}case "infante1": {
			
			pasaje = new PasajeInfantes();
			numVuelo = 777;
			origen = new LugarVuelo( "La Paz");
			origen.setPais("Bolivia");
			origen.setAeropuerto("Aeropuerto Internacional El Alto");
			
			destino = new LugarVuelo("Arica");
			destino.setPais("Chile");
			destino.setAeropuerto("Aeropuerto Internacional Chacalluta");
			
			avion = new Avion("Boeing", 777);
			cap =250;
			avion.setCapacidad(cap);
			avion.setNroAsientos(cap);
			pasajero = new Pasajero("Michael Eyzaguirre", "777777");
			numAsiento = "7B";
			costoPasaje = 1200.00;
			
			((PasajeInfantes) pasaje).setNumVuelo(numVuelo);
			((PasajeInfantes) pasaje).setOrigen(origen);
			((PasajeInfantes) pasaje).setDestino(destino);
			((PasajeInfantes) pasaje).setAvion(avion);
			((PasajeInfantes) pasaje).setPasajero(pasajero);
			((PasajeInfantes) pasaje).setNumAsiento(numAsiento);
			((PasajeInfantes) pasaje).setCosto(costoPasaje);
			break;
			
		}case "infante2": {
			
			pasaje = new PasajeInfantes();
			numVuelo = 869;
			origen = new LugarVuelo("Lima");
			origen.setPais("Peru");
			origen.setAeropuerto("Aeropuerto Internacional Jorge Chavez");
			
			destino = new LugarVuelo("Santiago");
			destino.setPais("Chile");
			destino.setAeropuerto("Aeropuerto Internacional Arturo Merlino Benitez");
			
			avion = new Avion("aribus", 888);
			cap =230;
			avion.setCapacidad(cap);
			avion.setNroAsientos(cap);
			pasajero = new Pasajero("Luz Noceda", "420024");
			numAsiento = "13A";
			costoPasaje = 1400.00;
			
			((PasajeInfantes) pasaje).setNumVuelo(numVuelo);
			((PasajeInfantes) pasaje).setOrigen(origen);
			((PasajeInfantes) pasaje).setDestino(destino);
			((PasajeInfantes) pasaje).setAvion(avion);
			((PasajeInfantes) pasaje).setPasajero(pasajero);
			((PasajeInfantes) pasaje).setNumAsiento(numAsiento);
			((PasajeInfantes) pasaje).setCosto(costoPasaje);
			break;
		}
		
		default:
			pasaje = new PasajeRegular();
		}
		
//		pasaje.setNumVuelo(numVuelo);
//		pasaje.setOrigen(origen);
//		pasaje.setDestino(destino);
//		pasaje.setAvion(avion);
//		pasaje.setPasajero(pasajero);
//		pasaje.setNumAsiento(numAsiento);
//		pasaje.setCosto(costoPasaje);
		
		
		return pasaje;
		
	}

}
