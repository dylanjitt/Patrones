package practica14proxy;

public class Launcher {

	public static void main(String[] args) {
		DebitCard card = new DebitCard("XXXX-XXXX-XXXX-6969", new BankAccount("Rodrigo", 123456879, 1000));
		card.infoAccount();
		card.pagar(999);
		card.pagar(2);
		card.deposito(100, "bs");
		card.deposito(100, "$");
		

	}

}
