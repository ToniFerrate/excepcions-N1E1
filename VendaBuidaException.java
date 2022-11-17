package excepcionsN1E1;


/*
L’excepció personalitzada VendaBuidaException ha de ser filla de la classe Exception. Al seu constructor li 
hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, 
l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.
Escriu el codi necessari per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException.
*/

public class VendaBuidaException extends Exception {

	private static final long serialVersionUID = 1462707215290990880L;

	public VendaBuidaException(String message) {
		super(message);
	}	

}
