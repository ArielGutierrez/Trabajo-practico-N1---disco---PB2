package ar.edu.unlam.TP1;

public class DiscoTest {

	public static void main(String[] args) {
		Disco miDisco= new Disco(2.0, 4.0);
		
		System.out.println(miDisco.getRadioInterior());
		System.out.println(miDisco.getRadioExterior());
		System.out.println(miDisco.obtenerSuperficieExterior(miDisco.getRadioExterior()));
		System.out.println(miDisco.obtenerSuperficieInterior(miDisco.getRadioInterior()));
		System.out.println(miDisco.obtenerSuperficieDeDisco());
		System.out.println(miDisco.obtenerPerimetroExterior(miDisco.getRadioExterior()));
		System.out.println(miDisco.obtenerPerimetroInterior(miDisco.getRadioInterior()));
	}

}
