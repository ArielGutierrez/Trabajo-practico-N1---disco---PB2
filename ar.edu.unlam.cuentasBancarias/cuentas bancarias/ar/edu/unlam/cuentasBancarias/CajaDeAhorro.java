package ar.edu.unlam.cuentasBancarias;

public class CajaDeAhorro extends Cuenta{
	
	private Integer contadorExtracciones= 0;

	public CajaDeAhorro(String titular, Integer dni, String direccion,
			Integer telefonoMovil, Double saldoInicial) {
		super(titular, dni, direccion, telefonoMovil, saldoInicial);
		
	}
	
	public Integer getContadorExtracciones() {
		return contadorExtracciones;
	}

	//Metodos propios y sobreescritura de metodos
	@Override
	public void extraer(Double monto){
		if(this.contadorExtracciones < 6 && monto <= saldo){
			saldo -= monto;
			contadorExtracciones++;
		}else if(monto <= saldo){
			saldo -= (monto + 6);
			contadorExtracciones++;
			}
	}

	@Override
	public String toString() {
		return "Caja de ahorro perteneciente a = " + titular + ", lleva realizadas hasta el momento " + contadorExtracciones + " extracciones=" + 
	" y el saldo de ésta cuenta es de= " + this.saldo;
	}
	
	
}
