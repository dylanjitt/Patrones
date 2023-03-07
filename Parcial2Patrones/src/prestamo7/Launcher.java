package prestamo7;

public class Launcher {

	public static void main(String[] args) {
		Cajero cajero = new Cajero();
		
		cajero.prestamo(new Prestamo(20), 10000);
		cajero.prestamo(new Prestamo(39), 10000);
		cajero.prestamo(new Prestamo(69), 10000);
		cajero.prestamo(new Prestamo(100), 10000);
		cajero.prestamo(new Prestamo(109), 10000);


	}

}
