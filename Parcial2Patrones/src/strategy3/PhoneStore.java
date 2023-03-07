package strategy3;

import java.util.ArrayList;
import java.util.List;

public class PhoneStore {
	private List<Celular> celularList = new ArrayList<>();
	private Icelulares celSelection;
	
	public PhoneStore() {}
	
	public List<Celular> getCelularList() {
		return celularList;
	}
	public void setCelularList(List<Celular> celularList) {
		this.celularList = celularList;
	}
	
	public void addCelular(Celular cel) {
		celularList.add(cel);
	}
	
	public Icelulares getCelSelection() {
		return celSelection;
	}
	public void setCelSelection(Icelulares celSelection) {
		this.celSelection = celSelection;
	}
	
	public void show() {
		celSelection.grouping(this.celularList);
	}

}
