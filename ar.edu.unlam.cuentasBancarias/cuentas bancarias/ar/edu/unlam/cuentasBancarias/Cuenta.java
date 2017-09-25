package ar.edu.unlam.cuentasBancarias;

public class Cuenta {
	//Atributos
	protected String titular;
	protected Integer dni;
	protected String direccion;
	protected Integer telefonoMovil;
	protected Double saldo;
	
	//Constructor
	public Cuenta(String titular, Integer dni, String direccion,
			Integer telefonoMovil, Double saldo) {
		super();
		this.titular = titular;
		this.dni = dni;
		this.direccion = direccion;
		this.telefonoMovil = telefonoMovil;
		this.saldo = saldo;
	}

	//Getters y Setters
	public String getTitular() {
		return titular;
	}

	public Integer getDni() {
		return dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(Integer telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	//Metodos
	public void depositar(Double monto){
		saldo += monto;
	}
	
	public void extraer(Double monto){
		
	}
	
	
}
