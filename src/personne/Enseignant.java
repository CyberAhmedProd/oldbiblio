package personne;

public class Enseignant extends Adherent {

	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enseignant(String nom, String prenom, String addresse, String type) {
		super(nom, prenom, addresse, type);
		this.max_doc=7;
		this.type="Enseignant";
		this.maxDayEmprunt = 7;
		
	}

	
	

	
	


	
}
