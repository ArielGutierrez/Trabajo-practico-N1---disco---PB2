package ar.edu.unlam.cuentasTest;

import ar.edu.unlam.cuentasBancarias.CajaDeAhorro;
import ar.edu.unlam.cuentasBancarias.CuentaCorriente;
import ar.edu.unlam.cuentasBancarias.CuentaSueldo;

public class CuentasTestComun {

	public static void main(String[] args) {
		System.out.println("-----Creación y prueba de Cuenta Sueldo-----");
		System.out.println();
		//Genero una cuenta sueldo
		CuentaSueldo cuentaSueldo= new CuentaSueldo("Ariel Gutierrez", 23445667, "Independencia 361", 1533445566, 0.0);
		//Pruebo obtencion de datos
		System.out.println(cuentaSueldo.toString());
		//Pruebo metodo depositar y si lo muestra correctamente
		cuentaSueldo.depositar(3000.0);
		System.out.println(cuentaSueldo.getSaldo());
		//Pruebo extraccion permitida y no permitida
		cuentaSueldo.extraer(2500.0);
		System.out.println(cuentaSueldo.getSaldo());
		cuentaSueldo.extraer(1500.0); //No permite ésta extracción porque supera el saldo
		System.out.println(cuentaSueldo.getSaldo());
		System.out.println();
		System.out.println();
		System.out.println("-----Creación y prueba de Caja de Ahorro-----");
		System.out.println();
		//Genero una caja de ahorro
		CajaDeAhorro caja= new CajaDeAhorro("Ariel Gutierrez", 23445667, "Independencia 361", 1533445566, 0.0);
		//Pruebo obtencion de datos
		System.out.println(caja.toString());
		//Pruebo metodo depositar y si lo muestra correctamente
		caja.depositar(4000.0);
		System.out.println(caja.getSaldo());
		//Pruebo extraccion permitida y no permitida
		caja.extraer(2500.0);
		System.out.println(caja.getSaldo());
		caja.extraer(1500.0); 
		System.out.println(caja.getSaldo());
		System.out.println(caja.getContadorExtracciones());
		caja.extraer(1500.0); //No permite ésta extracción porque supera el saldo
		System.out.println(caja.getContadorExtracciones());
		caja.depositar(9000.0);
		System.out.println(caja.getSaldo());
		caja.extraer(500.0);
		caja.extraer(500.0); 
		caja.extraer(500.0); 
		caja.extraer(500.0); 
		System.out.println(caja.getSaldo());
		System.out.println(caja.getContadorExtracciones());
		caja.extraer(500.0);
		System.out.println(caja.getSaldo());
		System.out.println(caja.getContadorExtracciones());
		System.out.println();
		System.out.println();
		System.out.println("-----Creación y prueba de Cuenta Corriente-----");
		System.out.println();
		//Genero una cuenta corriente
		CuentaCorriente cCorriente= new CuentaCorriente("Ariel Gutierrez", 23445667, "Independencia 361", 1533445566, 0.0);
		//Pruebo obtencion de datos
		System.out.println(cCorriente.toString());
		//Pruebo metodo depositar y si lo muestra correctamente
		cCorriente.depositar(5000.0);
		System.out.println(cCorriente.getSaldo());
		//Pruebo extraccion permitida y no permitida
		cCorriente.extraer(2500.0);
		System.out.println(cCorriente.getSaldo());
		cCorriente.extraer(1500.0); 
		System.out.println(cCorriente.getSaldo());
		cCorriente.extraer(900.0); 
		System.out.println(cCorriente.getSaldo());
		cCorriente.extraer(200.0); //Ésta extracción debería utilizar $100 del descubierto
		System.out.println(cCorriente.getSaldo());
		
		
	}

}
