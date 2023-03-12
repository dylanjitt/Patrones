package practica7Memento;

import java.util.ArrayList;
import java.util.List;

public class Backup {
	
	private String name;
	private List<Personas> listpersonas = new ArrayList<>();
	
	public Backup(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public List<Personas> getListpersonas() {
		return listpersonas;
	}

	public void setListpersonas(List<Personas> listpersonas) {
		this.listpersonas = listpersonas;
	}

	public void setPersonas(Personas persona) {
		listpersonas.add(persona);
	}
	
	public void infoBackup() {
		System.out.println("******************");
		System.out.println("BACKUP NAME: "+name);
		listpersonas.forEach((n)-> n.info());
		System.out.println("> TOTAL PERSONAS: "+listpersonas.size());
		
		
	}
	
	

}
