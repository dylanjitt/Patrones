package practicaCambioMonedaSingleton;

public class CuentaBancaria {
	private static CuentaBancaria instance = null;
    private double saldo;


    private CuentaBancaria(){
        saldo = 0;
        //System.out.println("INFO > Saldo Inicial: "+saldo);
    }

    private synchronized static void create(){
        if (instance == null)
            instance = new CuentaBancaria();
    }

    public static CuentaBancaria getInstance(){
        if (instance == null)
            create();
        return instance;
    }

    public synchronized void retirarDinero(int amount){
        if (amount <= saldo){
            saldo=saldo-amount;
            System.out.println("INFO> operacion satisfactoria: cantidad a retirar: "+amount+", nuevo saldo:"+saldo);
        }else{
            System.out.println("ERROR> no se puede retirar esa cantidad: "+amount+", el saldo que tiene: "+saldo);
        }
    }
    
    public synchronized void addDolar (double dolar) {
    	double bs = dolar * (double)6.96;
    	System.out.println("se anadio "+dolar+" Dolares ("+bs+" Bs.) a su cuenta");
    	saldo += bs;
    	saldoActual();
    }
    
    public synchronized void addEuro (double euro) {
    	double bs = euro * (double)7.41;
    	System.out.println("se anadio "+euro+" Euros ("+bs+" Bs.) a su cuenta");
    	saldo += bs;
    	saldoActual();
    }
    
    public synchronized void addBs (double bs) {
    	
    	System.out.println("se anadio "+bs+" Bs. a su cuenta");
    	saldo += bs;
    	saldoActual();
    }

    public void saldoActual(){
        System.out.println("INFO > tu saldo es : "+saldo);
        System.out.println("");
    }

}
