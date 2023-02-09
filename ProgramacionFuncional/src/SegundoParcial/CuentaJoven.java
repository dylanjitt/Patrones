package SegundoParcial;

public class CuentaJoven extends Cuenta {

	double bonificacion=0.20;
	
	public CuentaJoven(String nombre, int edad, String cI,double cantidad) {
		super(nombre, edad, cI, cantidad);
	}
	
	
	public double getBonificacion() {
		return bonificacion;
	}


	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}

	
	public void ingresarCantidad(double cantidad) {
		if (this.edad<25) {
		ingresar(this.cantidad+cantidad);	
		}else {
			System.out.println("No puede realizar transacciones.");
		}
		
	}
	

	public void retirarCantidad (double cantidad) {
		if (this.edad<25) {
			retirar(this.cantidad-cantidad);	
			}else {
				System.out.println("No puede realizar transacciones.");
			}
		
	}
	
	@Override
	public String mostrar() {
		if (this.edad<25) {
			return nombre+", "+edad+" años, ("+CI +")"+esMayorDeEdad()+"(Cuenta Joven) "+"Estado de cuenta: "+cantidad+" Bs.";
		
		}
		
		return nombre+", "+edad+" años, ("+CI +")"+esMayorDeEdad()+"(Titular No valido), Estado de cuenta: "+cantidad+" Bs.";
	}
	
}
