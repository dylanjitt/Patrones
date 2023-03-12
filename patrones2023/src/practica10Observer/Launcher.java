package practica10Observer;

public class Launcher {

	public static void main(String[] args) {
		Actividad preciosLlamadas = new Actividad("Precios Llamadas", new Notificacion("> APROVECHA LA OFERTA 5 MINUTOS X 1 BS"));
		Actividad promociones = new Actividad("Promociones",new Notificacion("> NUEVA PROMO INTERNET, 2000Mb por 10 BS"));
		Actividad premios = new Actividad("Premios", new Notificacion("> ERES EL GANADOR DE UN IPHONE 14 PRO MAX, FELICIDADES!!"));
		Actividad noticia = new Actividad("Noticias", new Notificacion("> La nueva cancion de Shakira es una Porqueria"));
		
		Cliente pedro = new Cliente("Pedro", "844564 LP", 64425467);
		Cliente maria = new Cliente("Maria", "1234567 OR", 12345678);
		Cliente eynar = new Cliente("Eynar", "6869420 SC", 69696969);
		
		preciosLlamadas.addUser(eynar);
		promociones.addUser(pedro);
		promociones.addUser(eynar);
		premios.addUser(pedro);
		premios.addUser(eynar);
		noticia.addUser(maria);
		noticia.addUser(eynar);
		
		preciosLlamadas.notifyy();
		promociones.notifyy();
		premios.notifyy();
		noticia.notifyy();

	}

}
