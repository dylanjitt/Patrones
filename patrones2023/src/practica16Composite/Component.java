package practica16Composite;

public abstract class Component {
	private String name;
	private int precio;
	
	public Component(String name, int precio) {
		this.name = name;
		this.precio = precio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public abstract void info();
	//public abstract void add (Component composite);
	//public abstract void remove (Component composite);
	//public abstract Component get(int posicion);


}
