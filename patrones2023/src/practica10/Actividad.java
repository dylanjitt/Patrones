package practica10;

import java.util.ArrayList;
import java.util.List;

public class Actividad implements Inotify {
	
	private String name;
	private List<Cliente> clientesList = new ArrayList<>();
	private Notificacion noti;
	
	

	public Actividad(String name, Notificacion noti) {
		this.name = name;
		this.noti = noti;
	}



	@Override
	public void notifyy() {
		for (Cliente clientes:clientesList) {
			System.out.println(clientes.getName()+", Tienes una nueva Notificacion de "+name);
			clientes.update(noti);
			System.out.println("-------------------------------------------------------");
		}
		
	}



	@Override
	public void addUser(Cliente c) {
		clientesList.add(c);
		
	}

}
