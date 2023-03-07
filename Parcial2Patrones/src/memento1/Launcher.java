package memento1;

public class Launcher {

	public static void main(String[] args) throws Exception {
		CareTakerTesis careTaker = new CareTakerTesis();
		OriginatorTesis originator = new OriginatorTesis();
		
		Tesis tesis = new Tesis("El Futuro del Arte", "Perry el ornitorrinco");
		
		tesis.setContenido("La inteligencia artificial");
		originator.setMemento(tesis);
		careTaker.createTesis(1, originator.createMemento());
		
		tesis.setContenido("La inteligencia artificial tiene una variedad de aplicaciones");
		originator.setMemento(tesis);
		careTaker.createTesis(2, originator.createMemento());
		
		tesis.setContenido("La inteligencia artificial esta siendo utilizada en el arte");
		originator.setMemento(tesis);
		careTaker.createTesis(3, originator.createMemento());
		
		tesis.setContenido("La inteligencia artificial facilita la automatización de procesos creativos humanos");
		originator.setMemento(tesis);
		careTaker.createTesis(4, originator.createMemento());
		
		tesis.setContenido("La inteligencia artificial es un potencial riesgo para el arte y la cultura humana");
		originator.setMemento(tesis);
		careTaker.createTesis(5, originator.createMemento());
		
		tesis.tesisInfo();
		
		tesis = originator.restoreMemento(careTaker.getMemento(3));
		
		tesis.tesisInfo();
		
	}

}
