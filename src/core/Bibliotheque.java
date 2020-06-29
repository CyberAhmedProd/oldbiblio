package core;

import java.util.Date;
import java.util.LinkedList;
import java.util.Scanner;

import document.Article;
import document.Document;
import document.Livre;
import document.Magazine;
import emprunt.Emprunt;
import personne.Adherent;
import personne.Enseignant;
import personne.Etudiant;
import personne.Visiteur;
import utility.Localistion;

public class Bibliotheque {
	Scanner sc1;
	Date aujourdhui= new Date();
	public static void main(String[] args) {
		// créer un objet de la classe ArrayList
				// parti declaration 
				Bibliotheque bib = new Bibliotheque();
				LinkedList<Adherent> Tab = new LinkedList<>();
				LinkedList<Document> Tab1 = new LinkedList<>();
				LinkedList<Emprunt> Tab2 = new LinkedList<>();
				// parti initalisation
				bib.initTabAherent(Tab);
				bib.initTabDocument(Tab1);
				bib.initEmprnt(Tab, Tab1, Tab2);
				Emprunt Em;
				 Em= new Emprunt();
				   Em.retard(Tab, Tab1, Tab2);
				//bib.Adh(Tab);
				bib.bibMenu(Tab, Tab1,Tab2);
			
	}
	// *******CyberAhmedProd************************************************************************************************************************
	// interface men principal********************************************************************************************************************
	public  void bibMenu(LinkedList<Adherent>Tab,LinkedList<Document>Tab1,LinkedList<Emprunt>Tab2) {
	
		
		
		System.out.println("*************************************BIENVENUE*************************************\n\n");
		Date aujourdhui= new Date();
		System.out.println("La date actuelle est : "+this.aujourdhui);
		
		Scanner sc1 = new Scanner(System.in);
		int choix=1;
		int choose;
		while(choix==1) {
			System.out.println("Que voulez-vous faire ?");
	        System.out.println("\t1 - Gérer Adherents");
	        System.out.println("\t2 - Gérer Documents");
	        System.out.println("\t3 - Gérer emprunts");
	        System.out.println("\t4 - Quitter");
			System.out.println("Entrer le numero correspondant : ");
			choose=sc1.nextInt();
			switch(choose) {
				case 0:
					System.out.println("FERMETURE ");
					break;
				case 1:
					Adh(Tab);
					break;
					
				case 2:
					Doc(Tab1);
					break;
				
				case 3:
					Emp(Tab,Tab1,Tab2);
					break;
				
				default:
					System.out.println("CHOIX INVALIDE");
					break;
			}
			System.out.println("\nVoulez vous revenir a l'acceuil ? .Appuyez \n 1 pour oui \t 2 pour non ");
			choix=sc1.nextInt();
			while(choix<1 &&choix >2 ) {
			System.out.println("Veuillez donner un nombre valide ");
			choix=sc1.nextInt();}
			if(choix ==2)
			{System.out.println("FERMETURE");}
		}
		}
	// *****************************************************************************************************************CyberAhmedProd*******
	// methode utilitaire *  * * * * -* *- ** -* -* -** -* -** -* -*--------------***************************************************
   
	
	public void pushAdherent(LinkedList<Adherent>TabAdh,Adherent A)
	{
		
	
		if (TabAdh.size()!=0)
			A.setIdAdherent((TabAdh.getLast()).getIdAdherent()+1);
		
		TabAdh.add(A);//ajouter les Adherents dans un tableau 
		//return TabAdh;
		
		
	}

	public  int lire_n(String T){
		sc1=new Scanner(System.in);
		int n;
		do{
			System.out.print(T);
			n=sc1.nextInt();
		}while (n<=0);
		return n;
	}
	
	private boolean verifDateAfter(Date d1) {
		return d1.after(aujourdhui)?true:false;
	}
	
	public void pushDocument(LinkedList<Document>TabAdh,Document D)
	{
		
	
		if (TabAdh.size()!=0)
			D.setId_doc((TabAdh.getLast()).getId_doc()+1);
		
		TabAdh.add(D);//ajouter les Adherents dans un tableau 
	
		
		
	}

	public Document existDoc(LinkedList<Document> TabAdh,int id)
	{
		Document D=null;
		
		for(int i=0; i< TabAdh.size() ;i++)
		{
			if(TabAdh.get(i).getId_doc()==id)
			{
				
				D= TabAdh.get(i);
			}
		}
		
		return D;
}
	// **********************************************************************************************************CyberAhmedProd***********
	// **  *************************** INIT METHOD **********************************************************************************
	// **********************************************************************************************************CyberAhmedProd***********
	// init la list des Adherent (Etudiant Enseignant and Visit)
	public void initTabAherent(LinkedList<Adherent> TabAdh) {
		Enseignant A1 = new Enseignant("amos", " ahmed ", " 10 avenue "," Enseignant ");
		Enseignant A2 = new Enseignant("rami ", " rami ", " 10 avenues "," Enseignant ");
		Visiteur A3 = new Visiteur("zod", " meo ", " 14 avenue "," Visiteur ");
		Visiteur A4 = new Visiteur("laurent", " jad ", " 18 avenue "," Visiteur ");
		Etudiant A5 = new Etudiant("ahmed", "gharbi", " 16 avenue "," Etudiant ");
		Etudiant A6 = new Etudiant("mohamed", " salah ", " 15 avenue "," Etudiant ");
		
		this.pushAdherent(TabAdh, A1);
		this.pushAdherent(TabAdh, A2);
		this.pushAdherent(TabAdh, A3);
		this.pushAdherent(TabAdh, A4);
		this.pushAdherent(TabAdh, A5);
		this.pushAdherent(TabAdh, A6);
		
	}
	// **********************************************************************************************************CyberAhmedProd***********
	// init list des Documents ( Livre Magazine and Article )
	
	public void initTabDocument(LinkedList<Document> TabAdh) {
	
		Localistion L1 = new Localistion("S1","R1");
		Localistion L2 = new Localistion("S2","R2");
		Localistion L3 = new Localistion("S3","R3");
		Date date1 = new Date("17/11/1992"); // verif date ?? 
		Date date2 = new Date("11/02/2020");
		Date date3 = new Date("27/07/2002");
		Date date4 = new Date("01/06/2003");
		Date date5 = new Date("02/05/2004");
		Date date6 = new Date("15/03/2005");
		Article d1 = new Article("la vie en rose",L1,"Article",11,"Victor",date1);
		Article d2 = new Article("Les nulles de Toulou",L2,"Article",40,"Van'toff",date2);
		Livre d3 = new Livre("notre dame de paris",L3,"Livre",10,"victor","Hugo",date3);
		Livre d4 = new Livre("without love",L1,"Livre",5,"john","doe",date4);
		Magazine d5 = new Magazine("code du zero",L2,"Magazine",500,12);
		Magazine d6 = new Magazine("arduino",L2,"Magazine",500,12);
		
		
		this.pushDocument(TabAdh, d1);
		this.pushDocument(TabAdh, d2);
		this.pushDocument(TabAdh, d3);
		this.pushDocument(TabAdh, d4);
		this.pushDocument(TabAdh, d5);
		this.pushDocument(TabAdh, d6);
	
		
	}
	

	
	
	// ******#adherent*********************************************************************************CyberAhmedProd*******************
	// *****************Methode Gestion des Aherents *********************************************************************************
	// **********************************************************************************************************CyberAhmedProd***********
	// Affichage Adherent
	
	
	
	public void afficheListeAdherent(LinkedList<Adherent>TabAdh)
	{
		System.out.format("%105s\n","---------+----------+------------+------------+--------------------------------+---+---+---+-------");
		System.out.format("%15s|%10s|%12s|%12s|%32s|%3s|%3s|%3s|%6s\n","ID ","TYPE  ","NOM    ","PRENOM   ","ADRESSE             ","NBE","NBD","NBC","STATUT");
		System.out.format("%105s\n","_________|__________|____________|____________|________________________________|___|___|___|_______");
		System.out.format("%105s\n","---------|----------|------------|------------|--------------------------------|---|---|---|-------");
		
		for(Adherent A1 : TabAdh)
            A1.afficheAdherent();
	}
	
	// *****************************************************************************************************************************
	// Ajouter adherent 
	public void ajouterAdherent(LinkedList<Adherent>TabAdh,Adherent A)
	{
		int i=0;
		sc1 = new Scanner(System.in);
	    
		if (TabAdh.size()!=0)
			A.setIdAdherent((TabAdh.getLast()).getIdAdherent()+1);
		System.out.println("Nom : ");
		A.setNom(sc1.nextLine());
		//System.out.println(A.getNom());
		System.out.println("Prenom : ");
		A.setPrenom(sc1.nextLine());
		System.out.println("Addresse : ");
		A.setAddresse(sc1.nextLine());
		
		TabAdh.add(A);//ajouter les Adherents dans un tableau 
		
	}
	// **************************************************************CyberAhmedProd***********************************************************
	
	// recherche By id Adherent
	public void rechercheAdherent(LinkedList<Adherent> TabAdh,int id)
	{
		
		boolean exist =false ;
		for(int i=0; i< TabAdh.size() && exist ==false;i++)
		{
			if(TabAdh.get(i).getIdAdherent()==id)
			{
				
				TabAdh.get(i).afficheAdherent(); 
				exist=true;
			}
			
		}
		if(exist==false)
		{
			System.out.println("Personne inexistante");
		}
		
	}
	
	// *************************************************************CyberAhmedProd*************************************************************
	// delete Adherent ************************
	public void supprimerAdherent(LinkedList<Adherent> TabAdh,int id)
	{ 
		boolean exist =false ;
		for(int i=0; i< TabAdh.size() && exist ==false;i++)
		{
			if(TabAdh.get(i).getIdAdherent()==id)
			{
				
				TabAdh.remove(TabAdh.get(i));      //supprimer les Adherents dans un tableau 
				exist=true;
			}
		}
		if(exist==false)
			System.out.println("ID introuvable");
		
	}
	
	
	// *********************************************************************************************************************************************
	// modify Adherent **************************************CyberAhmedProd************************************************************************
	
	public void modifierAdherent(LinkedList<Adherent> TabAdh,int id)
	{
		Scanner sc = new Scanner(System.in);
		boolean exist =false ;
		for(int i=0; i< TabAdh.size() && exist ==false;i++)
		{
			if(TabAdh.get(i).getIdAdherent()==id)
			{
				System.out.println("Veuillez saisir les nouvelles donnees de l'adherent "+id);
				System.out.println("Nom : ");
				TabAdh.get(i).setNom(sc.nextLine());
				System.out.println("Prenom : ");
				TabAdh.get(i).setPrenom(sc.nextLine());
				System.out.println("addresse : ");
				TabAdh.get(i).setAddresse(sc.nextLine());
				System.out.print("Nombre d'emprunt effectués :");
				TabAdh.get(i).setNbEmpruntEffectues(sc.nextInt());
				System.out.print("Nombre d'emprunt dépassés :");
				TabAdh.get(i).setNbEmpruntDepasses(sc.nextInt());
				System.out.print("Nombre d'emprunt en cour :");
				TabAdh.get(i).setNbEmpruntEncours(sc.nextInt());
				System.out.print("Etat adhérent :");
				TabAdh.get(i).setStatus(new Scanner(System.in).nextLine());
				exist=true;
			}
		}
		if(exist==false)
		{
			System.out.println("Adherent inexistent");
		}
		
	}
	
	// **********************************************************************************************************************************CyberAhmedProd
	// *--*-*-*-*-*-**---------------*-*-*-*---*--*-*------ interface Gestion des Adherents *-*-*-* -*-* -*-*-*- *-*-*-* -*- ----* ** -* ---- -- --* -
	
	public   void Adh(LinkedList<Adherent>Tab)
	{	
	 	int choix_adh=1;
		int choose_adh,i,n;
		System.out.println("---------------------------GESTION DES ADHERENTS---------------------------\n");
		while(choix_adh==1) {
			   System.out.println("\t1 - Ajouter un adherent");
	           System.out.println("\t2 - Supprimer un adherent");
	           System.out.println("\t3 - Modifier un adherent");
	           System.out.println("\t4 - Rechercher un adherent");
	           System.out.println("\t5 - Afficher tous les adherents");
	           System.out.println("\t6 - Retour");
			System.out.println("Entrer le numero correspondant : ");
			
			sc1=new Scanner(System.in);
			choose_adh=sc1.nextInt();
			if (choose_adh==1) {sc1 = new Scanner(System.in);
				int choix_add=1;
				int	choose_add;
				System.out.println(" \n Actualisation de la liste  \n ");
				this.afficheListeAdherent(Tab);
				System.out.println("\nVoulez vous faire d'autre Ajout.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_add=sc1.nextInt();
				while(choix_add != 1 && choix_add !=2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_add=sc1.nextInt();}
				if(choix_add ==2)
				{System.out.println("Operation Terminé");}
				while(choix_add==1) {
					System.out.print("\n\t\t\t\t\t\tAppuyez\n\t\t1 -  pour Etudiant");
					System.out.print("\t\t2 -  pour  Enseignant");
					System.out.print("\t\t3 - pour Visiteur");
					System.out.println("\nEntrer le numero correspondant : ");
					choose_add=sc1.nextInt();
					n=lire_n("Donner le nombre  d'Adherents pour cette opération : ");
					switch(choose_add) {
					
						case 1:
							   for (i = 1; i <= n; i++) {
								   System.out.println("Etudiant "+i);
							
							Etudiant E= new Etudiant();
							this.ajouterAdherent(Tab,E);}
							break;
							
						case 2:
							for (i = 1; i <= n; i++) {
								System.out.println("Enseignant "+i);
						
							Enseignant En = new Enseignant();
							this.ajouterAdherent(Tab,En);}
							
							
							break;
						case 3:
							for (i = 1; i <= n; i++) {
								System.out.println("Visiteur "+i);
							
								Visiteur V = new Visiteur();
							this.ajouterAdherent(Tab,V);}
						
							break;
							
						default:
							System.out.println("CHOIX INVALIDE");
							break;
					}
				
				System.out.println("\nVoulez vous recommencer l'ajout.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_add=sc1.nextInt();
				while(choix_add != 1 && choix_add !=2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_add=sc1.nextInt();}
				if(choix_add ==2)
				{System.out.println("Operation Terminé");}

				}
				
				System.out.println(" \n Actualisation de la liste des informatioms \n ");
				this.afficheListeAdherent(Tab);
			}			
			else if (choose_adh==2) {	sc1 = new Scanner(System.in);
				int choix_sup=1;//id;
				while(choix_sup==1) {
					
					
					System.out.print("Donner l'Id de l'Adherent ");
					this.supprimerAdherent(Tab,sc1.nextInt());
					
				System.out.println("\nVoulez vous recommencer la suppression.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_sup=sc1.nextInt();
				while(choix_sup<1 &&choix_sup >2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_sup=sc1.nextInt();}
				if(choix_sup ==2)
				{System.out.println("Operation Terminé");}

				}
				System.out.println(" \n Actualisation de la liste  \n ");
				
				this.afficheListeAdherent(Tab);

				
			}
			
			else if (choose_adh==3) 
			{	sc1 = new Scanner(System.in);
				int choix_mod=1;
				while(choix_mod==1) {	
				
					System.out.println("Donner l'Id de l'adherent ");
					this.modifierAdherent(Tab,sc1.nextInt());
					System.out.println("\nVoulez vous recommencer la modification.Appuyez \n 1 pour oui \t 2 pour non ");
					choix_mod=sc1.nextInt();
					while(choix_mod<1 && choix_mod >2 ) {
						System.out.println("Veuillez donner un nombre valide ");
						choix_mod=sc1.nextInt();
					}
					if(choix_mod ==2)
						System.out.println("Operation Terminé");

				}
				System.out.println(" \n Actualisation de la liste des informatioms \n ");
				this.afficheListeAdherent(Tab);

			}
			else if(choose_adh==4)
			{
				sc1 = new Scanner(System.in);
				int choix_rec=1;
				while(choix_rec==1) {
				
					System.out.println("Donner l'ID de l'adherent ");
					this.rechercheAdherent(Tab,sc1.nextInt());
					System.out.println("\nVoulez vous recommencer la recherche.Appuyez \n 1 pour oui \t 2 pour non ");
					choix_rec=sc1.nextInt();
					while(choix_rec<1 && choix_rec >2 ) {
						System.out.println("Veuillez donner un nombre valide ");
						choix_rec=sc1.nextInt();
					}
					if(choix_rec ==2)
						System.out.println("Operation Terminé");

				}

			}
			else if(choose_adh==5)
				this.afficheListeAdherent(Tab);
			
			else
				System.out.println("Choix incorrecte !");
			sc1 = new Scanner(System.in);
			System.out.println("\nVoulez vous recommencer la gestion des Adherents.Appuyez \n 1 pour oui \t 2 pour non ");
			choix_adh=sc1.nextInt();
			while(choix_adh<1 &&choix_adh >2 ) {
			System.out.println("Veuillez donner un nombre valide ");
			choix_adh=sc1.nextInt();}
			if(choix_adh ==2)
				System.out.println("Operation Terminé");
		}
	}
	
	
	
	
	
	// ******************************CyberAhmedProd *********************************************************************************
	// -*********#document****************************************Gestion des document ******************************************************
	// ******************************************************************************************************************************
	
	// Affichage Document
	
	
	public void afficheDocument(Document D) {
		System.out.format("%135s\n","+________+__________+___+________________________________+__________+__________+_________+________________+________________+____+");
		System.out.format("%15s|%10s|%3s|%32s|%10s|%10s|%9s|%16s|%16s|%4s|\n","ID ","TYPE","NB","TITRE","SALLE","RAYON","DATE","AUTEUR","EDITION","FREQ");
		System.out.format("%135s\n","|________|__________|___|________________________________|__________|__________|_________|________________|________________|____|");
		System.out.format("%135s\n","+--------+----------+---+--------------------------------+----------+----------+---------+----------------+----------------+----+");
		 D.afficheDocument();
	}
	public void afficheListeDocument(LinkedList<Document>TabDoc)
	{
		System.out.format("%135s\n","+________+__________+___+________________________________+__________+__________+_________+________________+________________+____+");
		System.out.format("%15s|%10s|%3s|%32s|%10s|%10s|%9s|%16s|%16s|%4s|\n","ID ","TYPE","NB","TITRE","SALLE","RAYON","DATE","AUTEUR","EDITION","FREQ");
		System.out.format("%135s\n","|________|__________|___|________________________________|__________|__________|_________|________________|________________|____|");
		System.out.format("%135s\n","+--------+----------+---+--------------------------------+----------+----------+---------+----------------+----------------+----+");
		for(Document D1 : TabDoc)
           D1.afficheDocument();
	}
	// ----------------------------------------------------------------------------------------------------------------------------
	// ajouter  Article
	// -----------------------------------------------------------------------------------------------------------------
	public void ajouterDocument(LinkedList<Document> docs, Document D){
		

		int i=0;
		sc1 = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
	    Localistion localisation = new Localistion();
		if(docs.size()!=0)
			D.setId_doc((docs.getLast()).getId_doc()+1);
		System.out.println("Titre : ");
		D.setTitre(sc1.nextLine());
		//System.out.println(A.getNom());
		System.out.println("Salle : ");
		localisation.setSalle(sc1.nextLine());
		System.out.println("Rayon : ");
		localisation.setRayon(sc1.nextLine());
		D.setLocalisation(localisation);
		System.out.println("nombe d'exemplaires : ");
		D.setNbre_exemp(sc1.nextInt());
		System.out.println("Nom auteur :");
		D.setNomAuthor(sc.nextLine());
		System.out.println("Nom Editeur :");
		D.setNomEdition(sc.nextLine());
		System.out.println("Date édition :");
		D.setDateDocument(new Date(sc.nextLine()));
		
		docs.add(D);
		
	
	    }
	// *****************************************************************************************************************************
	// suppression document *************************************************************CyberAhmedProd*****************************
	//* ******************* * *  ** * *   ** ** * * ***************************************** *   ** * * **************************
	
	public void supprimerDocument(LinkedList<Document> tab,int id)
	{ 
		boolean exist =false ;
		for(int i=0; i< tab.size() && exist ==false;i++)
		{
			if(tab.get(i).getId_doc()==id)
			{
				
		tab.remove(tab.get(i));//supprimer les Adherents dans un tableau 
		exist=true;
			}
		}
		if(exist==false)
		{
			System.out.println("ID introuvable");
		}

	}
	
	// ------------------------************-********************-**********************-***************
	// modify document * - * - *----------- -*-**---*-----------------*-*-*-*--******
	// ------------------------***********************************-********-*--******************
	
	public void modifierDocument(LinkedList<Document> TabAdh,int id){
	
		Scanner sc1 = new Scanner(System.in);
		if(existDoc(TabAdh,id)==null)
			System.out.println("Personne inexistante");

		else{
			for(Document D : TabAdh)	{
				if(D.equals(existDoc(TabAdh,id))){
					if(D instanceof Article){ 
						Article A=new Article();
						Scanner sc = new Scanner(System.in);
						A=(Article)D;
						System.out.println("Veuillez saisir les nouvelles donnees du document " +id);
						System.out.print("Titre : ");
					    A.setTitre(sc1.nextLine());
					    System.out.print("Nombre d'exemplaire : ");
					    A.setNbre_exemp(sc1.nextInt());
					    System.out.print("\nNom de l'auteur : ");
				        A.setNomAuthor(sc.nextLine());
				        System.out.println("Date de publication : ");
				        Date newDate = new Date(sc.nextLine()); // reglage es date ? ?? ? ?
				        A.setDatePubication(newDate);
		
					}
					else if(D instanceof Magazine){
						Magazine M=new Magazine();
						M=(Magazine)D;
		//M.affiche_Mag(M);
						System.out.println("Veuillez saisir les nouvelles donnees du document "+id);
						System.out.print("Titre : ");
					    M.setTitre(sc1.nextLine());
					    System.out.print("Nombre d'exemplaire : ");
					    M.setNbre_exemp(sc1.nextInt());
						System.out.println("Frequence : ");
					    M.setFrequence(sc1.nextInt());
					}
					else if (D instanceof Livre)
					{	
						Livre L =new Livre();
					
						L=(Livre)D;
						Scanner sc = new Scanner(System.in);
	//	L.affiche_livres(L);
						this.afficheDocument(L);
						System.out.println("Veuillez saisir les nouvelles donnees du document "+id);
						System.out.print("Titre : ");
					    L.setTitre(sc1.nextLine());
					    System.out.print("Nombre d'exemplaire : ");
					    L.setNbre_exemp(sc1.nextInt());
						System.out.print("Nom de l'auteur : ");
					    L.setNomAuthor(sc.nextLine());
					    System.out.print("Nom de l'éditeur : ");
					    L.setNomEdition(sc.nextLine());
					    System.out.print("Date d'edition: ");
					    Date day = new Date(sc.nextLine());
					    L.setDateDocument(day);
					}
					break;
				}
			}
		}
	}
	
	
	// -------------------**--*-*-**-*--------------************-*-*--************************-CyberAhmedProd
	// -------************Interface gestion des documents *****************************************-----------
	
	public   void Doc(LinkedList<Document>Tab)
	{		
	 	int choix_adh=1;
		int choose_adh,i,n;
		System.out.println("---------------------------GESTION DES DOCUMENTS---------------------------\n");
		while(choix_adh==1) {
			   System.out.println("\t1 - Ajouter un Document");
	           System.out.println("\t2 - Supprimer un Document");
	           System.out.println("\t3 - Modifier un Document");
	           System.out.println("\t4 - Rechercher un Document");
	           System.out.println("\t5 - Afficher tous les Documents");
	           System.out.println("\t6 - Retour");
	           System.out.println("Entrer le numero correspondant : ");
			
			sc1 = new Scanner(System.in);
			choose_adh=sc1.nextInt();
			if (choose_adh==1) {sc1 = new Scanner(System.in);
				int choix_add=1;
				int	choose_add;
				Document D= new Document();
				System.out.println(" \n Actualisation de la liste des informatioms \n ");
				this.afficheListeDocument(Tab);
				System.out.println("\nVoulez vous faire d'autre Ajout.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_add=sc1.nextInt();
				while(choix_add != 1 && choix_add !=2 ) {
				System.out.println("Veuillez donner un nombre valide");
				choix_add=sc1.nextInt();}
				if(choix_add ==2)
				{System.out.println("Operation Terminé");}
				
				while(choix_add==1) {
					System.out.print("\n\t\t\t\t\t\tAppuyez\n\t\t1 -  pour Article");
					System.out.print("\t\t2 -  pour  Livre");
					System.out.print("\t\t3 - pour Magazine");
					System.out.println("\nEntrer le numero correspondant : ");
					choose_add=sc1.nextInt();
					n=lire_n("Donner le nombre  de documents pour cette opération : ");
					switch(choose_add) {
					
						case 1:
							   for (i = 1; i <= n; i++) {
								   System.out.println("Article "+i);
							Article article= new Article ();
							this.ajouterDocument(Tab, article);   // ajouter article
							}
							break;
							
						case 2:
							for (i = 1; i <= n; i++) {
								System.out.println("Livre "+i);
							Livre livre = new Livre();
							this.ajouterDocument(Tab, livre); // ajouter livre
							}
							
							break;
						case 3:
							for (i = 1; i <= n; i++) {
								System.out.println("Magazine "+i);
							Magazine magazine  =new Magazine();
							this.ajouterDocument(Tab, magazine); // ajouter magazine
							}
						
							break;
							
						default:
							System.out.println("CHOIX INVALIDE");
							break;
					}
				
				System.out.println("\nVoulez vous recommencer l'ajout.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_add=sc1.nextInt();
				while(choix_add != 1 && choix_add !=2 ) {
				System.out.println("Veuillez donner un nombre valide");
				choix_add=sc1.nextInt();}
				if(choix_add ==2)
				{System.out.println("Operation Terminé");}

				}
				D= new Document();
				System.out.println(" \n Actualisation de la liste des informatioms \n ");
				this.afficheListeDocument(Tab);
			}			
			else if (choose_adh==2) {	sc1 = new Scanner(System.in);
				int choix_sup=1;//id;
				while(choix_sup==1) {
					
					Document D= new Document();
					System.out.print("Donner l'Id du Documemt ");
					this.supprimerDocument(Tab,sc1.nextInt());
					
				System.out.println("\nVoulez vous recommencer la suppression.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_sup=sc1.nextInt();
				while(choix_sup<1 &&choix_sup >2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_sup=sc1.nextInt();}
				if(choix_sup ==2)
				{System.out.println("Operation Terminé");}

				}
				System.out.println(" \n Actualisation de la liste  \n ");
			
				this.afficheListeDocument(Tab);

			}
			else if (choose_adh==3) {sc1 = new Scanner(System.in);
				int choix_mod=1;
				while(choix_mod==1) {	
					Document D= new Document();
							System.out.println("Donner l'Id du Documemt ");
							this.modifierDocument(Tab,sc1.nextInt());
				System.out.println("\nVoulez vous recommencer la modification.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_mod=sc1.nextInt();
				while(choix_mod<1 && choix_mod >2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_mod=sc1.nextInt();}
				if(choix_mod ==2)
				{System.out.println("Operation Terminé");}

				}
				System.out.println(" \n Actualisation de la liste des informatioms \n ");
				this.afficheListeDocument(Tab);

			}
			/*else if(choose_adh==4)
			{sc1 = new Scanner(System.in);
			int choix_rec=1;
			while(choix_rec==1) {
				D= new Document();
				System.out.println("Donner l'ID du Documemt ");
				D.recherche(Tab,sc1.nextInt());
			System.out.println("\nVoulez vous recommencer la recherche.Appuyez \n 1 pour oui \t 2 pour non ");
			choix_rec=sc1.nextInt();
			while(choix_rec<1 && choix_rec >2 ) {
			System.out.println("Veuillez donner un nombre valide ");
			choix_rec=sc1.nextInt();}
			if(choix_rec ==2)
			{System.out.println("Operation Termin�");}

			}
			
			}*/
			else if(choose_adh==5)
			{
				Document D= new Document();
				this.afficheListeDocument(Tab);
			}
			else
				System.out.println("END");
			sc1 = new Scanner(System.in);
			System.out.println("\nVoulez vous recommencer la gestion des Documemts.Appuyez \n 1 pour oui \t 2 pour non ");
			choix_adh=sc1.nextInt();
			while(choix_adh<1 &&choix_adh >2 ) {
			System.out.println("Veuillez donner un nombre valide");
			choix_adh=sc1.nextInt();}
			if(choix_adh ==2)
			{System.out.println("Operation Terminé");
				
			}
		}
		
	}
	
	
	//********************************************************************///////////////
	//init Emprunt
	
	public void initEmprnt(LinkedList<Adherent> TabAdh,LinkedList<Document> TabAdh1,LinkedList<Emprunt> TabAdh2)
	{
	
		Emprunt E1 = new Emprunt("amos","la vie en rose",10,06,2020);
		Emprunt E2 = new Emprunt("rami ","Les nulles de Toulou",27,06,2020);
		Emprunt E3 = new Emprunt("mohamed","without love",27,06,2020);
		Emprunt E4 = new Emprunt("laurent","code du zero",27,06,2020);
		Emprunt E5 = new Emprunt("zod","notre dame de paris",27,06,2020);
		Emprunt E6 = new Emprunt("amos","arduino",27,06,2020);
		Emprunt E7= new Emprunt("ahmed","notre dame de paris",27,06,2020);
		

		   Emprunt Em= new Emprunt();
		   Em.empruntStatic(TabAdh, TabAdh1, TabAdh2, E1);
		   Em.empruntStatic(TabAdh, TabAdh1, TabAdh2, E2);
		   Em.empruntStatic(TabAdh, TabAdh1, TabAdh2, E3);
		   Em.empruntStatic(TabAdh, TabAdh1, TabAdh2, E4);
		   Em.empruntStatic(TabAdh, TabAdh1, TabAdh2, E5);
		   Em.empruntStatic(TabAdh, TabAdh1, TabAdh2, E6);
		   Em.empruntStatic(TabAdh, TabAdh1, TabAdh2, E7);
		   
		  
	}

	public void afficheListeEmprunt(LinkedList<Emprunt>TabAdh)
	{
		System.out.format("%105s\n","+------------+--------------------------------+---+---+---+-----------");
		System.out.format("%32s|%32s|%10s|%10s\n","NOM    ","DOC EMPRUNTE   ","LIMIT ","STATUT");
		System.out.format("%105s\n","|____________|________________________________|___________|___________");
		System.out.format("%105s\n","|------------|--------------------------------|---|---|---|-----------");
		
		for( Emprunt E1: TabAdh)
            E1.afficheEmprunt();
	}
	///*********************************************************************//////
	
	public   void Emp(LinkedList<Adherent> TabAdh,LinkedList<Document> TabAdh1,LinkedList<Emprunt> TabAdh2)
	{	
	Emprunt Em;
	sc1=new Scanner(System.in);
	
	 	int choix_adh=1,k=1;
		int choose_adh,i,n;
		System.out.println("---------------------------GESTION DES EMPRUNTS---------------------------\n");
		while(choix_adh==1) {
			   System.out.println("\t1 - Faire un Emprunt");
	           System.out.println("\t2 - Faire une Remise");
	           System.out.println("\t3 - Rechercher un Emrpunt");
	           System.out.println("\t4 - Afficher tous les Emprunts et leur status");
	           System.out.println("\t5 - Retour");
			System.out.println("Entrer le numero correspondant : ");
		
			
			choose_adh=sc1.nextInt();
			while(choose_adh != 1 && choose_adh != 2 && choose_adh != 3 && choose_adh != 4 && choose_adh != 5 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choose_adh =sc1.nextInt();}
			if (choose_adh==1) {sc1 = new Scanner(System.in);
				int choix_add=1;
				int	choose_add;
				
				while(choix_add==1) {
				
					n=lire_n("Donner le nombre  d'Adherents pour cette opération : ");
					
							   for (i = 1; i <= n; i++) {
								   System.out.println("Emprunt "+i);
								   Em= new Emprunt();
								   Em.emprunt(TabAdh, TabAdh1, TabAdh2, Em);	
								   } 
			
				System.out.println(" \n Voulez vous recommencer l'ajout.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_add=sc1.nextInt();
				while(choix_add != 1 && choix_add !=2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_add=sc1.nextInt();}
				if(choix_add ==2)
				{System.out.println("Operation Terminé");}

				}
				
			}			
			else if (choose_adh==2) {	sc1 = new Scanner(System.in);
				int choix_sup=1;//id;
				while(choix_sup==1) {
					  Em= new Emprunt();
					Em.remise(TabAdh, TabAdh1, TabAdh2);
					
				System.out.println("\n Voulez vous recommencer la remise.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_sup=sc1.nextInt();
				while(choix_sup!=1 &&choix_sup !=2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_sup=sc1.nextInt();}
				if(choix_sup ==2)
				{System.out.println("Operation Terminé");}

				}
			}
			else if (choose_adh==3) {sc1 = new Scanner(System.in);
				int choix_mod=1;
				while(choix_mod==1) {	
					Em= new Emprunt();
							Em.rechercheEmp(TabAdh2);
				System.out.println("\nVoulez vous recommencer la recherche.Appuyez \n 1 pour oui \t 2 pour non ");
				choix_mod=sc1.nextInt();
				while(choix_mod!=1 && choix_mod !=2 ) {
				System.out.println("Veuillez donner un nombre valide ");
				choix_mod=sc1.nextInt();}
				if(choix_mod ==2)
				{System.out.println("Operation Terminé");}

				}
				

			}
			else if(choose_adh==4)
			{sc1 = new Scanner(System.in);
			int choix_rec=1;
			while(choix_rec==1) {
				   Em= new Emprunt();
				   Em.retard(TabAdh, TabAdh1, TabAdh2);
				   afficheListeEmprunt(TabAdh2);
				   
			System.out.println("\nVoulez vous recommencer l'affichage.Appuyez \n 1 pour oui \t 2 pour non ");
			choix_rec=sc1.nextInt();
			while(choix_rec!=1 && choix_rec !=2 ) {
			System.out.println("Veuillez donner un nombre valide ");
			choix_rec=sc1.nextInt();}
			if(choix_rec ==2)
			{System.out.println("Operation Terminé");}

			}

			}
			else if(choose_adh==5)
				System.out.println("END");
			sc1 = new Scanner(System.in);
			System.out.println("\nVoulez vous recommencer la gestion des Emprunts.Appuyez \n 1 pour oui \t 2 pour non ");
			choix_adh=sc1.nextInt();
			while(choix_adh!=1 &&choix_adh !=2 ) {
			System.out.println("Veuillez donner un nombre valide ");
			choix_adh=sc1.nextInt();}
			if(choix_adh ==2)
			{System.out.println("Operation Terminé");}
		}
	}

}
