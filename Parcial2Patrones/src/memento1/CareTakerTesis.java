package memento1;

import java.util.HashMap;
import java.util.Map;

public class CareTakerTesis {
	private Map<Integer,Memento> tesisIterations = new HashMap<>();
	
	public void createTesis(int iteration, Memento memento) {
		tesisIterations.put(iteration, memento);
	}
	
	public Memento getMemento(int iteration) throws Exception {
		if (!tesisIterations.containsKey(iteration)) {
			throw new Exception("ERROR > Iteracion no existe");
		}
		return tesisIterations.get(iteration);
	}

}
