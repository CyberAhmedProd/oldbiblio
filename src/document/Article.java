package document;

import java.util.Date;

import utility.Localistion;
import java.text.SimpleDateFormat;
public class Article extends Document {
	private String nomAuthor;
	private Date datePubication;
	public Article() {
		super();
		this.type="article";
	}
	public Article(String titre, Localistion localisation, String type, int nbre_exemp, String nomAuthor, Date datePublication) {
		super(titre, localisation, type, nbre_exemp);
		this.datePubication = datePublication;
		this.nomAuthor = nomAuthor;
	}
	public String getNomAuthor() {
		return nomAuthor;
	}
	public void setNomAuthor(String nomAuthor) {
		this.nomAuthor = nomAuthor;
	}
	public Date getDatePubication() {
		return datePubication;
	}
	public void setDatePubication(Date datePubication) {
		this.datePubication = datePubication;
	}
	@Override
	public void afficheDocument() {
		SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yy");
		System.out.format("%15d|%10s|%3d|%32s|%10s|%10s|%9s|%16s|%16s|%4s|\n",id_doc,type,nbre_exemp,titre,localisation.getSalle(),localisation.getRayon(),formater.format(datePubication),nomAuthor,"None","None");
		System.out.format("%135s\n","|--------|----------|---|--------------------------------|----------|----------|---------|----------------|----------------|----|");
	}
	
	
}
