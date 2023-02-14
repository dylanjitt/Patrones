package practica4;

import java.util.HashMap;
import java.util.Map;

public class FactoryPasajeMap {
	
	private static Map<String,Pasaje> pasajeMap = new HashMap<>();
	
	public static Pasaje make(String type) {
		pasajeMap.put("regular1", new PasajeRegular());
		pasajeMap.put("regular2", new PasajeRegular());
		pasajeMap.put("solidario1", new PasajeSolidario());
		pasajeMap.put("solidario2", new PasajeSolidario());
		pasajeMap.put("infante1", new PasajeInfantes());
		pasajeMap.put("infante2", new PasajeInfantes());
		
		return pasajeMap.containsKey(type)?pasajeMap.get(type):null;
	}

}
