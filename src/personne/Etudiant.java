package personne;

public class Etudiant extends Adherent {

	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Etudiant(String nom, String prenom, String addresse, String type) {
		super(nom, prenom, addresse, type);
		this.max_doc=3;
		this.type="etudiant";
		this.maxDayEmprunt = 7;
	}

	


}
