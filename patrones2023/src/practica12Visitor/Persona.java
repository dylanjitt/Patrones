package practica12Visitor;

public class Persona implements Iperson{

	@Override
	public void exchange(Bolivia bolivianos) {
		double bs = bolivianos.getBs();
		double dolar = bs/6.96;
		double euro = bs/7.15;
		System.out.println("En Bolivia: se ha realizado el cambio de "+bs+" Bs. a:"+dolar+" $"+" / "+euro+" Euros.");
		System.out.println();
		
	}

	@Override
	public void exchange(USA dolares) {
		double dolar = dolares.getBs();
		double bs = dolar*6.96;
		double euro = dolar*0.95;
		System.out.println("En USA: se ha realizado el cambio de "+dolar+" $ a:"+bs+" Bs"+" / "+euro+" Euros.");
		System.out.println();
		
	}

	@Override
	public void exchange(Europa euros) {
		double euro = euros.getEuro();
		double dolar = euro/0.95;
		double bs = euro*7.15;
		System.out.println("En Europa: se ha realizado el cambio de "+euro+" Euros a: "+dolar+" $ "+"/ "+bs+" Bs.");
		System.out.println();
		
	}

}
