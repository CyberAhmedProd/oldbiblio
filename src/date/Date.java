package date;

import java.util.Scanner;
import java.time.*;


public class Date {
    protected int jour;
    protected int mois;
    protected int annee;
	protected Scanner sc;
    public Date(int jour, int mois, int annee) {
       
        this.jour=jour;
        this.mois=mois;
        this.annee=annee;
    }
    public int getJour() {
        return jour;
    }
    public void setJour(int jour) {
        this.jour = jour;
    }
    public int getMois() {
        return mois;
    }
    public void setMois(int mois) {
        this.mois = mois;
    }
    public int getAnnee() {
        return annee;
    }
    public void setAnnee(int annee) {
        this.annee = annee;
    }
    
    public Date(){
    }
    public void creerDate(Date d){
        sc = new Scanner(System.in);
        int i=0;
        int k=0,z=0,q=0;  
        do{
			 if(k==1)
					System.out.println("Le jour saisie est incorete veuillez la ressaisir ");
	            System.out.print("\n\tJour : ");
	            i=sc.nextInt();
	            k=1;
	        }while (i<=0||i>31);
		  d.setJour(i);
	       
	        do{
	        	if(z==1)
					System.out.println("Le mois saisie est incorete veuillez la ressaisir ");
	            System.out.print("\n\tMois : ");
	            i=sc.nextInt();
	            z=1;
	        }while (i<=0||i>12);
	        d.setMois(i);
	        do{
	        	if(q==1)
					System.out.println("L'année saisie est incorete veuillez la ressaisir ");
	            System.out.print("\n\tAnnee : ");
	            i=sc.nextInt();
	            q=1;
	        }while (i<=0);
	        d.setAnnee(i);
	       
    }

    
    public void creerDate2(Date d){
        sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();
        int i=0;
            i=date.getDayOfMonth();
        d.setJour(i);
            i=date.getMonthValue(); 
        d.setMois(i);
            i=date.getYear();
        d.setAnnee(i);
    }
  

    public void afficherDate(Date date){
    	   
        System.out.print(" "+date.getJour() +" / "+ date.getMois() +" / "+ date.getAnnee() +"\n");
     
  
}
    
    public Date creerDate1(Date d){
        sc = new Scanner(System.in);
        int i=0,j=0,k=0;
        do{
            System.out.print("\n\tJour : ");
            i=sc.nextInt();
        }while (i<=0||i>31);
        d.setJour(i);
        do{
            System.out.print("\n\tMois : ");
            j=sc.nextInt();
        }while (j<=0||j>12);
        d.setMois(j);
        do{
            System.out.print("\n\tAnnee : ");
            k=sc.nextInt();
        }while (k<=0);
        d.setAnnee(k);
        return d;
    }
    public boolean BISSEXTILE(Date d)
	{
    	//d=new Date();
	    if((d.getAnnee()%4==0 && d.getAnnee()/100!=0) || (d.getAnnee()%400==0))
	        return true;
	    else
	        return false;
	}
	public int compare(Date d )
	{ //d=new Date();
		int j=0;
		if(d.getMois()==1 || d.getMois()==3 || d.getMois()==5 || d.getMois()==7 || d.getMois()== 8 || d.getMois()==10 || d.getMois()==12)
		{
		j=31;	
		}
		else if(d.getMois()==4 || d.getMois()==6 || d.getMois()==9 || d.getMois()==11 )
		{
			j=30;
		}
		else if(d.getMois()==2)
		{
			if(BISSEXTILE(d)==true)
                j=29;
        else
            j=28;
		}
		return j;
	}
	
	public int comparedate(Date d , Date d1)
	{
		//d=new Date();
		//d1=new Date();
		int i=0,j=0;
		j=compare(d);
	
		if(d.getAnnee()==d1.getAnnee())
		{
			if(d.getMois()<d1.getMois())
			{
				if(d.getJour()>d1.getJour())
				i=j-(d.getJour()+d1.getJour());
				else if(d.getJour()<d1.getJour())
					i=(d1.getJour()-d.getJour());
			}
			else if(d.getMois()==d1.getMois())
			{
				if(d.getJour()<d1.getJour())
				i=(d1.getJour()-d.getJour());
			}
		}
		else if(d.getAnnee()<d1.getAnnee())
		{
			if((d.getMois()>d1.getMois()))
			{
				if((d.getMois()+d1.getMois())-12==1)
			{
					if(d.getJour()>d1.getJour())
						i=j-(d.getJour()+d1.getJour());
						else if(d.getJour()<d1.getJour())
							i=(d1.getJour()-d.getJour());
			}
			}
		}
		
		
		return i;
	}
   
    public  static void main(String[] args) {
    	Date d=new Date();
   d.creerDate2(d);
    d.afficherDate(d);
    }
    
    
    

}


