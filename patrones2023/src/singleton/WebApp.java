package singleton;

public class WebApp {
	Client client;
	public WebApp(Client client) {
		this.client=client;
	}
	
	public void retirarDinero(int amount) {
		CuentaBancaria.getInstance().retirarDinero(amount);
	}

}
