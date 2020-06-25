package personne;

import java.text.SimpleDateFormat;

public class Adherent {
	protected int idAdherent = 1;
	protected String nom;
	protected String prenom;
	protected String addresse;
	protected String type;//type=Etudiant ou Visiteur ou Enseignant
	protected int max_doc;//Nombre maximal de document selon le type
	protected int nbEmpruntEffectues;
	protected int nbEmpruntDepasses;
	protected int nbEmpruntEncours;
	protected int maxDayEmprunt;
	protected String status = "None";
	public Adherent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Adherent(String nom, String prenom, String addresse, String type) {
		super();
		
		this.nom = nom;
		this.prenom = prenom;
		this.addresse = addresse;
		this.type = type;
	}
	public int getIdAdherent() {
		return idAdherent;
	}
	public void setIdAdherent(int idAdherent) {
		this.idAdherent = idAdherent;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAddresse() {
		return addresse;
	}
	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMax_doc() {
		return max_doc;
	}
	public void setMax_doc(int max_doc) {
		this.max_doc = max_doc;
	}
	public int getNbEmpruntEffectues() {
		return nbEmpruntEffectues;
	}
	public void setNbEmpruntEffectues(int nbEmpruntEffectues) {
		this.nbEmpruntEffectues = nbEmpruntEffectues;
	}
	public int getNbEmpruntDepasses() {
		return nbEmpruntDepasses;
	}
	public void setNbEmpruntDepasses(int nbEmpruntDepasses) {
		this.nbEmpruntDepasses = nbEmpruntDepasses;
	}
	public int getNbEmpruntEncours() {
		return nbEmpruntEncours;
	}
	public void setNbEmpruntEncours(int nbEmpruntEncours) {
		this.nbEmpruntEncours = nbEmpruntEncours;
	}
	public int getMaxDayEmprunt() {
		return maxDayEmprunt;
	}
	public void setMaxDayEmprunt(int maxDayEmprunt) {
		this.maxDayEmprunt = maxDayEmprunt;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Adherent [idAdherent=" + idAdherent + ", nom=" + nom + ", prenom=" + prenom + ", addresse=" + addresse
				+ ", type=" + type + ", max_doc=" + max_doc + ", nbEmpruntEffectues=" + nbEmpruntEffectues
				+ ", nbEmpruntDepasses=" + nbEmpruntDepasses + ", nbEmpruntEncours=" + nbEmpruntEncours
				+ ", maxDayEmprunt=" + maxDayEmprunt + "]";
	}
	
	public void afficheAdherent() {
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
		System.out.format("%15d|%10s|%12s|%12s|%32s|%3d|%3d|%3d|%6s\n",idAdherent,type,nom,prenom,addresse,nbEmpruntEffectues,nbEmpruntDepasses,nbEmpruntEncours,status);
		System.out.format("%105s\n","---------|----------|------------|------------|--------------------------------|---|---|---|-------");
	}

}
