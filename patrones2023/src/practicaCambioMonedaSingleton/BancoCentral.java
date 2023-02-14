package practicaCambioMonedaSingleton;

public class BancoCentral {
	
	private static BancoCentral instance = null;
	
	private synchronized static void create(){
        if (instance == null)
            instance = new BancoCentral();
    }
	
	public static BancoCentral getInstance(){
        if (instance == null)
            create();
        return instance;
    }
	
	public double dolaresBolivianos(double dolar) {
		double boliviano = dolar * (double)6.96;
		return boliviano;
	}
	
	public double bolivianosDolares(double boliviano) {
		double dolar = boliviano / (double)6.96;
		return dolar;
	}
	
	public double eurosBolivianos(double euro) {
		double boliviano = euro * (double)7.41;
		return boliviano;
	}
	
	public double bolivianosEuros(double boliviano) {
		double euro = boliviano / (double)7.41;
		return euro;
	}

	

}
