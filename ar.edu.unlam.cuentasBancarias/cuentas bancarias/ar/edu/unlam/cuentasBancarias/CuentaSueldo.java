package ar.edu.unlam.cuentasBancarias;

public class CuentaSueldo extends Cuenta{

	//Constructor
	public CuentaSueldo(String titular, Integer dni, String direccion,
			Integer telefonoMovil, Double saldoInicial) {
		super(titular, dni, direccion, telefonoMovil, saldoInicial);
		// TODO Auto-generated constructor stub
	}

	//Metodos propios y sobreescritura de metodos
	@Override
	public void extraer(Double monto){
		if(monto <= saldo){
			saldo -= monto;
		}
	}

	@Override
	public String toString() {
		return "Cuenta sueldo perteneciente a = " + titular + " , el saldo actual es de= " + this.saldo;
	}
	
	
	
	
	

}
