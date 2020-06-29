package document;

import java.text.SimpleDateFormat;

import utility.Localistion;

public class Magazine extends Document{
	private int frequence;

	public Magazine() {
		super();
		this.type="magazine";
	}

	public Magazine(String titre, Localistion localisation, String type, int nbre_exemp,int frequence) {
		super(titre, localisation, type, nbre_exemp);
		this.frequence = frequence;
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	@Override
	public void afficheDocument() {
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
		System.out.format("%15d|%10s|%3d|%32s|%10s|%10s|%9s|%16s|%16s|%4d|\n",id_doc,type,nbre_exemp,titre,localisation.getSalle(),localisation.getRayon(),"None","None","None",frequence);
		System.out.format("%135s\n","|--------|----------|---|--------------------------------|----------|----------|---------|----------------|----------------|----|");
	}
	
	

}
