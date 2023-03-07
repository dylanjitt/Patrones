package comunicacion6;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IcanalComunication {
	
	private List<Developer> group = new ArrayList<>();
	
	public ChatRoom addToChat(Developer p) {
		group.add(p);
		return this;
	}

	@Override
	public void send(String message, Developer dev) {
		for (Developer p:group) {
			if(!dev.getNombre().equals(p.getNombre())) {
				if(dev.isGroupMode()==false && p.isGroupMode()==false) {
					p.recieved(message);
				}else if (dev.isGroupMode()==true) {
					p.recieved(message);
				}
			}
		}
		
	}

}
