package ar.edu.unlam.cuentasBancarias;

public class CuentaCorriente extends Cuenta{

	private Double descubierto;
	
	public CuentaCorriente(String titular, Integer dni, String direccion,
			Integer telefonoMovil, Double saldoInicial) {
		super(titular, dni, direccion, telefonoMovil, saldoInicial);
		descubierto= 200.0;
	}

	//Metodos propios y sobreescritura de metodos
	@Override
	public void extraer(Double monto){
		Double primerSaldo;
		if(monto <= saldo){
			saldo -= monto;
		}else if(monto <= (saldo + this.descubierto)){
			primerSaldo= (this.descubierto - (monto - saldo));
			this.saldo= -(primerSaldo + ((primerSaldo * 5) / 100));
		}
	}

	@Override
	public String toString() {
		return "Cuenta corriente perteneciente a = " + titular + " , el saldo de ésta cuenta es de= " + this.saldo;
	}
	
	

}
