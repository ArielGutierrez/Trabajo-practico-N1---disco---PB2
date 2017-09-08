package ar.edu.unlam.TP1;

public class Disco {
	
	//Atributos
	private double radioInterior;
	private double radioExterior;
	private double superficieMayor;
	private double superficieMenor;
	private double superficie;
		
	//Constructor
	public Disco(double radioInterior, double radioExterior) {
		super();
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}

	//Getters y Setters
	public double getRadioInterior() {
		return radioInterior;
	}

	public void setRadioInterior(double radioInterior) {
		this.radioInterior = radioInterior;
	}

	public double getRadioExterior() {
		return radioExterior;
	}

	public void setRadioExterior(double radioExterior) {
		this.radioExterior = radioExterior;
	}
	
	public double getSuperficie() {
		return superficie;
	}
	
	public double getSuperficieMayor() {
		return superficieMayor;
	}

	public double getSuperficieMenor() {
		return superficieMenor;
	}

	//Metodos propios
	public void obtenerSuperficieDeDisco(){
		superficie= superficieMayor - superficieMenor;
	}
	
	public void obtenerSuperficieExterior(double radioExterior){
		this.radioExterior= radioExterior;
		superficieMayor= (Math.PI)*(radioExterior*radioExterior);
	}
	
	public void obtenerSuperficieInterior(double radioInterior){
		this.radioInterior= radioInterior;
		superficieMenor= (Math.PI)*(radioInterior*radioInterior);
	}
	
	public double obtenerPerimetroInterior(double radioInterior){
		double perimetroInterior = 2 * Math.PI * radioInterior;
		return perimetroInterior;
	}
	
	public double obtenerPerimetroExterior(double radioExterior){
		double perimetroExterior = 2 * Math.PI * radioExterior;
		return perimetroExterior;
	}
}
