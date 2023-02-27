package practica6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Skype implements ICanalCommunication{
	
	private List<Persona> general = new ArrayList<>();

	
	public Skype addToTheChat(Persona persona) {

        general.add(persona);
        return this;
    }


	@Override
	public void send(String message, Persona persona) {
		for (Persona per : general) {
            if (!persona.getCi().equals(per.getCi())) {
                if (persona.getCargo().equals("QA") && per.getCargo().equals("QA")) {
                    per.received(message);
                } else if (persona.getCargo().equals("DEV") && per.getCargo().equals("DEV")) {
                    per.received(message);
                } else if (persona.getCargo().equals("SM")) {
                    per.received(message);
                }
            }
        }
	}

}
