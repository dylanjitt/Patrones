package mediator4;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp implements IcanalComunicacion {
	
	private List<Persona> group = new ArrayList<>();
	
	public Whatsapp addToChat(Persona p) {
		group.add(p);
		return this;
	}

	@Override
	public void send(String message, Persona colega) {
		for (Persona persona: group) {
			if (!colega.getNombre().equals(persona.getNombre())) {
				if (colega.getChatMode().equals("single")&& persona.getChatMode().equals("single")) {
					persona.recieved(message);
				}else if (colega.getChatMode().equals("grupal")) {
					persona.recieved(message);
				}
			}
		}
		
	}
	
	

}
