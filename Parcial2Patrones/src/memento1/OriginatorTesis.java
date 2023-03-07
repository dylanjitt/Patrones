package memento1;

public class OriginatorTesis {
	private Tesis tesis;
	
	public void setMemento(Tesis tesis) {
		this.tesis = new Tesis(tesis.getTitulo(), tesis.getAutor());
		this.tesis.setContenido(tesis.getContenido());
	}
	
	public Memento createMemento() {
		return new Memento(tesis);
	}
	
	public Tesis restoreMemento(Memento memento) {
		tesis = memento.getTesis();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>");
		System.out.println(">    Tesis succesfully restored");
		return tesis;
	}

}
