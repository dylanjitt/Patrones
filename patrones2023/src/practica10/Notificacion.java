package practica10;

public class Notificacion {
	private String notificacion;

	public Notificacion(String notificacion) {
		this.notificacion = notificacion;
	}

	public String getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(String notificacion) {
		this.notificacion = notificacion;
	}
	
	public void showNotificacion() {
		System.out.println(notificacion); 
	}
	
	

}
