package strategy3;

import java.util.List;

public class ModeloSearch implements Icelulares {
	
	private String modelo;
	
	

	public ModeloSearch(String modelo) {
		this.modelo = modelo;
	}



	@Override
	public void grouping(List<Celular> celulares) {
		System.out.println("--------------------------------------------------------");
		System.out.println(">>> Seleccion por modelo:");
		for(Celular cel:celulares) {
			if(cel.getModelo().equals(modelo)) {
				cel.info();
			}
		}
		
	}

}
