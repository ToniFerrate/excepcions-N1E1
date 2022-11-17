package excepcionsN1E1;

/*
L’excepció personalitzada VendaBuidaException ha de ser filla de la classe Exception. Al seu constructor li 
hem de passar el missatge  “Per fer una venda primer has d’afegir productes” i quan capturem l’excepció, 
l’hem de mostrar per pantalla amb el mètode getMessage() de l’excepció.

Escriu el codi necessari per a generar i capturar una excepció de tipus ArrayIndexOutOfBoundsException.
*/
public class App {

	public static void main(String[] args) {
		
		// Salta l'excepció perquè l'ArrayList de Venda no té productes i està buida
        try {
        	Venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
        
        // Afegim productes a l'array de Venda
        Venda.addProducte(new Producte("tomaquets", 3.50));
        Venda.addProducte(new Producte("patates", 4.34));
        Venda.addProducte(new Producte("pomes", 2.32));
        
        
        // No salta l'excepció perquè l'ArrayList de Venda no està buida
        try {
        	Venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("El preu total de venda es: " + Venda.getPreuTotalVenda());
        
        // Fem saltar una excepció ArrayIndexOutOfBoundsException i el capturem per mostrar un missatge personalitzat
        int[] arraySencers = {1, 2, 3, 4};
        try {
        	System.out.println(arraySencers[4]);	
        } catch (ArrayIndexOutOfBoundsException e){
        	System.out.println("Error capturat: " + e.getMessage());
        }

	}

}
