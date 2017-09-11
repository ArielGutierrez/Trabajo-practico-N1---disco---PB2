package ar.edu.unlam.TP1;

public class Disco {
	
	//Atributos
	private double radioInterior;
	private double radioExterior;
			
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
	
	//Metodos propios
	public double obtenerSuperficieDeDisco(){
		double superficie=this.obtenerSuperficieExterior(getRadioExterior())- this.obtenerSuperficieInterior(radioInterior);
		return superficie;
	}
	
	public double obtenerSuperficieExterior(double radioExterior){
		this.radioExterior= radioExterior;
		double superficieMayor= (Math.PI)*(radioExterior*radioExterior);
		return superficieMayor;
	}
	
	public double obtenerSuperficieInterior(double radioInterior){
		this.radioInterior= radioInterior;
		double superficieMenor= (Math.PI)*(radioInterior*radioInterior);
		return superficieMenor;
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
