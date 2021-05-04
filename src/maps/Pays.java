package maps;

public class Pays {
	
	private String nom;
	private double nombre;
	private String continent;
	
	public Pays(String nom, double nombre, String continent) {
		super();
		this.nom = nom;
		this.nombre = nombre;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nombre=" + nombre + ", continent=" + continent + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getNombre() {
		return nombre;
	}

	public void setNombre(double nombre) {
		this.nombre = nombre;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	
}
