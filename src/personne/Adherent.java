package personne;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Scanner;

import document.*;




public class Adherent {
	protected int idAdherent = 1;
	protected String nom;
	protected String prenom;
	protected String addresse;
	protected String type;//type=Etudiant ou Visiteur ou Enseignant
	protected int max_doc;//Nombre maximal de document selon le type
	protected int nbEmpruntEffectues;
	protected int nbEmpruntDepasses=0;
	protected int nbEmpruntEncours;
	protected int maxDayEmprunt;
	protected String status = "None";
	Document D;
	Scanner sc;
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
	
	/**public void emprunt(LinkedList<Adherent> TabAdh,LinkedList<Document> TabAdh1)
	{sc=new Scanner(System.in);
	String emp=null;
	String adh=null;
	boolean ok=false,ok1=false;
	int a=0,b=0;
	System.out.print("Donner le nom de l'Adherent qui veut emprunter un docuemnt  :");
	adh=sc.nextLine();
	for(int i=0; i< TabAdh.size() ;i++)
		{
			if(adh==TabAdh.get(i).getNom())
			{
						if(TabAdh.get(i).getNbEmpruntEncours()<TabAdh.get(i).getMax_doc())
						{
							do {
								System.out.println("Choissisez le document a emprunter");
								emp=sc.nextLine();
								for(int j=0; j< TabAdh1.size() ;j++)
								{
										if(emp==TabAdh1.get(j).getTitre())
										{
											if(TabAdh1.get(j).getNbre_exemp()!=0)
											{TabAdh1.get(j).setNbre_exemp(TabAdh1.get(j).getNbre_exemp()-1);
											TabAdh.get(i).setNbEmpruntEncours(TabAdh.get(i).getNbEmpruntEncours()+1);
											TabAdh.get(i).setNbEmpruntEffectues(TabAdh.get(i).getNbEmpruntEncours());
											
												
											}
											else
												System.out.println("Desolé ce document ne dispose plus d'exemplaire");
											
											ok1=true;a=1;
										}
										else if (ok1==false && emp != TabAdh1.get(j).getTitre() && j==TabAdh1.size()-1)
											System.out.println("Le nom du docuemnt choisi ne correspond pas.Reesayer ");
										
									
								}
							}while(a==0);
							
					}
					else
						System.out.println("Desolé vous pouvez pas faire cette operation.Vous avez atteint la limite de votre nombre d'emprunts");
					ok=true;
				}
				else if (ok==false && adh != TabAdh.get(i).getNom() && i==TabAdh.size()-1)
					System.out.println("Le nom de l'Adherent choisi ne correspond pas ");
			
		}


	}*/
}
