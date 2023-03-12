package practica14proxy;

public class DebitCard implements IDebit{
	
	private String serialCard;
	private BankAccount cuenta;

	public DebitCard(String serialCard, BankAccount cuenta) {
		this.serialCard = serialCard;
		this.cuenta = cuenta;
	}

	public String getSerialCard() {
		return serialCard;
	}

	public void setSerialCard(String serialCard) {
		this.serialCard = serialCard;
	}

	public BankAccount getCuenta() {
		return cuenta;
	}

	public void setCuenta(BankAccount cuenta) {
		this.cuenta = cuenta;
	}


	@Override
	public void infoAccount() {
		System.out.println("Tarjeta: "+serialCard);
		cuenta.info();
		
	}

	@Override
	public void pagar(float monto) {
		cuenta.pagar(monto);
		
	}

	@Override
	public void deposito(float monto, String type) {
		if (type.toLowerCase().equals("bs")) {
			cuenta.deposito(monto);
		}else if (type.equals("$")) {
			cuenta.depositoDolares(monto);
		}
		
		
	}


}
