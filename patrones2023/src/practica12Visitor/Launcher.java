package practica12Visitor;

public class Launcher {

	public static void main(String[] args) {
		Bolivia bol = new Bolivia(700.00);
		USA usa = new USA(100.00);
		Europa eur = new Europa(100.00);
		
		Persona trader = new Persona();
		
		bol.trade(trader);
		usa.trade(trader);
		eur.trade(trader);

	}

}
