package excepcionsN1E1;
import java.util.ArrayList;

/*
, i una altra classe anomenada "Venda". 
Aquesta classe té com a atributs una col·lecció de productes i el preu total de la venda.

La classe "Venda", té un mètode anomenat calcularTotal() que llança l’excepció personalitzada 
VendaBuidaException i mostra per pantalla “Per fer una venda primer has d’afegir productes” si la 
col·lecció de productes està buida. Si la col·lecció té productes, llavors ha de recórrer la col·lecció 
i guardar la suma de tots els preus dels productes a l’atribut preu total de la venda.
*/
public class Venda {
	private static ArrayList <Producte> llistaProductes = new ArrayList <Producte>();
	private static double preuTotalVenda;
	
	public static void calcularTotal() throws VendaBuidaException {
		
		if (llistaProductes.isEmpty()) {
			throw new VendaBuidaException("Per fer una venda primer has d'afegir productes");
		} else {
			double suma = 0;
			for(int i=0; i<llistaProductes.size(); i++) {
				suma += llistaProductes.get(i).getPreu();
			}
			preuTotalVenda = suma;
		}
	}
	
	
	
	public static double getPreuTotalVenda() {
		return preuTotalVenda;
	}




	public static void addProducte(Producte p) {
		llistaProductes.add(p);
	}
}
