package memento1;

public class Memento {
	
	private Tesis tesis;
	
	public Memento(Tesis tesis) {
		this.tesis=tesis;
	}
	
	public Tesis getTesis() {
		return tesis;
	}

}
