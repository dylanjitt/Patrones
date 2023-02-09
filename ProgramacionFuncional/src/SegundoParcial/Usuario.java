package SegundoParcial;

public class Usuario {
	String user;
	String password;
	public Usuario(String user, String password) {
		super();
		this.user = user;
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean esFuerte() {
		if (password.matches("[\\w+\\W+\\d+]{8,100}")) {
			return true;
		}else {
		return false;	
		}
	}
	
	public int obtenerLongitud() {
		return password.length();
	}
}
