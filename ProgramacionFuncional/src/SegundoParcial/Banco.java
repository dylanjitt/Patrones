package SegundoParcial;

import java.util.LinkedList;
import java.util.List;

public class Banco {


	List<Cuenta> cuentas = new LinkedList<Cuenta>();
	List<CuentaJoven> cuentasJovenes = new LinkedList<CuentaJoven>();
	//List<Cuenta> cuentas = List.of(new Cuenta("Ewan Mcgregor", 38, "20456968-1P", 1098581.00),new Cuenta("Luz Noceda", 15, "696969", 10279.00));
	//List<CuentaJoven> cuentasJovenes = List.of(new CuentaJoven("Amity BLight", 15, "420420", 10027254.00));
	

	public Banco(List<Cuenta> cuentas, List<CuentaJoven> cuentasJovenes) {
		super();
		this.cuentas = cuentas;
		this.cuentasJovenes = cuentasJovenes;
	}

	public List<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	public List<CuentaJoven> getCuentasJovenes() {
		return cuentasJovenes;
	}

	public void setCuentasJovenes(List<CuentaJoven> cuentasJovenes) {
		this.cuentasJovenes = cuentasJovenes;
	}
	
	public double obtenerTotal(CuentaJoven cj) {
		return cj.getCantidad()+(cj.getCantidad()*cj.getBonificacion());
		
	}
	
	public void obtenerClientesVIP(Cuenta c){
		if (c.getCantidad()>= 1000000.00) {
			System.out.println(c.getTitular()); 
		}
	}

}
