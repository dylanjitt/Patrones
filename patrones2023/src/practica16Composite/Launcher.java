package practica16Composite;

public class Launcher {
	public static void main(String[] args) {
		Computer pc1 = new Computer("Hp Pavillion", 100);
		Computer pc2 = new Computer("Dell inspiron", 100);
		Computer pc3 = new Computer("Asus ROG Zephyrus", 100);
		
		Entity lab1 = new Entity("Laboratorio de Computadoras", 0);
		lab1.add(pc1);
		lab1.add(pc2);
		lab1.add(pc3);
		
		Entity lab2 = new Entity("Laboratorio de Computadoras", 0);
		lab2.add(pc1);
		lab2.add(pc2);
		lab2.add(pc3);
		
		Entity cont = new Entity("Contenedor de Computadoras", 0);
		cont.add(lab1);
		cont.add(lab2);
		
		cont.info();
		
	}

}
