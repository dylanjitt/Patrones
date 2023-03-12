package practica14proxy;

public class BankAccount {

	private String owner;
	private int numAccount;
	private float total;
	public BankAccount(String owner, int numAccount, float bs) {
		this.owner = owner;
		this.numAccount = numAccount;
		this.total = bs;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getNumAccount() {
		return numAccount;
	}
	public void setNumAccount(int numAccount) {
		this.numAccount = numAccount;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	public void saldoTotal() {
		System.out.println("Saldo total: "+total+" bs \n");
	}
	
	public void pagar (float monto) {
		if (!(monto > total)) {
			System.out.println("Se realizo el pago de "+monto+" bs");
			total-=monto;
		}else {
			System.out.println("NO TIENE SALDO SUFICIENTE PARA LA TRANSACCION");	
		}
		saldoTotal();
	}
	
	public void deposito(float bs) {
		System.out.println("Se ha realizado el deposito de "+bs+" bs");
		total+=bs;
		saldoTotal();
	}
	
	public void depositoDolares(float $) {
		float bs = (float) ($*6.96);
		System.out.println("Realizando la conversion de "+$+"$ -> "+bs+" bs");
		deposito(bs);
	}
	
	public void info() {
		System.out.println("Cuenta Nro.: "+numAccount);
		System.out.println("Titular: "+owner);
		saldoTotal();
	}
}
