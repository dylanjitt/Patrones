package strategy3;

public class Launcher {

	public static void main(String[] args) {
		PhoneStore store = new PhoneStore();
		store.addCelular(new Celular("A51", "Samsung Galaxy", "Media", 350));
		store.addCelular(new Celular("S23", "Samsung Galaxy", "Alta", 1000));
		store.addCelular(new Celular("iPhone 14", "Apple", "Alta", 1300));
		store.addCelular(new Celular("Note10", "Redmi", "Media", 250));
		store.addCelular(new Celular("S23 Ultra", "Samsung Galaxy", "Alta", 1200));
		store.addCelular(new Celular("A11", "Samsung Galaxy", "Baja", 150));
		store.addCelular(new Celular("A71", "Samsung Galaxy", "Media", 450));
		store.addCelular(new Celular("Pixel 7a", "Google", "Media", 500));
		store.addCelular(new Celular("Flip4", "Samsung Galaxy", "Alta", 950));
		
		store.setCelSelection(new ModeloSearch("Pixel 7a"));
		store.show();
		
		
		
		store.setCelSelection(new PrecioSearch(500));
		store.show();


	}

}
