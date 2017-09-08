package ar.edu.unlam.TP1;

public class DiscoTest {

	public static void main(String[] args) {
		Disco miDisco= new Disco(2.0, 4.0);
		
		System.out.println(miDisco.getRadioInterior());
		System.out.println(miDisco.getRadioExterior());
		miDisco.obtenerSuperficieExterior(miDisco.getRadioExterior());
		System.out.println(miDisco.getSuperficieMayor());
		miDisco.obtenerSuperficieInterior(miDisco.getRadioInterior());
		System.out.println(miDisco.getSuperficieMenor());
		miDisco.obtenerSuperficieDeDisco();
		System.out.println(miDisco.getSuperficie());
		System.out.println(miDisco.obtenerPerimetroExterior(miDisco.getRadioExterior()));
		System.out.println(miDisco.obtenerPerimetroInterior(miDisco.getRadioInterior()));
	}

}
