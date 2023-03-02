package practica9;

import java.util.ArrayList;
import java.util.List;

public class GeneratorNiveles {
	
	private List<Iaccion> actionList = new ArrayList<>();
	
	public void addLevel(Iaccion lvl) {
		actionList.add(lvl);
	}
	
	public void run() {
		for (Iaccion lvl:actionList) {
			lvl.execute();
		}
	}

}
