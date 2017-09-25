package ar.edu.unlam.cuentasTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.cuentasBancarias.CajaDeAhorro;
import ar.edu.unlam.cuentasBancarias.CuentaCorriente;
import ar.edu.unlam.cuentasBancarias.CuentaSueldo;

public class CuentasTest {

	@Test
	public void testQueCreaYPruebaCuentaSueldo() {
		CuentaSueldo cuentaSueldo= new CuentaSueldo("Ariel Gutierrez", 23445667, "Independencia 361", 1533445566, 0.0);
		cuentaSueldo.depositar(3000.0);
		assertEquals(3000.0, cuentaSueldo.getSaldo(), 0.01);
	}
	
	@Test
	public void testQueCreaYPruebaCajaDeAhorro() {
		CajaDeAhorro cajaAhorro= new CajaDeAhorro("Ariel Gutierrez", 23445667, "Independencia 361", 1533445566, 0.0);
		cajaAhorro.depositar(3000.0);
		assertEquals(3000.0, cajaAhorro.getSaldo(), 0.01);
	}
	
	@Test
	public void testQueCreaYPruebaCuentaCorriente() {
		CuentaCorriente cuentaC= new CuentaCorriente("Ariel Gutierrez", 23445667, "Independencia 361", 1533445566, 0.0);
		cuentaC.depositar(3000.0);
		assertEquals(3000.0, cuentaC.getSaldo(), 0.01);
	}

}
