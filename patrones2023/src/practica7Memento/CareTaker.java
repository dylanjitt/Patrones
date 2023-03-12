package practica7Memento;

import java.util.HashMap;
import java.util.Map;

public class CareTaker {
	//Memento m;
	private Map<String,Memento> savedStates = new HashMap<>();
	
	public void createRestorePoint(String backup, Memento memento) {
		savedStates.put(backup, memento);
	}
	
	//probable correction to type input
	public Memento getMemento(String backup) {
		return savedStates.get(backup);
		//return m;	
	}
	
	//public Memento getMeme(String backupname) {
		//return savedStates.containsKey(backupname);
	//	savedStates.containsKey();
	//}

}
