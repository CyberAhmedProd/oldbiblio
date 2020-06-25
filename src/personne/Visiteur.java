package personne;

public class Visiteur extends Adherent{

	public Visiteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visiteur(String nom, String prenom, String addresse, String type) {
		super(nom, prenom, addresse, type);
		this.max_doc=1;
		this.type="visiteur";
		this.maxDayEmprunt = 7;
	}

	

}
