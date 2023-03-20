package practica16Composite;

import java.util.ArrayList;
import java.util.List;

public class Entity extends Component {
	
	List<Component> componentList = new ArrayList<>();

	public Entity(String name, int precio) {
		super(name, precio);
		
	}

	@Override
	public void info() {
		System.out.println(super.getName()+", precio total: "+super.getPrecio()+"$");
		for(Component c:componentList) {
			c.info();
		}
		
	}
	
	public void add (Component composite) {
		componentList.add(composite);
		super.setPrecio(getPrecio()+composite.getPrecio());
	}
	
	public void remove (Component composite) {
		componentList.remove(composite);
	}
	
	public Component get(int posicion) {
		return componentList.get(posicion);
	}

}
