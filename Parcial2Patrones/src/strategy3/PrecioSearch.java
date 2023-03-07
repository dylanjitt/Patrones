package strategy3;

import java.util.List;

public class PrecioSearch implements Icelulares {
	
	private int precio;
	


	public PrecioSearch(int precio) {
		super();
		this.precio = precio;
	}



	@Override
	public void grouping(List<Celular> celulares) {
		System.out.println("--------------------------------------------------------");
		System.out.println(">>> Seleccion por precio:");
		//Busca celulares de precios iguales y menores al precio indicado
		for(Celular cel:celulares) {
			if(cel.getPrecio()<= precio) {
				cel.info();
			}
		}
		
	}

}
