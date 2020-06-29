package emprunt;


import date.*;

import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.Scanner;


import document.*;
import personne.*;

public class Emprunt {


	Scanner sc;
	Scanner sc1;
	String nom=null;
	String doc_emp=null;
	Date deadline1;
	String Status="None";
// cyberAhmedProd -------------------------------------------------------------------------------------------------------
	// getter setters 
	public String getStatus() {
		return Status;
	}


	public void setStatus(String status) {
		Status = status;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getDoc_emp() {
		return doc_emp;
	}


	public void setDoc_emp(String doc_emp) {
		this.doc_emp = doc_emp;
	}



	public Date getDeadline1() {
		return deadline1;
	}


	public void setDeadline1(Date deadline1) {
		this.deadline1 = deadline1;
	}

	

	public Emprunt(String nom, String doc_emp,int j,int m,int a) {
		deadline1=new Date(j,m,a);
		setNom(nom);
		setDoc_emp (doc_emp);	
		deadline1.setJour(j); deadline1.setMois(m);deadline1.setAnnee(a);
		
	}
	public Emprunt() {
	}

	//Emprunt E1 = new Emprunt("ahmed ","la vie en rose",27,06,2020);

	public void emprunt(LinkedList<Adherent> TabAdh,LinkedList<Document> TabAdh1,LinkedList<Emprunt> TabAdh2,Emprunt A)
	{sc=new Scanner(System.in);
	sc1=new Scanner(System.in);
	String emp=null;
	String adh=null;
	boolean ok=false,ok1=false;
	int a=0;
	deadline1 =new Date();
	System.out.print("Donner le nom de l'Adherent qui veut emprunter un docuemnt  :");
	adh=sc.nextLine();
	for(int i=0; i< TabAdh.size() ;i++)
		{
			if(TabAdh.get(i).getNom().equalsIgnoreCase(adh))
			{A.setNom(TabAdh.get(i).getNom());
						if(TabAdh.get(i).getNbEmpruntEncours()<TabAdh.get(i).getMax_doc() )
						{
							if(TabAdh.get(i).getNbEmpruntDepasses()==0)
							{	do {
								System.out.println("Choissisez le document a emprunter :");
								emp=sc.nextLine();
								for(int j=0; j< TabAdh1.size() ;j++)
								{
										if(TabAdh1.get(j).getTitre().equalsIgnoreCase(emp))
										{A.setDoc_emp(TabAdh1.get(j).getTitre());
											if(TabAdh1.get(j).getNbre_exemp()!=0)
											{TabAdh1.get(j).setNbre_exemp(TabAdh1.get(j).getNbre_exemp()-1);
											TabAdh.get(i).setNbEmpruntEncours(TabAdh.get(i).getNbEmpruntEncours()+1);
											TabAdh.get(i).setNbEmpruntEffectues(TabAdh.get(i).getNbEmpruntEncours());
											System.out.println("Donner la date de l'emprunt : ");
											deadline1=deadline1.creerDate1(deadline1);
											A.setDeadline1(deadline1);
												
											}
											else
												System.out.println("Desolé ce document ne dispose plus d'exemplaire");
											
											ok1=true;a=1;
										}
										else if (ok1==false &&  TabAdh1.get(j).getTitre().compareToIgnoreCase(emp)!=0 && j==TabAdh1.size()-1)
											System.out.println("Le nom du docuemnt choisi ne correspond pas.Reesayer ");
									
									
								}
							}while(a==0);
							
					}
							else
								System.out.println("Desolé vous pouvez pas emprunter de document vous devez règler votre retard");
							}
					else
						System.out.println("Desolé vous pouvez pas faire cette operation. Vous avez atteint la limite de votre nombre d'emprunts");
					ok=true;
				}
				else if (ok==false && TabAdh.get(i).getNom().compareToIgnoreCase(adh)!=0 && i==TabAdh.size()-1)
					System.out.println("Le nom de l'Adherent choisi ne correspond pas ");
			
		}


	TabAdh2.add(A);
	}
	
	 
	
	public void remise(LinkedList<Adherent> TabAdh,LinkedList<Document> TabAdh1,LinkedList<Emprunt> TabAdh2)
	{
		sc=new Scanner(System.in);
		String emp=null;
		String adh=null;
		String adh1=null;
		boolean ok=false,ok1=false;
		int a=0,compt=0;
		System.out.print("Donner le nom de l'Adherent qui veut remettre un document  :");
		adh=sc.nextLine();
		adh1=adh;

		for(int i=0; i< TabAdh2.size() ;i++)
		{
			if(TabAdh2.get(i).getNom().equalsIgnoreCase(adh))
			{
				if(TabAdh2.get(i).getStatus().equalsIgnoreCase("En retard"))
					compt++;
					
				
			}
			
		}
		for(int i=0; i< TabAdh2.size() ;i++)
			{
				if(TabAdh2.get(i).getNom().equalsIgnoreCase(adh1))
				{
								do {
									System.out.println("Choissisez le document a rendre :");
									emp=sc.nextLine();
									
											if(TabAdh2.get(i).getDoc_emp().equalsIgnoreCase(emp))
											{
												if(TabAdh2.get(i).getStatus().equalsIgnoreCase("En retard"))
													compt--;
												
												
													for(int j=0; j< TabAdh1.size() ;j++)
													{
														if(TabAdh2.get(i).getDoc_emp().equalsIgnoreCase(TabAdh1.get(j).getTitre()))
													TabAdh1.get(j).setNbre_exemp(TabAdh1.get(j).getNbre_exemp()+1);
													}
													for(int k=0; k< TabAdh.size() ;k++)
													{
														if(TabAdh2.get(i).getNom().equalsIgnoreCase(TabAdh.get(k).getNom()))
												TabAdh.get(k).setNbEmpruntEncours(TabAdh.get(k).getNbEmpruntEncours()-1);
													}
												ok1=true;a=1;
												TabAdh2.remove(TabAdh2.get(i));
												System.out.println("Operation reussi");
												adh1=null;
												
											}
											else if (ok1==false &&  TabAdh2.get(i).getDoc_emp().compareToIgnoreCase(emp)!=0)
												System.out.println("Le nom du docuemnt choisi ne correspond pas.Reesayer ");
								}while(a==0);
								
						
						ok=true;
					}
					else if (ok==false &&  TabAdh2.get(i).getNom().compareToIgnoreCase(adh)!=0 && i==TabAdh2.size()-1)
						System.out.println("Le nom de l'Adherent choisi ne correspond pas ");
				
			}
		
		for(int i=0; i< TabAdh2.size() ;i++)
		{
			if(TabAdh2.get(i).getNom().equalsIgnoreCase(adh))
			{
				if(compt==0)
				{
					for(int j=0; j< TabAdh.size() ;j++)
					{
						if(TabAdh.get(j).getNom().equalsIgnoreCase(adh))
						{TabAdh.get(j).setNbEmpruntDepasses(0);	
						TabAdh.get(j).setStatus("En règle");	
						
							
						}
					}
				}
				
			}
			
		}

	
	
	}
	public void retard(LinkedList<Adherent> TabAdh,LinkedList<Document> TabAdh1,LinkedList<Emprunt> TabAdh2)
	{	Date Aujourdhui=new Date();
	Aujourdhui.creerDate2(Aujourdhui);
		
	for(int i=0; i< TabAdh2.size() ;i++)
	{int z;
		z=Aujourdhui.comparedate(TabAdh2.get(i).getDeadline1(),Aujourdhui);
		for(int j=0; j< TabAdh.size() ;j++)
		{
			if(TabAdh.get(j).getNom().equalsIgnoreCase(TabAdh2.get(i).getNom()))
			{
		if(z<=TabAdh.get(j).getMaxDayEmprunt())
		{
			//TabAdh.get(j).setStatus("En r�gle");
			TabAdh2.get(i).setStatus("En règle");
		}
		else
		{
			
			//TabAdh.get(j).setStatus("En retard");
			TabAdh.get(j).setNbEmpruntDepasses(1);
			TabAdh2.get(i).setStatus("En retard");
		}
			}
		}
	}
	
	for(int j=0; j< TabAdh.size() ;j++)
	{
		if(TabAdh.get(j).getNbEmpruntDepasses()==0)
		{
			TabAdh.get(j).setStatus("En règle");
		}
		else
			TabAdh.get(j).setStatus("En retard");
	}
	
}
// ----------------------------------------------CyberAhmedProd-----------------------------------------------------------------------
	// Affichage emprunt ---------------********************************************-*****-****************-*-*-*-*-*-*-*-*-
	public void afficheEmprunt() {
		System.out.format("%32s|%32s|%2d/%2d/%4d|%10s\n",nom,doc_emp,deadline1.getJour(),deadline1.getMois() ,deadline1.getAnnee(),Status);
		System.out.format("%35s\n","|------------|--------------------------------|---|---|---|-----------|");
	
	
		
	
	
	}
	
	public void empruntStatic(LinkedList<Adherent> TabAdh,LinkedList<Document> TabAdh1,LinkedList<Emprunt> TabAdh2,Emprunt A)
	{
	boolean ok=false,ok1=false;
	int a=0;

	for(int i=0; i< TabAdh.size() ;i++)
		{
			if(TabAdh.get(i).getNom().equalsIgnoreCase(A.getNom()))
			{
						if(TabAdh.get(i).getNbEmpruntEncours()<TabAdh.get(i).getMax_doc())
						{
							do {
								
								for(int j=0; j< TabAdh1.size() ;j++)
								{
										if(TabAdh1.get(j).getTitre().equalsIgnoreCase(A.getDoc_emp()))
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
										
									
									
								}
							}while(a==0);
							
					}
					else
						System.out.println("Desolé vous pouvez pas faire cette operation.Vous avez atteint la limite de votre nombre d'emprunts");
					ok=true;
				}
		
			
		}


	TabAdh2.add(A);
	}
	
	
	public void rechercheEmp(LinkedList<Emprunt> TabAdh)
	{
		sc=new Scanner(System.in);
		String adh=null;
		System.out.print("Donner le nom de l'Adherent a chercher  :");
		adh=sc.nextLine();

		boolean exist =false ;
		for(int i=0; i< TabAdh.size() ;i++)
		{
			if(TabAdh.get(i).getNom().equalsIgnoreCase(adh))
			{
				
				TabAdh.get(i).afficheEmprunt();
				exist=true;
			}
			else if(exist==false &&  TabAdh.get(i).getNom().compareToIgnoreCase(adh)!=0 && i==TabAdh.size()-1)
				System.out.println("Desol� cette personne n'a pas fais d'emprunt");
		}
		
		
	}
	
}