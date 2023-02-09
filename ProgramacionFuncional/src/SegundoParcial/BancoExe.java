package SegundoParcial;

import java.util.List;

public class BancoExe {

	public static void main(String[] args) {
		
		//Banco bcp = new Banco(new List.of(new Cuenta("Luz Noceda", 15, "696969", 10279.00),new Cuenta("Luzura", 16, "44444", 10356.00)), new CuentaJoven("Amity BLight", 15, "420420", 10027254.00));
		
		//List<Cuenta> cuentas = List.of(new Cuenta("Ewan Mcgregor", 38, "20456968-1P", 1098581.00),new Cuenta("Luz Noceda", 15, "696969", 10279.00));
		List<CuentaJoven> cuentasJovenes = List.of(new CuentaJoven("Amity BLight", 15, "420420", 10027254.00));
		
		Cuenta ewan = new Cuenta("Ewan Mcgregor", 38, "20456968-1P", 1098581.00);
		
		System.out.println(ewan.mostrar());
		
		ewan.retirar(123456.00);
		
		System.out.println(ewan.mostrar());
		
		ewan.ingresar(123456.00);
		
		System.out.println(ewan.mostrar());
		
		CuentaJoven amity = new CuentaJoven("Amity BLight", 14, "420420", 10027254.00);
		CuentaJoven obiWan = new CuentaJoven ("Ewan Mcgregor", 38, "20456968-1P", 1098581.00);
		System.out.println(amity.mostrar());
		
		amity.retirarCantidad(100000.00);
		
		System.out.println(amity.mostrar());
		
		System.out.println(obiWan.mostrar());
		
		obiWan.retirarCantidad(69696.00);
		
		cuentasJovenes.stream().map(CuentaJoven::mostrar).forEach(System.out::println);

	}

}
