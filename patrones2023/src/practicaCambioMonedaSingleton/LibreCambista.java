package practicaCambioMonedaSingleton;

public class LibreCambista {
	
private BancoCentral bci;
private CuentaBancaria c;

private String nombre = "LIBRE CAMBISTA";

	public LibreCambista(BancoCentral bci, CuentaBancaria c) {

	this.bci = bci;
	this.c = c;
}

	public void dolaresBolivianos(double dolares) {
		double boliviano = bci.dolaresBolivianos(dolares);
		System.out.println(nombre+": $ "+dolares+" -> Bs."+boliviano);
		c.addBs(boliviano);
	}
	
	public void bolivianosDolares(double boliviano) {
		double dolar = bci.bolivianosDolares(boliviano);
		System.out.println(nombre+": Bs. "+boliviano+" -> Bs."+dolar);
		c.addDolar(dolar);
	}
	
	public void eurosBolivianos(double euro) {
		double boliviano = bci.eurosBolivianos(euro);
		System.out.println(nombre+": E "+euro+" -> Bs."+boliviano);
		c.addBs(boliviano);
	}
	
	public void bolivianosEuros(double boliviano) {
		double euro = bci.bolivianosEuros(boliviano);
		System.out.println(nombre+": $ "+euro+" -> E "+boliviano);
		c.addEuro(euro);
	}

}
