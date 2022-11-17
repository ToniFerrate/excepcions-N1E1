package excepcionsN1E1;
//Crea una classe anomenada "Producte" amb els atributs nom i preu

public class Producte {
	private String nom;
	private double preu;
	
	
	
	public Producte(String nom, double preu) {
		super();
		this.nom = nom;
		this.preu = preu;
	}
	
	
	
	// Getters i setters
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPreu() {
		return preu;
	}
	public void setPreu(double preu) {
		this.preu = preu;
	}
	
}
