package practica16Composite;

public class Computer extends Component{

	public Computer(String name, int precio) {
		super(name, precio);
	}

	@Override
	public void info() {
		System.out.println("> "+super.getName()+" "+super.getPrecio()+"$");
		
	}

	/*@Override
	public void add(Component composite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Component composite) {
		// TODO Auto-generated method stub
		
	}*/

}
